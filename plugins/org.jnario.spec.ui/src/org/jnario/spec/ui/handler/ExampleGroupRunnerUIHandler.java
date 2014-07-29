package org.jnario.spec.ui.handler;

import org.eclipse.jdt.internal.junit.model.TestCaseElement;
import org.eclipse.jdt.internal.junit.ui.TestRunnerViewPart;
import org.eclipse.jdt.junit.model.ITestElement;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.part.ViewPart;
import org.jnario.ui.handler.AbstractJnarioRunnerUIHandler;

@SuppressWarnings("restriction")
public class ExampleGroupRunnerUIHandler extends AbstractJnarioRunnerUIHandler {

	protected Action getAction(ViewPart part, ITestElement element) {
		return new OpenTestExampleGroupAction((TestRunnerViewPart) part, (TestCaseElement) element);
	}
}
