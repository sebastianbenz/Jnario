package demo;

import demo.AdditionFeatureAddTwoNumbers;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Contains(AdditionFeatureAddTwoNumbers.class)
@Named("Addition")
@SuppressWarnings("all")
public class AdditionFeature {
}
