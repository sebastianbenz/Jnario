package org.jnario.jnario.tests.unit.jnario;

import org.jnario.jnario.tests.unit.jnario.ExecutableIsPendingExampleGroupSpec;
import org.jnario.jnario.tests.unit.jnario.ExecutableIsPendingExampleSpec;
import org.jnario.jnario.tests.unit.jnario.ExecutableIsPendingFeatureSpec;
import org.jnario.jnario.tests.unit.jnario.ExecutableIsPendingScenarioSpec;
import org.jnario.jnario.tests.unit.jnario.ExecutableIsPendingStepSpec;
import org.jnario.jnario.tests.unit.jnario.ExecutableIsPendingSuiteSpec;
import org.jnario.jnario.tests.unit.jnario.ExecutableSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ ExecutableIsPendingFeatureSpec.class, ExecutableIsPendingScenarioSpec.class, ExecutableIsPendingStepSpec.class, ExecutableIsPendingExampleSpec.class, ExecutableIsPendingExampleGroupSpec.class, ExecutableIsPendingSuiteSpec.class })
@SuppressWarnings("all")
@Named("isPending")
@RunWith(ExampleGroupRunner.class)
public class ExecutableIsPendingSpec extends ExecutableSpec {
}
