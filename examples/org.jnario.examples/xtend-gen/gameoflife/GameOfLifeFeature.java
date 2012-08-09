package gameoflife;

import gameoflife.GameOfLifeFeatureBlinker;
import gameoflife.GameOfLifeFeatureBox;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Contains({ GameOfLifeFeatureBox.class, GameOfLifeFeatureBlinker.class })
@Named("Game of Life")
@SuppressWarnings("all")
public class GameOfLifeFeature {
}
