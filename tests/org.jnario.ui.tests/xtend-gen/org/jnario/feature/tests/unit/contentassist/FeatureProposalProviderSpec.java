package org.jnario.feature.tests.unit.contentassist;

import org.eclipse.xtext.ISetup;
import org.jnario.feature.tests.unit.contentassist.FeatureProposalProviderSameFileSpec;
import org.jnario.feature.tests.unit.contentassist.FeatureUiStandaloneSetup;
import org.jnario.jnario.test.util.AbstractContentAssistProcessorTest2;
import org.jnario.jnario.test.util.AbstractContentAssistProcessorTest2.ContentAssistProcessorTestBuilder2;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extends;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains(FeatureProposalProviderSameFileSpec.class)
@Named("FeatureProposalProvider")
@RunWith(ExampleGroupRunner.class)
@Extends(AbstractContentAssistProcessorTest2.class)
@SuppressWarnings("all")
public class FeatureProposalProviderSpec extends AbstractContentAssistProcessorTest2 {
  ContentAssistProcessorTestBuilder2 builder;
  
  protected ISetup doGetSetup() {
    FeatureUiStandaloneSetup _featureUiStandaloneSetup = new FeatureUiStandaloneSetup();
    return _featureUiStandaloneSetup;
  }
}
