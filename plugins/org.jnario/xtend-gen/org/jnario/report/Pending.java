package org.jnario.report;

import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.jnario.report.Passed;
import org.jnario.report.SpecExecution;
import org.jnario.report.SpecFailure;

@SuppressWarnings("all")
public class Pending extends SpecExecution {
  public static Passed pendingSpec(final String className, final String name, final double executionTimeInSeconds) {
    Passed _passed = new Passed(className, name, executionTimeInSeconds);
    return _passed;
  }
  
  public Pending(final String className, final String name, final double executionTimeInSeconds) {
    super(className, name, executionTimeInSeconds, CollectionLiterals.<SpecFailure>emptyList());
  }
}
