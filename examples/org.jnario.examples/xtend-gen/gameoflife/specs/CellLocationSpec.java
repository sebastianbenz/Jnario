package gameoflife.specs;

import gameoflife.specs.CellLocationCalculatingRelativeCellLocationsSpec;
import gameoflife.specs.CellLocationCellNeighboursSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ CellLocationCalculatingRelativeCellLocationsSpec.class, CellLocationCellNeighboursSpec.class })
@Named("CellLocation")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class CellLocationSpec {
}
