package de.bmw.carit.jnario.typing;

import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;

import com.google.inject.Singleton;

import de.bmw.carit.jnario.jnario.ExampleCell;
import de.bmw.carit.jnario.jnario.ExampleHeading;
import de.bmw.carit.jnario.jnario.ExampleRow;
import de.bmw.carit.jnario.jnario.Examples;

@Singleton
public class JnarioTypeProvider extends XbaseTypeProvider {

	protected JvmTypeReference _typeForIdentifiable(XVariableDeclaration variableDec, boolean rawType) {
		JvmTypeReference type = checkIfVariableDeclarationInExample(variableDec);
		if(type != null){
			return type;
		}
		return super._typeForIdentifiable(variableDec, rawType);
	}

	@Override
	protected JvmTypeReference _type(XVariableDeclaration variableDec, JvmTypeReference rawExpectation, boolean rawType) {
		JvmTypeReference type = checkIfVariableDeclarationInExample(variableDec);
		if(type != null){
			return type;
		}
		return super._type(variableDec, rawExpectation, rawType);
	}

	private JvmTypeReference checkIfVariableDeclarationInExample(XVariableDeclaration variableDec){
		Examples examples = getContainerOfType(variableDec, Examples.class);
		if(examples != null){
			ExampleHeading heading = examples.getHeading();
			if(isVariableDeclarationInExample(variableDec)){
				int index = heading.getParts().indexOf(variableDec);
				if(examples.getRows() != null && examples.getRows().size() > 0){
					ExampleRow exampleRow = examples.getRows().get(0);
					if(index < exampleRow.getParts().size()){
						ExampleCell exampleCell = exampleRow.getParts().get(index);
						return getType(exampleCell.getName());
					}
				}
			}
		}
		return null;
	}

	private boolean isVariableDeclarationInExample(XVariableDeclaration variableDec){
		Examples examples = getContainerOfType(variableDec, Examples.class);
		if(examples != null){
			ExampleHeading heading = examples.getHeading();
			if(heading.getParts().contains(variableDec)){
				return true;
			}
		}
		return false;
	}
}
