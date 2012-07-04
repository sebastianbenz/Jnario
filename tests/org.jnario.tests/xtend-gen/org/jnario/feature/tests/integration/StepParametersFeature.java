package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.StepParametersFeatureAccessOfParametersWithFirstSecond;
import org.jnario.feature.tests.integration.StepParametersFeatureParameterDefinitionInStepsAndBackground;
import org.jnario.feature.tests.integration.StepParametersFeatureParametersAreDefinedInQuotes;
import org.jnario.feature.tests.integration.StepParametersFeatureReferencingVariablesThatContainAValueFromArgs;
import org.jnario.feature.tests.integration.StepParametersFeatureUsingMultilineStrings;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Contains({ StepParametersFeatureParametersAreDefinedInQuotes.class, StepParametersFeatureAccessOfParametersWithFirstSecond.class, StepParametersFeatureParameterDefinitionInStepsAndBackground.class, StepParametersFeatureReferencingVariablesThatContainAValueFromArgs.class, StepParametersFeatureUsingMultilineStrings.class })
@Named("Step Parameters")
@SuppressWarnings("all")
public class StepParametersFeature {
}
