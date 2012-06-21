package test;

import org.jnario.feature.documentation.JnarioFeaturesTutorialHowToWriteAFeatureSpec;
import org.jnario.feature.documentation.JnarioFeaturesTutorialSpec;
import org.jnario.feature.tests.integration.AccessOfVariablesFeature;
import org.jnario.feature.tests.integration.BackgroundsFeature;
import org.jnario.feature.tests.integration.JunitRulesFeature;
import org.jnario.feature.tests.integration.ParsingSimpleJnarioFilesFeature;
import org.jnario.feature.tests.integration.ReferencesForStepsFeature;
import org.jnario.feature.tests.integration.StepParametersFeature;
import org.jnario.feature.tests.integration.TestRunnerFeature;
import org.jnario.feature.tests.integration.UsingMatchersInFeaturesFeature;
import org.jnario.feature.tests.unit.conversion.FeatureValueConverterToStringStringSpec;
import org.jnario.feature.tests.unit.linking.StepArgumentsProviderSpec;
import org.jnario.feature.tests.unit.naming.StepExpressionProviderSpec;
import org.jnario.feature.tests.unit.parser.FeatureTokenSourceSpec;
import org.jnario.feature.tests.unit.validation.FeatureJavaValidatorFeaturesMustHaveDescriptionsSpec;
import org.jnario.feature.tests.unit.validation.FeatureJavaValidatorScenariosMustHaveDescriptionsSpec;
import org.jnario.feature.tests.unit.validation.FeatureJavaValidatorSpec;
import org.jnario.feature.tests.unit.validation.FeatureJavaValidatorStepsMustHaveDescriptionsSpec;
import org.jnario.jnario.tests.unit.doc.WhiteSpaceNormalizerSpec;
import org.jnario.jnario.tests.unit.jnario.ExampleTableSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.spec.tests.documentation.JnarioSpecsTutorialHowToWriteASpecificationSpec;
import org.jnario.spec.tests.documentation.JnarioSpecsTutorialSpec;
import org.jnario.spec.tests.documentation.JnarioSpecsTutorialWritingAssertionsSpec;
import org.jnario.spec.tests.integration.AfterAllSpec;
import org.jnario.spec.tests.integration.AfterSpec;
import org.jnario.spec.tests.integration.AnnotationsSpec;
import org.jnario.spec.tests.integration.AssertionIntroductionSpec;
import org.jnario.spec.tests.integration.AssertionNoMoreDebuggingSpec;
import org.jnario.spec.tests.integration.AssertionSpec;
import org.jnario.spec.tests.integration.BeforeAllSpec;
import org.jnario.spec.tests.integration.BeforeSpec;
import org.jnario.spec.tests.integration.CollectionLiteralsListLiteralSpec;
import org.jnario.spec.tests.integration.CollectionLiteralsSetLiteralSpec;
import org.jnario.spec.tests.integration.CollectionLiteralsSpec;
import org.jnario.spec.tests.integration.ExampleGroupSpec;
import org.jnario.spec.tests.integration.ExtensionsSpec;
import org.jnario.spec.tests.integration.ImplicitSubjectSpec;
import org.jnario.spec.tests.integration.PendingSpec;
import org.jnario.spec.tests.integration.SimpleExampleSpec;
import org.jnario.spec.tests.integration.SpecInstantiationSpec;
import org.jnario.spec.tests.integration.SpecsExampleTablesSpec;
import org.jnario.spec.tests.integration.StaticImportsSpec;
import org.jnario.spec.tests.integration.ThrowsSpec;
import org.jnario.spec.tests.integration.UsingJUnitRulesSpec;
import org.jnario.spec.tests.integration.UsingShouldSpec;
import org.jnario.spec.tests.integration.UsingXtendSWithOperatorInitializeFixturesSpec;
import org.jnario.spec.tests.integration.UsingXtendSWithOperatorSpec;
import org.jnario.spec.tests.integration.UsingXtendSWithOperatorWriteMultipleAssertionsSpec;
import org.jnario.spec.tests.unit.doc.SpecDocGeneratorSpec;
import org.jnario.spec.tests.unit.naming.ExampleImplementationSpec;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderToFieldNameExampleTableSpec;
import org.jnario.spec.tests.unit.naming.ExampleNameSpec;
import org.jnario.spec.tests.unit.naming.ExamplePendingSpec;
import org.jnario.spec.tests.unit.naming.ExampleSpec;
import org.jnario.spec.tests.unit.naming.OperationNameProviderShouldNameMethodsSimilarToJavaDocLinksSpec;
import org.jnario.spec.tests.unit.scoping.SpecScopeProviderSpec;
import org.jnario.spec.tests.unit.validation.SpecJavaValidatorSpec;
import org.jnario.standalone.tests.JnarioDocCompilerFeatureDocCompilerSpec;
import org.jnario.standalone.tests.JnarioDocCompilerSpec;
import org.jnario.standalone.tests.JnarioDocCompilerSpecDocCompilerSpec;
import org.jnario.standalone.tests.JnarioDocCompilerSuiteDocCompilerSpec;
import org.jnario.suite.unit.SpecificationResolverEvaluatesRegularExpressionsSpec;
import org.jnario.suite.unit.SpecificationResolverSpec;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Example")
@Contains({ JnarioDocCompilerSpec.class, JnarioDocCompilerFeatureDocCompilerSpec.class, JnarioDocCompilerSpecDocCompilerSpec.class, JnarioDocCompilerSuiteDocCompilerSpec.class, ExampleSpec.class, OperationNameProviderShouldNameMethodsSimilarToJavaDocLinksSpec.class, UsingJUnitRulesSpec.class, ExampleGroupSpec.class, CollectionLiteralsSpec.class, CollectionLiteralsListLiteralSpec.class, CollectionLiteralsSetLiteralSpec.class, BeforeSpec.class, FeatureTokenSourceSpec.class, JnarioFeaturesTutorialSpec.class, JnarioFeaturesTutorialHowToWriteAFeatureSpec.class, BackgroundsFeature.class, ImplicitSubjectSpec.class, ExampleTableSpec.class, SimpleExampleSpec.class, UsingMatchersInFeaturesFeature.class, SpecificationResolverSpec.class, WhiteSpaceNormalizerSpec.class, ParsingSimpleJnarioFilesFeature.class, ThrowsSpec.class, AccessOfVariablesFeature.class, SpecsExampleTablesSpec.class, AssertionSpec.class, AssertionIntroductionSpec.class, AssertionNoMoreDebuggingSpec.class, StepExpressionProviderSpec.class, BeforeAllSpec.class, TestRunnerFeature.class, SpecInstantiationSpec.class, JunitRulesFeature.class, AfterAllSpec.class, ReferencesForStepsFeature.class, SpecDocGeneratorSpec.class, FeatureValueConverterToStringStringSpec.class, AnnotationsSpec.class, UsingXtendSWithOperatorSpec.class, UsingXtendSWithOperatorInitializeFixturesSpec.class, UsingXtendSWithOperatorWriteMultipleAssertionsSpec.class, SpecScopeProviderSpec.class, UsingShouldSpec.class, JnarioSpecsTutorialSpec.class, JnarioSpecsTutorialHowToWriteASpecificationSpec.class, JnarioSpecsTutorialWritingAssertionsSpec.class, AfterSpec.class, ExtensionsSpec.class, SpecificationResolverEvaluatesRegularExpressionsSpec.class, PendingSpec.class, StepArgumentsProviderSpec.class, StepParametersFeature.class, StaticImportsSpec.class, ExampleNameProviderToFieldNameExampleTableSpec.class, FeatureJavaValidatorSpec.class, FeatureJavaValidatorFeaturesMustHaveDescriptionsSpec.class, FeatureJavaValidatorScenariosMustHaveDescriptionsSpec.class, FeatureJavaValidatorStepsMustHaveDescriptionsSpec.class, ExampleNameSpec.class, ExampleImplementationSpec.class, ExamplePendingSpec.class, SpecJavaValidatorSpec.class })
@SuppressWarnings("all")
public class ExampleSuite {
}
