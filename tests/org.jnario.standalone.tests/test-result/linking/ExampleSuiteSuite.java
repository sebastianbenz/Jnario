package linking;

import linking.ExampleSpec;
import linking.ExamplesFeature;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Example Suite")
@Contains({ ExampleSpec.class, ExamplesFeature.class })
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleSuiteSuite {
}
