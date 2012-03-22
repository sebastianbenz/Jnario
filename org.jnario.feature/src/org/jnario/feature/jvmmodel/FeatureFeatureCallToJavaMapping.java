/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.jvmmodel;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;
import static java.util.Collections.emptyList;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XbaseFactory;
import org.eclipse.xtext.xbase.impl.FeatureCallToJavaMapping;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.jnario.feature.feature.Scenario;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureFeatureCallToJavaMapping extends FeatureCallToJavaMapping {
	
	@Inject
	private IJvmModelAssociations modelAssociations;
	
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
	
	@Override
	public XExpression getActualReceiver(XAbstractFeatureCall featureCall, JvmIdentifiableElement feature, XExpression implicitReceiver) {
		if (isStaticJavaFeature(feature) || feature instanceof JvmConstructor) {
			return null;
		}
		if (implicitReceiver!=null)
			return implicitReceiver;
		final List<? extends XExpression> allArguments = featureCall.getExplicitArguments();
		if (allArguments.isEmpty())
			return null;
		if(feature instanceof JvmField){
			JvmField field = (JvmField) feature;
			Scenario scenario = EcoreUtil2.getContainerOfType(featureCall, Scenario.class);
			if(scenario != null){
				List<XtendField> fields = EcoreUtil2.getAllContentsOfType(scenario, XtendField.class);
				for(XtendField existingField: fields){
					if(existingField.getName() == field.getSimpleName()){
						XFeatureCall callToThis = XbaseFactory.eINSTANCE.createXFeatureCall();
						JvmGenericType inferredJvmType = getFirstOrNull(modelAssociations.getJvmElements(scenario), JvmGenericType.class);
						callToThis.setFeature(inferredJvmType);
						return callToThis;
					}
				}
			}
		}
		return allArguments.get(0);
	}
	
	protected <T> T getFirstOrNull(Iterable<EObject> elements, Class<T> type) {
		Iterator<T> iterator = filter(elements, type).iterator();
		return iterator.hasNext() ? iterator.next() : null;
	}
	
}
