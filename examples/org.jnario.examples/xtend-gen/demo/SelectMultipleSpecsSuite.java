package demo;

import demo.AdditionFeature;
import demo.StackSpec;
import demo.TablesSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Select multiple specs")
@Contains({ AdditionFeature.class, StackSpec.class, TablesSpec.class })
@SuppressWarnings("all")
public class SelectMultipleSpecsSuite {
}
