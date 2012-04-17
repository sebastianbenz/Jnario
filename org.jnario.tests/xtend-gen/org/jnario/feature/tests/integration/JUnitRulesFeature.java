package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.JUnitRulesFeatureUsingRulesInAFeature;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Contains(JUnitRulesFeatureUsingRulesInAFeature.class)
@Named("Feature:  JUnit Rules")
@SuppressWarnings("all")
public class JUnitRulesFeature {
}
