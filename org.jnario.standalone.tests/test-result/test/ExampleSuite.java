package test;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;
import test.ExamplesFeature;
import test.SpecExampleNestedExampleSpec;
import test.SpecExampleSpec;

@RunWith(ExampleGroupRunner.class)
@Named("Example")
@Contains({ ExamplesFeature.class, SpecExampleSpec.class, SpecExampleNestedExampleSpec.class })
@SuppressWarnings("all")
public class ExampleSuite {
}
