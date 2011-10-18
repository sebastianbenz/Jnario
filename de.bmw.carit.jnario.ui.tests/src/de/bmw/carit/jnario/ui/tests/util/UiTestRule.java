package de.bmw.carit.jnario.ui.tests.util;

import static de.bmw.carit.jnario.ui.tests.util.Workspaces.assumeRunningEclipse;
import static de.bmw.carit.jnario.ui.tests.util.Workspaces.cleanWorkspace;
import static de.bmw.carit.jnario.ui.tests.util.Workspaces.closeAllOpenEditors;
import static de.bmw.carit.jnario.ui.tests.util.Workspaces.closeWelcomePage;
import static de.bmw.carit.jnario.ui.tests.util.Workspaces.waitForAutoBuild;

import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

public class UiTestRule implements MethodRule {

	public Statement apply(final Statement base, FrameworkMethod method, Object target) {
		prepareWorkspace();
		return new Statement() {
			
			@Override
			public void evaluate() throws Throwable {
				base.evaluate();
				closeAllOpenEditors();
			}
		};
	}
	
	public void prepareWorkspace() {
		assumeRunningEclipse();
		try{
			closeWelcomePage();
			cleanWorkspace();
			waitForAutoBuild();
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	

}
