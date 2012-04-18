package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.BackgroundsFeatureGivenMethodsFromBackgroundsAreGeneratedInEveryScenarioClass;
import org.jnario.feature.tests.integration.BackgroundsFeatureItIsPossibleToAddABackgroundToAFeature;
import org.jnario.feature.tests.integration.BackgroundsFeatureUsingFieldsFromBackgroundSteps;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@RunWith(FeatureRunner.class)
@Contains({ BackgroundsFeatureItIsPossibleToAddABackgroundToAFeature.class, BackgroundsFeatureGivenMethodsFromBackgroundsAreGeneratedInEveryScenarioClass.class, BackgroundsFeatureUsingFieldsFromBackgroundSteps.class })
@Named("Feature: Backgrounds")
@SuppressWarnings("all")
public class BackgroundsFeature {
}
