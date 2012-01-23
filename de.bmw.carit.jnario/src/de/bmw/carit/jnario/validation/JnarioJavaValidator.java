/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.validation;

import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.eclipse.xtext.xbase.typing.ITypeProvider;

import com.google.inject.Inject;

import de.bmw.carit.jnario.jnario.ExampleCell;
import de.bmw.carit.jnario.jnario.ExampleHeading;
import de.bmw.carit.jnario.jnario.ExampleRow;
import de.bmw.carit.jnario.jnario.ExampleTable;
import de.bmw.carit.jnario.jnario.JnarioPackage;
import de.bmw.carit.jnario.jnario.Scenario;
import de.bmw.carit.jnario.jnario.Step;
import de.bmw.carit.jnario.jnario.StepReference;


public class JnarioJavaValidator extends AbstractJnarioJavaValidator {

	@Inject
	private ITypeProvider typeProvider;

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
			error("Examples rows have to have the same number of columns", JnarioPackage.Literals.EXAMPLE_TABLE__HEADING);
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
			for(ExampleCell cell: rows.get(0).getParts()){
				JvmType type = typeProvider.getType(cell.getName()).getType();
				//starting with second row
				for(int rowNum = 1; rowNum < rows.size(); rowNum++){
					EList<ExampleCell> parts = rows.get(rowNum).getParts();
					XExpression expression = parts.get(colNum).getName();
					JvmType compareType = typeProvider.getType(expression).getType();
					if(!type.equals(compareType)){
						error("Examples columns have to have the same type - Conflicting types: " + type.getQualifiedName() + ", " + compareType.getQualifiedName(), JnarioPackage.Literals.EXAMPLE_TABLE__ROWS);
					}
				}
				colNum++;
			}
		}
	}

	@Check
	public void checkVariableDeclaration(XVariableDeclaration declaration) {
		if(getContainerOfType(declaration, ExampleTable.class) == null){
			super.checkVariableDeclaration(declaration);
		}
	}

	protected void checkDeclaredVariableName(EObject nameDeclarator, EObject attributeHolder, EAttribute attr) {
		if (nameDeclarator.eContainer() == null)
			return;
		if (attr.getEContainingClass().isInstance(attributeHolder)) {
			String name = (String) attributeHolder.eGet(attr);
			// shadowing 'it' is allowed
			if (name == null || name.equals(XbaseScopeProvider.IT.toString()))
				return;
			int idx = 0;
			if (nameDeclarator.eContainer() instanceof XBlockExpression) {
				idx = ((XBlockExpression)nameDeclarator.eContainer()).getExpressions().indexOf(nameDeclarator);
			}
			IScope scope = getScopeProvider().createSimpleFeatureCallScope(nameDeclarator.eContainer(), XbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE, nameDeclarator.eResource(), true, idx);
			Iterable<IEObjectDescription> elements = scope.getElements(QualifiedName.create(name));
			for (IEObjectDescription desc : elements) {
				if (desc.getEObjectOrProxy()!=nameDeclarator && !(desc.getEObjectOrProxy() instanceof JvmFeature)) {
					error("Duplicate variable name '"+name+"'", attributeHolder, attr,-1, org.eclipse.xtext.xbase.validation.IssueCodes.VARIABLE_NAME_SHADOWING);
				}
			}
		}
	}

	@Check
	public void checkStepDefinitionAndReferences(Step step){
		Scenario scenario = getContainerOfType(step, Scenario.class);
		EList<Step> steps = scenario.getSteps();

		if(step instanceof StepReference){
			StepReference ref = (StepReference) step;
			for(Step currentStep: steps){
				if(currentStep instanceof Step){
					if(ref.getReference().equals(currentStep)){
						error("Cannot reference a step that was defined in this scenario.", JnarioPackage.Literals.STEP__NAME);
					}
				}
			}
		}
	}

}
