package org.jnario.feature.jvmmodel;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;

@SuppressWarnings("all")
public class Scenarios {
  public static Iterable<Step> steps(final Scenario scenario) {
    EList<XtendMember> _members = scenario.getMembers();
    Iterable<Step> _filter = Iterables.<Step>filter(_members, Step.class);
    return _filter;
  }
  
  public static ArrayList<Step> allSteps(final Scenario scenario) {
    ArrayList<Step> _xblockexpression = null;
    {
      final ArrayList<Step> steps = CollectionLiterals.<Step>newArrayList();
      EList<Step> _steps = scenario.getSteps();
      final Procedure1<Step> _function = new Procedure1<Step>() {
          public void apply(final Step it) {
            steps.add(it);
            EList<Step> _and = it.getAnd();
            Iterables.<Step>addAll(steps, _and);
          }
        };
      IterableExtensions.<Step>forEach(_steps, _function);
      _xblockexpression = (steps);
    }
    return _xblockexpression;
  }
}
