package org.jnario.jnario.tests.unit.ui;

import java.util.Arrays;
import java.util.List;
import org.eclipse.jdt.internal.junit.model.TestCaseElement;
import org.eclipse.jdt.internal.junit.model.TestElement;
import org.eclipse.jdt.internal.junit.model.TestRoot;
import org.eclipse.jdt.internal.junit.model.TestRunSession;
import org.eclipse.jdt.internal.junit.model.TestSuiteElement;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.core.AnyOf;
import org.jnario.jnario.tests.unit.ui.AbstractJnarioRunnerUIHandlerSpec;
import org.jnario.jnario.tests.unit.ui.AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases;
import org.jnario.jnario.tests.unit.ui.TestUIHandler;
import org.jnario.lib.Assert;
import org.jnario.lib.Each;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.util.Strings;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * JUnit suite names are annotated with [IGNORED] if all child members are ignored
 * and [PENDING] if all child members are ignored and at least one is pending.
 */
@Named("Suite Labelling")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class AbstractJnarioRunnerUIHandlerSuiteLabellingSpec extends AbstractJnarioRunnerUIHandlerSpec {
  final TestRoot root = new TestRoot(new TestRunSession("run", null));
  
  final TestUIHandler handler = new TestUIHandler();
  
  final ViewPart part = null;
  
  public ExampleTable<AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases() {
    return ExampleTable.create("cases", 
      Arrays.asList("left", "right", "result"), 
      new AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases(  Arrays.asList("null", "null", "notMarked"), null, null, _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell2()),
      new AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases(  Arrays.asList("tc", "null", "notMarked"), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell3(), null, _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell5()),
      new AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases(  Arrays.asList("ign", "null", "markedIgnored"), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell6(), null, _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell8()),
      new AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases(  Arrays.asList("pend", "null", "markedPending"), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell9(), null, _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell11()),
      new AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases(  Arrays.asList("tc", "ign", "notMarked"), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell12(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell13(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell14()),
      new AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases(  Arrays.asList("tc", "pend", "notMarked"), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell15(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell16(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell17()),
      new AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases(  Arrays.asList("ign", "pend", "markedPending"), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell18(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell19(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell20()),
      new AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases(  Arrays.asList("ign", "ign", "markedIgnored"), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell21(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell22(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell23()),
      new AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases(  Arrays.asList("suite(tc)", "pend", "notMarked"), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell24(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell25(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell26()),
      new AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases(  Arrays.asList("suite(pend)", "tc", "notMarked"), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell27(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell28(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell29()),
      new AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases(  Arrays.asList("suite(tc)", "ign", "notMarked"), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell30(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell31(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell32()),
      new AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases(  Arrays.asList("suite(ign)", "tc", "notMarked"), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell33(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell34(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell35()),
      new AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases(  Arrays.asList("suite(pend)", "ign", "markedPending"), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell36(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell37(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell38()),
      new AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases(  Arrays.asList("suite(ign)", "pend", "markedPending"), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell39(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell40(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell41()),
      new AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases(  Arrays.asList("suite(ign)", "ign", "markedIgnored"), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell42(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell43(), _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell44())
    );
  }
  
  protected ExampleTable<AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases> cases = _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases();
  
  public Object _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell0() {
    return null;
  }
  
  public Object _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell1() {
    return null;
  }
  
  public Matcher<String> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell2() {
    Matcher<String> _notMarked = this.notMarked();
    return _notMarked;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell3() {
    Function1<TestSuiteElement, TestCaseElement> _tc = this.tc();
    return _tc;
  }
  
  public Object _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell4() {
    return null;
  }
  
  public Matcher<String> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell5() {
    Matcher<String> _notMarked = this.notMarked();
    return _notMarked;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell6() {
    Function1<TestSuiteElement, TestCaseElement> _ign = this.ign();
    return _ign;
  }
  
  public Object _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell7() {
    return null;
  }
  
  public Matcher<String> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell8() {
    Matcher<String> _markedIgnored = this.markedIgnored();
    return _markedIgnored;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell9() {
    Function1<TestSuiteElement, TestCaseElement> _pend = this.pend();
    return _pend;
  }
  
  public Object _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell10() {
    return null;
  }
  
  public Matcher<String> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell11() {
    Matcher<String> _markedPending = this.markedPending();
    return _markedPending;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell12() {
    Function1<TestSuiteElement, TestCaseElement> _tc = this.tc();
    return _tc;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell13() {
    Function1<TestSuiteElement, TestCaseElement> _ign = this.ign();
    return _ign;
  }
  
  public Matcher<String> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell14() {
    Matcher<String> _notMarked = this.notMarked();
    return _notMarked;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell15() {
    Function1<TestSuiteElement, TestCaseElement> _tc = this.tc();
    return _tc;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell16() {
    Function1<TestSuiteElement, TestCaseElement> _pend = this.pend();
    return _pend;
  }
  
  public Matcher<String> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell17() {
    Matcher<String> _notMarked = this.notMarked();
    return _notMarked;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell18() {
    Function1<TestSuiteElement, TestCaseElement> _ign = this.ign();
    return _ign;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell19() {
    Function1<TestSuiteElement, TestCaseElement> _pend = this.pend();
    return _pend;
  }
  
  public Matcher<String> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell20() {
    Matcher<String> _markedPending = this.markedPending();
    return _markedPending;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell21() {
    Function1<TestSuiteElement, TestCaseElement> _ign = this.ign();
    return _ign;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell22() {
    Function1<TestSuiteElement, TestCaseElement> _ign = this.ign();
    return _ign;
  }
  
  public Matcher<String> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell23() {
    Matcher<String> _markedIgnored = this.markedIgnored();
    return _markedIgnored;
  }
  
  public Function1<TestSuiteElement, TestSuiteElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell24() {
    Function1<TestSuiteElement, TestCaseElement> _tc = this.tc();
    Function1<TestSuiteElement, TestSuiteElement> _suite = this.suite(_tc);
    return _suite;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell25() {
    Function1<TestSuiteElement, TestCaseElement> _pend = this.pend();
    return _pend;
  }
  
  public Matcher<String> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell26() {
    Matcher<String> _notMarked = this.notMarked();
    return _notMarked;
  }
  
  public Function1<TestSuiteElement, TestSuiteElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell27() {
    Function1<TestSuiteElement, TestCaseElement> _pend = this.pend();
    Function1<TestSuiteElement, TestSuiteElement> _suite = this.suite(_pend);
    return _suite;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell28() {
    Function1<TestSuiteElement, TestCaseElement> _tc = this.tc();
    return _tc;
  }
  
  public Matcher<String> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell29() {
    Matcher<String> _notMarked = this.notMarked();
    return _notMarked;
  }
  
  public Function1<TestSuiteElement, TestSuiteElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell30() {
    Function1<TestSuiteElement, TestCaseElement> _tc = this.tc();
    Function1<TestSuiteElement, TestSuiteElement> _suite = this.suite(_tc);
    return _suite;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell31() {
    Function1<TestSuiteElement, TestCaseElement> _ign = this.ign();
    return _ign;
  }
  
  public Matcher<String> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell32() {
    Matcher<String> _notMarked = this.notMarked();
    return _notMarked;
  }
  
  public Function1<TestSuiteElement, TestSuiteElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell33() {
    Function1<TestSuiteElement, TestCaseElement> _ign = this.ign();
    Function1<TestSuiteElement, TestSuiteElement> _suite = this.suite(_ign);
    return _suite;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell34() {
    Function1<TestSuiteElement, TestCaseElement> _tc = this.tc();
    return _tc;
  }
  
  public Matcher<String> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell35() {
    Matcher<String> _notMarked = this.notMarked();
    return _notMarked;
  }
  
  public Function1<TestSuiteElement, TestSuiteElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell36() {
    Function1<TestSuiteElement, TestCaseElement> _pend = this.pend();
    Function1<TestSuiteElement, TestSuiteElement> _suite = this.suite(_pend);
    return _suite;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell37() {
    Function1<TestSuiteElement, TestCaseElement> _ign = this.ign();
    return _ign;
  }
  
  public Matcher<String> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell38() {
    Matcher<String> _markedPending = this.markedPending();
    return _markedPending;
  }
  
  public Function1<TestSuiteElement, TestSuiteElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell39() {
    Function1<TestSuiteElement, TestCaseElement> _ign = this.ign();
    Function1<TestSuiteElement, TestSuiteElement> _suite = this.suite(_ign);
    return _suite;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell40() {
    Function1<TestSuiteElement, TestCaseElement> _pend = this.pend();
    return _pend;
  }
  
  public Matcher<String> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell41() {
    Matcher<String> _markedPending = this.markedPending();
    return _markedPending;
  }
  
  public Function1<TestSuiteElement, TestSuiteElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell42() {
    Function1<TestSuiteElement, TestCaseElement> _ign = this.ign();
    Function1<TestSuiteElement, TestSuiteElement> _suite = this.suite(_ign);
    return _suite;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell43() {
    Function1<TestSuiteElement, TestCaseElement> _ign = this.ign();
    return _ign;
  }
  
  public Matcher<String> _initAbstractJnarioRunnerUIHandlerSuiteLabellingSpecCasesCell44() {
    Matcher<String> _markedIgnored = this.markedIgnored();
    return _markedIgnored;
  }
  
  @Test
  @Named("All cases")
  @Order(1)
  public void _allCases() throws Exception {
    final Procedure1<AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases> _function = new Procedure1<AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases>() {
      public void apply(final AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases it) {
        Function1<TestSuiteElement, ? extends TestElement> _left = it.getLeft();
        Function1<TestSuiteElement, TestCaseElement> _right = it.getRight();
        List<Function1<TestSuiteElement, ? extends TestElement>> _list = JnarioCollectionLiterals.<Function1<TestSuiteElement, ? extends TestElement>>list(_left, _right);
        final Iterable<Function1<TestSuiteElement, ? extends TestElement>> elements = IterableExtensions.<Function1<TestSuiteElement, ? extends TestElement>>filterNull(_list);
        Matcher<String> _result = it.getResult();
        TestSuiteElement _root = AbstractJnarioRunnerUIHandlerSuiteLabellingSpec.this.root(((Function1<? super TestSuiteElement, ? extends TestElement>[])Conversions.unwrapArray(elements, Function1.class)));
        String _label = AbstractJnarioRunnerUIHandlerSuiteLabellingSpec.this.label(_root);
        boolean _matches = _result.matches(_label);
        Assert.assertTrue("\nExpected result.matches(label(root(elements))) should be true but"
         + "\n     result.matches(label(root(elements))) is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_matches)).toString()
         + "\n     result is " + new org.hamcrest.StringDescription().appendValue(_result).toString()
         + "\n     label(root(elements)) is " + new org.hamcrest.StringDescription().appendValue(_label).toString()
         + "\n     root(elements) is " + new org.hamcrest.StringDescription().appendValue(_root).toString()
         + "\n     elements is " + new org.hamcrest.StringDescription().appendValue(((Function1<? super TestSuiteElement, ? extends TestElement>[])Conversions.unwrapArray(elements, Function1.class))).toString() + "\n", Should.<Boolean>should_be(Boolean.valueOf(_matches), true));
        
      }
    };
    Each.<AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases>forEach(this.cases, _function);
  }
  
  public TestSuiteElement root(final Function1<? super TestSuiteElement, ? extends TestElement>... elementConstructors) {
    Function1<TestSuiteElement, TestSuiteElement> _suite = this.suite(elementConstructors);
    return _suite.apply(this.root);
  }
  
  public Function1<TestSuiteElement, TestSuiteElement> suite(final Function1<? super TestSuiteElement, ? extends TestElement>... elementConstructors) {
    final Function1<TestSuiteElement, TestSuiteElement> _function = new Function1<TestSuiteElement, TestSuiteElement>() {
      public TestSuiteElement apply(final TestSuiteElement parent) {
        TestSuiteElement _xblockexpression = null;
        {
          final TestSuiteElement suite = new TestSuiteElement(parent, "id", "name", 10);
          final Procedure1<Function1<? super TestSuiteElement, ? extends TestElement>> _function = new Procedure1<Function1<? super TestSuiteElement, ? extends TestElement>>() {
            public void apply(final Function1<? super TestSuiteElement, ? extends TestElement> it) {
              it.apply(suite);
            }
          };
          IterableExtensions.<Function1<? super TestSuiteElement, ? extends TestElement>>forEach(((Iterable<Function1<? super TestSuiteElement, ? extends TestElement>>)Conversions.doWrapArray(elementConstructors)), _function);
          _xblockexpression = suite;
        }
        return _xblockexpression;
      }
    };
    return _function;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> tc() {
    final Function1<TestSuiteElement, TestCaseElement> _function = new Function1<TestSuiteElement, TestCaseElement>() {
      public TestCaseElement apply(final TestSuiteElement suite) {
        return new TestCaseElement(suite, "id", "tc");
      }
    };
    return _function;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> ign() {
    final Function1<TestSuiteElement, TestCaseElement> _function = new Function1<TestSuiteElement, TestCaseElement>() {
      public TestCaseElement apply(final TestSuiteElement suite) {
        Function1<TestSuiteElement, TestCaseElement> _tc = AbstractJnarioRunnerUIHandlerSuiteLabellingSpec.this.tc();
        TestCaseElement _apply = _tc.apply(suite);
        final Procedure1<TestCaseElement> _function = new Procedure1<TestCaseElement>() {
          public void apply(final TestCaseElement it) {
            it.setName("tc-ign");
            it.setIgnored(true);
          }
        };
        return ObjectExtensions.<TestCaseElement>operator_doubleArrow(_apply, _function);
      }
    };
    return _function;
  }
  
  public Function1<TestSuiteElement, TestCaseElement> pend() {
    final Function1<TestSuiteElement, TestCaseElement> _function = new Function1<TestSuiteElement, TestCaseElement>() {
      public TestCaseElement apply(final TestSuiteElement suite) {
        Function1<TestSuiteElement, TestCaseElement> _ign = AbstractJnarioRunnerUIHandlerSuiteLabellingSpec.this.ign();
        TestCaseElement _apply = _ign.apply(suite);
        final Procedure1<TestCaseElement> _function = new Procedure1<TestCaseElement>() {
          public void apply(final TestCaseElement it) {
            it.setName("tc [PENDING]");
          }
        };
        return ObjectExtensions.<TestCaseElement>operator_doubleArrow(_apply, _function);
      }
    };
    return _function;
  }
  
  public String label(final TestSuiteElement suite) {
    return this.handler.getSimpleLabel(this.part, suite);
  }
  
  public Matcher<String> markedPending() {
    Matcher<String> _containsString = Matchers.containsString(Strings.PENDING_FLAG);
    Matcher<String> _containsString_1 = Matchers.containsString(Strings.IGNORED_FLAG);
    Matcher<String> _not = Matchers.<String>not(_containsString_1);
    return Matchers.<String>allOf(_containsString, _not);
  }
  
  public Matcher<String> markedIgnored() {
    Matcher<String> _containsString = Matchers.containsString(Strings.IGNORED_FLAG);
    Matcher<String> _containsString_1 = Matchers.containsString(Strings.PENDING_FLAG);
    Matcher<String> _not = Matchers.<String>not(_containsString_1);
    return Matchers.<String>allOf(_containsString, _not);
  }
  
  public Matcher<String> notMarked() {
    Matcher<String> _containsString = Matchers.containsString(Strings.IGNORED_FLAG);
    Matcher<String> _containsString_1 = Matchers.containsString(Strings.PENDING_FLAG);
    AnyOf<String> _anyOf = Matchers.<String>anyOf(_containsString, _containsString_1);
    return Matchers.<String>not(_anyOf);
  }
}
