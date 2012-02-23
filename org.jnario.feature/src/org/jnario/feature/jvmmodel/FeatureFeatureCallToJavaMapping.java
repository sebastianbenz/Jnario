/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.jvmmodel;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.Collections.emptyList;

import java.util.List;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.impl.FeatureCallToJavaMapping;

import com.google.common.collect.Lists;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureFeatureCallToJavaMapping extends FeatureCallToJavaMapping {
	
	/**
	 *  based on FeatureCallToJavaMapping, removed check for constructor
	 */
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
