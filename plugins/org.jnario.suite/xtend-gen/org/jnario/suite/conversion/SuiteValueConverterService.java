/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService;
import org.jnario.suite.conversion.PatternValueConverter;
import org.jnario.suite.conversion.SuiteValueConverter;
import org.jnario.suite.conversion.TextValueConverter;

@SuppressWarnings("all")
public class SuiteValueConverterService extends XbaseValueConverterService {
  private final TextValueConverter textValueConverter = new TextValueConverter(":", "");
  
  private final PatternValueConverter patternValueConverter = new PatternValueConverter();
  
  private final SuiteValueConverter suiteValueConverter = new SuiteValueConverter("#".charAt(0));
  
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
