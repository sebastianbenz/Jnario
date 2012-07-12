/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package calculator;

import calculator.CalculatorAddIntIntSpec;
import calculator.CalculatorDivideIntIntSpec;
import calculator.CalculatorSubstractSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ CalculatorAddIntIntSpec.class, CalculatorDivideIntIntSpec.class, CalculatorSubstractSpec.class })
@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Calculator")
public class CalculatorSpec {
}
