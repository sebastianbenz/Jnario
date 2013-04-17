/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.StepParametersFeatureAccessOfParametersWithFirstSecond;
import org.jnario.feature.tests.integration.StepParametersFeatureFieldInitializersInBackgrounds;
import org.jnario.feature.tests.integration.StepParametersFeatureParameterDefinitionInAndSteps;
import org.jnario.feature.tests.integration.StepParametersFeatureParameterDefinitionInStepsAndBackground;
import org.jnario.feature.tests.integration.StepParametersFeatureParametersAreDefinedInQuotes;
import org.jnario.feature.tests.integration.StepParametersFeatureReferencingVariablesThatContainAValueFromArgs;
import org.jnario.feature.tests.integration.StepParametersFeatureUsingArgsInAndSteps;
import org.jnario.feature.tests.integration.StepParametersFeatureUsingMultilineStrings;
import org.jnario.feature.tests.integration.StepParametersFeatureWhiteSpaceNormalizing;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ StepParametersFeatureParametersAreDefinedInQuotes.class, StepParametersFeatureAccessOfParametersWithFirstSecond.class, StepParametersFeatureParameterDefinitionInStepsAndBackground.class, StepParametersFeatureParameterDefinitionInAndSteps.class, StepParametersFeatureReferencingVariablesThatContainAValueFromArgs.class, StepParametersFeatureUsingMultilineStrings.class, StepParametersFeatureUsingArgsInAndSteps.class, StepParametersFeatureFieldInitializersInBackgrounds.class, StepParametersFeatureWhiteSpaceNormalizing.class })
@Named("Step Parameters")
@RunWith(FeatureRunner.class)
@SuppressWarnings("all")
public class StepParametersFeature {
}
