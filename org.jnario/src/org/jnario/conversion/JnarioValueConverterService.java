package org.jnario.conversion;

import org.eclipse.xtend.core.conversion.XtendValueConverterService;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

import com.google.inject.Inject;

public class JnarioValueConverterService extends XtendValueConverterService {
	
	@Inject ShouldValueConverter shouldValueConverter;
	
	@ValueConverter(rule = "Should")
	public IValueConverter<String> getShouldValueConverter() {
		return shouldValueConverter;
	}

}
