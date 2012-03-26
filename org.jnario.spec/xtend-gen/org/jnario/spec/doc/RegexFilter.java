package org.jnario.spec.doc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jnario.spec.doc.Filter;

@SuppressWarnings("all")
public class RegexFilter implements Filter {
  public static Filter create(final String regex) {
    RegexFilter _regexFilter = new RegexFilter(regex);
    return _regexFilter;
  }
  
  private String regex;
  
  private Pattern pattern;
  
  public RegexFilter(final String regex) {
    this.regex = regex;
    Pattern _compile = Pattern.compile(regex, Pattern.DOTALL);
    this.pattern = _compile;
  }
  
  public String apply(final String input) {
    Matcher _matcher = this.pattern.matcher(input);
    return _matcher.replaceAll("");
  }
  
  public String toString() {
    return this.regex;
  }
  
  public String key() {
    return "filter";
  }
}
