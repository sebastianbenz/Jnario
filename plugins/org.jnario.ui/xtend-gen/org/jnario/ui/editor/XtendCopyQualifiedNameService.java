package org.jnario.ui.editor;

import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendConstructor;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.ui.editor.copyqualifiedname.XbaseCopyQualifiedNameService;

@SuppressWarnings("all")
public class XtendCopyQualifiedNameService extends XbaseCopyQualifiedNameService {
  protected String _getQualifiedName(final XtendFunction it, final EObject context) {
    return this.toQualifiedName(it);
  }
  
  protected String _getQualifiedName(final XtendFunction it, final Void context) {
    return this.toQualifiedName(it);
  }
  
  protected String toQualifiedName(final XtendFunction it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("´toFullyQualifiedNameª(´parameters.toQualifiedNames[parameterType.simpleName]ª)");
    return _builder.toString();
  }
  
  protected String _getQualifiedName(final XtendConstructor it, final EObject context) {
    return this.toQualifiedName(it);
  }
  
  protected String _getQualifiedName(final XtendConstructor it, final Void context) {
    return this.toQualifiedName(it);
  }
  
  protected String toQualifiedName(final XtendConstructor it) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("´toFullyQualifiedNameª(´parameters.toQualifiedNames[parameterType.simpleName]ª)");
    return _builder.toString();
  }
  
  public String getQualifiedName(final EObject constructor, final EObject constructorCall) {
    if (constructor instanceof JvmConstructor
         && constructorCall instanceof XConstructorCall) {
      return _getQualifiedName((JvmConstructor)constructor, (XConstructorCall)constructorCall);
    } else if (constructor instanceof JvmExecutable
         && constructorCall instanceof XAbstractFeatureCall) {
      return _getQualifiedName((JvmExecutable)constructor, (XAbstractFeatureCall)constructorCall);
    } else if (constructor instanceof JvmExecutable
         && constructorCall != null) {
      return _getQualifiedName((JvmExecutable)constructor, constructorCall);
    } else if (constructor instanceof JvmExecutable
         && constructorCall == null) {
      return _getQualifiedName((JvmExecutable)constructor, (Void)null);
    } else if (constructor instanceof XtendConstructor
         && constructorCall != null) {
      return _getQualifiedName((XtendConstructor)constructor, constructorCall);
    } else if (constructor instanceof XtendFunction
         && constructorCall != null) {
      return _getQualifiedName((XtendFunction)constructor, constructorCall);
    } else if (constructor instanceof XtendConstructor
         && constructorCall == null) {
      return _getQualifiedName((XtendConstructor)constructor, (Void)null);
    } else if (constructor instanceof XtendFunction
         && constructorCall == null) {
      return _getQualifiedName((XtendFunction)constructor, (Void)null);
    } else if (constructor != null
         && constructorCall != null) {
      return _getQualifiedName(constructor, constructorCall);
    } else if (constructor != null
         && constructorCall == null) {
      return _getQualifiedName(constructor, (Void)null);
    } else if (constructor == null
         && constructorCall != null) {
      return _getQualifiedName((Void)null, constructorCall);
    } else if (constructor == null
         && constructorCall == null) {
      return _getQualifiedName((Void)null, (Void)null);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(constructor, constructorCall).toString());
    }
  }
}
