package org.jnario.suite.unit;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.suite.conversion.SuiteValueConverterService;
import org.jnario.suite.unit.TextValueConverterToStringStringSpec;
import org.jnario.suite.unit.TextValueConverterToValueStringINodeSpec;
import org.junit.runner.RunWith;

@Contains({ TextValueConverterToStringStringSpec.class, TextValueConverterToValueStringINodeSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("TextValueConverter")
public class TextValueConverterSpec {
  final IValueConverter<String> subject = new Function0<IValueConverter<String>>() {
    public IValueConverter<String> apply() {
      SuiteValueConverterService _suiteValueConverterService = new SuiteValueConverterService();
      IValueConverter<String> _textValueConverter = _suiteValueConverterService.getTextValueConverter();
      return _textValueConverter;
    }
  }.apply();
}
