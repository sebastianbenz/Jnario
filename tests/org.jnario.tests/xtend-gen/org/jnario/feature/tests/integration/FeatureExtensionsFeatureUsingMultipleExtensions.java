package org.jnario.feature.tests.integration;

import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.hamcrest.StringDescription;
import org.jnario.feature.tests.integration.FeatureExtensionsFeature;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using Multiple extensions")
@SuppressWarnings("all")
public class FeatureExtensionsFeatureUsingMultipleExtensions extends FeatureExtensionsFeature {
  List list;
  
  @Test
  @Order(0)
  @Named("When sorting the colors \\\"red, green, blue\\\"")
  public void whenSortingTheColorsRedGreenBlue() {
    StepArguments _stepArguments = new StepArguments("red, green, blue");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    String[] _split = _first.split(",");
    final Function1<String,String> _function = new Function1<String,String>() {
        public String apply(final String it) {
          String _trim = it.trim();
          return _trim;
        }
      };
    List<String> _map = ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(_split)), _function);
    List<String> _sort = IterableExtensions.<String>sort(_map);
    this.list = _sort;
  }
  
  @Test
  @Order(1)
  @Named("Then they should be ordered")
  public void thenTheyShouldBeOrdered() {
    List<String> _list = JnarioCollectionLiterals.<String>list("blue", "green", "red");
    boolean _doubleArrow = Should.operator_doubleArrow(this.list, _list);
    Assert.assertTrue("\nExpected list => list(\"blue\",\"green\",\"red\") but"
     + "\n     list is " + new StringDescription().appendValue(this.list).toString()
     + "\n     list(\"blue\",\"green\",\"red\") is " + new StringDescription().appendValue(_list).toString() + "\n", _doubleArrow);
    
  }
}
