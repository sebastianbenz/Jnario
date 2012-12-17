package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.CalculatorFeatureSimpleCalculatorTestWithBackgroundAndReferences;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@Contains(CalculatorFeatureSimpleCalculatorTestWithBackgroundAndReferences.class)
@Named("Calculator")
@SuppressWarnings("all")
@RunWith(FeatureRunner.class)
public class CalculatorFeature {
}
