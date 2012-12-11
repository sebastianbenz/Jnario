package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.SetupTeardownWithFeatureExtensionsFeatureUsingAnExtension;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@Contains(SetupTeardownWithFeatureExtensionsFeatureUsingAnExtension.class)
@Named("Setup & Teardown with Feature Extensions")
@SuppressWarnings("all")
@RunWith(FeatureRunner.class)
public class SetupTeardownWithFeatureExtensionsFeature {
}
