package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.PendingStepsFeatureWhenAStepOfABackgroundAllFollowingStepsAndAllScenarioStepsShouldBePending;
import org.jnario.feature.tests.integration.PendingStepsFeatureWhenAnAndStepIsPendingTheFollowingStepsShouldBePending;
import org.jnario.feature.tests.integration.PendingStepsFeatureWhenOneStepOfAScenarioIsPendingThenAllFollowingShouldBePending;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@RunWith(FeatureRunner.class)
@Contains({ PendingStepsFeatureWhenOneStepOfAScenarioIsPendingThenAllFollowingShouldBePending.class, PendingStepsFeatureWhenAnAndStepIsPendingTheFollowingStepsShouldBePending.class, PendingStepsFeatureWhenAStepOfABackgroundAllFollowingStepsAndAllScenarioStepsShouldBePending.class })
@Named("Pending steps")
@CreateWith(value = FeatureTestCreator.class)
@SuppressWarnings("all")
public class PendingStepsFeature {
}
