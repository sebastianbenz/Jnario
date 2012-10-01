package demo;

import demo.ListExistingSpecsSuite;
import demo.SelectMultipleSpecsSuite;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Test Suites on Steroids")
@Contains({ ListExistingSpecsSuite.class, SelectMultipleSpecsSuite.class })
@SuppressWarnings("all")
public class TestSuitesOnSteroidsSuite {
}
