package org.jnario.spec.tests.unit.report;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.report.HashBasedSpec2ResultMapping;
import org.jnario.report.SpecExecution;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Subject;
import org.jnario.spec.spec.Example;
import org.jnario.spec.tests.unit.report.HashBasedSpec2ResultMappingExampleSpec;
import org.junit.runner.RunWith;

@Contains(HashBasedSpec2ResultMappingExampleSpec.class)
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("HashBasedSpec2ResultMapping")
@CreateWith(value = SpecTestCreator.class)
public class HashBasedSpec2ResultMappingSpec {
  @Subject
  public HashBasedSpec2ResultMapping subject;
  
  @Inject
  @Extension
  public ModelStore m;
  
  final static double anyExecutionTime = 0.0;
  
  public boolean should_match(final Example example, final SpecExecution execution) {
    SpecExecution _result = this.subject.getResult(example);
    boolean _equals = Objects.equal(_result, execution);
    return _equals;
  }
  
  public Example example() {
    Example _first = this.m.<Example>first(Example.class);
    return _first;
  }
}
