package gameoflife;

import gameoflife.GameOfLifeEvolutionDeadCellsSpec;
import gameoflife.GameOfLifeEvolutionLiveCellsSpec;
import gameoflife.GameOfLifeSpec;
import gameoflife.Rule;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ GameOfLifeEvolutionDeadCellsSpec.class, GameOfLifeEvolutionLiveCellsSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Evolution")
public class GameOfLifeEvolutionSpec extends GameOfLifeSpec {
  final Rule dontCare = new Function0<Rule>() {
    public Rule apply() {
      final Function1<Integer,Boolean> _function = new Function1<Integer,Boolean>() {
          public Boolean apply(final Integer it) {
            return false;
          }
        };
      return new Rule() {
          public boolean becomesAlive(int neighbourCount) {
            return _function.apply(neighbourCount);
          }
      };
    }
  }.apply();
}
