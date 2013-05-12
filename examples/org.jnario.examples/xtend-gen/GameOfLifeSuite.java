import gameoflife.GameOfLifeWithJnarioXtendSuite;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Game of Life")
@Contains(GameOfLifeWithJnarioXtendSuite.class)
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class GameOfLifeSuite {
}
