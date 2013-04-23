package diverse;

import diverse.ListExistingSpecsSuite;
import diverse.SelectMultipleSpecsSuite;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Test Suites on Steroids")
@Contains({ ListExistingSpecsSuite.class, SelectMultipleSpecsSuite.class })
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class TestSuitesOnSteroidsSuite {
}
