package org.jnario;

import org.jnario.jnario.documentation.InstallingJnarioSpec;
import org.jnario.jnario.documentation._20FactsAboutXtendSpec;
import org.jnario.jnario.tests.integration.ExtensionLibrarySpec;
import org.jnario.jnario.tests.unit.DocumentationProviderSpec;
import org.jnario.jnario.tests.unit.doc.FilterExtractorSpec;
import org.jnario.jnario.tests.unit.doc.HtmlAssetsCompilerSpec;
import org.jnario.jnario.tests.unit.doc.HtmlAssetsSpec;
import org.jnario.jnario.tests.unit.doc.HtmlFileSpec;
import org.jnario.jnario.tests.unit.doc.RegexFilterSpec;
import org.jnario.jnario.tests.unit.doc.WhiteSpaceNormalizerSpec;
import org.jnario.jnario.tests.unit.jnario.ExampleColumnSpec;
import org.jnario.jnario.tests.unit.jnario.ExampleTableSpec;
import org.jnario.jnario.tests.unit.jnario.ExecutableSpec;
import org.jnario.jnario.tests.unit.jnario.ShouldSpec;
import org.jnario.jnario.tests.unit.jnario.StringsSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Common")
@Contains({ _20FactsAboutXtendSpec.class, DocumentationProviderSpec.class, ExampleColumnSpec.class, ExampleTableSpec.class, ExecutableSpec.class, ExtensionLibrarySpec.class, FilterExtractorSpec.class, HtmlAssetsSpec.class, HtmlAssetsCompilerSpec.class, HtmlFileSpec.class, InstallingJnarioSpec.class, RegexFilterSpec.class, ShouldSpec.class, StringsSpec.class, WhiteSpaceNormalizerSpec.class })
@SuppressWarnings("all")
public class CommonSuite {
}
