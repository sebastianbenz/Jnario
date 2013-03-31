/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.scoping

import com.google.common.base.Predicate
import org.eclipse.xtext.resource.IEObjectDescription
import org.jnario.spec.spec.SpecPackage
import static org.jnario.spec.scoping.SpecResourceDescriptionStrategy.*

class SuiteSpecFilter implements Predicate<IEObjectDescription>{
	
	extension val SpecPackage = SpecPackage::eINSTANCE 

	override apply(IEObjectDescription input) {
		switch input.EClass{
			case exampleGroup: isRoot(input)
			default: true
		}
	}
	
	def isRoot(IEObjectDescription input){
		input.getUserData(ROOT_SPEC) == TRUE
	}
	
}