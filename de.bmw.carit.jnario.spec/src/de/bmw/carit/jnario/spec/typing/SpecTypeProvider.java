/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.spec.typing;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmDelegateTypeReference;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.ITypeArgumentContext;
import org.eclipse.xtext.common.types.util.TypeArgumentContextProvider;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.typing.Closures;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;
import org.eclipse.xtext.xtend2.typing.Xtend2TypeProvider;
import org.eclipse.xtext.xtype.impl.XFunctionTypeRefImplCustom;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.bmw.carit.jnario.common.Assertion;
import de.bmw.carit.jnario.common.Matcher;
/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
@Singleton
public class SpecTypeProvider extends Xtend2TypeProvider {
	
	@Inject
	private Closures closures;
	
	@Override
	protected JvmTypeReference expectedType(EObject container, EReference reference, int index,
			boolean rawType) {
		if(isInAssertion(container)){
			return booleanType(container);
		}
		else if(isInMatcher(container)){
			JvmTypeReference expectedType = super.expectedType(container.eContainer(), container.eContainmentFeature(), index, rawType);
			if (expectedType instanceof JvmParameterizedTypeReference) {
				JvmParameterizedTypeReference parameterizedTypeReference = (JvmParameterizedTypeReference) expectedType;
				return closures.createFunctionTypeRef(container, newArrayList(parameterizedTypeReference.getArguments().get(0)), booleanType(container), true);
			}
			return expectedType;
		}
		else{
			return super.expectedType(container, reference, index, rawType);
		}
	}

	protected JvmTypeReference booleanType(EObject container) {
		return getTypeReferences().getTypeForName(Boolean.TYPE, container);
	}

	protected boolean isInMatcher(EObject container) {
		return container instanceof Matcher;
	}
	
	protected boolean isInAssertion(EObject container) {
		if(container instanceof Assertion){
			return true;
		}
		return container instanceof XBlockExpression && container.eContainer() instanceof Assertion;
	}
	
	@Override
	protected JvmTypeReference type(XExpression expression, JvmTypeReference rawExpectation, boolean rawType) {
		if (expression instanceof Assertion) {
			return _type((Assertion)expression, rawExpectation, rawType);
		} if (expression instanceof Matcher) {
			return _type((Matcher)expression, rawExpectation, rawType);
		}else {
			return super.type(expression, rawExpectation, rawType);
		}
	}

	protected JvmTypeReference _type(Assertion assertion, JvmTypeReference rawExpectation, boolean rawType) {
		return getPrimitiveVoid(assertion);
	}
	
	protected JvmTypeReference _type(final Matcher matcher, JvmTypeReference rawExpectation, final boolean rawType) {
		XFunctionTypeRefImplCustom closureType = (XFunctionTypeRefImplCustom) getType(matcher.getClosure());
		JvmTypeReference matchedType = getPrimitiveVoid(matcher);
		if(closureType.getParamTypes().isEmpty()){
			JvmTypeReference enclosingType = getExpectedReturnType((XExpression)matcher.eContainer(), rawType);
			if (enclosingType instanceof JvmParameterizedTypeReference) {
				JvmParameterizedTypeReference parameterizedTypeReference = (JvmParameterizedTypeReference) enclosingType;
				if(!parameterizedTypeReference.getArguments().isEmpty()){
					matchedType = parameterizedTypeReference.getArguments().get(0);
				}
			}
		}else{ 
			matchedType = closureType.getParamTypes().get(0);
		}
		JvmDelegateTypeReference delegate = getTypesFactory().createJvmDelegateTypeReference();
		delegate.setDelegate(matchedType);
		return getTypeReferences().getTypeForName(org.hamcrest.Matcher.class.getName(), matcher, delegate);
	}
}
