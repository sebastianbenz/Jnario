package org.jnario;

import org.jnario.feature.documentation.GivenWhenThenSpec;
import org.jnario.feature.documentation.IntroducingJnarioFeaturesSpec;
import org.jnario.feature.tests.unit.compiler.FeatureCompilerSpec;
import org.jnario.feature.tests.unit.conversion.FeatureValueConverterSpec;
import org.jnario.feature.tests.unit.doc.FeatureDocGeneratorSpec;
import org.jnario.feature.tests.unit.feature.FeatureExecutableProviderSpec;
import org.jnario.feature.tests.unit.jvmmodel.ShouldSpec;
import org.jnario.feature.tests.unit.jvmmodel.StepContextProviderSpec;
import org.jnario.feature.tests.unit.linking.ReferencingOtherStepsSpec;
import org.jnario.feature.tests.unit.linking.StepArgumentsProviderSpec;
import org.jnario.feature.tests.unit.naming.FeatureClassNameProviderSpec;
import org.jnario.feature.tests.unit.naming.FeatureQualifiedNameProviderSpec;
import org.jnario.feature.tests.unit.naming.FeatureScopeProviderSpec;
import org.jnario.feature.tests.unit.naming.StepExpressionProviderSpec;
import org.jnario.feature.tests.unit.naming.StepNameProviderSpec;
import org.jnario.feature.tests.unit.parser.FeatureTokenSourceSpec;
import org.jnario.feature.tests.unit.resource.FeatureLocationInFileProviderSpec;
import org.jnario.feature.tests.unit.validation.FeatureJavaValidatorSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Named("Feature")
@Contains({ FeatureCompilerSpec.class, FeatureClassNameProviderSpec.class, FeatureDocGeneratorSpec.class, FeatureExecutableProviderSpec.class, FeatureJavaValidatorSpec.class, FeatureLocationInFileProviderSpec.class, FeatureQualifiedNameProviderSpec.class, FeatureScopeProviderSpec.class, FeatureTokenSourceSpec.class, FeatureValueConverterSpec.class, GivenWhenThenSpec.class, IntroducingJnarioFeaturesSpec.class, ReferencingOtherStepsSpec.class, ShouldSpec.class, StepArgumentsProviderSpec.class, StepContextProviderSpec.class, StepExpressionProviderSpec.class, StepNameProviderSpec.class })
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureSuite {
}
