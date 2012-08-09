package gameoflife;

import gameoflife.SimulatingGameOfLifeFeatureBlinker;
import gameoflife.SimulatingGameOfLifeFeatureBox;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Contains({ SimulatingGameOfLifeFeatureBox.class, SimulatingGameOfLifeFeatureBlinker.class })
@Named("Simulating Game of Life")
@SuppressWarnings("all")
public class SimulatingGameOfLifeFeature {
}
