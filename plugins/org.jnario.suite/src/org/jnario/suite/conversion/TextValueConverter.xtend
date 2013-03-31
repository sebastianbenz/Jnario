/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.conversion

import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode

class TextValueConverter extends SuiteValueConverter {
	
	val String prefix
	val String postfix
	
	new(String prefix, String postfix) {
		super(":".charAt(0))
		this.prefix = prefix
		this.postfix = postfix
	}
	
	override toString(String value) throws ValueConverterException {
		prefix + super.toString(value) + postfix
	}
	
	override toValue(String input, INode node) throws ValueConverterException {
		var string = super.toValue(input, node)
		var result = ""
		if(string != null){
			result = string.substring(prefix.length, string.length - postfix.length).trim
		}
		return result
	}
	
}