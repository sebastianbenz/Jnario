package demo;

import demo.CalculatorSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Test Suite")
@Contains(CalculatorSpec.class)
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class TestSuiteSuite {
}
