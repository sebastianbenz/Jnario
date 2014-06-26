package linking;

import linking.ExamplesFeature;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Background: Some more info")
@SuppressWarnings("all")
public abstract class ExamplesFeatureSomeMoreInfo extends ExamplesFeature {
  @Test
  @Order(0)
  @Ignore
  @Named("Given I have entered \\\"333\\\" into the calculator [PENDING]")
  public void _givenIHaveEntered333IntoTheCalculator();
}
