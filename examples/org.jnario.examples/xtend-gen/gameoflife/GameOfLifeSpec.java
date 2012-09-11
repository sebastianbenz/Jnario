package gameoflife;

import gameoflife.CellLocation;
import gameoflife.GameOfLifeCellLocationSpec;
import gameoflife.GameOfLifeEvolutionSpec;
import gameoflife.GameOfLifeRuleSpec;
import gameoflife.GameOfLifeWorldSpec;
import gameoflife.World;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ GameOfLifeRuleSpec.class, GameOfLifeCellLocationSpec.class, GameOfLifeWorldSpec.class, GameOfLifeEvolutionSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Game of Life")
public class GameOfLifeSpec {
  final CellLocation livingCell = new Function0<CellLocation>() {
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
      List<CellLocation> _list = JnarioCollectionLiterals.<CellLocation>list(GameOfLifeSpec.this.livingCell);
      World _worldWith = World.worldWith(_list);
      return _worldWith;
    }
  }.apply();
  
  final World worldWithTwoLiveNeighbours = new Function0<World>() {
    public World apply() {
      List<CellLocation> _list = JnarioCollectionLiterals.<CellLocation>list(GameOfLifeSpec.this.livingCell, GameOfLifeSpec.this.anotherLivingCell);
      World _worldWith = World.worldWith(_list);
      return _worldWith;
    }
  }.apply();
}
