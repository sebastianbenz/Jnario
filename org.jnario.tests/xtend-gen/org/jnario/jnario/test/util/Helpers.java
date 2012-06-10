/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;

@SuppressWarnings("all")
public class Helpers {
  public static void is(final String actual, final CharSequence expected) {
    String _string = expected.toString();
    String _replaceAll = _string.replaceAll("\r", "");
    String _replaceAll_1 = actual.replaceAll("\r", "");
    Assert.assertEquals(_replaceAll, _replaceAll_1);
  }
  
  public static String errorMessage(final Procedure1<Boolean> proc) {
    try {
      proc.apply(null);
      AssertionError _assertionError = new AssertionError("expected AssertionError");
      throw _assertionError;
    } catch (final Throwable _t) {
      if (_t instanceof AssertionError) {
        final AssertionError e = (AssertionError)_t;
        String _message = e.getMessage();
        return _message.trim();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
