package org.jnario;

import org.jnario.feature.tests.unit.linking.ReferencingOtherStepsSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Features")
@Contains(ReferencingOtherStepsSpec.class)
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeaturesSuite {
}
