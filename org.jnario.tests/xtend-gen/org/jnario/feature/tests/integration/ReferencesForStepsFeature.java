package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.ReferencesForStepsFeatureDefiningAStepAndUsingItInTheSameScenario;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureReferencingStepsWithDifferentKeyword;
import org.jnario.feature.tests.integration.ReferencesForStepsFeatureUsingFieldsFromOtherSteps;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.Ignore;
import org.junit.runner.RunWith;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@RunWith(FeatureRunner.class)
@Contains({ ReferencesForStepsFeatureDefiningAStepAndUsingItInTheSameScenario.class, ReferencesForStepsFeatureReferencingStepsWithDifferentKeyword.class, ReferencesForStepsFeatureUsingFieldsFromOtherSteps.class })
@Named("Feature: References for steps")
@SuppressWarnings("all")
@Ignore
public class ReferencesForStepsFeature {
}
