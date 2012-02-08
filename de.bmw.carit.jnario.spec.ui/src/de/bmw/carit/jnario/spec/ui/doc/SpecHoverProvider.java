/**
 * 
 */
package de.bmw.carit.jnario.spec.ui.doc;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;
import org.eclipse.xtext.xtend2.ui.hover.XtendHoverProvider;

import com.google.inject.Inject;

import de.bmw.carit.jnario.spec.doc.DocGenerator;
import de.bmw.carit.jnario.spec.spec.ExampleGroup;

/**
 * @author Sebastian Benz 
 *
 */
public class SpecHoverProvider extends XtendHoverProvider {
	
	@Inject
	private DocGenerator docGenerator;

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider#getDocumentation(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected String getDocumentation(EObject o) {
		String comment;
		if (o instanceof ExampleGroup) {
			comment = docGenerator.generate((ExampleGroup) o).toString();
		}else{
			comment = super.getDocumentation(o);
		}
		return comment;
	}
	
}
