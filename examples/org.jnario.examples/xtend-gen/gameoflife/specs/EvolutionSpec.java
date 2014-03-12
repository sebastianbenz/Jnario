package gameoflife.specs;

import gameoflife.CellLocation;
import gameoflife.Rule;
import gameoflife.World;
import gameoflife.specs.EvolutionDeadCellsSpec;
import gameoflife.specs.EvolutionLiveCellsSpec;
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
  final CellLocation livingCell = CellLocation.cell(0, 0);
  
  final World worldWithLiveCell = World.worldWith(JnarioCollectionLiterals.<CellLocation>list(this.livingCell));
  
  final Rule dontCare = new Rule() {
    public boolean becomesAlive(final int it) {
      return false;
    }
  };
}
