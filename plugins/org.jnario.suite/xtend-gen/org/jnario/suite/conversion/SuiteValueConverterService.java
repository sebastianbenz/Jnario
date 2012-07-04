package org.jnario.suite.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.suite.conversion.PatternValueConverter;
import org.jnario.suite.conversion.SuiteValueConverter;
import org.jnario.suite.conversion.TextValueConverter;

@SuppressWarnings("all")
public class SuiteValueConverterService extends XbaseValueConverterService {
  private final TextValueConverter textValueConverter = new Function0<TextValueConverter>() {
    public TextValueConverter apply() {
      TextValueConverter _textValueConverter = new TextValueConverter(":", "");
      return _textValueConverter;
    }
  }.apply();
  
  private final PatternValueConverter patternValueConverter = new Function0<PatternValueConverter>() {
    public PatternValueConverter apply() {
      PatternValueConverter _patternValueConverter = new PatternValueConverter();
      return _patternValueConverter;
    }
  }.apply();
  
  private final SuiteValueConverter suiteValueConverter = new Function0<SuiteValueConverter>() {
    public SuiteValueConverter apply() {
      char _charAt = "#".charAt(0);
      SuiteValueConverter _suiteValueConverter = new SuiteValueConverter(_charAt);
      return _suiteValueConverter;
    }
  }.apply();
  
  @ValueConverter(rule = "TEXT")
  public IValueConverter<String> getTextValueConverter() {
    return this.textValueConverter;
  }
  
  @ValueConverter(rule = "PATTERN")
  public IValueConverter<String> getPatternValueConverter() {
    return this.patternValueConverter;
  }
  
  @ValueConverter(rule = "SUITE_NAME")
  public IValueConverter<String> getSuiteValueConverter() {
    return this.suiteValueConverter;
  }
}
