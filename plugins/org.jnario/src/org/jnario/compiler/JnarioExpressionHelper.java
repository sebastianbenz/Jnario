package org.jnario.compiler;

import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;
import static org.jnario.jvmmodel.DoubleArrowSupport.isDoubleArrow;

import org.eclipse.xtend.core.typing.XtendExpressionHelper;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.jnario.Assertion;
import org.jnario.Should;

public class JnarioExpressionHelper extends XtendExpressionHelper {

	@Override
	public boolean isShortCircuiteBooleanOperation(
			XAbstractFeatureCall featureCall) {
		if (isInAssertion(featureCall)) {
			return false;
		}
		return super.isShortCircuiteBooleanOperation(featureCall);
	}

	protected boolean isInAssertion(XAbstractFeatureCall featureCall) {
		if(!isDoubleArrow(featureCall)){
			return true;
		}
		if(isAssertion(featureCall)){
			return true;
		}
		return isShould(featureCall);
	}

	protected boolean isShould(XAbstractFeatureCall featureCall) {
		return getContainerOfType(featureCall, Should.class) != null;
	}

	protected boolean isAssertion(XAbstractFeatureCall featureCall) {
		return getContainerOfType(featureCall, Assertion.class) != null;
	}
	
}
