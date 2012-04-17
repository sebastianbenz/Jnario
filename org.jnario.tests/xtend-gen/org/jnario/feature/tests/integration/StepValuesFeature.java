package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.StepValuesFeatureAccessOfValuesWithFirstSecond;
import org.jnario.feature.tests.integration.StepValuesFeatureReferencingVariablesThatContainAValueFromArgs;
import org.jnario.feature.tests.integration.StepValuesFeatureValueDefinitionInSteps;
import org.jnario.feature.tests.integration.StepValuesFeatureValueDefinitionInStepsAndBackground;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Contains({ StepValuesFeatureValueDefinitionInSteps.class, StepValuesFeatureAccessOfValuesWithFirstSecond.class, StepValuesFeatureValueDefinitionInStepsAndBackground.class, StepValuesFeatureReferencingVariablesThatContainAValueFromArgs.class })
@Named("Feature: Step values")
@SuppressWarnings("all")
public class StepValuesFeature {
}
