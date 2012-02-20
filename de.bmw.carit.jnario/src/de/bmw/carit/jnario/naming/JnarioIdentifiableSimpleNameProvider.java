package de.bmw.carit.jnario.naming;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xtend2.featurecalls.Xtend2IdentifiableSimpleNameProvider;

import de.bmw.carit.jnario.jnario.Step;

public class JnarioIdentifiableSimpleNameProvider extends Xtend2IdentifiableSimpleNameProvider {
	
	@Override
	public String getSimpleName(JvmIdentifiableElement element) {
		if(element instanceof Step){
			Step step = (Step) element;
			step.getName().trim().replaceAll(" +", " ").replaceAll("\\? *\n", "").replace("\\? *\r", "");
		}
		return super.getSimpleName(element);
	}
	

}
