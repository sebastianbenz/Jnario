package org.jnario;

import org.jnario.feature.documentation.GivenWhenThenSpec;
import org.jnario.feature.documentation.IntroducingJnarioFeaturesSpec;
import org.jnario.feature.tests.integration.AccessOfVariablesFeature;
import org.jnario.feature.tests.integration.BackgroundsFeature;
import org.jnario.feature.tests.integration.CalculatorFeature;
import org.jnario.feature.tests.integration.DefiningFeatureBasesClassesFeature;
import org.jnario.feature.tests.integration.FeatureExtensionsFeature;
import org.jnario.feature.tests.integration.FieldInferenceFeature;
import org.jnario.feature.tests.integration.ParsingSimpleJnarioFilesFeature;
import org.jnario.feature.tests.integration.PendingStepsFeature;
import org.jnario.feature.tests.integration.ReferencesForStepsFeature;
import org.jnario.feature.tests.integration.SetupTeardownWithFeatureExtensionsFeature;
import org.jnario.feature.tests.integration.StepParametersFeature;
import org.jnario.feature.tests.integration.TestRunnerFeature;
import org.jnario.feature.tests.integration.UsingJUnitRulesInFeaturesFeature;
import org.jnario.feature.tests.integration.UsingMatchersInFeaturesFeature;
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
@Contains({ AccessOfVariablesFeature.class, BackgroundsFeature.class, CalculatorFeature.class, DefiningFeatureBasesClassesFeature.class, FeatureCompilerSpec.class, FeatureExtensionsFeature.class, FeatureClassNameProviderSpec.class, FeatureDocGeneratorSpec.class, FeatureExecutableProviderSpec.class, FeatureJavaValidatorSpec.class, FeatureLocationInFileProviderSpec.class, FeatureQualifiedNameProviderSpec.class, FeatureScopeProviderSpec.class, FeatureTokenSourceSpec.class, FeatureValueConverterSpec.class, FieldInferenceFeature.class, GivenWhenThenSpec.class, IntroducingJnarioFeaturesSpec.class, ParsingSimpleJnarioFilesFeature.class, PendingStepsFeature.class, ReferencesForStepsFeature.class, ReferencingOtherStepsSpec.class, SetupTeardownWithFeatureExtensionsFeature.class, ShouldSpec.class, StepParametersFeature.class, StepArgumentsProviderSpec.class, StepContextProviderSpec.class, StepExpressionProviderSpec.class, StepNameProviderSpec.class, TestRunnerFeature.class, UsingJUnitRulesInFeaturesFeature.class, UsingMatchersInFeaturesFeature.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
public class FeatureSuite {
}
