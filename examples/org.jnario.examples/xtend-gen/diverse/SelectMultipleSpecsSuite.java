package diverse;

import diverse.AdditionFeature;
import diverse.HelloWorldSpec;
import diverse.StackSpec;
import diverse.TablesSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Select multiple specs")
@Contains({ AdditionFeature.class, HelloWorldSpec.class, StackSpec.class, TablesSpec.class })
@SuppressWarnings("all")
public class SelectMultipleSpecsSuite {
}
