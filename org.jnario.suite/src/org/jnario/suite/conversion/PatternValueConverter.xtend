package org.jnario.suite.conversion

import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode
import java.util.regex.Pattern
import java.util.regex.PatternSyntaxException
import org.eclipse.xtext.util.Strings

@Data
class PatternValueConverter implements IValueConverter<String> {
	
	override toString(String string) throws ValueConverterException {
		var result = ""
		if(string != null){
			result = "- \\" + string + "\\" + Strings::newLine
		}
		result
	}
	
	override toValue(String string, INode node) throws ValueConverterException {
		try{
			var result = string.substring(1).trim
			result = result.substring(1, result.length-1)
			Pattern::compile(result)
			return result
		}catch(PatternSyntaxException e){
			throw new ValueConverterException(e.message, node, e)
		}
	}
	
}