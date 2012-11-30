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
import static com.google.common.collect.Maps.newHashMap;
import static com.google.common.collect.Sets.newHashSet;
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend.core.validation.IssueCodes;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend.core.xtend.XtendImport;
import org.eclipse.xtend.core.xtend.XtendPackage;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
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
@ComposedChecks(validators={JnarioJavaValidator.class})
public class FeatureJavaValidator extends AbstractFeatureJavaValidator {
	
	@Inject StepNameProvider nameProvider;
	@Inject FeatureClassNameProvider classNameProvider;

	@Override
	public void checkInnerExpressions(XExpression block) {
		super.checkInnerExpressions(block);
	}
	
	@Check(CheckType.FAST)
	public void checkFeaturesHaveAName(Feature feature){
		if(isNullOrEmpty(feature.getName())){
			error("Features should have a description", XtendPackage.Literals.XTEND_CLASS__NAME);
		}
	}
	
	@Check(CheckType.FAST)
	public void checkDuplicateScenarioNames(Feature feature){
		Set<String> names = newHashSet();
		for (Scenario scenario : feature.getScenarios()) {
			if(!names.add(classNameProvider.toJavaClassName(scenario))){
				error("Duplicate scenario: '" + scenario.getName() + "'", XtendPackage.Literals.XTEND_CLASS__NAME);
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
			error("Scenarios should have a description", XtendPackage.Literals.XTEND_CLASS__NAME);
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
	protected void checkDeclaredVariableName(EObject nameDeclarator, EObject attributeHolder, EAttribute attr) {
		if (nameDeclarator.eContainer() == null)
			return;
		if (attr.getEContainingClass().isInstance(attributeHolder)) {
			String name = (String) attributeHolder.eGet(attr);
			// shadowing 'it' is allowed
			if (name == null || name.equals(XbaseScopeProvider.IT.toString()))
				return;
			int idx = 0;
			if (nameDeclarator.eContainer() instanceof XBlockExpression) {
				idx = ((XBlockExpression)nameDeclarator.eContainer()).getExpressions().indexOf(nameDeclarator);
			}
			IScope scope = getScopeProvider().createSimpleFeatureCallScope(nameDeclarator.eContainer(), XbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE, nameDeclarator.eResource(), true, idx);
			Iterable<IEObjectDescription> elements = scope.getElements(QualifiedName.create(name));
			for (IEObjectDescription desc : elements) {
				if (desc.getEObjectOrProxy()!=nameDeclarator && !(desc.getEObjectOrProxy() instanceof JvmFeature)) {
					error("Duplicate variable name '"+name+"'", attributeHolder, attr,-1, org.eclipse.xtext.xbase.validation.IssueCodes.VARIABLE_NAME_SHADOWING);
				}
			}
		}
	}
	
	@Check
	public void checkImports(XtendFile file) {
		final Map<JvmType, XtendImport> imports = newHashMap();
		final Map<JvmType, XtendImport> staticImports = newHashMap();
		final Map<String, JvmType> importedNames = newHashMap();
		
		for (XtendImport imp : file.getImports()) {
			if (imp.getImportedNamespace() != null) {
				warning("The use of wildcard imports is deprecated.", imp, null, IssueCodes.IMPORT_WILDCARD_DEPRECATED);
			} else {
				JvmType importedType = imp.getImportedType();
				if (importedType != null && !importedType.eIsProxy()) {
					Map<JvmType, XtendImport> map = imp.isStatic() ? staticImports : imports;
					if (map.containsKey(importedType)) {
						warning("Duplicate import of '" + importedType.getSimpleName() + "'.", imp, null,
								IssueCodes.IMPORT_DUPLICATE);
					} else {
						map.put(importedType, imp);
						if (!imp.isStatic()) {
							JvmType currentType = importedType;
							String currentSuffix = currentType.getSimpleName();
							JvmType collidingImport = importedNames.put(currentSuffix, importedType);
							if(collidingImport != null)
								error("The import '" + importedType.getIdentifier() + "' collides with the import '" 
										+ collidingImport.getIdentifier() + "'.", imp, null, IssueCodes.IMPORT_COLLISION);
							while (currentType.eContainer() instanceof JvmType) {
								currentType = (JvmType) currentType.eContainer();
								currentSuffix = currentType.getSimpleName()+"$"+currentSuffix;
								JvmType collidingImport2 = importedNames.put(currentSuffix, importedType);
								if(collidingImport2 != null)
									error("The import '" + importedType.getIdentifier() + "' collides with the import '" 
											+ collidingImport2.getIdentifier() + "'.", imp, null, IssueCodes.IMPORT_COLLISION);
							}
						}
					}
				}
			}
		}

		for (final XtendClass xtendClass : file.getXtendClasses()) {
			String clazzName = classNameProvider.toJavaClassName(xtendClass);
			if(importedNames.containsKey(clazzName)){
				JvmType importedType = importedNames.get(clazzName);
				if(importedType != null){
					XtendImport xtendImport = imports.get(importedType);
					if(xtendImport != null)
						error("The import '" + importedType.getIdentifier() + "' conflicts with a type defined in the same file", xtendImport, null, IssueCodes.IMPORT_CONFLICT );
				}
			}
			ICompositeNode node = NodeModelUtils.findActualNodeFor(xtendClass);
			if (node != null) {
				for (INode n : node.getAsTreeIterable()) {
					if (n.getGrammarElement() instanceof CrossReference) {
						EClassifier classifier = ((CrossReference) n.getGrammarElement()).getType().getClassifier();
						if (classifier instanceof EClass
								&& (TypesPackage.Literals.JVM_TYPE.isSuperTypeOf((EClass) classifier) || TypesPackage.Literals.JVM_CONSTRUCTOR
										.isSuperTypeOf((EClass) classifier))) {
							// Filter out HiddenLeafNodes to avoid confusion by comments etc.
							StringBuilder builder = new StringBuilder();
							for(ILeafNode leafNode : n.getLeafNodes()){
								if(!leafNode.isHidden()){
									builder.append(leafNode.getText());
								}
							}
							String simpleName = builder.toString().trim();
							// handle StaticQualifier Workaround (see Xbase grammar)
							if (simpleName.endsWith("::"))
								simpleName = simpleName.substring(0, simpleName.length() - 2);
							if (importedNames.containsKey(simpleName)) {
								JvmType type = importedNames.remove(simpleName);
								imports.remove(type);
							} else {
								while (simpleName.contains("$")) {
									simpleName = simpleName.substring(0, simpleName.lastIndexOf('$'));
									if (importedNames.containsKey(simpleName)) {
										imports.remove(importedNames.remove(simpleName));
										break;
									}
								}
							}
						}
					}
				}
			}
		}
		for (XtendImport imp : imports.values()) {
			warning("The import '" + imp.getImportedTypeName() + "' is never used.", imp, null,
					IssueCodes.IMPORT_UNUSED);
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
}
