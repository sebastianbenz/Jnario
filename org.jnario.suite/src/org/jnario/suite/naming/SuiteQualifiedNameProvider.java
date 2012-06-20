package org.jnario.suite.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.naming.XtendQualifiedNameProvider;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.jnario.suite.suite.Suite;
import org.jnario.util.Strings;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class SuiteQualifiedNameProvider extends XtendQualifiedNameProvider {
	
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;
	
	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		if (obj instanceof Suite) {
			Suite suite = (Suite)obj;
			String lastSegment = suite.getName();
			if(lastSegment == null){
				return null;
			}
			lastSegment = Strings.firstLine(lastSegment);
			lastSegment = trimPrefix(lastSegment);
			
			final String qualifiedName = (suite.getPackageName() != null ? suite.getPackageName() + "." : "")
					+ lastSegment;
			return qualifiedNameConverter.toQualifiedName(qualifiedName);
		}
		return super.getFullyQualifiedName(obj);
	}

	private String trimPrefix(String lastSegment) {
		int begin = 0;
		for(int i = 0; i < lastSegment.length(); i++){
			if(lastSegment.charAt(i) == '#'){
				begin++;
			}else{
				break;
			}
		}
		lastSegment = lastSegment.substring(begin);
		return lastSegment;
	}
}
