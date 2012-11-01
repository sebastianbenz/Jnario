package org.jnario.feature.documentation;

import org.jnario.feature.documentation.IntroducingJnarioFeaturesHowToWriteAFeatureSpec;
import org.jnario.feature.documentation.IntroducingJnarioFeaturesViewsSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ IntroducingJnarioFeaturesHowToWriteAFeatureSpec.class, IntroducingJnarioFeaturesViewsSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Introducing Jnario Features")
public class IntroducingJnarioFeaturesSpec {
}
