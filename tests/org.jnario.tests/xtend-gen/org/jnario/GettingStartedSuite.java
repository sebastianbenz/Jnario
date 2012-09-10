package org.jnario;

import org.jnario.feature.documentation.IntroducingJnarioFeaturesSpec;
import org.jnario.jnario.documentation._20FactsAboutXtendSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.tests.documentation.IntroducingJnarioSpecsSpec;
import org.jnario.suite.documentation.IntroducingJnarioSuitesSpec;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Getting Started")
@Contains({ _20FactsAboutXtendSpec.class, IntroducingJnarioFeaturesSpec.class, IntroducingJnarioSpecsSpec.class, IntroducingJnarioSuitesSpec.class })
@SuppressWarnings("all")
public class GettingStartedSuite {
}
