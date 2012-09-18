package org.jnario.jnario.tests.integration;

import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.jnario.tests.integration.ParsingSpecResultsFromJUnitXMLReportsFeatureMatchingFailedSpecRuns;
import org.jnario.jnario.tests.integration.ParsingSpecResultsFromJUnitXMLReportsFeatureMatchingSuccessfullSpecRuns;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.Ignore;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Contains({ ParsingSpecResultsFromJUnitXMLReportsFeatureMatchingSuccessfullSpecRuns.class, ParsingSpecResultsFromJUnitXMLReportsFeatureMatchingFailedSpecRuns.class })
@Named("Parsing spec results from JUnit XML reports")
@Ignore
@CreateWith(value = SpecTestCreator.class)
@SuppressWarnings("all")
public class ParsingSpecResultsFromJUnitXMLReportsFeature {
}
