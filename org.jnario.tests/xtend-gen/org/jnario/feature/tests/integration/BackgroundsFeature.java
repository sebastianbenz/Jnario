package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.BackgroundsFeatureItIsPossibleToAddABackgroundToAFeature;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@RunWith(FeatureRunner.class)
@Contains(BackgroundsFeatureItIsPossibleToAddABackgroundToAFeature.class)
@Named("Feature: Backgrounds")
@SuppressWarnings("all")
public class BackgroundsFeature {
}
