package org.jnario.jnario.documentation;

import org.jnario.jnario.documentation.InstallingJnarioEclipseToolingSpec;
import org.jnario.jnario.documentation.InstallingJnarioMavenSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ InstallingJnarioEclipseToolingSpec.class, InstallingJnarioMavenSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Installing Jnario")
public class InstallingJnarioSpec {
}
