package org.jnario;

import org.jnario.feature.documentation.JnarioFeaturesTutorialSpec;
import org.jnario.feature.tests.integration.AccessOfVariablesFeature;
import org.jnario.feature.tests.integration.BackgroundsFeature;
import org.jnario.feature.tests.integration.JunitRulesFeature;
import org.jnario.feature.tests.integration.ParsingSimpleJnarioFilesFeature;
import org.jnario.feature.tests.integration.ReferencesForStepsFeature;
import org.jnario.feature.tests.integration.SetupTeardownWithFeatureExtensionsFeature;
import org.jnario.feature.tests.integration.StepParametersFeature;
import org.jnario.feature.tests.integration.TestRunnerFeature;
import org.jnario.feature.tests.integration.UsingMatchersInFeaturesFeature;
import org.jnario.feature.tests.unit.conversion.FeatureValueConverterSpec;
import org.jnario.feature.tests.unit.linking.StepArgumentsProviderSpec;
import org.jnario.feature.tests.unit.naming.FeatureClassNameProviderSpec;
import org.jnario.feature.tests.unit.naming.StepExpressionProviderSpec;
import org.jnario.feature.tests.unit.naming.StepNameProviderSpec;
import org.jnario.feature.tests.unit.parser.FeatureTokenSourceSpec;
import org.jnario.feature.tests.unit.validation.FeatureJavaValidatorSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Feature")
@Contains({ FeatureTokenSourceSpec.class, JnarioFeaturesTutorialSpec.class, BackgroundsFeature.class, UsingMatchersInFeaturesFeature.class, ParsingSimpleJnarioFilesFeature.class, AccessOfVariablesFeature.class, FeatureClassNameProviderSpec.class, TestRunnerFeature.class, JunitRulesFeature.class, ReferencesForStepsFeature.class, FeatureValueConverterSpec.class, StepNameProviderSpec.class, StepExpressionProviderSpec.class, StepArgumentsProviderSpec.class, StepParametersFeature.class, FeatureJavaValidatorSpec.class, SetupTeardownWithFeatureExtensionsFeature.class })
@SuppressWarnings("all")
public class FeatureSuite {
}
