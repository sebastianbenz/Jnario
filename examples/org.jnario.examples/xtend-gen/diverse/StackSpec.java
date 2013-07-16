package diverse;

import diverse.StackEmptySpec;
import diverse.StackNotEmptySpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ StackEmptySpec.class, StackNotEmptySpec.class })
@Named("Stack")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class StackSpec {
}
