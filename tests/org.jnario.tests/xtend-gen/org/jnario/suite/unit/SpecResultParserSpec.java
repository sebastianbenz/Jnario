package org.jnario.suite.unit;

import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.jnario.doc.Failure;
import org.jnario.doc.ParseResultAcceptor;
import org.jnario.doc.SpecExecution;
import org.jnario.doc.SpecResultParser;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("SpecResultParser")
public class SpecResultParserSpec {
  @Subject
  public SpecResultParser subject;
  
  final ParseResultAcceptor acceptor = new Function0<ParseResultAcceptor>() {
    public ParseResultAcceptor apply() {
      ParseResultAcceptor _mock = Mockito.<ParseResultAcceptor>mock(ParseResultAcceptor.class);
      return _mock;
    }
  }.apply();
  
  @Test
  @Named("parses successfull specs from xml")
  @Order(99)
  public void _parsesSuccessfullSpecsFromXml() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
    _builder.newLine();
    _builder.append("<testsuite failures=\"0\" time=\"0\" errors=\"0\" skipped=\"0\" tests=\"1\" name=\"demo.CalculatorSuite\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<properties>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<property name=\"java.runtime.name\" value=\"Java(TM) SE Runtime Environment\"/>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</properties>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<testcase time=\"0.01\" classname=\"demo.CalculatorSpec\" name=\"adding values\"/>");
    _builder.newLine();
    _builder.append("</testsuite>");
    _builder.newLine();
    this.parse(_builder);
    ParseResultAcceptor _verify = Mockito.<ParseResultAcceptor>verify(this.acceptor);
    List<Failure> _list = JnarioCollectionLiterals.<Failure>list();
    SpecExecution _specExecution = new SpecExecution("demo.CalculatorSpec", "adding values", 0.01, _list);
    _verify.accept(_specExecution);
  }
  
  @Test
  @Ignore
  @Named("parses specs with failure from xml [PENDING]")
  @Order(99)
  public void _parsesSpecsWithFailureFromXml() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<testsuite failures=\"1\" time=\"0.017\" errors=\"0\" skipped=\"0\" tests=\"1\" name=\"example.AddingValuesSpec\">");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("<testcase time=\"0.01\" classname=\"demo.CalculatorSpec\" name=\"adding values\">");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("<failure message=\"a message\" type=\"java.lang.AssertionError\">the stacktrace</failure>");
    _builder.newLine();
    _builder.append("\t  ");
    _builder.append("</testcase>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</testsuite>\t");
    _builder.newLine();
    this.parse(_builder);
    ParseResultAcceptor _verify = Mockito.<ParseResultAcceptor>verify(this.acceptor);
    List<Failure> _list = JnarioCollectionLiterals.<Failure>list();
    SpecExecution _specExecution = new SpecExecution("demo.CalculatorSpec", "adding values", 0.01, _list);
    _verify.accept(_specExecution);
  }
  
  public void parse(final CharSequence content) {
    String _string = content.toString();
    StringInputStream _stringInputStream = new StringInputStream(_string);
    this.subject.parse(_stringInputStream, this.acceptor);
  }
}
