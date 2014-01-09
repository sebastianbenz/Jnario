package test;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;
import test.ExamplesFeature;

@Named("Example")
@Contains(ExamplesFeature.class)
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleSuite {
}
