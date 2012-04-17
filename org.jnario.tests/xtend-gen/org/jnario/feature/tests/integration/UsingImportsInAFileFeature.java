package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.UsingImportsInAFileFeatureImportStuff;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@RunWith(FeatureRunner.class)
@Contains(UsingImportsInAFileFeatureImportStuff.class)
@Named("Feature: Using imports in a file")
@SuppressWarnings("all")
public class UsingImportsInAFileFeature {
}
