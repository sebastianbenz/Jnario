package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.UsingMatchersInFeaturesFeatureUsingMatchersInJnario;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains(UsingMatchersInFeaturesFeatureUsingMatchersInJnario.class)
@Named("Using Matchers in Features")
@SuppressWarnings("all")
@RunWith(FeatureRunner.class)
public class UsingMatchersInFeaturesFeature {
}
