package org.jnario.spec.tests.unit.report;

import com.google.inject.Inject;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.report.SpecExecution;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Subject;
import org.jnario.spec.report.Spec2ResultMatcher;
import org.jnario.spec.spec.Example;
import org.jnario.spec.tests.unit.report.Spec2ResultMatcherExampleSpec;
import org.junit.runner.RunWith;

@Contains(Spec2ResultMatcherExampleSpec.class)
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Spec2ResultMatcher")
@CreateWith(value = SpecTestCreator.class)
public class Spec2ResultMatcherSpec {
  @Subject
  public Spec2ResultMatcher subject;
  
  @Inject
  @Extension
  public ModelStore m;
  
  final static double anyExecutionTime = 0.0;
  
  public boolean should_match(final Example example, final SpecExecution execution) {
    boolean _matches = this.subject.matches(example, execution);
    return _matches;
  }
  
  public Example example() {
    Example _first = this.m.<Example>first(Example.class);
    return _first;
  }
}
