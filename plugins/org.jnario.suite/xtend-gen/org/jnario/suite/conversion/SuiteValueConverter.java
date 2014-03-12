/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.conversion;

import com.google.common.base.Objects;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.jnario.util.Strings;

@SuppressWarnings("all")
public class SuiteValueConverter implements IValueConverter<String> {
  private final char prefix;
  
  public SuiteValueConverter(final char prefix) {
    this.prefix = prefix;
  }
  
  public String toString(final String value) throws ValueConverterException {
    String _xblockexpression = null;
    {
      boolean _equals = Objects.equal(value, null);
      if (_equals) {
        return null;
      }
      final int begin = Strings.lastIndexOfPrefix(value, this.prefix);
      final String prefix = value.substring(0, begin);
      String _substring = value.substring(begin);
      String _replace = _substring.replace("-", "\\-");
      String _replace_1 = _replace.replace("#", "\\#");
      _xblockexpression = (prefix + _replace_1);
    }
    return _xblockexpression;
  }
  
  public String toValue(final String string, final INode node) throws ValueConverterException {
    String _xblockexpression = null;
    {
      boolean _equals = Objects.equal(string, null);
      if (_equals) {
        return null;
      }
      final int begin = Strings.lastIndexOfPrefix(string, this.prefix);
      final String prefix = string.substring(0, begin);
      String _substring = string.substring(begin);
      String _replace = _substring.replace("\\-", "-");
      String _replace_1 = _replace.replace("\\#", "#");
      _xblockexpression = (prefix + _replace_1);
    }
    return _xblockexpression;
  }
}
