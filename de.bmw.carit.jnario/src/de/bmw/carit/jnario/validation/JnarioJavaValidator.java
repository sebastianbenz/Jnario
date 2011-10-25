package de.bmw.carit.jnario.validation;

import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.typing.ITypeProvider;

import com.google.inject.Inject;

import de.bmw.carit.jnario.jnario.ExampleCell;
import de.bmw.carit.jnario.jnario.ExampleHeading;
import de.bmw.carit.jnario.jnario.ExampleRow;
import de.bmw.carit.jnario.jnario.Examples;
import de.bmw.carit.jnario.jnario.JnarioPackage;
 

public class JnarioJavaValidator extends AbstractJnarioJavaValidator {
	
	@Inject
	private ITypeProvider typeProvider;

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}
	
	@Check
	public void checkExampleHeaderAndRowsHaveSameColumnNumber(Examples examples){
		ExampleHeading heading = examples.getHeading();
		EList<ExampleRow> rows = examples.getRows();
		int headingColumnNumber = heading.getParts().size();
		boolean hasSameNumberOfColumns = true;
		for(ExampleRow row: rows){
			if(row.getParts().size() != headingColumnNumber){
				error("Examples rows have to have the same number of columns", JnarioPackage.Literals.EXAMPLES__HEADING);
				hasSameNumberOfColumns = false;
			}
		}
		if(hasSameNumberOfColumns){
			int colNum = 0;
			for(ExampleCell cell: rows.get(0).getParts()){
				JvmType type = typeProvider.getType(cell.getName()).getType();
				//starting with second row
				for(int rowNum = 1; rowNum < rows.size(); rowNum++){
					EList<ExampleCell> parts = rows.get(rowNum).getParts();
					XExpression expression = parts.get(colNum).getName();
					JvmType compareType = typeProvider.getType(expression).getType();
					if(!type.equals(compareType)){
						error("Examples columns have to have the same type - Conflicting types: " + type.getQualifiedName() + ", " + compareType.getQualifiedName(), JnarioPackage.Literals.EXAMPLES__ROWS);
					}
				}
				colNum++;
			}
		}
		
	}
	
	@Check
	public void checkVariableDeclaration(XVariableDeclaration declaration) {
		if(getContainerOfType(declaration, Examples.class) == null){
			super.checkVariableDeclaration(declaration);
		}
	}

}
