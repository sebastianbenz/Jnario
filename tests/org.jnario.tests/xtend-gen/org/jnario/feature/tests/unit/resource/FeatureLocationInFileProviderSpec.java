package org.jnario.feature.tests.unit.resource;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.util.ITextRegion;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.resource.FeatureLocationInFileProvider;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@Named("FeatureLocationInFileProvider")
@RunWith(ExampleGroupRunner.class)
@CreateWith(value = FeatureTestCreator.class)
public class FeatureLocationInFileProviderSpec {
  @Subject
  public FeatureLocationInFileProvider subject;
  
  CharSequence content;
  
  @Inject
  @Extension
  public ModelStore _modelStore;
  
  @Test
  @Named("Scenario significant region spans over first line")
  @Order(1)
  public void _scenarioSignificantRegionSpansOverFirstLine() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: My Feature");
    _builder.newLine();
    _builder.append("Scenario: My Scenario");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given something");
    _builder.newLine();
    this.parse(_builder);
    Scenario _firstScenario = this._modelStore.firstScenario();
    CharSequence _siginificantRegion = this.siginificantRegion(_firstScenario);
    this.is(_siginificantRegion, "Scenario: My Scenario");
  }
  
  @Test
  @Named("Scenario full text region spans over all steps")
  @Order(2)
  public void _scenarioFullTextRegionSpansOverAllSteps() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: My Feature");
    _builder.newLine();
    _builder.append("Scenario: My Scenario");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("String something");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given something");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("And something else");
    _builder.newLine();
    this.parse(_builder);
    Scenario _firstScenario = this._modelStore.firstScenario();
    CharSequence _region = this.region(_firstScenario);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("Scenario: My Scenario");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("String something");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Given something");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("And something else");
    _builder_1.newLine();
    this.is(_region, _builder_1);
  }
  
  public void is(final CharSequence actual, final CharSequence expected) {
    String _string = expected.toString();
    String _string_1 = actual.toString();
    Assert.assertEquals(_string, _string_1);
  }
  
  public Resource parse(final CharSequence s) {
    Resource _xblockexpression = null;
    {
      this.content = s;
      Resource _parseScenario = this._modelStore.parseScenario(s);
      _xblockexpression = (_parseScenario);
    }
    return _xblockexpression;
  }
  
  public CharSequence siginificantRegion(final EObject object) {
    Scenario _firstScenario = this._modelStore.firstScenario();
    ITextRegion _significantTextRegion = this.subject.getSignificantTextRegion(_firstScenario);
    CharSequence _text = this.toText(_significantTextRegion);
    return _text;
  }
  
  public CharSequence region(final EObject object) {
    Scenario _firstScenario = this._modelStore.firstScenario();
    ITextRegion _fullTextRegion = this.subject.getFullTextRegion(_firstScenario);
    CharSequence _text = this.toText(_fullTextRegion);
    return _text;
  }
  
  public CharSequence toText(final ITextRegion region) {
    int _offset = region.getOffset();
    int _offset_1 = region.getOffset();
    int _length = region.getLength();
    int _plus = (_offset_1 + _length);
    CharSequence _subSequence = this.content.subSequence(_offset, _plus);
    return _subSequence;
  }
}
