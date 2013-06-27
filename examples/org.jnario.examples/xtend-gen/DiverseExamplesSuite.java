import diverse.AdditionFeature;
import diverse.HelloWorldSpec;
import diverse.StackSpec;
import diverse.TablesSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Diverse Examples")
@Contains({ AdditionFeature.class, HelloWorldSpec.class, StackSpec.class, TablesSpec.class })
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class DiverseExamplesSuite {
}
