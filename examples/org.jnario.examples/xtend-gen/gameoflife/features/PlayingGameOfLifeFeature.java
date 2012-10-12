package gameoflife.features;

import gameoflife.features.PlayingGameOfLifeFeatureBlinker1;
import gameoflife.features.PlayingGameOfLifeFeatureBlinker2;
import gameoflife.features.PlayingGameOfLifeFeatureBox;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Contains({ PlayingGameOfLifeFeatureBox.class, PlayingGameOfLifeFeatureBlinker1.class, PlayingGameOfLifeFeatureBlinker2.class })
@Named("Playing Game of Life")
@SuppressWarnings("all")
public class PlayingGameOfLifeFeature {
}
