package gameoflife;

import gameoflife.GameOfLifeSpec;
import gameoflife.GameOfLifeWorldDeadCellsSpec;
import gameoflife.GameOfLifeWorldLivingNeighboursSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ GameOfLifeWorldDeadCellsSpec.class, GameOfLifeWorldLivingNeighboursSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("World")
public class GameOfLifeWorldSpec extends GameOfLifeSpec {
}
