package org.jnario.jnario.tests.unit.report;

import java.util.ArrayList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.jnario.test.util.Strings;
import org.jnario.report.Failed;
import org.jnario.report.Passed;
import org.jnario.report.Pending;
import org.jnario.report.SpecExecutionAcceptor;
import org.jnario.report.SpecFailure;
import org.jnario.report.SpecResultParser;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@SuppressWarnings("all")
@Named("SpecResultParser")
@RunWith(ExampleGroupRunner.class)
public class SpecResultParserSpec {
  @Subject
  public SpecResultParser subject;
  
  final static String CLASSNAME = "demo.CalculatorSpec";
  
  final static String NAME = "adding values";
  
  final static double EXECUTION_TIME = 0.01;
  
  final static String FAILURE_MESSAGE = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("a message");
      _builder.newLine();
      _builder.append("withnewline");
      String _platformIndependent = Strings.platformIndependent(_builder);
      return _platformIndependent;
    }
  }.apply();
  
  final static String FAILURE_TYPE = "java.lang.AssertionError";
  
  final static String STACKTRACE = new Function0<String>() {
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t");
      _builder.append("at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:39)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:27)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("at java.lang.reflect.Constructor.newInstance(Constructor.java:513)");
      _builder.newLine();
      String _platformIndependent = Strings.platformIndependent(_builder);
      return _platformIndependent;
    }
  }.apply();
  
  final static String XML_STACKTRACE = new Function0<String>() {
    public String apply() {
      String _plus = (SpecResultParserSpec.FAILURE_MESSAGE + "\n");
      String _plus_1 = (_plus + SpecResultParserSpec.STACKTRACE);
      return _plus_1;
    }
  }.apply();
  
  final SpecExecutionAcceptor acceptor = new Function0<SpecExecutionAcceptor>() {
    public SpecExecutionAcceptor apply() {
      SpecExecutionAcceptor _mock = Mockito.<SpecExecutionAcceptor>mock(SpecExecutionAcceptor.class);
      return _mock;
    }
  }.apply();
  
  @Test
  @Named("parses successfull specs from xml")
  @Order(1)
  public void _parsesSuccessfullSpecsFromXml() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<testcase time=\"");
    _builder.append(SpecResultParserSpec.EXECUTION_TIME, "");
    _builder.append("\" classname=\"");
    _builder.append(SpecResultParserSpec.CLASSNAME, "");
    _builder.append("\" name=\"");
    _builder.append(SpecResultParserSpec.NAME, "");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    CharSequence _xml = this.toXml(_builder);
    this.parse(_xml);
    SpecExecutionAcceptor _verify = Mockito.<SpecExecutionAcceptor>verify(this.acceptor);
    Passed _passingSpec = this.passingSpec();
    _verify.accept(_passingSpec);
  }
  
  @Test
  @Named("parses specs with failure from xml")
  @Order(2)
  public void _parsesSpecsWithFailureFromXml() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<testcase time=\"");
    _builder.append(SpecResultParserSpec.EXECUTION_TIME, "");
    _builder.append("\" classname=\"");
    _builder.append(SpecResultParserSpec.CLASSNAME, "");
    _builder.append("\" name=\"");
    _builder.append(SpecResultParserSpec.NAME, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("<failure message=\"");
    _builder.append(SpecResultParserSpec.FAILURE_MESSAGE, "");
    _builder.append("\" type=\"");
    _builder.append(SpecResultParserSpec.FAILURE_TYPE, "");
    _builder.append("\">");
    _builder.append(SpecResultParserSpec.XML_STACKTRACE, "");
    _builder.append("</failure>");
    _builder.newLineIfNotEmpty();
    _builder.append("</testcase>");
    _builder.newLine();
    CharSequence _xml = this.toXml(_builder);
    this.parse(_xml);
    SpecExecutionAcceptor _verify = Mockito.<SpecExecutionAcceptor>verify(this.acceptor);
    Failed _failingSpec = this.failingSpec();
    _verify.accept(_failingSpec);
  }
  
  @Test
  @Named("parses specs with error from xml")
  @Order(3)
  public void _parsesSpecsWithErrorFromXml() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<testcase time=\"");
    _builder.append(SpecResultParserSpec.EXECUTION_TIME, "");
    _builder.append("\" classname=\"");
    _builder.append(SpecResultParserSpec.CLASSNAME, "");
    _builder.append("\" name=\"");
    _builder.append(SpecResultParserSpec.NAME, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("<error message=\"");
    _builder.append(SpecResultParserSpec.FAILURE_MESSAGE, "");
    _builder.append("\" type=\"");
    _builder.append(SpecResultParserSpec.FAILURE_TYPE, "");
    _builder.append("\">");
    _builder.append(SpecResultParserSpec.XML_STACKTRACE, "");
    _builder.append("</error>");
    _builder.newLineIfNotEmpty();
    _builder.append("</testcase>");
    _builder.newLine();
    CharSequence _xml = this.toXml(_builder);
    this.parse(_xml);
    SpecExecutionAcceptor _verify = Mockito.<SpecExecutionAcceptor>verify(this.acceptor);
    Failed _failingSpec = this.failingSpec();
    _verify.accept(_failingSpec);
  }
  
  @Test
  @Named("parses multiple spec results")
  @Order(4)
  public void _parsesMultipleSpecResults() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<testcase time=\"");
    _builder.append(SpecResultParserSpec.EXECUTION_TIME, "");
    _builder.append("\" classname=\"");
    _builder.append(SpecResultParserSpec.CLASSNAME, "");
    _builder.append("\" name=\"");
    _builder.append(SpecResultParserSpec.NAME, "");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("<testcase time=\"");
    _builder.append(SpecResultParserSpec.EXECUTION_TIME, "");
    _builder.append("\" classname=\"");
    _builder.append(SpecResultParserSpec.CLASSNAME, "");
    _builder.append("\" name=\"");
    _builder.append(SpecResultParserSpec.NAME, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("<error message=\"");
    _builder.append(SpecResultParserSpec.FAILURE_MESSAGE, "");
    _builder.append("\" type=\"");
    _builder.append(SpecResultParserSpec.FAILURE_TYPE, "");
    _builder.append("\">");
    _builder.append(SpecResultParserSpec.XML_STACKTRACE, "");
    _builder.append("</error>");
    _builder.newLineIfNotEmpty();
    _builder.append("</testcase>");
    _builder.newLine();
    CharSequence _xml = this.toXml(_builder);
    this.parse(_xml);
    SpecExecutionAcceptor _verify = Mockito.<SpecExecutionAcceptor>verify(this.acceptor);
    Passed _passingSpec = this.passingSpec();
    _verify.accept(_passingSpec);
    SpecExecutionAcceptor _verify_1 = Mockito.<SpecExecutionAcceptor>verify(this.acceptor);
    Failed _failingSpec = this.failingSpec();
    _verify_1.accept(_failingSpec);
  }
  
  @Test
  @Named("created pending results")
  @Order(5)
  public void _createdPendingResults() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<testcase time=\"");
    _builder.append(SpecResultParserSpec.EXECUTION_TIME, "");
    _builder.append("\" classname=\"");
    _builder.append(SpecResultParserSpec.CLASSNAME, "");
    _builder.append("\" name=\"");
    _builder.append(SpecResultParserSpec.NAME, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("<skipped/>");
    _builder.newLine();
    _builder.append("</testcase>");
    _builder.newLine();
    CharSequence _xml = this.toXml(_builder);
    this.parse(_xml);
    SpecExecutionAcceptor _verify = Mockito.<SpecExecutionAcceptor>verify(this.acceptor);
    Pending _pendingSpec = this.pendingSpec();
    _verify.accept(_pendingSpec);
  }
  
  @Test
  @Named("decodes escaped strings")
  @Order(6)
  public void _decodesEscapedStrings() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<testcase time=\"");
    _builder.append(SpecResultParserSpec.EXECUTION_TIME, "");
    _builder.append("\" classname=\"");
    _builder.append(SpecResultParserSpec.CLASSNAME, "");
    _builder.append("\" name=\"When I entered \\&quot;50\\&quot; and \\&quot;70\\&quot;\"/>");
    _builder.newLineIfNotEmpty();
    CharSequence _xml = this.toXml(_builder);
    this.parse(_xml);
    SpecExecutionAcceptor _verify = Mockito.<SpecExecutionAcceptor>verify(this.acceptor);
    Passed _passed = new Passed(SpecResultParserSpec.CLASSNAME, "When I entered \\\"50\\\" and \\\"70\\\"", SpecResultParserSpec.EXECUTION_TIME);
    _verify.accept(_passed);
  }
  
  public Passed passingSpec() {
    Passed _passed = new Passed(SpecResultParserSpec.CLASSNAME, SpecResultParserSpec.NAME, SpecResultParserSpec.EXECUTION_TIME);
    return _passed;
  }
  
  public Pending pendingSpec() {
    Pending _pending = new Pending(SpecResultParserSpec.CLASSNAME, SpecResultParserSpec.NAME, SpecResultParserSpec.EXECUTION_TIME);
    return _pending;
  }
  
  public Failed failingSpec() {
    SpecFailure _specFailure = new SpecFailure(SpecResultParserSpec.FAILURE_MESSAGE, "java.lang.AssertionError", SpecResultParserSpec.STACKTRACE);
    ArrayList<SpecFailure> _newArrayList = CollectionLiterals.<SpecFailure>newArrayList(_specFailure);
    Failed _failed = new Failed(SpecResultParserSpec.CLASSNAME, SpecResultParserSpec.NAME, SpecResultParserSpec.EXECUTION_TIME, _newArrayList);
    return _failed;
  }
  
  public CharSequence toXml(final CharSequence content) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
    _builder.newLine();
    _builder.append("<testsuite failures=\"1\" time=\"0.017\" errors=\"0\" skipped=\"0\" tests=\"1\" name=\"example.AddingValuesSpec\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(content, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("</testsuite>\t");
    _builder.newLine();
    return _builder;
  }
  
  public void parse(final CharSequence content) {
    String _string = content.toString();
    StringInputStream _stringInputStream = new StringInputStream(_string);
    this.subject.parse(_stringInputStream, this.acceptor);
  }
}
