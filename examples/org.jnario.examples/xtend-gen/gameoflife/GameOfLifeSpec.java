package gameoflife;

import gameoflife.CellPosition;
import gameoflife.GameOfLifeCellPositionSpec;
import gameoflife.GameOfLifeEvolutionSpec;
import gameoflife.GameOfLifeRulesSpec;
import gameoflife.GameOfLifeWorldSpec;
import gameoflife.World;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ GameOfLifeEvolutionSpec.class, GameOfLifeRulesSpec.class, GameOfLifeCellPositionSpec.class, GameOfLifeWorldSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Game of Life")
public class GameOfLifeSpec {
  final CellPosition livingCell = new Function0<CellPosition>() {
    public CellPosition apply() {
      CellPosition _cell = CellPosition.cell(0, 0);
      return _cell;
    }
  }.apply();
  
  final CellPosition anotherLivingCell = new Function0<CellPosition>() {
    public CellPosition apply() {
      CellPosition _cell = CellPosition.cell(1, 1);
      return _cell;
    }
  }.apply();
  
  final World worldWithLiveCell = new Function0<World>() {
    public World apply() {
      List<CellPosition> _list = JnarioCollectionLiterals.<CellPosition>list(GameOfLifeSpec.this.livingCell);
      World _worldWith = World.worldWith(_list);
      return _worldWith;
    }
  }.apply();
  
  final World worldWithTwoLiveNeighbours = new Function0<World>() {
    public World apply() {
      List<CellPosition> _list = JnarioCollectionLiterals.<CellPosition>list(GameOfLifeSpec.this.livingCell, GameOfLifeSpec.this.anotherLivingCell);
      World _worldWith = World.worldWith(_list);
      return _worldWith;
    }
  }.apply();
}
