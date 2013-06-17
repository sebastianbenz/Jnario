package org.jnario.ui.tests;

import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.ui.tests.feature.contentassist.FeatureProposalProviderSpec;
import org.junit.runner.RunWith;

@Named("JnarioUiTests")
@Contains(FeatureProposalProviderSpec.class)
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class JnarioUiTestsSuite {
}
