package org.jnario.report;

import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.jnario.report.SpecExecution;
import org.jnario.report.SpecFailure;

@SuppressWarnings("all")
public class NotRun extends SpecExecution {
  public NotRun(final String className, final String name) {
    super(className, name, 0.0, CollectionLiterals.<SpecFailure>emptyList());
  }
}
