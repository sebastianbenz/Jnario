package org.jnario.jvmmodel;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XBinaryOperation;

public class DoubleArrowSupport {

	public static boolean isDoubleArrow(XAbstractFeatureCall expr) {
		if (!(expr instanceof XBinaryOperation)) {
			return false;
		}
		JvmIdentifiableElement feature = expr.getFeature();
		return feature != null && "operator_doubleArrow".equals(feature.getSimpleName());
	}

}
