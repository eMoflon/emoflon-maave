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
package org.gervarro.democles.codegen.velocity;

import java.util.ArrayList;
import java.util.List;

import org.apache.velocity.Template;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.RuntimeInstance;
import org.gervarro.democles.codegen.AbstractCodeGeneratorBuilder;
import org.gervarro.democles.codegen.CodeGeneratorProvider;
import org.gervarro.democles.codegen.GeneratorOperation;

public class VelocityCodeGeneratorBuilder extends AbstractCodeGeneratorBuilder<VelocityTemplateController> {
	private final List<CodeGeneratorProvider<VelocityTemplateController>> constraintTypeSpecificProviders = new ArrayList<CodeGeneratorProvider<VelocityTemplateController>>();
	private final Template methodTemplate;
	private final Template readVariableTemplate;
	private final Template checkVariableTemplate;
	private final Template writeVariableTemplate;
	private final Template successfulMatchingTemplate;

	public VelocityCodeGeneratorBuilder(RuntimeInstance templateEngine)
			throws ResourceNotFoundException, ParseErrorException, Exception {
		methodTemplate = templateEngine.getTemplate("InterpretedMethod");
		readVariableTemplate = templateEngine.getTemplate("InterpretedReadVariable");
		checkVariableTemplate = templateEngine.getTemplate("InterpretedCheckVariable");
		writeVariableTemplate = templateEngine.getTemplate("InterpretedWriteVariable");
		successfulMatchingTemplate = templateEngine.getTemplate("InterpretedSuccessfulMatching");
	}

	public void addCodeGeneratorProvider(CodeGeneratorProvider<VelocityTemplateController> provider) {
		constraintTypeSpecificProviders.add(provider);
	}

	protected VelocityTemplateController getSuccessfulMatchingController() {
		return new VelocityTemplateController(successfulMatchingTemplate);
	}

	protected VelocityTemplateController getWriteVariableController(GeneratorOperation operation, int index,
			VelocityTemplateController tail) {
		ParameterizedVelocityTemplateControllerChain<GeneratorOperation> renderable = new ParameterizedVelocityTemplateControllerChain<GeneratorOperation>(
				writeVariableTemplate, operation, tail);
		renderable.put("index", index);
		return renderable;
	}

	protected VelocityTemplateController getCheckVariableController(GeneratorOperation operation, int index,
			VelocityTemplateController tail) {
		ParameterizedVelocityTemplateControllerChain<GeneratorOperation> renderable = new ParameterizedVelocityTemplateControllerChain<GeneratorOperation>(
				checkVariableTemplate, operation, tail);
		renderable.put("index", index);
		return renderable;
	}

	protected VelocityTemplateController getOperationController(GeneratorOperation operation,
			VelocityTemplateController tail) {
		for (CodeGeneratorProvider<VelocityTemplateController> constraintTypeSpecific : constraintTypeSpecificProviders) {
			if (constraintTypeSpecific.isResponsibleFor(operation)) {
				return constraintTypeSpecific.getTemplateController(operation, tail);
			}
		}
		throw new RuntimeException("No handler exists for " + operation.toString());
	}

	protected VelocityTemplateController getReadVariableController(GeneratorOperation operation, int index,
			VelocityTemplateController tail) {
		ParameterizedVelocityTemplateControllerChain<GeneratorOperation> renderable = new ParameterizedVelocityTemplateControllerChain<GeneratorOperation>(
				readVariableTemplate, operation, tail);
		renderable.put("index", index);
		return renderable;
	}

	protected VelocityTemplateController getMethodController(GeneratorOperation operation,
			VelocityTemplateController tail) {
		return new ParameterizedVelocityTemplateControllerChain<GeneratorOperation>(methodTemplate, operation, tail);
	}
}
