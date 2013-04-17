/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.conversion;

import com.google.common.base.Objects;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class PatternValueConverter implements IValueConverter<String> {
  public String toString(final String string) throws ValueConverterException {
    String _xblockexpression = null;
    {
      String result = string;
      boolean _equals = Objects.equal(result, null);
      if (_equals) {
        result = "";
      }
      String _plus = ("\\" + result);
      String _plus_1 = (_plus + "\\");
      String _newLine = Strings.newLine();
      String _plus_2 = (_plus_1 + _newLine);
      _xblockexpression = (_plus_2);
    }
    return _xblockexpression;
  }
  
  public String toValue(final String string, final INode node) throws ValueConverterException {
    try {
      boolean _isNullOrEmpty = com.google.common.base.Strings.isNullOrEmpty(string);
      if (_isNullOrEmpty) {
        return null;
      }
      int begin = string.indexOf("\\");
      int end = string.lastIndexOf("\\");
      int _plus = (begin + 1);
      final String result = string.substring(_plus, end);
      Pattern.compile(result);
      return result;
    } catch (final Throwable _t) {
      if (_t instanceof PatternSyntaxException) {
        final PatternSyntaxException e = (PatternSyntaxException)_t;
        String _message = e.getMessage();
        ValueConverterException _valueConverterException = new ValueConverterException(_message, node, e);
        throw _valueConverterException;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
