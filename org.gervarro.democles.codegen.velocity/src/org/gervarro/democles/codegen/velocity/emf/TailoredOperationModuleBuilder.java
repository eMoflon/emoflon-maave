/*
 * Democles, Declarative Model Query Framework for Monitoring Heterogeneous Embedded Systems
 * Copyright (C) 2010  Gergely Varro
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *  
 * Contributors:
 * 		Gergely Varro <gervarro@cs.bme.hu> - initial API and implementation and/or initial documentation
 */
package org.gervarro.democles.codegen.velocity.emf;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.velocity.Template;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.RuntimeInstance;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenDataType;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.gervarro.democles.codegen.Generator;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.velocity.VelocityCodeGeneratorBuilder;
import org.gervarro.democles.codegen.velocity.ParameterizedVelocityTemplateController;
import org.gervarro.democles.codegen.velocity.ParameterizedVelocityTemplateControllerChain;
import org.gervarro.democles.codegen.velocity.ParameterizedVelocityTemplateControllerContainer;
import org.gervarro.democles.codegen.velocity.VelocityTemplateController;
import org.gervarro.democles.codegen.velocity.VelocityTemplateControllerChain;
import org.gervarro.democles.common.runtime.OperationBuilder;
import org.gervarro.democles.emf.codegen.GenClassAdapter;
import org.gervarro.democles.emf.codegen.GenDataTypeAdapter;
import org.gervarro.democles.emf.codegen.GenFeatureAdapter;
import org.gervarro.democles.emf.codegen.GenPackageAdapter;
import org.gervarro.democles.emf.codegen.TailoredOperationResource;
import org.gervarro.democles.emf.util.EcoreResourceFactory;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.gervarro.democles.specification.emf.SpecificationPackage;
import org.gervarro.democles.specification.impl.Constraint;
import org.gervarro.democles.specification.impl.ConstraintVariable;
import org.gervarro.democles.specification.impl.Variable;

public class TailoredOperationModuleBuilder {
	private final Template generalOperationClassTemplate;
	private final Template checkMethodTemplate;
	private final Template getAllDataMethodTemplate;
	private final Template ob3Template;
	private final Template ob2GenFeatureTemplate;
	private final Template ob2GenClassifierTemplate;
	private final Template ifThenElseTemplate;
	private final Template ob1FeatureTemplate;
	private final Template ob1ClassifierTemplate;
	private final Template operationBuilderIRStructuralFeatureTemplate;
	private final Template operationBuilderIRClassifierTemplate;
	private final Template operationBuilderPackageFieldTemplate;
	private final Template operationBuilderIsResponsibleForMethodTemplate;
	private final Template operationBuilderGetOperationsMethodTemplate;
	private final Template operationBuilderClassTemplate;
	
	private final VelocityCodeGeneratorBuilder operationGenerator;

	private TailoredOperationModuleBuilder() throws Exception {
		final RuntimeInstance templateEngine = new RuntimeInstance();
		templateEngine.addProperty(RuntimeConstants.FILE_RESOURCE_LOADER_PATH, "C:\\Dokumente und Einstellungen\\varro\\workspace\\org.gervarro.democles.prototype\\newtemplates");
		templateEngine.addProperty(RuntimeConstants.DIRECTIVE_IF_TOSTRING_NULLCHECK, false);
		templateEngine.addProperty(RuntimeConstants.COUNTER_INITIAL_VALUE, 0);
		templateEngine.init();
		
		// Templates for Operation classes
		operationGenerator = new VelocityCodeGeneratorBuilder(templateEngine);
		// operationGenerator.addCodeGeneratorProvider(new TailoredCodeGeneratorProvider(templateEngine));
		
		generalOperationClassTemplate = templateEngine.getTemplate("OperationClass");
		checkMethodTemplate = templateEngine.getTemplate("CheckMethod");
		getAllDataMethodTemplate = templateEngine.getTemplate("GetAllDataMethod");
		
		// Templates for the OperationBuilder class
		ifThenElseTemplate = templateEngine.getTemplate("IfThenElse");
		
		operationBuilderClassTemplate = templateEngine.getTemplate("/OperationBuilder/OperationBuilderClass");
		
		operationBuilderPackageFieldTemplate = templateEngine.getTemplate("/OperationBuilder/OperationBuilderPackageField");
		
		operationBuilderIsResponsibleForMethodTemplate = templateEngine.getTemplate("/OperationBuilder/OperationBuilderIsResponsibleForMethod");
		operationBuilderIRStructuralFeatureTemplate = templateEngine.getTemplate("/OperationBuilder/OB-IR-Feature");
		operationBuilderIRClassifierTemplate = templateEngine.getTemplate("/OperationBuilder/OB-IR-Classifier");
		
		operationBuilderGetOperationsMethodTemplate = templateEngine.getTemplate("/OperationBuilder/OperationBuilderGetOperationsMethod");
		ob1FeatureTemplate = templateEngine.getTemplate("/OperationBuilder/OB1Feature");
		ob1ClassifierTemplate = templateEngine.getTemplate("/OperationBuilder/OB1Classifier");
		ob2GenFeatureTemplate = templateEngine.getTemplate("/OperationBuilder/OB2GenFeature");
		ob2GenClassifierTemplate = templateEngine.getTemplate("/OperationBuilder/OB2GenClassifier");
		ob3Template = templateEngine.getTemplate("/OperationBuilder/OB3");
		
	}
	
	private void generateOperationForStructuralFeature(Writer writer, GenFeatureAdapter gfa, List<GeneratorOperation> operations) throws IOException {
		List<VelocityTemplateController> methods = new ArrayList<VelocityTemplateController>();
		for (GeneratorOperation operation : operations) {
			methods.add(operationGenerator.getGeneralConstraintGenerator(operation));
		}
		methods.add(new ParameterizedVelocityTemplateController<List<GeneratorOperation>>(getAllDataMethodTemplate, operations));
		VelocityTemplateController featureClassGenerator = 
			new ParameterizedVelocityTemplateControllerContainer<GenFeatureAdapter>(generalOperationClassTemplate, gfa, methods);
		
		featureClassGenerator.generateCode(writer);
		writer.flush();
		writer.close();
	}
	
	private void generateOperationForClass(Writer writer, GenClassAdapter gca, List<GeneratorOperation> operations) throws IOException {
		List<VelocityTemplateController> methods = new ArrayList<VelocityTemplateController>();
		methods.add(new ParameterizedVelocityTemplateController<GenClassAdapter>(checkMethodTemplate, gca));
		for (GeneratorOperation operation : operations) {
			methods.add(operationGenerator.getGeneralConstraintGenerator(operation));
		}
		methods.add(new ParameterizedVelocityTemplateController<List<GeneratorOperation>>(getAllDataMethodTemplate, operations));

		ParameterizedVelocityTemplateControllerContainer<GenClassAdapter> classClassGenerator = 
			new ParameterizedVelocityTemplateControllerContainer<GenClassAdapter>(generalOperationClassTemplate, gca, methods);
		
		classClassGenerator.generateCode(writer);
		writer.flush();
		writer.close();
	}
	
	private void generateOperationForDataType(Writer writer, GenDataTypeAdapter gda, List<GeneratorOperation> operations) throws IOException {
		List<VelocityTemplateController> methods = new ArrayList<VelocityTemplateController>();
		methods.add(new ParameterizedVelocityTemplateController<GenDataTypeAdapter>(checkMethodTemplate, gda));
		for (GeneratorOperation operation : operations) {
			methods.add(operationGenerator.getGeneralConstraintGenerator(operation));
		}
		methods.add(new ParameterizedVelocityTemplateController<List<GeneratorOperation>>(getAllDataMethodTemplate, operations));
		ParameterizedVelocityTemplateControllerContainer<GenDataTypeAdapter> dataTypeClassGenerator = 
			new ParameterizedVelocityTemplateControllerContainer<GenDataTypeAdapter>(generalOperationClassTemplate, gda, methods);
		
		dataTypeClassGenerator.generateCode(writer);
		writer.flush();
		writer.close();
	}
	
	private void generateOperationModule(File srcDir, GenModel genModel) throws IOException {
		/*
		ResourceSet set = genModel.eResource().getResourceSet();
		// Loads EMFPackage, SpecificationPackage, and EcorePackage
		SpecificationPackage specificationPackage = SpecificationPackage.eINSTANCE;
		
		// Load the GenModel and generate the EMF specific code
		TailoredOperationResource genModelOperationBuilder = 
			new TailoredOperationResource(genModel);

		List<VariableRuntimeBuilder<GeneratorVariable>> variableBuilders =
			new LinkedList<VariableRuntimeBuilder<GeneratorVariable>>();
		variableBuilders.add(genModelOperationBuilder);
		List<OperationBuilder<GeneratorOperation, GeneratorVariable>> operationBuilders =
			new LinkedList<OperationBuilder<GeneratorOperation, GeneratorVariable>>();
		operationBuilders.add(genModelOperationBuilder);
		for (GenPackage genPackage : genModel.getGenPackages()) {
			// TODO genPackage.getNestedGenPackages()
			EPackage ePackage = genPackage.getEcorePackage();
			GenPackageAdapter gpa = 
				(GenPackageAdapter) genModelOperationBuilder.adapt(ePackage, GenPackageAdapter.class);
			List<VelocityTemplateController> childrenOfMainITEBranch = new LinkedList<VelocityTemplateController>();
			List<VelocityTemplateController> operationBuilderFeatureGenerators = new LinkedList<VelocityTemplateController>();
			List<VelocityTemplateController> operationBuilderClassGenerators = new LinkedList<VelocityTemplateController>();
			List<VelocityTemplateController> operationBuilderDataTypeGenerators = new LinkedList<VelocityTemplateController>();
			for (GenClass genClass : genPackage.getGenClasses()) {
				for (GenFeature genFeature : genClass.getGenFeatures()) {
					EStructuralFeature eFeature = genFeature.getEcoreFeature();
					GenFeatureAdapter gfa = 
						(GenFeatureAdapter) genModelOperationBuilder.adapt(eFeature, GenFeatureAdapter.class);
					Variable var0 = new Variable("var0", 0, gfa.getGenElement().getGenClass().getEcoreClass());
					Variable var1 = new Variable("var1", 1, gfa.getGenElement().getEcoreFeature().getEType());
					StructuralFeatureConstraint<? extends EStructuralFeature> constraint;
					if (gfa.getGenElement().getEcoreFeature() instanceof EReference) {
						constraint = new ReferenceConstraint(new ConstraintVariable[] { var0, var1 }, (EReference) gfa.getGenElement().getEcoreFeature());
					} else if (gfa.getGenElement().getEcoreFeature() instanceof EAttribute) {
						constraint = new AttributeConstraint(new ConstraintVariable[] { var0, var1 }, (EAttribute) gfa.getGenElement().getEcoreFeature());
					} else {
						throw new RuntimeException("Unknown type " + gfa.getGenElement().getEcoreFeature().eClass().getName());
					}

					// Prepares variable runtimes and operations
					List<GeneratorVariable> parameters = new LinkedList<GeneratorVariable>();
					parameters.add(getGeneratorVariable(variableBuilders, var0));
					parameters.add(getGeneratorVariable(variableBuilders, var1));
					List<GeneratorOperation> operations = new LinkedList<GeneratorOperation>();
					for (OperationBuilder builder : operationBuilders) {
						if (builder.isResponsibleFor(constraint)) {
							operations.addAll(builder.getOperations(constraint, parameters));
							break;
						}
					}

					// Generates operation code for a structural feature
					Writer writer = getWriterForJavaFile(srcDir, gfa.getPackageName(), gfa.getClassName());
					generateOperationForStructuralFeature(writer, gfa, operations);

					VelocityTemplateController ob3GenFeature = new ParameterizedVelocityTemplateController<List<GeneratorOperation>>(ob3Template, operations);
					VelocityTemplateController ob2GenFeature = new ParameterizedVelocityTemplateControllerChain<GenFeature>(ob2GenFeatureTemplate, gfa.getGenElement(), ob3GenFeature);
					operationBuilderFeatureGenerators.add(ob2GenFeature);
				}

				// Prepare an operation for code generation purposes
				//						Variable var0 = new Variable("value", 0);
				//						Constraint typeConstraint =
				//							new Constraint(gca.getConstraintType(), new Variable[] { var0 });
				//						var0.setDomain(typeConstraint);
				//						
				//						ConstraintVariable[] parameters = new ConstraintVariable[] { var0 };
				//						Constraint constraint = new Constraint(gca.getConstraintType(), parameters);
				//
				//						// Prepares operations
				//						List<GeneratorOperation> operations = PatternMatchingEngine.getOperations(operationBuilders, constraint);
				//						
				//						// Generates operation code for a class
				//						Writer writer = getWriterForJavaFile(srcDir, gca.getPackageName(), gca.getClassName());
				//						generateOperationForClass(writer, gca, operations);
				//
				//						VelocityTemplateController ob3GenClass = new ParameterizedVelocityTemplateController<List<GeneratorOperation>>(ob3Template, operations);
				//						VelocityTemplateController ob2GenClass = new ParameterizedVelocityTemplateControllerChain<GenClass>(ob2GenClassifierTemplate, gca.getGenElement(), ob3GenClass);
				//						operationBuilderClassGenerators.add(ob2GenClass);
			}
			//					for (GenDataTypeAdapter gda : gpa.getDataTypes()) {
			//						// Prepare an operation for code generation purposes
			//						Variable var0 = new Variable("value", 0);
			//						Constraint typeConstraint =
			//							new Constraint(gda.getConstraintType(), new Variable[] { var0 });
			//						var0.setDomain(typeConstraint);
			//						
			//						ConstraintVariable[] parameters = new ConstraintVariable[] { var0 };
			//						Constraint constraint = new Constraint(gda.getConstraintType(), parameters);
			//
			//						// Prepares operations
			//						List<GeneratorOperation> operations = PatternMatchingEngine.getOperations(operationBuilders, constraint);
			//						
			//						// Generates operation code for a data type
			//						Writer writer = getWriterForJavaFile(srcDir, gda.getPackageName(), gda.getClassName());
			//						generateOperationForDataType(writer, gda, operations);
			//						
			//						VelocityTemplateController ob3GenDataType = new ParameterizedVelocityTemplateController<List<GeneratorOperation>>(ob3Template, operations);
			//						VelocityTemplateController ob2GenDataType = new ParameterizedVelocityTemplateControllerChain<GenDataType>(ob2GenClassifierTemplate, gda.getGenElement(), ob3GenDataType);
			//						operationBuilderDataTypeGenerators.add(ob2GenDataType);
			//					}

			// Features
			if (!operationBuilderFeatureGenerators.isEmpty()) {
				VelocityTemplateController itef = 
					new VelocityTemplateControllerContainer(ifThenElseTemplate, operationBuilderFeatureGenerators);
				VelocityTemplateController ob1Feature = new ParameterizedVelocityTemplateControllerChain<Class<?>>(ob1FeatureTemplate, StructuralFeatureConstraint.class, itef);
				childrenOfMainITEBranch.add(ob1Feature);
			}

			// Classes
			if (!operationBuilderClassGenerators.isEmpty()) {
				VelocityTemplateController itec = 
					new VelocityTemplateControllerContainer(ifThenElseTemplate, operationBuilderClassGenerators);
				VelocityTemplateController ob1Class = new ParameterizedVelocityTemplateControllerChain<Class<?>>(ob1ClassifierTemplate, ClassConstraint.class, itec);
				childrenOfMainITEBranch.add(ob1Class);
			}

			// Data types
			if (!operationBuilderDataTypeGenerators.isEmpty()) {
				VelocityTemplateController ited = 
					new VelocityTemplateControllerContainer(ifThenElseTemplate, operationBuilderDataTypeGenerators);
				VelocityTemplateController ob1DataType = new ParameterizedVelocityTemplateControllerChain<Class<?>>(ob1ClassifierTemplate, DataTypeConstraint.class, ited);
				childrenOfMainITEBranch.add(ob1DataType);
			}

			VelocityTemplateController iteMain =
				new VelocityTemplateControllerContainer(ifThenElseTemplate, childrenOfMainITEBranch);
			VelocityTemplateController operationBuilderGetOperationsMethod = 
				new VelocityTemplateControllerChain(operationBuilderGetOperationsMethodTemplate, iteMain);

			VelocityTemplateController aFeature = new ParameterizedVelocityTemplateController<Class<?>>(operationBuilderIRStructuralFeatureTemplate, StructuralFeatureConstraint.class);
			//					VelocityTemplateController aClass = new ParameterizedVelocityTemplateController<Class<?>>(operationBuilderIRClassifierTemplate, ClassConstraint.class);
			//					VelocityTemplateController aDataType = new ParameterizedVelocityTemplateController<Class<?>>(operationBuilderIRClassifierTemplate, DataTypeConstraint.class);
			//					VelocityTemplateController iteIRMain =
			//						new VelocityTemplateControllerContainer(ifThenElseTemplate, aFeature, aClass, aDataType);
			VelocityTemplateController iteIRMain =
				new VelocityTemplateControllerContainer(ifThenElseTemplate, aFeature );

			List<VelocityTemplateController> operationBuilderMethods = new ArrayList<VelocityTemplateController>();
			operationBuilderMethods.add(new ParameterizedVelocityTemplateController<GenPackage>(operationBuilderPackageFieldTemplate, gpa.getGenElement()));
			operationBuilderMethods.add(new VelocityTemplateControllerChain(operationBuilderIsResponsibleForMethodTemplate, iteIRMain));
			operationBuilderMethods.add(operationBuilderGetOperationsMethod);
			VelocityTemplateController operationBuilderClassGenerator = 
				new ParameterizedVelocityTemplateControllerContainer<GenPackageAdapter>(operationBuilderClassTemplate, gpa, operationBuilderMethods);

			Writer writer = getWriterForJavaFile(srcDir, gpa.getPackageName(), gpa.getClassName());
			operationBuilderClassGenerator.generateCode(writer);
			writer.flush();
			writer.close();
		}
		*/
	}

	private Writer getWriterForJavaFile(File root, String packageName, String className) throws IOException {
		File packageDir = new File(root, packageName.replace('.','/'));
		if (!packageDir.exists()) {
			packageDir.mkdirs();
		}

		// packageDir = new File(projectDir, "generated");
		File sourceCodeFile = new File(packageDir, className + ".java");
		// StringWriter writer = new StringWriter(32768);
		FileWriter writer = new FileWriter(sourceCodeFile);
		return writer;
	}
	
	// Code formatting
	//		String source = writer.toString();
	//		IDocument document = new Document(source);
	//		Map<String, Object> compilerOptions = new HashMap<String, Object>();
	//		compilerOptions.put("org.eclipse.jdt.core.compiler.source", "1.5");
	//		CodeFormatter formatter = ToolFactory.createCodeFormatter(compilerOptions);
	//		TextEdit textEdit = formatter.format(CodeFormatter.K_COMPILATION_UNIT, source, 0, source.length(), 0, null);
	//		textEdit.apply(document);
	//		FileWriter fileWriter = new FileWriter(sourceCodeFile);
	//		fileWriter.write(document.get());
	//		fileWriter.flush();
	//		fileWriter.close();

	// Code compilation
	//		File binDir = new File(projectDir, "bin");
	//		if (BatchCompiler.compile("\"" + packageDir.toString() + "\" -d \"" + binDir.toString() + "\" -1.5", new PrintWriter(System.out), new PrintWriter(System.err), null)) {
	//			Class<?> clazz = getClass().getClassLoader().loadClass(packageName + "." + className);
	//			Object o = clazz.newInstance();
	//			
	//		}
	
	// This is the code that registers code generator adapters for GenModel
	// GeneratorAdapterFactory.Descriptor.Registry.INSTANCE.addDescriptor(GenModelPackage.eNS_URI, CodeGeneratorAdapterFactory.DESCRIPTOR);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String workspaceRootPath = "C:\\Dokumente und Einstellungen\\varro\\workspace\\";
		URI workspaceRootURI = URI.createFileURI(workspaceRootPath);
		File workspaceRootDir = new File(workspaceRootPath);
		
		String genModelFileLocation = "/org.gervarro.democles.specification.emf/model/specification-interface.genmodel";
//		genModelFileLocation = "/org.gervarro.democles.prototype/model/test.genmodel";
//		TestPackage.eINSTANCE.eClass();
		
		// String projectName = "org.gervarro.democles.specification.emf.operation";
		String projectName = "org.gervarro.democles.specification.operation";
		String sourceDirectoryName = "src";
		
		ResourceSet set = new ResourceSetImpl();
		set.setPackageRegistry(EPackage.Registry.INSTANCE);
		
		// Special handling of ecore file is needed to be able to load their generated counterparts
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactory());
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		set.getURIConverter().getURIMap().put(URI.createPlatformResourceURI("/", true), workspaceRootURI);
		
		URI genModelURI = URI.createPlatformResourceURI(genModelFileLocation, true);
		GenModelPackage.eINSTANCE.eResource();
		Resource genModelResource = set.getResource(genModelURI, true);
		GenModel genModel = (GenModel) genModelResource.getContents().get(0);

		File projectDir = new File(workspaceRootDir, projectName);
		File srcDir = new File(projectDir, sourceDirectoryName);

		try {
			TailoredOperationModuleBuilder builder = new TailoredOperationModuleBuilder();
			builder.generateOperationModule(srcDir, genModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
