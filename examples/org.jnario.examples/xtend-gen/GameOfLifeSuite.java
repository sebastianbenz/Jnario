import gameoflife.specs.GameOfLifeWithJnarioXtendSuite;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Game of Life")
@Contains(GameOfLifeWithJnarioXtendSuite.class)
@SuppressWarnings("all")
public class GameOfLifeSuite {
}
