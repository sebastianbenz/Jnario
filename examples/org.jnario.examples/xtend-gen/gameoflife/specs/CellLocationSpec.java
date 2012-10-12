package gameoflife.specs;

import gameoflife.specs.CellLocationCalculatingRelativeCellLocationsSpec;
import gameoflife.specs.CellLocationCellNeighboursSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ CellLocationCalculatingRelativeCellLocationsSpec.class, CellLocationCellNeighboursSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("CellLocation")
public class CellLocationSpec {
}
