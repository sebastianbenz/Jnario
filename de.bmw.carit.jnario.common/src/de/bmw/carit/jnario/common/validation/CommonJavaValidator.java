package de.bmw.carit.jnario.common.validation;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.typing.ITypeProvider;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

import de.bmw.carit.jnario.common.Assertion;
import de.bmw.carit.jnario.common.CommonPackage;
import de.bmw.carit.jnario.common.ExampleHeading;
import de.bmw.carit.jnario.common.ExampleRow;
import de.bmw.carit.jnario.common.ExampleTable;

public class CommonJavaValidator extends AbstractDeclarativeValidator {

	private static final String ILLEGAL_ASSERTION_EXPRESSION = "invalid type: expecting boolean";
	@Inject 
	private ITypeProvider typeProvider;

	@Override
	protected List<EPackage> getEPackages() {
		return Lists.<EPackage>newArrayList(CommonPackage.eINSTANCE);
	}
	
	@Check
	public void checkAssertExpressionIsBoolean(Assertion assertion){
		JvmTypeReference actualType = typeProvider.getType(assertion.getExpression());
		String actualTypeName = actualType.getQualifiedName();
		if(!actualTypeName.equals(boolean.class.getName()) && 
				!actualTypeName.equals(Boolean.class.getName())){
			error(ILLEGAL_ASSERTION_EXPRESSION, null);
		}
	}
	
	@Check
	public void checkExampleHeaderAndRowsHaveSameColumnNumber(ExampleTable exampleTable){
		ExampleHeading heading = exampleTable.getHeading();
		EList<ExampleRow> rows = exampleTable.getRows();
		int headingColumnNumber = heading.getParts().size();
		boolean rowsHaveSameNumberOfColumns = doRowsHaveSameNumberOfColumns(rows, headingColumnNumber);

		if(rowsHaveSameNumberOfColumns){
			hasSameTypesInColumns(rows);
		}
		else{
			error("Examples rows have to have the same number of columns", CommonPackage.Literals.EXAMPLE_TABLE__HEADING);
		}
	}

	private boolean doRowsHaveSameNumberOfColumns(EList<ExampleRow> rows, int headingColumnNumber){
		for(ExampleRow row: rows){
			if(row.getParts().size() != headingColumnNumber){			
				return false;
			}
		}
		return true;
	}

	private void hasSameTypesInColumns(EList<ExampleRow> rows){
		int colNum = 0;
		if(rows.size() > 0){
			ExampleRow firstRow = rows.get(0);
			for(XExpression cell: firstRow.getParts()){
				JvmType type = typeProvider.getType(cell).getType();
				//starting with second row
				for(int rowNum = 1; rowNum < rows.size(); rowNum++){
					EList<XExpression> parts = rows.get(rowNum).getParts();
					XExpression expression = parts.get(colNum);
					JvmType compareType = typeProvider.getType(expression).getType();
					if(!type.equals(compareType)){
						error("Examples columns have to have the same type - Conflicting types: " + type.getQualifiedName() + ", " + compareType.getQualifiedName(), CommonPackage.Literals.EXAMPLE_TABLE__ROWS);
					}
				}
				colNum++;
			} 
		}
	}
}
