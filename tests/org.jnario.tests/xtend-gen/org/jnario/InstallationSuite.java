package org.jnario;

import org.jnario.jnario.documentation.InstallingJnarioSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Installation")
@Contains(InstallingJnarioSpec.class)
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class InstallationSuite {
}
