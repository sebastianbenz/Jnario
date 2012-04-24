package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.UsingMatchersInFeaturesFeatureUsingMatchersInJnario;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Contains(UsingMatchersInFeaturesFeatureUsingMatchersInJnario.class)
@Named("Feature: Using Matchers in Features")
@SuppressWarnings("all")
public class UsingMatchersInFeaturesFeature {
}
