/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.linking;

import static com.google.common.collect.Iterables.concat;
import static java.util.Collections.emptyList;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XbaseFactory;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.jvmmodel.FeatureJvmModelInferrer;
import org.jnario.feature.jvmmodel.StepArgumentsProvider;
import org.jnario.linking.JnarioLazyLinker;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;

/**
 * @author Birgit Engelmann - Initial contribution and API
 * @author Sebastian Benz
 */
public class FeatureLazyLinker extends JnarioLazyLinker {
	
	@Inject StepArgumentsProvider stepArgumentsProvider;

	@Override
	protected void beforeModelLinked(EObject model,
			IDiagnosticConsumer diagnosticsConsumer) {
		super.beforeModelLinked(model, diagnosticsConsumer);
		generateStepValues(model);
	}

	private void generateStepValues(EObject model) {
		if (!(model instanceof FeatureFile)) {
			return;
		}
		FeatureFile featureFile = (FeatureFile) model;
		generateArguments(allSteps(featureFile));		
	}
	
	private Iterable<Step> allSteps(FeatureFile featureFile){
		Iterable<Step> result = emptyList();
		for (Feature feature : Iterables.filter(featureFile.getXtendClasses(), Feature.class)) {
			if(feature == null){
				return result;
			}
			if(feature.getBackground() != null){
				result = concat(result, feature.getBackground().getSteps());		
			}
			for(Scenario scenario : feature.getScenarios()){
				result = concat(result, scenario.getSteps());
			}
		}
		return result;
	}
	
	private void generateArguments(Iterable<Step> steps) {
		for(Step step: steps){
			if(step.getName() != null){
				generateArguments(step);
			}
		}
	}

	private void generateArguments(Step step) {
		List<String> arguments = stepArgumentsProvider.findStepArguments(step);
		if(arguments.isEmpty()){
			return;
		}
		EList<XExpression> expressions = step.getStepExpression().getBlockExpression().getExpressions();
		XVariableDeclaration stepValuesDec = createVariableForStepArguments();
		expressions.add(0, stepValuesDec);
		for(int i = 0; i < arguments.size(); i++){
			expressions.add(i + 1, createFeatureCall(arguments.get(i), stepValuesDec));
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
