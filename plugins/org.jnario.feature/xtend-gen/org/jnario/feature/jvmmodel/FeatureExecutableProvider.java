package org.jnario.feature.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.jnario.Executable;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.jvmmodel.ExecutableProvider;

@SuppressWarnings("all")
public class FeatureExecutableProvider implements ExecutableProvider {
  public List<? extends Executable> getExecutables(final Executable specification) {
    List<? extends Executable> _doGetExecutables = this.doGetExecutables(specification);
    return _doGetExecutables;
  }
  
  protected List<? extends Executable> _doGetExecutables(final Scenario scenario) {
    EList<Step> _steps = scenario.getSteps();
    return _steps;
  }
  
  protected List<? extends Executable> _doGetExecutables(final Executable e) {
    List<Executable> _emptyList = CollectionLiterals.<Executable>emptyList();
    return _emptyList;
  }
  
  protected List<? extends Executable> _doGetExecutables(final Feature feature) {
    ArrayList<Scenario> _xblockexpression = null;
    {
      Background _background = feature.getBackground();
      boolean _equals = Objects.equal(_background, null);
      if (_equals) {
        return feature.getScenarios();
      }
      Background _background_1 = feature.getBackground();
      final ArrayList<Scenario> result = CollectionLiterals.<Scenario>newArrayList(_background_1);
      EList<Scenario> _scenarios = feature.getScenarios();
      Iterables.<Scenario>addAll(result, _scenarios);
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
  
  public List<? extends Executable> doGetExecutables(final Executable feature) {
    if (feature instanceof Feature) {
      return _doGetExecutables((Feature)feature);
    } else if (feature instanceof Scenario) {
      return _doGetExecutables((Scenario)feature);
    } else if (feature != null) {
      return _doGetExecutables(feature);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(feature).toString());
    }
  }
}
