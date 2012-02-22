/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package de.bmw.carit.jnario.common.validation;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeConformanceComputer;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.typing.ITypeProvider;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

import de.bmw.carit.jnario.common.Assertion;
import de.bmw.carit.jnario.common.CommonPackage;
import de.bmw.carit.jnario.common.ExampleColumn;
import de.bmw.carit.jnario.common.ExampleRow;
import de.bmw.carit.jnario.common.ExampleTable;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
public class CommonJavaValidator extends AbstractDeclarativeValidator {

	private static final String ILLEGAL_ASSERTION_EXPRESSION = "invalid type: expecting boolean";
	@Inject 
	private ITypeProvider typeProvider;
	
	@Inject
	private TypeConformanceComputer conformanceComputer;
	
	@Inject 
	private TypeReferences typeReferences;

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
	public void checkExpressionsInTableDoNotReturnVoid(ExampleRow row){
		for (XExpression cell : row.getCells()) {
			JvmTypeReference actualType = typeProvider.getType(cell);
			if(typeReferences.is(actualType, Void.TYPE)){
				error("Expression must not be void", cell, null, 0);
			}
		}
	}
	
	@Check
	public void checkExampleTableCellsConformToColumType(ExampleTable exampleTable){
		for (ExampleColumn column : exampleTable.getColumns()) {
			for (XExpression cell : column.getCells()) {
				JvmTypeReference cellType = typeProvider.getType(cell);
				if(!conformanceComputer.isConformant(column.getType(), cellType)){
					error("Incompatible types. Expected " + cellType.getIdentifier() + " but was " + column.getType().getIdentifier(), cell, null, 0);
				}
			}
		}
	}
	
	@Check
	public void checkExampleHeaderAndRowsHaveSameColumnNumber(ExampleTable exampleTable){
		if(!exampleTable.isValid()){
			error("Examples rows have to have the same number of columns", null);
		}
	}

}
