package org.jnario.jnario.test.util;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.jnario.Specification;
import org.jnario.suite.suite.Reference;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFactory;
import org.jnario.suite.suite.SuiteFile;

@SuppressWarnings("all")
public class Suites {
  private final static SuiteFactory factory = SuiteFactory.eINSTANCE;
  
  public static Suite suiteWith(final String name, final SpecReference... references) {
    Suite _xblockexpression = null;
    {
      final Suite suite = Suites.suite(name);
      EList<Reference> _elements = suite.getElements();
      _elements.addAll(((Collection<? extends Reference>)Conversions.doWrapArray(references)));
      _xblockexpression = (suite);
    }
    return _xblockexpression;
  }
  
  public static Suite suite(final String name) {
    Suite _xblockexpression = null;
    {
      final Suite suite = Suites.factory.createSuite();
      suite.setName(name);
      _xblockexpression = (suite);
    }
    return _xblockexpression;
  }
  
  public static Suite suite(final String name, final String packageName) {
    Suite _xblockexpression = null;
    {
      final Suite suite = Suites.factory.createSuite();
      suite.setName(name);
      final SuiteFile file = Suites.factory.createSuiteFile();
      file.setPackage(packageName);
      EList<XtendClass> _xtendClasses = file.getXtendClasses();
      _xtendClasses.add(suite);
      _xblockexpression = (suite);
    }
    return _xblockexpression;
  }
  
  public static SpecReference specReference(final Specification spec) {
    SpecReference _xblockexpression = null;
    {
      final SpecReference result = Suites.factory.createSpecReference();
      result.setSpec(spec);
      _xblockexpression = (result);
    }
    return _xblockexpression;
  }
}
