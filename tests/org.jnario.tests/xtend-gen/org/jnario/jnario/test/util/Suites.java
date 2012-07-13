package org.jnario.jnario.test.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFactory;
import org.jnario.suite.suite.SuiteFile;

@SuppressWarnings("all")
public class Suites {
  private final static SuiteFactory factory = SuiteFactory.eINSTANCE;
  
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
}
