/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.validation;

import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.jnario.ExampleTable;
import org.jnario.validation.JnarioJavaValidator;

/**
 * @author Birgit Engelmann - Initial contribution and API
 * @author Sebastian Benz
 */
@ComposedChecks(validators={JnarioJavaValidator.class})
public class FeatureJavaValidator extends AbstractFeatureJavaValidator {

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
	
	@Override
	public  void checkLocalUsageOfDeclared(XVariableDeclaration variableDeclaration) {
	}

}
