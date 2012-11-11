package org.jnario.jvmmodel;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.NoSuchElementException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.jnario.jvmmodel.JUnit3ModelEnhancer;
import org.jnario.jvmmodel.JUnit4ModelEnhancer;
import org.jnario.jvmmodel.SpecJvmModelProcessor;

@SuppressWarnings("all")
public class RuntimeProvider {
  private Provider<JUnit4ModelEnhancer> junit4Support;
  
  private Provider<JUnit3ModelEnhancer> junit3Support;
  
  private final static String JUNIT3_CLASS = "junit.framework.TestCase";
  
  private final static String JUNIT4_CLASS = "org.junit.Test";
  
  private TypeReferences typeReferences;
  
  @Inject
  public RuntimeProvider(final TypeReferences typeReferences, final Provider<JUnit3ModelEnhancer> junit3Support, final Provider<JUnit4ModelEnhancer> junit4Support) {
    this.typeReferences = typeReferences;
    this.junit3Support = junit3Support;
    this.junit4Support = junit4Support;
  }
  
  public SpecJvmModelProcessor get(final EObject context) {
    JvmTypeReference _typeForName = this.typeReferences.getTypeForName(RuntimeProvider.JUNIT4_CLASS, context);
    boolean _notEquals = (!Objects.equal(_typeForName, null));
    if (_notEquals) {
      return this.junit4Support.get();
    }
    JvmTypeReference _typeForName_1 = this.typeReferences.getTypeForName(RuntimeProvider.JUNIT3_CLASS, context);
    boolean _notEquals_1 = (!Objects.equal(_typeForName_1, null));
    if (_notEquals_1) {
      return this.junit3Support.get();
    }
    NoSuchElementException _noSuchElementException = new NoSuchElementException("Mandatory test library bundle \'org.junit\' 3.8.x or 4.8.x not found on the classpath.");
    throw _noSuchElementException;
  }
}
