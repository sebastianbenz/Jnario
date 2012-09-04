package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.ReferencesForStepsFeatureDefiningAStepAndUsingItInTheSameScenario;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureExtensionFields;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureFieldInitialization;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureMultipleStepReferencesCausesProblemWhenCopierDoesNotClearItsCache;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureReferencingStepsWithDifferentKeyword;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureSteps;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureStepsWithShortNames;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureUsingClosuresInSteps;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureUsingFieldsFromOtherSteps;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@RunWith(FeatureRunner.class)
@Contains({ ReferencesForStepsFeatureDefiningAStepAndUsingItInTheSameScenario.class, ReferencesForStepsFeatureReferencingStepsWithDifferentKeyword.class, ReferencesForStepsFeatureUsingFieldsFromOtherSteps.class, ReferencesForStepsFeatureStepsWithShortNames.class, ReferencesForStepsFeatureFieldInitialization.class, ReferencesForStepsFeatureSteps.class, ReferencesForStepsFeatureExtensionFields.class, ReferencesForStepsFeatureUsingClosuresInSteps.class, ReferencesForStepsFeatureMultipleStepReferencesCausesProblemWhenCopierDoesNotClearItsCache.class })
@Named("References for steps")
@SuppressWarnings("all")
public class ReferencesForStepsFeature {
}
