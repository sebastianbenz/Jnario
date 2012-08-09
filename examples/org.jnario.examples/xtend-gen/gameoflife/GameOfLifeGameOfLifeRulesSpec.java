package gameoflife;

import gameoflife.GameOfLifeGameOfLifeRulesEvolveDeadCellsSpec;
import gameoflife.GameOfLifeGameOfLifeRulesEvolveLivingCellsSpec;
import gameoflife.GameOfLifeSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ GameOfLifeGameOfLifeRulesEvolveLivingCellsSpec.class, GameOfLifeGameOfLifeRulesEvolveDeadCellsSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Game of Life rules")
public class GameOfLifeGameOfLifeRulesSpec extends GameOfLifeSpec {
}
