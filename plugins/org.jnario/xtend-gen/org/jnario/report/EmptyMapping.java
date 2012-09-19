package org.jnario.report;

import org.jnario.Executable;
import org.jnario.report.Spec2ResultMapping;
import org.jnario.report.SpecExecution;

@SuppressWarnings("all")
public class EmptyMapping implements Spec2ResultMapping {
  public SpecExecution getResult(final Executable executable) {
    return SpecExecution.NO_EXECUTION;
  }
}
