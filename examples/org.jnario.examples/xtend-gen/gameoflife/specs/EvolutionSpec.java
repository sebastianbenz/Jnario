package gameoflife.specs;

import gameoflife.CellLocation;
import gameoflife.Rule;
import gameoflife.World;
import gameoflife.specs.EvolutionDeadCellsSpec;
import gameoflife.specs.EvolutionLiveCellsSpec;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * Responsible for evolving cells in the world. The
 * evolution is parameterized by two rules, the first
 * rule deciding whether a live cell  stays alive and the second
 * rule deciding whether a dead cell becomes alive.
 */
@Contains({ EvolutionDeadCellsSpec.class, EvolutionLiveCellsSpec.class })
@Named("Evolution")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class EvolutionSpec {
  final CellLocation livingCell = new Function0<CellLocation>() {
    public CellLocation apply() {
      CellLocation _cell = CellLocation.cell(0, 0);
      return _cell;
    }
  }.apply();
  
  final World worldWithLiveCell = new Function0<World>() {
    public World apply() {
      List<CellLocation> _list = JnarioCollectionLiterals.<CellLocation>list(EvolutionSpec.this.livingCell);
      World _worldWith = World.worldWith(_list);
      return _worldWith;
    }
  }.apply();
  
  final Rule dontCare = new Function0<Rule>() {
    public Rule apply() {
      final Rule _function = new Rule() {
          public boolean becomesAlive(final int it) {
            return false;
          }
        };
      return _function;
    }
  }.apply();
}
