package org.jnario.suite.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.suite.conversion.LinkValueConverter;
import org.jnario.suite.conversion.PatternValueConverter;

@SuppressWarnings("all")
public class SuiteValueConverterService extends XbaseValueConverterService {
  private final LinkValueConverter linkValueConverter = new Function0<LinkValueConverter>() {
    public LinkValueConverter apply() {
      LinkValueConverter _linkValueConverter = new LinkValueConverter("-", "");
      return _linkValueConverter;
    }
  }.apply();
  
  private final LinkValueConverter textValueConverter = new Function0<LinkValueConverter>() {
    public LinkValueConverter apply() {
      LinkValueConverter _linkValueConverter = new LinkValueConverter(":", "");
      return _linkValueConverter;
    }
  }.apply();
  
  private final LinkValueConverter suiteValueConverter = new Function0<LinkValueConverter>() {
    public LinkValueConverter apply() {
      LinkValueConverter _linkValueConverter = new LinkValueConverter("Suite:", "");
      return _linkValueConverter;
    }
  }.apply();
  
  private final PatternValueConverter patternValueConverter = new Function0<PatternValueConverter>() {
    public PatternValueConverter apply() {
      PatternValueConverter _patternValueConverter = new PatternValueConverter();
      return _patternValueConverter;
    }
  }.apply();
  
  @ValueConverter(rule = "LINK")
  public IValueConverter<String> getLinkValueConverter() {
    return this.linkValueConverter;
  }
  
  @ValueConverter(rule = "TEXT")
  public IValueConverter<String> getTextValueConverter() {
    return this.textValueConverter;
  }
  
  @ValueConverter(rule = "SUITE_NAME")
  public IValueConverter<String> getSuiteValueConverter() {
    return this.suiteValueConverter;
  }
  
  @ValueConverter(rule = "PATTERN")
  public IValueConverter<String> getPatternValueConverter() {
    return this.patternValueConverter;
  }
}
