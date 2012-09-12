package gameoflife.specs;

import gameoflife.CellLocation;
import gameoflife.World;
import gameoflife.specs.WorldDeadCellsSpec;
import gameoflife.specs.WorldLivingNeighboursSpec;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ WorldDeadCellsSpec.class, WorldLivingNeighboursSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("World")
public class WorldSpec {
  final CellLocation liveCell = new Function0<CellLocation>() {
    public CellLocation apply() {
      CellLocation _cell = CellLocation.cell(0, 0);
      return _cell;
    }
  }.apply();
  
  final CellLocation anotherLivingCell = new Function0<CellLocation>() {
    public CellLocation apply() {
      CellLocation _cell = CellLocation.cell(1, 1);
      return _cell;
    }
  }.apply();
  
  final World worldWithLiveCell = new Function0<World>() {
    public World apply() {
      List<CellLocation> _list = JnarioCollectionLiterals.<CellLocation>list(WorldSpec.this.liveCell);
      World _worldWith = World.worldWith(_list);
      return _worldWith;
    }
  }.apply();
  
  final World worldWithTwoLiveNeighbours = new Function0<World>() {
    public World apply() {
      List<CellLocation> _list = JnarioCollectionLiterals.<CellLocation>list(WorldSpec.this.liveCell, WorldSpec.this.anotherLivingCell);
      World _worldWith = World.worldWith(_list);
      return _worldWith;
    }
  }.apply();
}
