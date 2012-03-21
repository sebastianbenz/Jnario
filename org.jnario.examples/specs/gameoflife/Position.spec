/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package gameoflife

import static gameoflife.Position.*
import gameoflife.Position
import static org.junit.Assert.*
import static org.hamcrest.CoreMatchers.*

describe Position {

	fact "returns neighbouring positions"{
		assertThat(
			newHashSet(
				pos(2, 2), pos(2, 3), pos(2, 4),
				pos(3, 2), pos(3, 4),
				pos(4, 2), pos(4, 3), pos(4, 4)
			),
			is(pos(3, 3).neighbours()))
	}
	
	fact "calculates hash code based on coordinates"{
		assert pos(0, 0).hashCode == pos(0, 0).hashCode
	}
	
	fact "calculates equals based on coordinates"{
		assert pos(0, 0) == pos(0, 0)
	}

	fact "can add another position"{
		assert pos(1, 2).plus(pos(3, 4)) == pos(4, 6)
	}
	
	
}    