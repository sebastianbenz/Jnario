import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Jnario Examples")
@Contains({ GameOfLifeSuite.class, DiverseExamplesSuite.class })
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class JnarioExamplesSuite {
}
