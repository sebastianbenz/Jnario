/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.spec.typing;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xtend2.typing.Xtend2TypeProvider;

import com.google.inject.Singleton;

import de.bmw.carit.jnario.spec.spec.Assertion;
/**
 * @author Sebastian Benz
 */
@SuppressWarnings("restriction")
@Singleton
public class SpecTypeProvider extends Xtend2TypeProvider {
	
	@Override
	protected JvmTypeReference expectedType(EObject container, EReference reference, int index,
			boolean rawType) {
		if(isInAssertion(container)){
			return getTypeReferences().getTypeForName(Boolean.TYPE, container);
		}else{
			return super.expectedType(container, reference, index, rawType);
		}
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
		} else {
			return super.type(expression, rawExpectation, rawType);
		}
	}

	protected JvmTypeReference _type(Assertion assertion, JvmTypeReference rawExpectation, boolean rawType) {
		return getTypeReferences().getTypeForName(Void.TYPE, assertion);
	}
}
