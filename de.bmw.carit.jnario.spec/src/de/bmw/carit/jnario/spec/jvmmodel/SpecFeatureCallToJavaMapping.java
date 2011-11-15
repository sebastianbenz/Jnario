package de.bmw.carit.jnario.spec.jvmmodel;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.Collections.emptyList;

import java.util.List;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.impl.FeatureCallToJavaMapping;

import com.google.common.collect.Lists;

public class SpecFeatureCallToJavaMapping extends FeatureCallToJavaMapping {
	
	public List<XExpression> getActualArguments(
			XAbstractFeatureCall featureCall, 
			JvmIdentifiableElement feature, 
			XExpression implicitReceiver, 
			XExpression implicitFirstArgument) {
		final List<? extends XExpression> explicitArguments = featureCall.getExplicitArguments();
		if (isStaticJavaFeature(feature)) {
			if (implicitReceiver == null || explicitArguments.contains(implicitReceiver) || implicitReceiver.toString().equals("<unkown>"))
				return newArrayList(explicitArguments);
			List<XExpression> result = newArrayList(implicitReceiver);
			result.addAll(explicitArguments);
			return result;
		} else if (implicitReceiver != null) {
			if (implicitFirstArgument != null) {
				List<XExpression> result = Lists.newArrayList(implicitFirstArgument);
				result.addAll(explicitArguments);
				return result;
			}
			return newArrayList(explicitArguments);
		}
		if (explicitArguments.size()<=1)
			return emptyList();
		return newArrayList(explicitArguments.subList(1, explicitArguments.size()));
	}
	
}
