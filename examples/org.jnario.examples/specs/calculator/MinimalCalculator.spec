/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package calculator

describe Calculator "- A minimal Spec" {
	
	fact subject.add(4, 5) => 9
	fact subject.divide(10, 5) => 1
	fact subject.divide(10, 0) should throw ArithmeticException

}                                          