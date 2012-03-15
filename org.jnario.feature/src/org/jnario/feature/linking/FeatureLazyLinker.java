/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.linking;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XbaseFactory;
import org.jnario.feature.feature.Step;
import org.jnario.feature.jvmmodel.FeatureJvmModelInferrer;
import org.jnario.linking.JnarioLazyLinker;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
public class FeatureLazyLinker extends JnarioLazyLinker {

	private static Pattern ARG_PATTERN = Pattern.compile("\"([a-zA-Z0-9_\\.]+)\"");

	@Override
	protected void beforeModelLinked(EObject model,
			IDiagnosticConsumer diagnosticsConsumer) {
		super.beforeModelLinked(model, diagnosticsConsumer);
		generateStepValues(model);
	}

	private void generateStepValues(EObject model) {
		List<Step> steps = EcoreUtil2.getAllContentsOfType(model, Step.class);
		for(Step step: steps){
			String name = step.getName();
			if(name != null){
				Matcher matcher = ARG_PATTERN.matcher(name);
				if(matcher.find()){
					EList<XExpression> expressions = step.getStepExpression().getBlockExpression().getExpressions();
					XVariableDeclaration stepValuesDec = createVariableForStepArguments();
					expressions.add(0, stepValuesDec);
					int i = 1;
					do{
						expressions.add(i, createFeatureCall(name.substring(matcher.start(1), matcher.end(1)), stepValuesDec));
						i++;
					}while(matcher.find());
				}
			}
		}		
	}

	private XVariableDeclaration createVariableForStepArguments(){
		XVariableDeclaration variableDec = XbaseFactory.eINSTANCE.createXVariableDeclaration();
		variableDec.setName(FeatureJvmModelInferrer.STEP_VALUES);
		XConstructorCall constructor = XbaseFactory.eINSTANCE.createXConstructorCall();
		variableDec.setRight(constructor);
		return variableDec;
	}

	private XMemberFeatureCall createFeatureCall(String value, XVariableDeclaration dec){
		XFeatureCall featureCall = XbaseFactory.eINSTANCE.createXFeatureCall();
		featureCall.setFeature(dec);
		XStringLiteral stringLiteral = XbaseFactory.eINSTANCE.createXStringLiteral();
		stringLiteral.setValue(value);
		XMemberFeatureCall memberFeatureCall = XbaseFactory.eINSTANCE.createXMemberFeatureCall();		
		memberFeatureCall.setMemberCallTarget(featureCall);
		memberFeatureCall.getMemberCallArguments().add(stringLiteral);
		return memberFeatureCall;
	}

}
