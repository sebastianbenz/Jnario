package org.jnario.feature.tests.integration;

import org.jnario.feature.tests.integration.AnnotationsFeatureParsingAnnotationsInsideACodeBlock;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

/**
 * @author Birgit Engelmann - Initial contribution and API
 */
@RunWith(FeatureRunner.class)
@Contains(AnnotationsFeatureParsingAnnotationsInsideACodeBlock.class)
@Named("Feature: Annotations")
@SuppressWarnings("all")
public class AnnotationsFeature {
}
