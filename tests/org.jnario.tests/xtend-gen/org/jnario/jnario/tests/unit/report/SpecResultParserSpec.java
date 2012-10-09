package org.jnario.jnario.tests.unit.report;

import java.util.ArrayList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.jnario.report.Failed;
import org.jnario.report.Passed;
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
@RunWith(ExampleGroupRunner.class)
@Named("SpecResultParser")
public class SpecResultParserSpec {
  @Subject
  public SpecResultParser subject;
  
  final static String CLASSNAME = "demo.CalculatorSpec";
  
  final static String NAME = "adding values";
  
  final static double EXECUTION_TIME = 0.01;
  
  final static String FAILURE_MESSAGE = "a message";
  
  final static String FAILURE_TYPE = "java.lang.AssertionError";
  
  final static String STACKTRACE = "the stacktrace";
  
  final SpecExecutionAcceptor acceptor = Mockito.mock(SpecExecutionAcceptor.class);
  
  @Test
  @Named("parses successfull specs from xml")
  @Order(99)
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
  @Order(99)
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
    _builder.append(" ");
    _builder.append("<failure message=\"");
    _builder.append(SpecResultParserSpec.FAILURE_MESSAGE, " ");
    _builder.append("\" type=\"");
    _builder.append(SpecResultParserSpec.FAILURE_TYPE, " ");
    _builder.append("\">");
    _builder.append(SpecResultParserSpec.STACKTRACE, " ");
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
  @Order(99)
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
    _builder.append(" ");
    _builder.append("<error message=\"");
    _builder.append(SpecResultParserSpec.FAILURE_MESSAGE, " ");
    _builder.append("\" type=\"");
    _builder.append(SpecResultParserSpec.FAILURE_TYPE, " ");
    _builder.append("\">");
    _builder.append(SpecResultParserSpec.STACKTRACE, " ");
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
  @Order(99)
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
    _builder.append(" ");
    _builder.append("<error message=\"");
    _builder.append(SpecResultParserSpec.FAILURE_MESSAGE, " ");
    _builder.append("\" type=\"");
    _builder.append(SpecResultParserSpec.FAILURE_TYPE, " ");
    _builder.append("\">");
    _builder.append(SpecResultParserSpec.STACKTRACE, " ");
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
  
  public Passed passingSpec() {
    Passed _passed = new Passed(SpecResultParserSpec.CLASSNAME, SpecResultParserSpec.NAME, SpecResultParserSpec.EXECUTION_TIME);
    return _passed;
  }
  
  public Failed failingSpec() {
    SpecFailure _specFailure = new SpecFailure("a message", "java.lang.AssertionError", "the stacktrace");
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
