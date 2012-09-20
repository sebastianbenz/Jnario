package example;

import example.SomethingFeatureMyScenario;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Contains(SomethingFeatureMyScenario.class)
@Named("Something")
@SuppressWarnings("all")
public class SomethingFeature {
}
