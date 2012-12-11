package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.PendingStepsFeatureWhenAStepOfABackgroundAllFollowingStepsAndAllScenarioStepsShouldBePending;
import org.jnario.feature.tests.integration.PendingStepsFeatureWhenAnAndStepIsPendingTheFollowingStepsShouldBePending;
import org.jnario.feature.tests.integration.PendingStepsFeatureWhenOneStepOfAScenarioIsPendingThenAllFollowingShouldBePending;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@Contains({ PendingStepsFeatureWhenOneStepOfAScenarioIsPendingThenAllFollowingShouldBePending.class, PendingStepsFeatureWhenAnAndStepIsPendingTheFollowingStepsShouldBePending.class, PendingStepsFeatureWhenAStepOfABackgroundAllFollowingStepsAndAllScenarioStepsShouldBePending.class })
@Named("Pending steps")
@SuppressWarnings("all")
@RunWith(FeatureRunner.class)
public class PendingStepsFeature {
}
