/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.unit.validation

import com.google.inject.Inject
import org.jnario.feature.feature.GivenReference
import org.jnario.runner.InstantiateWith
import org.jnario.jnario.test.util.ModelStore
import org.jnario.jnario.test.util.SpecTestInstantiator
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.junit4.validation.RegisteredValidatorTester

import static org.jnario.jnario.test.util.Query.*

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@InstantiateWith(typeof(SpecTestInstantiator))
describe "JnarioValidator"{

	@Inject ModelStore modelStore
	
	
	def validate(Class<? extends EObject> type){
		val target = query(modelStore).first(type)
		return RegisteredValidatorTester::validateObj(target)
	}
}