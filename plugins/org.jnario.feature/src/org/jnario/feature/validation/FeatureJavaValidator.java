/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.validation;

import static com.google.common.base.Strings.isNullOrEmpty;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Sets.newHashSet;
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend.core.xtend.XtendPackage;
import org.eclipse.xtend.core.xtend.XtendTypeDeclaration;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.NamesAreUniqueValidator;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.validation.IssueCodes;
import org.jnario.ExampleTable;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.naming.FeatureClassNameProvider;
import org.jnario.feature.naming.StepNameProvider;
import org.jnario.validation.JnarioJavaValidator;

import com.google.inject.Inject;

/**
 * @author Birgit Engelmann - Initial contribution and API
 * @author Sebastian Benz
 */
@ComposedChecks(validators={JnarioJavaValidator.class, NamesAreUniqueValidator.class})
public class FeatureJavaValidator extends AbstractFeatureJavaValidator {
	
	@Inject StepNameProvider nameProvider;
	@Inject FeatureClassNameProvider classNameProvider;

	@Check
	protected void checkModifiers(XtendClass xtendClass) {
		if (!(xtendClass instanceof Scenario)) {
			super.checkModifiers(xtendClass);
		}
	}
	
	@Check(CheckType.FAST)
	public void checkFeaturesHaveAName(Feature feature){
		if(isNullOrEmpty(feature.getName())){
			error("Features should have a description", XtendPackage.Literals.XTEND_TYPE_DECLARATION__NAME);
		}
	}
	
	@Check(CheckType.FAST)
	public void checkDuplicateScenarioNames(Feature feature){
		Set<String> names = newHashSet();
		for (Scenario scenario : feature.getScenarios()) {
			if(!names.add(classNameProvider.toJavaClassName(scenario))){
				error("Duplicate scenario: '" + scenario.getName() + "'", XtendPackage.Literals.XTEND_TYPE_DECLARATION__NAME);
			}
		}
	}
	
	public String removeKeywords(String string){
		return nameProvider.removeKeywords(string).trim();
	}
	
	
	@Check(CheckType.FAST)
	public void checkFeaturesHaveAName(Scenario scenario){
		if (scenario instanceof Background) {
			return;
		}
		String name = removeKeywords(scenario.getName());
		if(isNullOrEmpty(name)){
			error("Scenarios should have a description", XtendPackage.Literals.XTEND_TYPE_DECLARATION__NAME);
		}
	}
	
	@Check(CheckType.FAST)
	public void checkStepsHaveAName(Step step){
		String name = nameProvider.nameOf(step);
		name = nameProvider.removeKeywords(name);
		if(isNullOrEmpty(name)){
			error("Steps should have a description", XtendPackage.Literals.XTEND_FUNCTION__NAME);
		}
	}
	
	@Override
	public void checkVariableDeclaration(XVariableDeclaration declaration) {
		if(getContainerOfType(declaration, ExampleTable.class) == null){
			super.checkVariableDeclaration(declaration);
		}
	}
	
	
	@Override
	public  void checkLocalUsageOfDeclared(XVariableDeclaration variableDeclaration) {
	}
	
	protected void warning(String message, EObject source, EStructuralFeature feature, String code, String... issueData) {
		// avoids overriding the whole method
		if("The use of wildcard imports is deprecated.".equals(message)){
			return;
		}
		getMessageAcceptor().acceptWarning(message, source, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, code, issueData);
	}

	@Check
	public void checkAbstract(XtendFunction function) {
		if (function instanceof Step) {
			return;
		}
		super.checkAbstract(function);
	}
	
	protected void error(String message, EObject source, EStructuralFeature feature, int index, String code, String... issueData) {
		if(NodeModelUtils.getNode(source) == null){
			source = EcoreUtil2.getContainerOfType(source, Step.class);
			feature = XtendPackage.Literals.XTEND_FUNCTION__NAME;
		}
		getMessageAcceptor().acceptError(message, source, feature, index, code, issueData);
	}
	
	
	@Check
	public void checkConflictingFields(Scenario scenario){
		
		Iterable<XtendField> fields = filter(scenario.getMembers(), XtendField.class);
		Set<String> names = new HashSet<String>();
		for (XtendField xtendField : fields) {
			if(names.contains(xtendField.getName())){
				
			}else{
				names.add(xtendField.getName());
			}
		}
	}
	
	@Override
	@Check
	public void checkDuplicateAndOverriddenFunctions(
			XtendTypeDeclaration xtendType) {
	}
	
	@Override
	protected void addIssue(String message, EObject source, String issueCode) {
		if(IssueCodes.IMPORT_WILDCARD_DEPRECATED == issueCode){
			return;
		}
		super.addIssue(message, source, issueCode);
	}
}
