package org.jnario;

import org.jnario.feature.tests.integration.UsingJUnitRulesInFeaturesFeature;
import org.jnario.feature.tests.unit.linking.ReferencingOtherStepsSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.tests.integration.ExtensionsSpec;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Features")
@Contains({ ExtensionsSpec.class, UsingJUnitRulesInFeaturesFeature.class, ReferencingOtherStepsSpec.class })
@SuppressWarnings("all")
public class FeaturesSuite {
}
