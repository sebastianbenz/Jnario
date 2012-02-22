package de.bmw.carit.jnario.spec.doc;

import de.bmw.carit.jnario.spec.doc.Filter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("all")
public class RegexFilter implements Filter {
  public static RegexFilter create(final String regex) {
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
    String _replaceAll = _matcher.replaceAll("");
    return _replaceAll;
  }
  
  public String toString() {
    return this.regex;
  }
}
