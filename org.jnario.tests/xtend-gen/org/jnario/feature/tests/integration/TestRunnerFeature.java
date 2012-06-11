package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.TestRunnerFeatureCreateOnlyOneTestInstanceForOneJnarioScenario;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@RunWith(FeatureRunner.class)
@Contains(TestRunnerFeatureCreateOnlyOneTestInstanceForOneJnarioScenario.class)
@Named("Feature: Test Runner")
@SuppressWarnings("all")
public class TestRunnerFeature {
}
