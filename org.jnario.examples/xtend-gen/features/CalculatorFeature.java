package features;

import features.CalculatorFeatureAddingToValues;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Contains(CalculatorFeatureAddingToValues.class)
@Named("Feature: Calculator")
@SuppressWarnings("all")
public class CalculatorFeature {
}
