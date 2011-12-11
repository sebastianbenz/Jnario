package de.bmw.carit.jnario.spec.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.xtend2.conversion.Xtend2ValueConverterService;

import com.google.inject.Inject;

public class SpecValueConverterService extends Xtend2ValueConverterService {

	@Inject
	private MethodNameConverter validIDConverter;

	@ValueConverter(rule = "ValidID")
	public IValueConverter<String> getValidIDConverter() {
		return validIDConverter;
	}
	
	@ValueConverter(rule = "Method")
	public IValueConverter<String> getMethodConverter() {
		return validIDConverter;
	}
}
