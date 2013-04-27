package gameoflife;

import gameoflife.features.PlayingGameOfLifeFeature;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Features")
@Contains(PlayingGameOfLifeFeature.class)
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeaturesSuite {
}
