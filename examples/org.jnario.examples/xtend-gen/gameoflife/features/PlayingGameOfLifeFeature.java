package gameoflife.features;

import gameoflife.features.PlayingGameOfLifeFeatureBlinker;
import gameoflife.features.PlayingGameOfLifeFeatureBox;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Contains({ PlayingGameOfLifeFeatureBox.class, PlayingGameOfLifeFeatureBlinker.class })
@Named("Playing Game of Life")
@SuppressWarnings("all")
public class PlayingGameOfLifeFeature {
}
