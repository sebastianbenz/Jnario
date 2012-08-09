package gameoflife;

import gameoflife.GameOfLifeRulesEvolveDeadCellsSpec;
import gameoflife.GameOfLifeRulesEvolveLivingCellsSpec;
import gameoflife.GameOfLifeSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ GameOfLifeRulesEvolveLivingCellsSpec.class, GameOfLifeRulesEvolveDeadCellsSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Rules")
public class GameOfLifeRulesSpec extends GameOfLifeSpec {
}
