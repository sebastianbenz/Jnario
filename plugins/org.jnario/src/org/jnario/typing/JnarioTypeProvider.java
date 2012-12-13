/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.typing;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend.core.typing.XtendTypeProvider;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.jnario.Assertion;
import org.jnario.ExampleColumn;
import org.jnario.ExampleTable;
import org.jnario.MockLiteral;
import org.jnario.Should;
import org.jnario.ShouldThrow;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.inject.Singleton;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@Singleton
public class JnarioTypeProvider extends XtendTypeProvider {
	
	@Override
	protected JvmTypeReference expectedType(EObject container, EReference reference, int index, boolean rawType) {
		if(isInAssertion(container)){
			return booleanType(container);
		}else if(container instanceof ExampleTable){
			return getTypeReferences().getTypeForName(Void.TYPE, container);
		}else{
			return super.expectedType(container, reference, index, rawType);
		}
	}

	protected JvmTypeReference booleanType(EObject container) {
		return getTypeReferences().getTypeForName(Boolean.TYPE, container);
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
		}else if (expression instanceof Should) {
			return _type((Should)expression, rawExpectation, rawType);
		}else if (expression instanceof ShouldThrow) {
			return _type((ShouldThrow)expression, rawExpectation, rawType);
		}else if (expression instanceof MockLiteral) {
			return _type((MockLiteral)expression, rawExpectation, rawType);
		}else if (expression instanceof ExampleColumn) {
			return _type((ExampleColumn)expression, rawExpectation, rawType);
		}else {
			return super.type(expression, rawExpectation, rawType);
		}
	}
	
	protected JvmTypeReference _type(ExampleColumn object, JvmTypeReference rawExpectation, boolean rawType) {
		List<JvmTypeReference> types = Lists.transform(object.getCells(), new Function<XExpression, JvmTypeReference>() {
			public JvmTypeReference apply(XExpression expr){
				return getType(expr);
			}
		});
		return getCommonType(types);
	}

	protected JvmTypeReference _type(MockLiteral object, JvmTypeReference rawExpectation, boolean rawType) {
		JvmParameterizedTypeReference typeRef = getTypesFactory().createJvmParameterizedTypeReference();
		typeRef.setType(object.getType());
		return typeRef;
	}
	
	protected JvmTypeReference _type(Assertion assertion, JvmTypeReference rawExpectation, boolean rawType) {
		return booleanType(assertion);
	}
	
	protected JvmTypeReference _type(Should should, JvmTypeReference rawExpectation, boolean rawType) {
		return booleanType(should);
	}
	
	protected JvmTypeReference _type(ShouldThrow should, JvmTypeReference rawExpectation, boolean rawType) {
		return booleanType(should);
	}
	
}
