package org.jnario.suite.conversion

import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode

@Data
class LinkValueConverter implements IValueConverter<String> {
	
	String prefix
	String postfix
	
	override toString(String value) throws ValueConverterException {
		prefix + value + postfix
	}
	
	override toValue(String string, INode node) throws ValueConverterException {
		var result = ""
		if(string != null){
			result = string.substring(prefix.length, string.length - postfix.length).trim
		}
		return result
	}
	
}