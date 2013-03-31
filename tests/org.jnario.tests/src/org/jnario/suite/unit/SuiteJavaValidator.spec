/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.unit

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.junit4.validation.RegisteredValidatorTester
import org.jnario.jnario.test.util.ModelStore
import org.jnario.jnario.test.util.SuiteTestCreator
import org.jnario.runner.CreateWith
import org.jnario.suite.suite.SpecReference
import org.jnario.suite.validation.SuiteJavaValidator

import static org.jnario.jnario.test.util.Query.*

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@CreateWith(typeof(SuiteTestCreator))
describe SuiteJavaValidator{

	@Inject extension ModelStore modelStore

		fact "Suite cannot include itself"{
			'''
				#MySuite
				- "MySuite"	
			'''.parseSuite
			validate(typeof(SpecReference)).assertErrorContains("Suites cannot include themselves")
		}
		
	def validate(Class<? extends EObject> type){
		val target = query(modelStore).first(type)
		return RegisteredValidatorTester::validateObj(target)
	}
}