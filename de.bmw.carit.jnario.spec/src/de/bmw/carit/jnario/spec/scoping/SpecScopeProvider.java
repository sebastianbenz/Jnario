/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.spec.scoping;

import static com.google.common.collect.Iterables.filter;
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;
import static org.eclipse.xtext.scoping.Scopes.scopeFor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xtend2.scoping.Xtend2ScopeProvider;

import com.google.common.base.Function;
import com.google.inject.Inject;

import de.bmw.carit.jnario.spec.naming.OperationNameProvider;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;
import de.bmw.carit.jnario.spec.spec.SpecPackage;
/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class SpecScopeProvider extends Xtend2ScopeProvider {
	
	@Inject
	private OperationNameProvider operationNameProvider;
	
	@Override
	public IScope getScope(EObject context, EReference reference) {
		if(reference == SpecPackage.Literals.EXAMPLE_GROUP__TARGET_OPERATION){
			return targetOperation(context, reference);
		}
		return super.getScope(context, reference);
	}

	private IScope targetOperation(EObject subject, EReference reference) {
		ExampleGroup context = getContainerOfType(subject.eContainer(), ExampleGroup.class);
		if(context == null){
			return IScope.NULLSCOPE;
		}
		
		JvmTypeReference targetTypeReference = context.getTargetType();
		if(targetTypeReference == null){
			return IScope.NULLSCOPE;
		}
		
		JvmType targetType = targetTypeReference.getType();
		if(targetType == null || targetType.eIsProxy()){
			return IScope.NULLSCOPE;
		}
		if (!(targetType instanceof JvmGenericType)) {
			return IScope.NULLSCOPE;
		}
		Iterable<JvmOperation> operations = filter(((JvmGenericType) targetType).getMembers(), JvmOperation.class);
		
		IScope simpleNames = scopeFor(operations, simpleNameProvider(), IScope.NULLSCOPE);
		return scopeFor(operations, operationNameProvider, simpleNames);
	}

	private Function<JvmOperation, QualifiedName> simpleNameProvider() {
		return new Function<JvmOperation, QualifiedName>(){

			public QualifiedName apply(JvmOperation input) {
				return QualifiedName.create(input.getSimpleName());
			}
			
		};
	}
	
}
