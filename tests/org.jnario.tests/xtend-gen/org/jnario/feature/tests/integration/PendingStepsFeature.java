/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
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
@RunWith(FeatureRunner.class)
@SuppressWarnings("all")
public class PendingStepsFeature {
}
