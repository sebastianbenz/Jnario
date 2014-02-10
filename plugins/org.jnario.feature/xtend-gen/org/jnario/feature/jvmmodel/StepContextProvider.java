package org.jnario.feature.jvmmodel;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.util.XbaseUsageCrossReferencer;
import org.jnario.feature.feature.Step;
import org.jnario.feature.jvmmodel.StepExpressionProvider;
import org.jnario.feature.jvmmodel.VisibleMembersCalculator;

@SuppressWarnings("all")
public class StepContextProvider {
  @Inject
  @Extension
  private StepExpressionProvider _stepExpressionProvider;
  
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  @Inject
  @Extension
  private VisibleMembersCalculator _visibleMembersCalculator;
  
  public Set<XtendField> usedFields(final Step step) {
    Set<XtendField> _xblockexpression = null;
    {
      final XExpression expr = this._stepExpressionProvider.expressionOf(step);
      Iterable<XtendMember> _allVisibleMembers = this._visibleMembersCalculator.allVisibleMembers(step);
      Iterable<XtendField> _filter = Iterables.<XtendField>filter(_allVisibleMembers, XtendField.class);
      final Function1<XtendField,Boolean> _function = new Function1<XtendField,Boolean>() {
        public Boolean apply(final XtendField it) {
          boolean _xblockexpression = false;
          {
            Set<EObject> _jvmElements = StepContextProvider.this._iJvmModelAssociations.getJvmElements(it);
            Iterable<JvmField> _filter = Iterables.<JvmField>filter(_jvmElements, JvmField.class);
            Iterator<JvmField> _iterator = _filter.iterator();
            final JvmField field = _iterator.next();
            ArrayList<XExpression> _newArrayList = CollectionLiterals.<XExpression>newArrayList(expr);
            final Collection<EStructuralFeature.Setting> usages = XbaseUsageCrossReferencer.find(field, _newArrayList);
            boolean _isEmpty = usages.isEmpty();
            _xblockexpression = ((!_isEmpty));
          }
          return Boolean.valueOf(_xblockexpression);
        }
      };
      Iterable<XtendField> _filter_1 = IterableExtensions.<XtendField>filter(_filter, _function);
      _xblockexpression = (IterableExtensions.<XtendField>toSet(_filter_1));
    }
    return _xblockexpression;
  }
}
