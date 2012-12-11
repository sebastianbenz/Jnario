package org.jnario.suite.unit;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.suite.conversion.SuiteValueConverterService;
import org.jnario.suite.unit.TextValueConverterToStringSpec;
import org.jnario.suite.unit.TextValueConverterToValueSpec;
import org.junit.runner.RunWith;

@Contains({ TextValueConverterToStringSpec.class, TextValueConverterToValueSpec.class })
@SuppressWarnings("all")
@Named("TextValueConverter")
@RunWith(ExampleGroupRunner.class)
public class TextValueConverterSpec {
  final IValueConverter<String> subject = new Function0<IValueConverter<String>>() {
    public IValueConverter<String> apply() {
      SuiteValueConverterService _suiteValueConverterService = new SuiteValueConverterService();
      IValueConverter<String> _textValueConverter = _suiteValueConverterService.getTextValueConverter();
      return _textValueConverter;
    }
  }.apply();
}
