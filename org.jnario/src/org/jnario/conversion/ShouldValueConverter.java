package org.jnario.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

public class ShouldValueConverter implements IValueConverter<String> {

	public String toValue(String string, INode node)
			throws ValueConverterException {
		if("=>".equals(string)){
			return "should_be";
		}
		return "should_" + string.substring(string.lastIndexOf(' ') + 1);
	}

	public String toString(String value) throws ValueConverterException {
		return value.replace("_", " ");
	}

}
