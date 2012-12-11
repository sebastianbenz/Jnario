package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.BackgroundsFeatureGivenMethodsFromBackgroundsAreGeneratedInEveryScenarioClass;
import org.jnario.feature.tests.integration.BackgroundsFeatureInstantiatingObjectsInBackgrounds;
import org.jnario.feature.tests.integration.BackgroundsFeatureItIsPossibleToAddABackgroundToAFeature;
import org.jnario.feature.tests.integration.BackgroundsFeatureUsingFieldsFromBackgroundSteps;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@Contains({ BackgroundsFeatureItIsPossibleToAddABackgroundToAFeature.class, BackgroundsFeatureGivenMethodsFromBackgroundsAreGeneratedInEveryScenarioClass.class, BackgroundsFeatureUsingFieldsFromBackgroundSteps.class, BackgroundsFeatureInstantiatingObjectsInBackgrounds.class })
@Named("Backgrounds")
@SuppressWarnings("all")
@RunWith(FeatureRunner.class)
public class BackgroundsFeature {
}
