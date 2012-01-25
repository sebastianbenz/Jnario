package de.bmw.carit.jnario.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xtend2.naming.Xtend2QualifiedNameProvider;

import com.google.inject.Inject;

import de.bmw.carit.jnario.jnario.Step;

public class JnarioQualifiedNameProvider extends Xtend2QualifiedNameProvider {
	
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;
	
	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof Step) {
			String name = ((Step)obj).getName();
			if(name == null){
				return null;
			}
			return QualifiedName.create(name);
		}
		return super.getFullyQualifiedName(obj);
	}
}
