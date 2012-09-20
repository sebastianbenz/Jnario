package demo;

import demo.AdditionFeature;
import demo.CalculatorSpec;
import example.AddingValuesSpec;
import example.SomethingFeature;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("AllTests")
@Contains({ AddingValuesSpec.class, AdditionFeature.class, CalculatorSpec.class, SomethingFeature.class })
@SuppressWarnings("all")
public class AllTestsSuite {
}
