package org.jnario.feature.tests.unit.contentassist;

import com.google.inject.Injector;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.junit4.ui.AbstractContentAssistProcessorTest;
import org.jnario.feature.FeatureUiInjectorProvider;
import org.jnario.feature.tests.unit.contentassist.FeatureProposalProviderSameFileSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extends;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains(FeatureProposalProviderSameFileSpec.class)
@Named("FeatureProposalProvider")
@RunWith(ExampleGroupRunner.class)
@Extends(AbstractContentAssistProcessorTest.class)
@SuppressWarnings("all")
public class FeatureProposalProviderSpec extends AbstractContentAssistProcessorTest {
  protected ISetup doGetSetup() {
    final ISetup _function = new ISetup() {
        public Injector createInjectorAndDoEMFRegistration() {
          FeatureUiInjectorProvider _featureUiInjectorProvider = new FeatureUiInjectorProvider();
          Injector _injector = _featureUiInjectorProvider.getInjector();
          return _injector;
        }
      };
    return _function;
  }
}
