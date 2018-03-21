VM Arguments:

-Djava.library.path=${workspace_loc}/org.moflon.maave.tool.smt.z3/lib/z3-4.3.2-x64-win/bin

Environment:
PATH
${workspace_loc:/org.moflon.maave.tool.smt.z3}/lib/z3-4.3.2-x64-win/bin;${env_var:PATH}

java.library.path
${workspace_loc:/org.moflon.maave.tool.smt.z3}/lib/z3-4.3.2-x64-win/bin

CurrentWSLoc
Root of Git repo
${project_loc:/org.moflon.maave.tests.testsuite}/..

Use the following snippet for your launch configs:
<launchConfiguration>
...
<mapAttribute key="org.eclipse.debug.core.environmentVariables">
<mapEntry key="CurrentWSLoc" value="${project_loc:/org.moflon.maave.tests.testsuite}/.."/>
<mapEntry key="PATH" value="${workspace_loc:/org.moflon.maave.tool.smt.z3}/lib/z3-4.3.2-x64-win/bin;${env_var:PATH}"/>
<mapEntry key="java.library.path" value="${workspace_loc:/org.moflon.maave.tool.smt.z3}/lib/z3-4.3.2-x64-win/bin"/>
</mapAttribute>
...
</launchConfiguration>