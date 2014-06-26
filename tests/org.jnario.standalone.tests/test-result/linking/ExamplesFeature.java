package linking;

import linking.ExamplesFeatureExampleTables;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains(ExamplesFeatureExampleTables.class)
@Named("Examples")
@RunWith(FeatureRunner.class)
@SuppressWarnings("all")
public class ExamplesFeature {
}
