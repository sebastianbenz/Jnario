package org.jnario.ui.handler;

import org.eclipse.jdt.internal.junit.model.TestCaseElement;
import org.eclipse.jdt.junit.model.ITestCaseElement;
import org.eclipse.jdt.junit.model.ITestElement;
import org.eclipse.jdt.junit.model.ITestSuiteElement;
import org.eclipse.jdt.junit.runners.IRunnerUIHandler;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.ui.part.ViewPart;

@SuppressWarnings("restriction")
public abstract class AbstractJnarioRunnerUIHandler implements IRunnerUIHandler {

	protected abstract Action getAction(ViewPart part, ITestElement element);
	
	public boolean contextMenuAboutToShow(ViewPart part, ITestElement element,
			IMenuManager menu) {
		if (element instanceof TestCaseElement) {
			menu.add(getAction(part, element));
			return true;
		}
		return false;
	}

	public boolean handleDoubleClick(ViewPart part, ITestElement element) {
		if (element instanceof TestCaseElement) {
			Action action = getAction(part, element);
			if (action.isEnabled()) {
				action.run();
				return true;
			}
		}
		return false;
	}

	public String getSimpleLabel(ViewPart part, ITestElement element) {
		if (element instanceof ITestCaseElement)
			return ((ITestCaseElement) element).getTestMethodName();
		if (element instanceof ITestSuiteElement)
			return ((ITestSuiteElement) element).getSuiteTypeName();
		return "unknown";
	}

	public StyledString getStyledLabel(ViewPart part, ITestElement element,
			int layout) {
		return null;
	}
}
