/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.jnario.spec.doc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jnario.spec.doc.Filter;

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
