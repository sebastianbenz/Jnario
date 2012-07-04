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