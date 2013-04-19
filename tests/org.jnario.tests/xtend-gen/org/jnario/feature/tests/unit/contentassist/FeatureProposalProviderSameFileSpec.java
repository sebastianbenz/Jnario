package org.jnario.feature.tests.unit.contentassist;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.ui.ContentAssistProcessorTestBuilder;
import org.jnario.feature.tests.unit.contentassist.FeatureProposalProviderSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("same file")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureProposalProviderSameFileSpec extends FeatureProposalProviderSpec {
  @Test
  @Named("proposes implemented steps")
  @Order(1)
  public void _proposesImplementedSteps() throws Exception {
    ContentAssistProcessorTestBuilder _newBuilder = this.newBuilder();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: My Feature");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: My Scenario");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given an implemented step");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("1 + 1 => 2");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    ContentAssistProcessorTestBuilder _append = _newBuilder.append(_builder.toString());
    _append.assertProposal("And an implemented step");
  }
}
