package org.jnario.report;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.Executable;
import org.jnario.report.Executable2ResultMatcher;
import org.jnario.report.SpecExecution;
import org.jnario.report.SpecExecutionAcceptor;

@SuppressWarnings("all")
public class Spec2ResultMapping implements SpecExecutionAcceptor {
  private final List<SpecExecution> results = new Function0<List<SpecExecution>>() {
    public List<SpecExecution> apply() {
      LinkedList<SpecExecution> _newLinkedList = CollectionLiterals.<SpecExecution>newLinkedList();
      return _newLinkedList;
    }
  }.apply();
  
  private final Executable2ResultMatcher matcher;
  
  @Inject
  public Spec2ResultMapping(final Executable2ResultMatcher matcher) {
    this.matcher = matcher;
  }
  
  public SpecExecution getResult(final Executable executable) {
    final Function1<SpecExecution,Boolean> _function = new Function1<SpecExecution,Boolean>() {
        public Boolean apply(final SpecExecution it) {
          boolean _matches = Spec2ResultMapping.this.matcher.matches(executable, it);
          return Boolean.valueOf(_matches);
        }
      };
    Iterable<SpecExecution> _filter = IterableExtensions.<SpecExecution>filter(this.results, _function);
    final SpecExecution result = IterableExtensions.<SpecExecution>head(_filter);
    boolean _equals = Objects.equal(result, null);
    if (_equals) {
      return SpecExecution.NO_EXECUTION;
    }
    return result;
  }
  
  public void accept(final SpecExecution result) {
    this.results.add(result);
  }
}
