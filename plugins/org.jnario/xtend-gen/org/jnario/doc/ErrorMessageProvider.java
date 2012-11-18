package org.jnario.doc;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.report.ExecutableStateSwitch;
import org.jnario.report.Failed;
import org.jnario.report.NotRun;
import org.jnario.report.Passed;
import org.jnario.report.Pending;

@SuppressWarnings("all")
public class ErrorMessageProvider extends ExecutableStateSwitch<String> {
  protected String handleFailed(final Failed execution) {
    StringConcatenation _builder = new StringConcatenation();
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
