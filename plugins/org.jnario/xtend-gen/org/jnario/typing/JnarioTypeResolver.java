package org.jnario.typing;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.typesystem.DispatchAndExtensionAwareReentrantTypeResolver;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.scoping.batch.IFeatureScopeSession;
import org.eclipse.xtext.xbase.typesystem.InferredTypeIndicator;
import org.eclipse.xtext.xbase.typesystem.conformance.TypeConformanceComputer;
import org.eclipse.xtext.xbase.typesystem.internal.ResolvedTypes;
import org.eclipse.xtext.xbase.typesystem.references.ITypeReferenceOwner;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.xbase.typesystem.util.CommonTypeComputationServices;
import org.eclipse.xtext.xtype.XComputedTypeReference;
import org.jnario.ExampleColumn;
import org.jnario.ExampleTable;
import org.jnario.typing.ColumnTypeProvider;

@SuppressWarnings("all")
public class JnarioTypeResolver extends DispatchAndExtensionAwareReentrantTypeResolver {
  @Inject
  private IJvmModelAssociations _iJvmModelAssociations;
  
  protected void _doPrepare(final ResolvedTypes resolvedTypes, final IFeatureScopeSession session, final JvmConstructor constructor, final Map<JvmIdentifiableElement,ResolvedTypes> resolvedTypesByContext) {
    final EObject source = this._iJvmModelAssociations.getPrimarySourceElement(constructor);
    if ((source instanceof ExampleTable)) {
      EList<JvmFormalParameter> _parameters = constructor.getParameters();
      final Procedure1<JvmFormalParameter> _function = new Procedure1<JvmFormalParameter>() {
          public void apply(final JvmFormalParameter param) {
            EObject _primarySourceElement = JnarioTypeResolver.this._iJvmModelAssociations.getPrimarySourceElement(param);
            final ExampleColumn column = ((ExampleColumn) _primarySourceElement);
            JvmTypeReference _parameterType = param.getParameterType();
            JnarioTypeResolver.this.setColumnTypeProvider(_parameterType, resolvedTypes, session, column, resolvedTypesByContext);
          }
        };
      IterableExtensions.<JvmFormalParameter>forEach(_parameters, _function);
    }
    super._doPrepare(resolvedTypes, session, constructor, resolvedTypesByContext);
  }
  
  protected void _doPrepare(final ResolvedTypes resolvedTypes, final IFeatureScopeSession session, final JvmField field, final Map<JvmIdentifiableElement,ResolvedTypes> resolvedTypesByContext) {
    final EObject source = this._iJvmModelAssociations.getPrimarySourceElement(field);
    if ((source instanceof ExampleColumn)) {
      JvmTypeReference _type = field.getType();
      this.setColumnTypeProvider(_type, resolvedTypes, session, ((ExampleColumn) source), resolvedTypesByContext);
    }
    super._doPrepare(resolvedTypes, session, field, resolvedTypesByContext);
  }
  
  protected void _doPrepare(final ResolvedTypes resolvedTypes, final IFeatureScopeSession session, final JvmOperation operation, final Map<JvmIdentifiableElement,ResolvedTypes> resolvedTypesByContext) {
    final EObject source = this._iJvmModelAssociations.getPrimarySourceElement(operation);
    if ((source instanceof ExampleColumn)) {
      JvmTypeReference _returnType = operation.getReturnType();
      this.setColumnTypeProvider(_returnType, resolvedTypes, session, ((ExampleColumn) source), resolvedTypesByContext);
    }
    super._doPrepare(resolvedTypes, session, operation, resolvedTypesByContext);
  }
  
  public void setColumnTypeProvider(final JvmTypeReference typeRef, final ResolvedTypes resolvedTypes, final IFeatureScopeSession session, final ExampleColumn column, final Map<JvmIdentifiableElement,ResolvedTypes> resolvedTypesByContext) {
    boolean _isInferred = InferredTypeIndicator.isInferred(typeRef);
    boolean _not = (!_isInferred);
    if (_not) {
      return;
    }
    final Function1<XComputedTypeReference,JvmTypeReference> _function = new Function1<XComputedTypeReference,JvmTypeReference>() {
        public JvmTypeReference apply(final XComputedTypeReference it) {
          JvmTypeReference _xblockexpression = null;
          {
            final ArrayList<LightweightTypeReference> types = CollectionLiterals.<LightweightTypeReference>newArrayList();
            EList<XExpression> _cells = column.getCells();
            for (final XExpression cell : _cells) {
              {
                LightweightTypeReference type = resolvedTypes.getActualType(cell);
                boolean _equals = Objects.equal(type, null);
                if (_equals) {
                  JnarioTypeResolver.this.computeTypes(resolvedTypesByContext, resolvedTypes, session, cell);
                }
                LightweightTypeReference _actualType = resolvedTypes.getActualType(cell);
                type = _actualType;
                boolean _notEquals = (!Objects.equal(type, null));
                if (_notEquals) {
                  types.add(type);
                }
              }
            }
            final ITypeReferenceOwner owner = resolvedTypes.getReferenceOwner();
            boolean _isEmpty = types.isEmpty();
            if (_isEmpty) {
              return null;
            }
            CommonTypeComputationServices _services = JnarioTypeResolver.this.getServices();
            TypeConformanceComputer _typeConformanceComputer = _services.getTypeConformanceComputer();
            LightweightTypeReference _commonSuperType = _typeConformanceComputer.getCommonSuperType(types, owner);
            JvmTypeReference _javaCompliantTypeReference = _commonSuperType.toJavaCompliantTypeReference();
            _xblockexpression = (_javaCompliantTypeReference);
          }
          return _xblockexpression;
        }
      };
    ColumnTypeProvider _columnTypeProvider = new ColumnTypeProvider(_function);
    ((XComputedTypeReference) typeRef).setTypeProvider(_columnTypeProvider);
  }
}
