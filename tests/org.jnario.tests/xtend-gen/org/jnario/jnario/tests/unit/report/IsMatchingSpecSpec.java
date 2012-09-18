package org.jnario.jnario.tests.unit.report;

import com.google.inject.Inject;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.jnario.tests.unit.report.IsMatchingSpecExampleSpec;
import org.jnario.jnario.tests.unit.report.IsMatchingSpecSpecificationSpec;
import org.jnario.jnario.tests.unit.report.IsMatchingSpecStepSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ IsMatchingSpecExampleSpec.class, IsMatchingSpecStepSpec.class, IsMatchingSpecSpecificationSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("IsMatchingSpec")
@CreateWith(value = SpecTestCreator.class)
public class IsMatchingSpecSpec {
  @Inject
  ModelStore m;
}
