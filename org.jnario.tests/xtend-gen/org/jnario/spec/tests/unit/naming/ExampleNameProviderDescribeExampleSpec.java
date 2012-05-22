package org.jnario.spec.tests.unit.naming;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.jnario.jnario.test.util.Query;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.Example;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("describe[Example]")
public class ExampleNameProviderDescribeExampleSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("should use the description")
  @Order(99)
  public void shouldUseTheDescription() throws Exception {
    String _describeFirst = this.describeFirst("\'should do stuff\' {true}");
    boolean _doubleArrow = Should.operator_doubleArrow(_describeFirst, "should do stuff");Assert
    .assertTrue("\nExpected describeFirst(\"\'should do stuff\' {true}\") => \"should do stuff\" but"
     + "\n     describeFirst(\"\'should do stuff\' {true}\") is " + "\"" + _describeFirst + "\"" + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("apppends \\\'[PENDING]\\\' to pending example descriptions")
  @Order(99)
  public void apppendsPENDINGToPendingExampleDescriptions() throws Exception {
    String _describeFirst = this.describeFirst("\'should do stuff\'");
    boolean _doubleArrow = Should.operator_doubleArrow(_describeFirst, "should do stuff [PENDING]");Assert
    .assertTrue("\nExpected describeFirst(\"\'should do stuff\'\") => \"should do stuff [PENDING]\" but"
     + "\n     describeFirst(\"\'should do stuff\'\") is " + "\"" + _describeFirst + "\"" + "\n", _doubleArrow);
    
    String _describeFirst_1 = this.describeFirst("\'should do stuff\'{}");
    boolean _doubleArrow_1 = Should.operator_doubleArrow(_describeFirst_1, "should do stuff [PENDING]");Assert
    .assertTrue("\nExpected describeFirst(\"\'should do stuff\'{}\") => \"should do stuff [PENDING]\" but"
     + "\n     describeFirst(\"\'should do stuff\'{}\") is " + "\"" + _describeFirst_1 + "\"" + "\n", _doubleArrow_1);
    
  }
  
  public String describeFirst(final String content) {
    String _xblockexpression = null;
    {
      String _plus = ObjectExtensions.operator_plus("describe \'Example\'{ fact ", content);
      final String contentWithExampleGroup = ObjectExtensions.operator_plus(_plus, "}");
      Query _parse = this.parse(contentWithExampleGroup);
      Example _first = _parse.<Example>first(Example.class);
      String _describe = this.subject.describe(_first);
      _xblockexpression = (_describe);
    }
    return _xblockexpression;
  }
}
