/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.typing;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend.core.typing.XtendTypeProvider;
import org.eclipse.xtext.common.types.JvmDelegateTypeReference;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.typing.Closures;
import org.eclipse.xtext.xtype.impl.XFunctionTypeRefImplCustom;
import org.jnario.Assertion;
import org.jnario.Matcher;
import org.jnario.Should;
import org.jnario.ShouldThrow;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@Singleton
public class JnarioTypeProvider extends XtendTypeProvider {
	
	@Inject
	private Closures closures;
	
	@Override
	protected JvmTypeReference expectedType(EObject container, EReference reference, int index,
			boolean rawType) {
		if(isInAssertion(container)){
			return booleanType(container);
		}
		else if(isInMatcher(container)){
			return _expectedType((Matcher) container, rawType);
		}else if(container instanceof Should){
			return _expectedType((Should) container, reference, rawType);
		}
		else{
			return super.expectedType(container, reference, index, rawType);
		}
	}

	private JvmTypeReference _expectedType(Should should, EReference reference, boolean rawType) {
		if(reference == XbasePackage.Literals.XBINARY_OPERATION__RIGHT_OPERAND && should.getLeftOperand() != null && should.getRightOperand() instanceof Matcher){
			JvmTypeReference leftType = getType(should.getLeftOperand());
			return getTypeReferences().getTypeForName(org.hamcrest.Matcher.class, should, leftType);
		}
		return null;
	}

	private JvmTypeReference _expectedType(Matcher matcher,
			boolean rawType) {
		JvmTypeReference expectedType = expectedFromContainer(matcher, rawType);
		if (!(expectedType instanceof JvmParameterizedTypeReference)) {
			return expectedType;
		}
		JvmParameterizedTypeReference parameterizedTypeReference = (JvmParameterizedTypeReference) expectedType;
		if(parameterizedTypeReference.getArguments().isEmpty()){
			return expectedType;
		}
		List<JvmTypeReference> arguments = newArrayList(parameterizedTypeReference.getArguments().get(0));
		return closures.createFunctionTypeRef(matcher, arguments, booleanType(matcher), true);
	}

	private JvmTypeReference expectedFromContainer(Matcher matcher,
			boolean rawType) {
		EObject container = matcher.eContainer();
		EReference feature = matcher.eContainmentFeature();
		int index;
		if(feature.isMany()){
			index = ((EList<?>)container.eGet(feature)).indexOf(matcher);
		}else{
			index = -1;
		}
		JvmTypeReference expectedType = expectedType(container, feature, index, rawType);
		return expectedType;
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
		}if (expression instanceof Should) {
			return _type((Should)expression, rawExpectation, rawType);
		}if (expression instanceof Matcher) {
			return _type((Matcher)expression, rawExpectation, rawType);
		}if (expression instanceof ShouldThrow) {
			return _type((ShouldThrow)expression, rawExpectation, rawType);
		}else {
			return super.type(expression, rawExpectation, rawType);
		}
	}

	protected JvmTypeReference _type(Assertion assertion, JvmTypeReference rawExpectation, boolean rawType) {
		return getPrimitiveVoid(assertion);
	}
	
	protected JvmTypeReference _type(Should should, JvmTypeReference rawExpectation, boolean rawType) {
		return getPrimitiveVoid(should);
	}
	
	protected JvmTypeReference _type(ShouldThrow should, JvmTypeReference rawExpectation, boolean rawType) {
		return getPrimitiveVoid(should);
	}
	
	protected JvmTypeReference _type(final Matcher matcher, JvmTypeReference rawExpectation, final boolean rawType) {
		XFunctionTypeRefImplCustom closureType = (XFunctionTypeRefImplCustom) getType(matcher.getClosure());
		JvmTypeReference matchedType = getPrimitiveVoid(matcher);
		if(closureType == null || closureType.getParamTypes().isEmpty()){
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
