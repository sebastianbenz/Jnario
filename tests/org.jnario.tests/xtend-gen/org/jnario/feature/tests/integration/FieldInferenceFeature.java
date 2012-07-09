package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.FieldInferenceFeatureInferringFieldsFromOtherScenario;
import org.jnario.feature.tests.integration.FieldInferenceFeatureInferringFieldsFromScenarioInDifferentFeatures;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Contains({ FieldInferenceFeatureInferringFieldsFromOtherScenario.class, FieldInferenceFeatureInferringFieldsFromScenarioInDifferentFeatures.class })
@Named("Field Inference")
@CreateWith(value = FeatureTestCreator.class)
@SuppressWarnings("all")
public class FieldInferenceFeature {
}
