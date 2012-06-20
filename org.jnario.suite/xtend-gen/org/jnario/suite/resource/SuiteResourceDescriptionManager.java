package org.jnario.suite.resource;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.resource.DerivedStateAwareResourceDescriptionManager;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.suite.suite.SuitePackage;

@SuppressWarnings("all")
public class SuiteResourceDescriptionManager extends DerivedStateAwareResourceDescriptionManager {
  public boolean isAffected(final Delta delta, final IResourceDescription candidate) throws IllegalArgumentException {
    EClass _patternReference = SuitePackage.eINSTANCE.getPatternReference();
    Iterable<IEObjectDescription> _exportedObjectsByType = candidate.getExportedObjectsByType(_patternReference);
    boolean _isEmpty = IterableExtensions.isEmpty(_exportedObjectsByType);
    if (_isEmpty) {
      return super.isAffected(delta, candidate);
    }
    return false;
  }
}
