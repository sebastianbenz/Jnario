package gameoflife;

import gameoflife.GameOfLifeCellLocationAddingCellLocationsSpec;
import gameoflife.GameOfLifeCellLocationNeighboursSpec;
import gameoflife.GameOfLifeSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ GameOfLifeCellLocationAddingCellLocationsSpec.class, GameOfLifeCellLocationNeighboursSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("CellLocation")
public class GameOfLifeCellLocationSpec extends GameOfLifeSpec {
}
