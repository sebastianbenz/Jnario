package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.ShouldFeatureFeaturesWithShould;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Contains(ShouldFeatureFeaturesWithShould.class)
@Named("Feature: Should")
@SuppressWarnings("all")
public class ShouldFeature {
}
