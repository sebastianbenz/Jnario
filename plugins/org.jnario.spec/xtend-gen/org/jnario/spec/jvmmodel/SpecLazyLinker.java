package org.jnario.spec.jvmmodel;

import com.google.common.collect.Multimap;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.xtext.diagnostics.IDiagnosticProducer;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.linking.XbaseLazyLinker;
import org.jnario.spec.jvmmodel.ImplicitSubject;
import org.jnario.spec.spec.ExampleGroup;

@SuppressWarnings("all")
public class SpecLazyLinker extends XbaseLazyLinker {
  @Inject
  private ImplicitSubject _implicitSubject;
  
  protected void installProxies(final EObject obj, final IDiagnosticProducer producer, final Multimap<Setting,INode> settingsToLink) {
    if ((obj instanceof ExampleGroup)) {
      this._implicitSubject.addImplicitSubject(((ExampleGroup) obj));
    }
    super.installProxies(obj, producer, settingsToLink);
  }
}
