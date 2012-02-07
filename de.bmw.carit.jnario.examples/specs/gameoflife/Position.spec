package gameoflife

import static gameoflife.Position.*
import gameoflife.Position
import static org.junit.Assert.*
import static org.hamcrest.CoreMatchers.*

describe Position {

	it "returns neighbouring positions"{
		assertThat(
			newHashSet(
				pos(2, 2), pos(2, 3), pos(2, 4),
				pos(3, 2), pos(3, 4),
				pos(4, 2), pos(4, 3), pos(4, 4)
			),
			is(pos(3, 3).neighbours()))
	}
	
	it "calculates hash code based on coordinates"{
		assert pos(0, 0).hashCode == pos(0, 0).hashCode
	}
	
	it "calculates equals based on coordinates"{
		assert pos(0, 0) == pos(0, 0)
	}

	it "can add another position"{
		assert pos(1, 2).plus(pos(3, 4)) == pos(4, 6)
	}
	
	
}    