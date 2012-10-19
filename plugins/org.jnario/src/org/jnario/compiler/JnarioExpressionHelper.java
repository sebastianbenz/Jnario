package org.jnario.compiler;

import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;
import static org.jnario.jvmmodel.DoubleArrowSupport.isDoubleArrow;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.typing.XtendExpressionHelper;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XClosure;
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
		EObject parent = featureCall.eContainer();
		while(parent != null){
			if(parent instanceof Should){
				return true;
			}else if(parent instanceof Assertion){
				return true;
			}else if (parent instanceof XClosure) {
				return false;
			}
			parent = parent.eContainer();
		}
		return false;
	}

}
