package org.jnario.doc;

import org.jnario.doc.Filter;

@SuppressWarnings("all")
public class LangFilter implements Filter {
  public static Filter create(final String regex) {
    LangFilter _langFilter = new LangFilter(regex);
    return _langFilter;
  }
  
  private String language;
  
  public LangFilter(final String language) {
    this.language = language;
  }
  
  public String apply(final String input) {
    String _plus = ("<pre class=\"prettyprint lang-" + this.language);
    String _plus_1 = (_plus + "\">");
    return input.replace("<pre class=\"prettyprint lang-spec\">", _plus_1);
  }
  
  public String toString() {
    return ("lang-" + this.language);
  }
}
