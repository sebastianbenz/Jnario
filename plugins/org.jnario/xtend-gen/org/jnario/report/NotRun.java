package org.jnario.report;

import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.report.SpecExecution;
import org.jnario.report.SpecFailure;

@SuppressWarnings("all")
public class NotRun extends SpecExecution {
  public NotRun(final String className, final String name) {
    super(className, name, 0.0, new Function0<List<SpecFailure>>() {
      public List<SpecFailure> apply() {
        List<SpecFailure> _emptyList = CollectionLiterals.<SpecFailure>emptyList();
        return _emptyList;
      }
    }.apply());
  }
}
