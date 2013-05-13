package diverse;

import diverse.StackSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("List existing Specs")
@Contains(StackSpec.class)
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ListExistingSpecsSuite {
}
