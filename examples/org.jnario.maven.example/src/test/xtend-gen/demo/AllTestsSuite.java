package demo;

import demo.AdditionFeature;
import demo.CalculatorSpec;
import demo.TestSuiteSuite;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("AllTests")
@Contains({ AdditionFeature.class, CalculatorSpec.class, TestSuiteSuite.class })
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class AllTestsSuite {
}
