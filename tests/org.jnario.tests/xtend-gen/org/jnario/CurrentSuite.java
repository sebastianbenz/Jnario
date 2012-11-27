package org.jnario;

import org.jnario.feature.tests.integration.ReferencesForStepsFeature;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Current")
@Contains(ReferencesForStepsFeature.class)
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
public class CurrentSuite {
}
