package org.jnario.ui.quickfix;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.jnario.ui.quickfix.JavaMethodBuilder;
import org.jnario.ui.quickfix.XtendMethodBuilder;

@SuppressWarnings("all")
public class MethodBuilderProvider {
  @Inject
  private Provider<XtendMethodBuilder> xtendMethodBuilderProvider;
  
  @Inject
  private Provider<JavaMethodBuilder> javaMethodBuilderProvider;
  
  public XtendMethodBuilder newXtendMethodBuilder(final String methodName) {
    XtendMethodBuilder _xblockexpression = null;
    {
      final XtendMethodBuilder builder = this.xtendMethodBuilderProvider.get();
      builder.setMethodName(methodName);
      _xblockexpression = (builder);
    }
    return _xblockexpression;
  }
  
  public JavaMethodBuilder newJavaMethodBuilder(final String methodName) {
    JavaMethodBuilder _xblockexpression = null;
    {
      final JavaMethodBuilder builder = this.javaMethodBuilderProvider.get();
      builder.setMethodName(methodName);
      char _charAt = ".".charAt(0);
      ImportManager _importManager = new ImportManager(false, _charAt);
      builder.setImportManager(_importManager);
      _xblockexpression = (builder);
    }
    return _xblockexpression;
  }
}
