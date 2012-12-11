package org.jnario.feature.documentation;

import org.jnario.feature.documentation.IntroducingJnarioFeaturesHowToWriteAFeatureSpec;
import org.jnario.feature.documentation.IntroducingJnarioFeaturesViewsSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * Jnario Features are based on [Xtend](http://www.xtend-lang.org). It is a good idea
 * to read the Xtend [documentation](http://www.eclipse.org/xtend/documentation/index.html)
 * before you get started with Jnario, because expressions, fields, methods and extensions in Jnario work exactly as in Xtend.
 */
@Contains({ IntroducingJnarioFeaturesHowToWriteAFeatureSpec.class, IntroducingJnarioFeaturesViewsSpec.class })
@SuppressWarnings("all")
@Named("Introducing Jnario Features")
@RunWith(ExampleGroupRunner.class)
public class IntroducingJnarioFeaturesSpec {
}
