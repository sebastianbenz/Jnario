/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.doc;

import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.report.ExecutableStateSwitch;
import org.jnario.report.Failed;
import org.jnario.report.NotRun;
import org.jnario.report.Passed;
import org.jnario.report.Pending;
import org.jnario.report.SpecFailure;

@SuppressWarnings("all")
public class ErrorMessageProvider extends ExecutableStateSwitch<String> {
  protected String handleFailed(final Failed result) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<SpecFailure> _failures = result.getFailures();
      for(final SpecFailure failure : _failures) {
        _builder.append("<pre class=\"errormessage\">");
        _builder.newLine();
        String _message = failure.getMessage();
        _builder.append(_message, "");
        _builder.append("</pre>");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  protected String handleNotRun(final NotRun execution) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String handlePassed(final Passed execution) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String handlePending(final Pending execution) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
}
