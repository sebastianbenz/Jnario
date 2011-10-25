package de.bmw.carit.jnario.typing;

import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;

import com.google.inject.Singleton;

import de.bmw.carit.jnario.jnario.ExampleCell;
import de.bmw.carit.jnario.jnario.ExampleHeading;
import de.bmw.carit.jnario.jnario.ExampleRow;
import de.bmw.carit.jnario.jnario.Examples;

@Singleton
public class JnarioTypeProvider extends XbaseTypeProvider {
	
	protected JvmTypeReference _typeForIdentifiable(XVariableDeclaration object, boolean rawType) {
		Examples examples = getContainerOfType(object, Examples.class);
		if(examples == null){
			return super._typeForIdentifiable(object, rawType);
		}else{
		ExampleHeading heading = examples.getHeading();
			int i = 0;
			for(XVariableDeclaration variable: heading.getParts()){
				if(variable.getName().equals(object.getName())){
					break;
				}
				i++;
			}
			ExampleRow exampleRow = examples.getRows().get(0);
			if(exampleRow.getParts().size() > i){
				ExampleCell exampleCell = exampleRow.getParts().get(i);
				XExpression expression = exampleCell.getName();
			
				return this.getType(expression);
			}
			else{
				return super._typeForIdentifiable(object, rawType);
			}
		}
	}
}
