package org.jnario;

import org.jnario.jnario.documentation.MavenSpec;
import org.jnario.jnario.tests.unit.doc.FilterExtractorSpec;
import org.jnario.jnario.tests.unit.doc.RegexFilterSpec;
import org.jnario.jnario.tests.unit.doc.WhiteSpaceNormalizerSpec;
import org.jnario.jnario.tests.unit.jnario.ExampleColumnSpec;
import org.jnario.jnario.tests.unit.jnario.ExampleTableSpec;
import org.jnario.jnario.tests.unit.jnario.ShouldSpec;
import org.jnario.jnario.tests.unit.jnario.StringsSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Common")
@Contains({ ShouldSpec.class, ExampleColumnSpec.class, RegexFilterSpec.class, FilterExtractorSpec.class, StringsSpec.class, WhiteSpaceNormalizerSpec.class, ExampleTableSpec.class, MavenSpec.class })
@SuppressWarnings("all")
public class CommonSuite {
}
