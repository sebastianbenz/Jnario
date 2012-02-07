package de.bmw.carit.jnario.common.test.util;

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
      {
        proc.apply(null);
        AssertionError _assertionError = new AssertionError("expected AssertionError");
        throw _assertionError;
      }
    } catch (final Throwable _t) {
      if (_t instanceof AssertionError) {
        final AssertionError e = (AssertionError)_t;
        String _message = e.getMessage();
        String _trim = _message.trim();
        return _trim;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
