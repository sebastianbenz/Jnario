package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.FeatureExtensionsFeatureDefiningOwnExtensions;
import org.jnario.feature.tests.integration.FeatureExtensionsFeatureReferencingMultipleExtensions;
import org.jnario.feature.tests.integration.FeatureExtensionsFeatureReferencingStepsWithExtensions;
import org.jnario.feature.tests.integration.FeatureExtensionsFeatureReferencingStepsWithImportedExtensions;
import org.jnario.feature.tests.integration.FeatureExtensionsFeatureUsingJnarioPredefinedExtensions;
import org.jnario.feature.tests.integration.FeatureExtensionsFeatureUsingMultipleExtensions;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ FeatureExtensionsFeatureUsingJnarioPredefinedExtensions.class, FeatureExtensionsFeatureReferencingStepsWithExtensions.class, FeatureExtensionsFeatureDefiningOwnExtensions.class, FeatureExtensionsFeatureReferencingStepsWithImportedExtensions.class, FeatureExtensionsFeatureUsingMultipleExtensions.class, FeatureExtensionsFeatureReferencingMultipleExtensions.class })
@Named("Feature Extensions")
@SuppressWarnings("all")
@RunWith(FeatureRunner.class)
public class FeatureExtensionsFeature {
}
