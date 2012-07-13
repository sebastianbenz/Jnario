package org.jnario;

import org.jnario.feature.tests.integration.FeatureExtensionsFeature;
import org.jnario.feature.tests.integration.UsingJUnitRulesInFeaturesFeature;
import org.jnario.feature.tests.unit.linking.ReferencingOtherStepsSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Features")
@Contains({ FeatureExtensionsFeature.class, UsingJUnitRulesInFeaturesFeature.class, ReferencingOtherStepsSpec.class })
@SuppressWarnings("all")
public class FeaturesSuite {
}
