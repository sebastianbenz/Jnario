package org.jnario.ui.handler;

import org.eclipse.jdt.internal.junit.model.TestCaseElement;
import org.eclipse.jdt.internal.junit.model.TestElement;
import org.eclipse.jdt.internal.junit.model.TestSuiteElement;
import org.eclipse.jdt.junit.model.ITestCaseElement;
import org.eclipse.jdt.junit.model.ITestElement;
import org.eclipse.jdt.junit.model.ITestElementContainer;
import org.eclipse.jdt.junit.model.ITestSuiteElement;
import org.eclipse.jdt.junit.runners.IRunnerUIHandler;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.ui.part.ViewPart;
import org.jnario.util.Strings;

@SuppressWarnings("restriction")
public abstract class AbstractJnarioRunnerUIHandler implements IRunnerUIHandler {

	protected abstract Action getAction(ViewPart part, ITestElement element);
	
	public boolean contextMenuAboutToShow(ViewPart part, ITestElement element,
			IMenuManager menu) {
		if (element instanceof TestCaseElement || element instanceof TestSuiteElement) {
			menu.add(getAction(part, element));
			return true;
		}
		return false;
	}

	public boolean handleDoubleClick(ViewPart part, ITestElement element) {
		if (element instanceof TestCaseElement || element instanceof TestSuiteElement) {
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
		if (element instanceof ITestSuiteElement) {
			String baseName = AbstractJnarioOpenTestAction.extractTestName((TestElement)element);
			if (isAllPendingOrIgnored((TestSuiteElement) element, false)) {
				return Strings.markAsIgnored(new StringBuilder(baseName)).toString();
			} else if (isAllPendingOrIgnored((TestSuiteElement) element, true)) {
				return Strings.markAsPending(new StringBuilder(baseName)).toString();
			}
			return baseName;
		}
		return "unknown";
	}

	private boolean isAllPendingOrIgnored(ITestElementContainer element, boolean includePending) {
		if (element.getChildren().length == 0) {
			return false;
		}
		for (ITestElement child : element.getChildren()) {
			if (child instanceof TestCaseElement) {
				if (!((TestCaseElement) child).isIgnored()) {
					return false;
				} else if(!includePending && Strings.isMarkedAsPending(((TestCaseElement) child).getTestName())) {
					return false;
				}
			} else if (child instanceof ITestElementContainer) {
				if (!isAllPendingOrIgnored((ITestElementContainer) child, includePending)) {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;
	}

	public StyledString getStyledLabel(ViewPart part, ITestElement element,
			int layout) {
		return null;
	}
}
