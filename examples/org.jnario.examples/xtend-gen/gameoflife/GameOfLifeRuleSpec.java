package gameoflife;

import gameoflife.GameOfLifeRuleEvolveDeadCellsSpec;
import gameoflife.GameOfLifeRuleEvolveLiveCellsSpec;
import gameoflife.GameOfLifeSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ GameOfLifeRuleEvolveLiveCellsSpec.class, GameOfLifeRuleEvolveDeadCellsSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Rule")
public class GameOfLifeRuleSpec extends GameOfLifeSpec {
}
