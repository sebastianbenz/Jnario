/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.conversion

import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.IValueConverter

class SuiteValueConverterService extends XbaseValueConverterService {
	
	val textValueConverter = new TextValueConverter(":", "")
	val patternValueConverter = new PatternValueConverter
	val suiteValueConverter = new SuiteValueConverter("#".charAt(0))
	
	@ValueConverter(rule = "TEXT")
	def IValueConverter<String> getTextValueConverter() {
		return textValueConverter;
	}

	@ValueConverter(rule = "PATTERN")
	def IValueConverter<String> getPatternValueConverter() {
		return patternValueConverter;
	}
	
	@ValueConverter(rule = "SUITE_NAME")
	def IValueConverter<String> getSuiteValueConverter() {
		return suiteValueConverter;
	}
}