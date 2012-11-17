package org.jnario;

import org.jnario.feature.tests.integration.SetupTeardownWithFeatureExtensionsFeature;
import org.jnario.feature.tests.integration.UsingJUnitRulesInFeaturesFeature;
import org.jnario.feature.tests.unit.linking.ReferencingOtherStepsSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Features")
@Contains({ ReferencingOtherStepsSpec.class, SetupTeardownWithFeatureExtensionsFeature.class, UsingJUnitRulesInFeaturesFeature.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
public class FeaturesSuite {
}
