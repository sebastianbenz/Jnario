package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.ExamplesFeatureExampleTables;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@RunWith(FeatureRunner.class)
@Contains(ExamplesFeatureExampleTables.class)
@Named("Feature: Examples.")
@SuppressWarnings("all")
public class ExamplesFeature {
}
