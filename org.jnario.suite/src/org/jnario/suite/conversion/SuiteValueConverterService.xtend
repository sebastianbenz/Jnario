package org.jnario.suite.conversion

import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.IValueConverter

class SuiteValueConverterService extends XbaseValueConverterService {
	
	val linkValueConverter = new LinkValueConverter("-", "")
	val textValueConverter = new LinkValueConverter(":", "")
	val suiteValueConverter = new LinkValueConverter("Suite:", "")
	val patternValueConverter = new PatternValueConverter
	
	@ValueConverter(rule = "LINK")
	def IValueConverter<String> getLinkValueConverter() {
		return linkValueConverter;
	}
	
	@ValueConverter(rule = "TEXT")
	def IValueConverter<String> getTextValueConverter() {
		return textValueConverter;
	}
	
	@ValueConverter(rule = "SUITE_NAME")
	def IValueConverter<String> getSuiteValueConverter() {
		return suiteValueConverter;
	}
	
	@ValueConverter(rule = "PATTERN")
	def IValueConverter<String> getPatternValueConverter() {
		return patternValueConverter;
	}
}