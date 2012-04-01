package org.jnario.feature.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

public class FeatureValueConverter implements IValueConverter<String> {

	private final String prefix;

	public static FeatureValueConverter create(String prefix) {
		return new FeatureValueConverter(prefix);
	}

	public FeatureValueConverter(String prefix) {
		this.prefix = prefix;
	}

	public String toValue(String string, INode node)
			throws ValueConverterException {
		if(string == null){
			return null;
		}
		if(string.length() < prefix.length()){
			return string;
		}
		return string.substring(prefix.length()).trim();
	}

	public String toString(String value) throws ValueConverterException {
		if(value == null){
			return null;
		}
		return prefix + value + Strings.newLine();
	}
}
