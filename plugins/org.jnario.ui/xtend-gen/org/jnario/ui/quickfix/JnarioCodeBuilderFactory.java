package org.jnario.ui.quickfix;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.ide.codebuilder.CodeBuilderFactory;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class JnarioCodeBuilderFactory extends CodeBuilderFactory {
  public Object getSource(final JvmDeclaredType element) {
    Object _xblockexpression = null;
    {
      final XtendClass xtendClass = this.xtendClass(element);
      boolean _notEquals = (!Objects.equal(xtendClass, null));
      if (_notEquals) {
        return xtendClass;
      }
      _xblockexpression = super.getSource(element);
    }
    return _xblockexpression;
  }
  
  private XtendClass xtendClass(final JvmType type) {
    XtendClass _xblockexpression = null;
    {
      boolean _equals = Objects.equal(type, null);
      if (_equals) {
        return null;
      }
      Resource _eResource = type.eResource();
      TreeIterator<EObject> _allContents = _eResource.getAllContents();
      Iterator<XtendClass> _filter = Iterators.<XtendClass>filter(_allContents, XtendClass.class);
      final Function1<XtendClass,Boolean> _function = new Function1<XtendClass,Boolean>() {
        public Boolean apply(final XtendClass it) {
          String _name = it.getName();
          String _simpleName = type.getSimpleName();
          return Boolean.valueOf(Objects.equal(_name, _simpleName));
        }
      };
      _xblockexpression = IteratorExtensions.<XtendClass>findFirst(_filter, _function);
    }
    return _xblockexpression;
  }
}
