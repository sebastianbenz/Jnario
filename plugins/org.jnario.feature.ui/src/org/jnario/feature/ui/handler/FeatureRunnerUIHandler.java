package org.jnario.feature.ui.handler;

import org.eclipse.jdt.internal.junit.model.TestCaseElement;
import org.eclipse.jdt.internal.junit.model.TestSuiteElement;
import org.eclipse.jdt.internal.junit.ui.TestRunnerViewPart;
import org.eclipse.jdt.junit.model.ITestElement;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.part.ViewPart;
import org.jnario.ui.handler.AbstractJnarioRunnerUIHandler;

public class FeatureRunnerUIHandler extends AbstractJnarioRunnerUIHandler {

	protected Action getAction(ViewPart part, ITestElement element) {
		if (element instanceof TestCaseElement) {
			return new OpenTestFeatureAction((TestRunnerViewPart) part, (TestCaseElement) element);
		} else if (element instanceof TestSuiteElement) {
			return new OpenTestFeatureAction((TestRunnerViewPart) part, (TestSuiteElement) element);
		} else {
			throw new IllegalArgumentException(String.valueOf(element));
		}
	}
}
