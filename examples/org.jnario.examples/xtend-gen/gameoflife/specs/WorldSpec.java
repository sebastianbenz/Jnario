package gameoflife.specs;

import gameoflife.CellLocation;
import gameoflife.World;
import gameoflife.specs.WorldDeadCellsSpec;
import gameoflife.specs.WorldLivingNeighboursSpec;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ WorldDeadCellsSpec.class, WorldLivingNeighboursSpec.class })
@Named("World")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class WorldSpec {
  final CellLocation liveCell = CellLocation.cell(0, 0);
  
  final CellLocation anotherLivingCell = CellLocation.cell(1, 1);
  
  final World worldWithLiveCell = World.worldWith(JnarioCollectionLiterals.<CellLocation>list(this.liveCell));
  
  final World worldWithTwoLiveNeighbours = World.worldWith(JnarioCollectionLiterals.<CellLocation>list(this.liveCell, this.anotherLivingCell));
}
