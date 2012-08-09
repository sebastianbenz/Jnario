package gameoflife;

import gameoflife.GameOfLifeCellPositionNeighboursSpec;
import gameoflife.GameOfLifeCellPositionPlusSpec;
import gameoflife.GameOfLifeSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ GameOfLifeCellPositionPlusSpec.class, GameOfLifeCellPositionNeighboursSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("CellPosition")
public class GameOfLifeCellPositionSpec extends GameOfLifeSpec {
}
