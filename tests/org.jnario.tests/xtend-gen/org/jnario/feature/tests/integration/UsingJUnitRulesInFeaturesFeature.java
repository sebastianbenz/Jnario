package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.UsingJUnitRulesInFeaturesFeatureUsingJUnitRules;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains(UsingJUnitRulesInFeaturesFeatureUsingJUnitRules.class)
@Named("Using JUnit Rules in Features")
@SuppressWarnings("all")
@RunWith(FeatureRunner.class)
public class UsingJUnitRulesInFeaturesFeature {
}
