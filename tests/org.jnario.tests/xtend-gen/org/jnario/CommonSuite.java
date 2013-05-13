package org.jnario;

import org.jnario.jnario.documentation.GeneratingReportsSpec;
import org.jnario.jnario.tests.unit.DocumentationProviderSpec;
import org.jnario.jnario.tests.unit.doc.FilterExtractorSpec;
import org.jnario.jnario.tests.unit.doc.HtmlAssetsCompilerSpec;
import org.jnario.jnario.tests.unit.doc.HtmlAssetsSpec;
import org.jnario.jnario.tests.unit.doc.RegexFilterSpec;
import org.jnario.jnario.tests.unit.doc.WhiteSpaceNormalizerSpec;
import org.jnario.jnario.tests.unit.jnario.ExampleColumnSpec;
import org.jnario.jnario.tests.unit.jnario.ExampleTableSpec;
import org.jnario.jnario.tests.unit.jnario.ExecutableSpec;
import org.jnario.jnario.tests.unit.jnario.ShouldSpec;
import org.jnario.jnario.tests.unit.jnario.StringsSpec;
import org.jnario.jnario.tests.unit.jvmmodel.TestRuntimeProviderSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Common")
@Contains({ DocumentationProviderSpec.class, ExampleColumnSpec.class, ExampleTableSpec.class, ExecutableSpec.class, FilterExtractorSpec.class, GeneratingReportsSpec.class, HtmlAssetsSpec.class, HtmlAssetsCompilerSpec.class, RegexFilterSpec.class, ShouldSpec.class, StringsSpec.class, TestRuntimeProviderSpec.class, WhiteSpaceNormalizerSpec.class })
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class CommonSuite {
}
