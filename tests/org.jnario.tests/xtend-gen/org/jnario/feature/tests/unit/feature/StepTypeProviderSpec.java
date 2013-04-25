package org.jnario.feature.tests.unit.feature;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.inject.Inject;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.hamcrest.StringDescription;
import org.jnario.feature.feature.FeatureFactory;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.Given;
import org.jnario.feature.feature.GivenReference;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.Then;
import org.jnario.feature.feature.ThenReference;
import org.jnario.feature.feature.When;
import org.jnario.feature.feature.WhenReference;
import org.jnario.feature.jvmmodel.StepTypeProvider;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("StepTypeProvider")
@RunWith(ExampleGroupRunner.class)
@CreateWith(SpecTestCreator.class)
@SuppressWarnings("all")
public class StepTypeProviderSpec {
  @Extension
  @org.jnario.runner.Extension
  public FeatureFactory factory = FeatureFactory.eINSTANCE;
  
  @Extension
  @org.jnario.runner.Extension
  public StepTypeProvider _stepTypeProvider = new Function0<StepTypeProvider>() {
    public StepTypeProvider apply() {
      StepTypeProvider _stepTypeProvider = new StepTypeProvider();
      return _stepTypeProvider;
    }
  }.apply();
  
  @Extension
  @org.jnario.runner.Extension
  public FeaturePackage pack = FeaturePackage.eINSTANCE;
  
  @Inject
  @Extension
  @org.jnario.runner.Extension
  public ModelStore _modelStore;
  
  @Test
  @Named("createGiven.expectedTypes => -[given, givenReference]")
  @Order(1)
  public void _createGivenExpectedTypesGivenGivenReference() throws Exception {
    Given _createGiven = this.factory.createGiven();
    Set<EClass> _expectedTypes = this._stepTypeProvider.getExpectedTypes(_createGiven);
    EClass _given = this.pack.getGiven();
    EClass _givenReference = this.pack.getGivenReference();
    List<EClass> _xlistliteral = null;
    Builder<EClass> _builder = ImmutableList.builder();
    _builder.add(_given);
    _builder.add(_givenReference);
    _xlistliteral = _builder.build();
    boolean _doubleArrow = Should.operator_doubleArrow(_expectedTypes, _xlistliteral);
    Assert.assertTrue("\nExpected createGiven.expectedTypes => #[given, givenReference] but"
     + "\n     createGiven.expectedTypes is " + new StringDescription().appendValue(_expectedTypes).toString()
     + "\n     createGiven is " + new StringDescription().appendValue(_createGiven).toString()
     + "\n     #[given, givenReference] is " + new StringDescription().appendValue(_xlistliteral).toString()
     + "\n     given is " + new StringDescription().appendValue(_given).toString()
     + "\n     givenReference is " + new StringDescription().appendValue(_givenReference).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("createGivenReference.expectedTypes => -[given, givenReference]")
  @Order(2)
  public void _createGivenReferenceExpectedTypesGivenGivenReference() throws Exception {
    GivenReference _createGivenReference = this.factory.createGivenReference();
    Set<EClass> _expectedTypes = this._stepTypeProvider.getExpectedTypes(_createGivenReference);
    EClass _given = this.pack.getGiven();
    EClass _givenReference = this.pack.getGivenReference();
    List<EClass> _xlistliteral = null;
    Builder<EClass> _builder = ImmutableList.builder();
    _builder.add(_given);
    _builder.add(_givenReference);
    _xlistliteral = _builder.build();
    boolean _doubleArrow = Should.operator_doubleArrow(_expectedTypes, _xlistliteral);
    Assert.assertTrue("\nExpected createGivenReference.expectedTypes => #[given, givenReference] but"
     + "\n     createGivenReference.expectedTypes is " + new StringDescription().appendValue(_expectedTypes).toString()
     + "\n     createGivenReference is " + new StringDescription().appendValue(_createGivenReference).toString()
     + "\n     #[given, givenReference] is " + new StringDescription().appendValue(_xlistliteral).toString()
     + "\n     given is " + new StringDescription().appendValue(_given).toString()
     + "\n     givenReference is " + new StringDescription().appendValue(_givenReference).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("createWhen.expectedTypes => -[when, whenReference]")
  @Order(3)
  public void _createWhenExpectedTypesWhenWhenReference() throws Exception {
    When _createWhen = this.factory.createWhen();
    Set<EClass> _expectedTypes = this._stepTypeProvider.getExpectedTypes(_createWhen);
    EClass _when = this.pack.getWhen();
    EClass _whenReference = this.pack.getWhenReference();
    List<EClass> _xlistliteral = null;
    Builder<EClass> _builder = ImmutableList.builder();
    _builder.add(_when);
    _builder.add(_whenReference);
    _xlistliteral = _builder.build();
    boolean _doubleArrow = Should.operator_doubleArrow(_expectedTypes, _xlistliteral);
    Assert.assertTrue("\nExpected createWhen.expectedTypes => #[when, whenReference] but"
     + "\n     createWhen.expectedTypes is " + new StringDescription().appendValue(_expectedTypes).toString()
     + "\n     createWhen is " + new StringDescription().appendValue(_createWhen).toString()
     + "\n     #[when, whenReference] is " + new StringDescription().appendValue(_xlistliteral).toString()
     + "\n     when is " + new StringDescription().appendValue(_when).toString()
     + "\n     whenReference is " + new StringDescription().appendValue(_whenReference).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("createWhenReference.expectedTypes => -[when, whenReference]")
  @Order(4)
  public void _createWhenReferenceExpectedTypesWhenWhenReference() throws Exception {
    WhenReference _createWhenReference = this.factory.createWhenReference();
    Set<EClass> _expectedTypes = this._stepTypeProvider.getExpectedTypes(_createWhenReference);
    EClass _when = this.pack.getWhen();
    EClass _whenReference = this.pack.getWhenReference();
    List<EClass> _xlistliteral = null;
    Builder<EClass> _builder = ImmutableList.builder();
    _builder.add(_when);
    _builder.add(_whenReference);
    _xlistliteral = _builder.build();
    boolean _doubleArrow = Should.operator_doubleArrow(_expectedTypes, _xlistliteral);
    Assert.assertTrue("\nExpected createWhenReference.expectedTypes => #[when, whenReference] but"
     + "\n     createWhenReference.expectedTypes is " + new StringDescription().appendValue(_expectedTypes).toString()
     + "\n     createWhenReference is " + new StringDescription().appendValue(_createWhenReference).toString()
     + "\n     #[when, whenReference] is " + new StringDescription().appendValue(_xlistliteral).toString()
     + "\n     when is " + new StringDescription().appendValue(_when).toString()
     + "\n     whenReference is " + new StringDescription().appendValue(_whenReference).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("createThen.expectedTypes => -[then, thenReference]")
  @Order(5)
  public void _createThenExpectedTypesThenThenReference() throws Exception {
    Then _createThen = this.factory.createThen();
    Set<EClass> _expectedTypes = this._stepTypeProvider.getExpectedTypes(_createThen);
    EClass _then = this.pack.getThen();
    EClass _thenReference = this.pack.getThenReference();
    List<EClass> _xlistliteral = null;
    Builder<EClass> _builder = ImmutableList.builder();
    _builder.add(_then);
    _builder.add(_thenReference);
    _xlistliteral = _builder.build();
    boolean _doubleArrow = Should.operator_doubleArrow(_expectedTypes, _xlistliteral);
    Assert.assertTrue("\nExpected createThen.expectedTypes => #[then, thenReference] but"
     + "\n     createThen.expectedTypes is " + new StringDescription().appendValue(_expectedTypes).toString()
     + "\n     createThen is " + new StringDescription().appendValue(_createThen).toString()
     + "\n     #[then, thenReference] is " + new StringDescription().appendValue(_xlistliteral).toString()
     + "\n     then is " + new StringDescription().appendValue(_then).toString()
     + "\n     thenReference is " + new StringDescription().appendValue(_thenReference).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("createThenReference.expectedTypes => -[then, thenReference]")
  @Order(6)
  public void _createThenReferenceExpectedTypesThenThenReference() throws Exception {
    ThenReference _createThenReference = this.factory.createThenReference();
    Set<EClass> _expectedTypes = this._stepTypeProvider.getExpectedTypes(_createThenReference);
    EClass _then = this.pack.getThen();
    EClass _thenReference = this.pack.getThenReference();
    List<EClass> _xlistliteral = null;
    Builder<EClass> _builder = ImmutableList.builder();
    _builder.add(_then);
    _builder.add(_thenReference);
    _xlistliteral = _builder.build();
    boolean _doubleArrow = Should.operator_doubleArrow(_expectedTypes, _xlistliteral);
    Assert.assertTrue("\nExpected createThenReference.expectedTypes => #[then, thenReference] but"
     + "\n     createThenReference.expectedTypes is " + new StringDescription().appendValue(_expectedTypes).toString()
     + "\n     createThenReference is " + new StringDescription().appendValue(_createThenReference).toString()
     + "\n     #[then, thenReference] is " + new StringDescription().appendValue(_xlistliteral).toString()
     + "\n     then is " + new StringDescription().appendValue(_then).toString()
     + "\n     thenReference is " + new StringDescription().appendValue(_thenReference).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Feature: something Scenario: scenario Given something And something else And something else \\\'\\\'\\\'.expectedTypes =>  -[given, givenReference]")
  @Order(7)
  public void _featureSomethingScenarioScenarioGivenSomethingAndSomethingElseAndSomethingElseExpectedTypesGivenGivenReference() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: something");
    _builder.newLine();
    _builder.append("Scenario: scenario");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given something");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("And something else");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("And something else");
    _builder.newLine();
    Set<EClass> _expectedTypes = this.expectedTypes(_builder);
    EClass _given = this.pack.getGiven();
    EClass _givenReference = this.pack.getGivenReference();
    List<EClass> _xlistliteral = null;
    Builder<EClass> _builder_1 = ImmutableList.builder();
    _builder_1.add(_given);
    _builder_1.add(_givenReference);
    _xlistliteral = _builder_1.build();
    boolean _doubleArrow = Should.operator_doubleArrow(_expectedTypes, _xlistliteral);
    Assert.assertTrue("\nExpected \'\'\'\n\t\tFeature: something\n\t\tScenario: scenario\n\t\t\tGiven something\n\t\t\tAnd something else\n\t\t\tAnd something else\n\t\'\'\'.expectedTypes =>  #[given, givenReference] but"
     + "\n     \'\'\'\n\t\tFeature: something\n\t\tScenario: scenario\n\t\t\tGiven something\n\t\t\tAnd something else\n\t\t\tAnd something else\n\t\'\'\'.expectedTypes is " + new StringDescription().appendValue(_expectedTypes).toString()
     + "\n     \'\'\'\n\t\tFeature: something\n\t\tScenario: scenario\n\t\t\tGiven something\n\t\t\tAnd something else\n\t\t\tAnd something else\n\t\'\'\' is " + new StringDescription().appendValue(_builder).toString()
     + "\n     #[given, givenReference] is " + new StringDescription().appendValue(_xlistliteral).toString()
     + "\n     given is " + new StringDescription().appendValue(_given).toString()
     + "\n     givenReference is " + new StringDescription().appendValue(_givenReference).toString() + "\n", _doubleArrow);
    
  }
  
  public Set<EClass> expectedTypes(final CharSequence s) {
    Set<EClass> _xblockexpression = null;
    {
      this._modelStore.parseScenario(s);
      Scenario _firstScenario = this._modelStore.firstScenario();
      EList<Step> _steps = _firstScenario.getSteps();
      Step _last = IterableExtensions.<Step>last(_steps);
      Set<EClass> _expectedTypes = this._stepTypeProvider.getExpectedTypes(_last);
      _xblockexpression = (_expectedTypes);
    }
    return _xblockexpression;
  }
}
