package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.JunitRulesFeatureUsingJUnitRules;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Contains(JunitRulesFeatureUsingJUnitRules.class)
@Named("Junit Rules")
@SuppressWarnings("all")
public class JunitRulesFeature {
}
