/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.conversion

import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode
import java.util.regex.Pattern
import java.util.regex.PatternSyntaxException
import org.eclipse.xtext.util.Strings
import static extension com.google.common.base.Strings.*

class PatternValueConverter implements IValueConverter<String> {
	
	override toString(String string) throws ValueConverterException {
		var result = string
		if(result == null){
			result = ""
		}
		"\\" + result + "\\" + Strings::newLine
	}
	
	override toValue(String string, INode node) throws ValueConverterException {
		try{
			if(string.nullOrEmpty) return null
			var begin = string.indexOf("\\")
			var end = string.lastIndexOf("\\")
			val result = string.substring(begin+1, end)
			Pattern::compile(result)
			return result
		}catch(PatternSyntaxException e){
			throw new ValueConverterException(e.message, node, e)
		}
	}
	
}