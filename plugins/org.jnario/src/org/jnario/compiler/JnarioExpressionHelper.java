package org.jnario.compiler;

import static com.google.common.collect.Iterators.concat;
import static com.google.common.collect.Iterators.filter;
import static org.jnario.jvmmodel.DoubleArrowSupport.isDoubleArrow;
import static org.jnario.util.EObjects.allParents;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.typing.XtendExpressionHelper;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.jnario.Assertion;

public class JnarioExpressionHelper extends XtendExpressionHelper {

	@Override
	public boolean isShortCircuitOperation(XAbstractFeatureCall featureCall) {
//		if (!(featureCall instanceof XBinaryOperation)) {
//			return false;
//		}
		if (isInAssertion(featureCall)) {
			return false;
		}
		return super.isShortCircuitOperation(featureCall);
	}

	protected boolean isInAssertion(XAbstractFeatureCall featureCall) {
		Iterator<XExpression> context = concat(filterExpressions(featureCall.eAllContents()), filterExpressions(allParents(featureCall)));
		while(context.hasNext()){
			XExpression current = context.next();
			if(isDoubleArrow((XExpression)current)){
				return true;
			}else if(current instanceof Assertion){
				return true;
			}else if (current instanceof XClosure) {
				return false;
			}
		}
		return false;
	}

	private Iterator<XExpression> filterExpressions(
			Iterator<EObject> elements) {
		return filter(elements, XExpression.class);
	}


	public boolean isLiteral(XExpression expr) {
		return expr instanceof XClosure
				|| expr instanceof XStringLiteral
				|| expr instanceof XTypeLiteral
				|| expr instanceof XBooleanLiteral
				|| expr instanceof XNumberLiteral
				|| expr instanceof XNullLiteral
				|| expr instanceof XAnnotation;
	}

}
