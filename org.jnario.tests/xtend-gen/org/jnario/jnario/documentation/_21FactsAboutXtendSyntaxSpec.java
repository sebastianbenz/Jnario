package org.jnario.jnario.documentation;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.Pair;
import org.hamcrest.StringDescription;
import org.jnario.jnario.documentation._21FactsAboutXtendSpec;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Syntax")
public class _21FactsAboutXtendSyntaxSpec extends _21FactsAboutXtendSpec {
  @Test
  @Named("No semicolons!")
  @Order(99)
  public void noSemicolons() throws Exception {
    String greeting = "";
    greeting = "Hello World";
    InputOutput.<String>println(greeting);
  }
  
  @Test
  @Named("Declaring variables")
  @Order(99)
  public void declaringVariables() throws Exception {
    String x = "I might change";
    final String y = "I\'ll never change";
  }
  
  @Test
  @Named("Less typing thanks to type inference")
  @Order(99)
  public void lessTypingThanksToTypeInference() throws Exception {
    final String greeting = "Hello World";
    boolean _doubleArrow = Should.operator_doubleArrow(greeting, String.class);
    Assert.assertTrue("\nExpected greeting => typeof(String) but"
     + "\n     greeting is " + new StringDescription().appendValue(greeting).toString() + "\n", _doubleArrow);
    
    Pair<String,String> _mappedTo = Pair.<String, String>of("german", "Hallo");
    Pair<String,String> _mappedTo_1 = Pair.<String, String>of("english", "Hello");
    final HashMap<String,String> greetings = CollectionLiterals.<String, String>newHashMap(_mappedTo, _mappedTo_1);
    boolean _doubleArrow_1 = Should.operator_doubleArrow(greetings, HashMap.class);
    Assert.assertTrue("\nExpected greetings => typeof(HashMap) but"
     + "\n     greetings is " + new StringDescription().appendValue(greetings).toString() + "\n", _doubleArrow_1);
    
  }
  
  @Test
  @Named("Good to know: Pairs")
  @Order(99)
  public void goodToKnowPairs() throws Exception {
    final Pair<String,String> pair = Pair.<String, String>of("spain", "italy");
    String _key = pair.getKey();
    boolean _doubleArrow = Should.operator_doubleArrow(_key, "spain");
    Assert.assertTrue("\nExpected pair.key   => \"spain\" but"
     + "\n     pair.key is " + new StringDescription().appendValue(_key).toString()
     + "\n     pair is " + new StringDescription().appendValue(pair).toString() + "\n", _doubleArrow);
    
    String _value = pair.getValue();
    boolean _doubleArrow_1 = Should.operator_doubleArrow(_value, "italy");
    Assert.assertTrue("\nExpected pair.value => \"italy\" but"
     + "\n     pair.value is " + new StringDescription().appendValue(_value).toString()
     + "\n     pair is " + new StringDescription().appendValue(pair).toString() + "\n", _doubleArrow_1);
    
  }
  
  /**
   * Static members of a class are accessed via `::` and not via `.` like in Java.
   * 
   * <span class="label label-warning">Attention</span> This is probably the most
   * asked question on the Xtend mailing list.
   */
  @Test
  @Named("Accessing static members")
  @Order(99)
  public void accessingStaticMembers() throws Exception {
    final List<String> colors = JnarioCollectionLiterals.<String>list("red", "blue", "green");
    Collections.<String>sort(colors);
    List<String> _list = JnarioCollectionLiterals.<String>list("blue", "green", "red");
    boolean _doubleArrow = this.<String>operator_doubleArrow(colors, _list);
    Assert.assertTrue("\nExpected colors => list(\"blue\", \"green\", \"red\") but"
     + "\n     colors is " + new StringDescription().appendValue(colors).toString()
     + "\n     list(\"blue\", \"green\", \"red\") is " + new StringDescription().appendValue(_list).toString() + "\n", _doubleArrow);
    
  }
  
  final String greeting = "Hello ";
  
  /**
   * Methods in Xtend are declared like in Java. The only difference is that methods
   * declarations are preceded with `def`.
   * 
   * <pre class="prettyprint lang-spec">
   * String greeting = "Hello "
   * 
   * def public String sayHello(String name){
   *   return greeting + name
   * }
   * </pre>
   * 
   * 
   * The type inference also works for fields and methods. You can omit
   * the return type of methods and the type of fields. Methods are by default
   * public. So declaring fields and methods becomes a lot more concise:
   * 
   * <pre class="prettyprint lang-spec">
   * val greeting = "Hello "
   * 
   * def sayHello(String name){
   *   greeting + name // return is optional
   * }
   * </pre>
   * 
   * Calling fields and methods works exactly like in Java:
   */
  @Test
  @Named("Declaring fields & methods")
  @Order(99)
  public void declaringFieldsMethods() throws Exception {
    String _sayHello = this.sayHello("Sebastian");
    String _plus = (this.greeting + "Sebastian");
    boolean _doubleArrow = Should.operator_doubleArrow(_sayHello, _plus);
    Assert.assertTrue("\nExpected sayHello(\"Sebastian\") => greeting + \"Sebastian\" but"
     + "\n     sayHello(\"Sebastian\") is " + new StringDescription().appendValue(_sayHello).toString()
     + "\n     greeting + \"Sebastian\" is " + new StringDescription().appendValue(_plus).toString()
     + "\n     greeting is " + new StringDescription().appendValue(this.greeting).toString() + "\n", _doubleArrow);
    
  }
  
  public String sayHello(final String name) {
    String _plus = (this.greeting + name);
    return _plus;
  }
}
