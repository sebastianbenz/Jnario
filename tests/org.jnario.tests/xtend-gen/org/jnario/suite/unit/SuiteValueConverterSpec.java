package org.jnario.suite.unit;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.suite.conversion.SuiteValueConverterService;
import org.jnario.suite.unit.SuiteValueConverterToStringSpec;
import org.jnario.suite.unit.SuiteValueConverterToValueSpec;
import org.junit.runner.RunWith;

@Contains({ SuiteValueConverterToStringSpec.class, SuiteValueConverterToValueSpec.class })
@SuppressWarnings("all")
@Named("SuiteValueConverter")
@RunWith(ExampleGroupRunner.class)
public class SuiteValueConverterSpec {
  final IValueConverter<String> subject = new Function0<IValueConverter<String>>() {
    public IValueConverter<String> apply() {
      SuiteValueConverterService _suiteValueConverterService = new SuiteValueConverterService();
      IValueConverter<String> _suiteValueConverter = _suiteValueConverterService.getSuiteValueConverter();
      return _suiteValueConverter;
    }
  }.apply();
}
