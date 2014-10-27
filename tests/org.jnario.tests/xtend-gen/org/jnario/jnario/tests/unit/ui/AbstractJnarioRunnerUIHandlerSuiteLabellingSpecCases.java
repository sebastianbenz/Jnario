package org.jnario.jnario.tests.unit.ui;

import java.util.List;
import org.eclipse.jdt.internal.junit.model.TestCaseElement;
import org.eclipse.jdt.internal.junit.model.TestElement;
import org.eclipse.jdt.internal.junit.model.TestSuiteElement;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.hamcrest.Matcher;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases extends ExampleTableRow {
  public AbstractJnarioRunnerUIHandlerSuiteLabellingSpecCases(final List<String> cellNames, final Function1<TestSuiteElement, ? extends TestElement> left, final Function1<TestSuiteElement, TestCaseElement> right, final Matcher<String> result) {
    super(cellNames);
    this.left = left;
    this.right = right;
    this.result = result;
    
  }
  
  private Function1<TestSuiteElement, ? extends TestElement> left;
  
  public Function1<TestSuiteElement, ? extends TestElement> getLeft() {
    return this.left;
  }
  
  private Function1<TestSuiteElement, TestCaseElement> right;
  
  public Function1<TestSuiteElement, TestCaseElement> getRight() {
    return this.right;
  }
  
  private Matcher<String> result;
  
  public Matcher<String> getResult() {
    return this.result;
  }
}
