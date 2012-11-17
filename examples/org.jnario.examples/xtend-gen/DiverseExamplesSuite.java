import diverse.AdditionFeature;
import diverse.HelloWorldSpec;
import diverse.ListExistingSpecsSuite;
import diverse.SelectMultipleSpecsSuite;
import diverse.StackSpec;
import diverse.TablesSpec;
import diverse.TestSuitesOnSteroidsSuite;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Diverse Examples")
@Contains({ AdditionFeature.class, HelloWorldSpec.class, ListExistingSpecsSuite.class, SelectMultipleSpecsSuite.class, StackSpec.class, TablesSpec.class, TestSuitesOnSteroidsSuite.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
public class DiverseExamplesSuite {
}
