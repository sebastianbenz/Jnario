package org.jnario.report;

import org.jnario.Executable;
import org.jnario.report.Spec2ResultMapping;
import org.jnario.report.SpecExecution;

@SuppressWarnings("all")
public class NoResultsMapping extends Spec2ResultMapping {
  public NoResultsMapping() {
    super(null);
  }
  
  public SpecExecution getResult(final Executable executable) {
    return SpecExecution.NO_EXECUTION;
  }
}
