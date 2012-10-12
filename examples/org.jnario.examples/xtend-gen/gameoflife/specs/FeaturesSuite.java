package gameoflife.specs;

import gameoflife.features.PlayingGameOfLifeFeature;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Features")
@Contains(PlayingGameOfLifeFeature.class)
@SuppressWarnings("all")
public class FeaturesSuite {
}
