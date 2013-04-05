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
import org.eclipse.xtext.xbase.typesystem.legacy.StandardTypeReferenceOwner;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.xbase.typesystem.util.CommonTypeComputationServices;
import org.eclipse.xtext.xbase.typing.IJvmTypeReferenceProvider;
import org.eclipse.xtext.xtype.XComputedTypeReference;
import org.eclipse.xtext.xtype.impl.XComputedTypeReferenceImplCustom;
import org.jnario.ExampleColumn;
import org.jnario.ExampleTable;

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
            boolean _isInferred = InferredTypeIndicator.isInferred(_parameterType);
            if (_isInferred) {
              JvmTypeReference _parameterType_1 = param.getParameterType();
              JnarioTypeResolver.this.setColumnTypeProvider(_parameterType_1, resolvedTypes, session, column, resolvedTypesByContext);
            }
          }
        };
      IterableExtensions.<JvmFormalParameter>forEach(_parameters, _function);
    }
    super._doPrepare(resolvedTypes, session, constructor, resolvedTypesByContext);
  }
  
  protected void _doPrepare(final ResolvedTypes resolvedTypes, final IFeatureScopeSession session, final JvmField field, final Map<JvmIdentifiableElement,ResolvedTypes> resolvedTypesByContext) {
    final EObject source = this._iJvmModelAssociations.getPrimarySourceElement(field);
    boolean _and = false;
    if (!(source instanceof ExampleColumn)) {
      _and = false;
    } else {
      JvmTypeReference _type = field.getType();
      boolean _isInferred = InferredTypeIndicator.isInferred(_type);
      _and = ((source instanceof ExampleColumn) && _isInferred);
    }
    if (_and) {
      JvmTypeReference _type_1 = field.getType();
      this.setColumnTypeProvider(_type_1, resolvedTypes, session, ((ExampleColumn) source), resolvedTypesByContext);
    }
    super._doPrepare(resolvedTypes, session, field, resolvedTypesByContext);
  }
  
  protected void _doPrepare(final ResolvedTypes resolvedTypes, final IFeatureScopeSession session, final JvmOperation operation, final Map<JvmIdentifiableElement,ResolvedTypes> resolvedTypesByContext) {
    final EObject source = this._iJvmModelAssociations.getPrimarySourceElement(operation);
    boolean _and = false;
    if (!(source instanceof ExampleColumn)) {
      _and = false;
    } else {
      JvmTypeReference _returnType = operation.getReturnType();
      boolean _isInferred = InferredTypeIndicator.isInferred(_returnType);
      _and = ((source instanceof ExampleColumn) && _isInferred);
    }
    if (_and) {
      JvmTypeReference _returnType_1 = operation.getReturnType();
      this.setColumnTypeProvider(_returnType_1, resolvedTypes, session, ((ExampleColumn) source), resolvedTypesByContext);
    }
    super._doPrepare(resolvedTypes, session, operation, resolvedTypesByContext);
  }
  
  public void setColumnTypeProvider(final JvmTypeReference typeRef, final ResolvedTypes resolvedTypes, final IFeatureScopeSession session, final ExampleColumn column, final Map<JvmIdentifiableElement,ResolvedTypes> resolvedTypesByContext) {
    boolean _not = (!(typeRef instanceof XComputedTypeReference));
    if (_not) {
      return;
    }
    final Function1<XComputedTypeReferenceImplCustom,JvmTypeReference> _function = new Function1<XComputedTypeReferenceImplCustom,JvmTypeReference>() {
        public JvmTypeReference apply(final XComputedTypeReferenceImplCustom it) {
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
            CommonTypeComputationServices _services = JnarioTypeResolver.this.getServices();
            StandardTypeReferenceOwner _standardTypeReferenceOwner = new StandardTypeReferenceOwner(_services, column);
            final StandardTypeReferenceOwner owner = _standardTypeReferenceOwner;
            boolean _isEmpty = types.isEmpty();
            if (_isEmpty) {
              return null;
            }
            CommonTypeComputationServices _services_1 = JnarioTypeResolver.this.getServices();
            TypeConformanceComputer _typeConformanceComputer = _services_1.getTypeConformanceComputer();
            LightweightTypeReference _commonSuperType = _typeConformanceComputer.getCommonSuperType(types, owner);
            JvmTypeReference _javaCompliantTypeReference = _commonSuperType.toJavaCompliantTypeReference();
            _xblockexpression = (_javaCompliantTypeReference);
          }
          return _xblockexpression;
        }
      };
    ((XComputedTypeReference) typeRef).setTypeProvider(new IJvmTypeReferenceProvider() {
        public JvmTypeReference getTypeReference(XComputedTypeReferenceImplCustom context) {
          return _function.apply(context);
        }
    });
  }
}
