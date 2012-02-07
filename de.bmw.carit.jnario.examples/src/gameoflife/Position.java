package gameoflife;

import static com.google.common.collect.Iterables.transform;
import static com.google.common.collect.Sets.newHashSet;

import java.util.Set;

import com.google.common.base.Function;
import com.google.common.collect.Sets;

public class Position {
		
		private static final Set<Position> OFFSETS = Sets.newHashSet(
				pos(-1, -1), pos(-1, 0), pos(-1, 1), 
				pos(0, -1), pos(0, 1), 
				pos(1, -1),pos(1, 0), pos(1, 1));
		
		public static Position pos(int x, int y){
			return new Position(x, y);
		}

		private int x;
		private int y;
		
		protected Position(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public Set<Position> neighbours(){
			return newHashSet(transform(OFFSETS, new Function<Position, Position>() {

				@Override
				public Position apply(Position input) {
					return input.plus(Position.this);
				}
			}));
		}
		
		public Position plus(Position other){
			return pos(x + other.x, y + other.y);
		}	
		
		public int hashCode() {
			int prime = 31;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}

		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Position other = (Position)obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}
		
		public String toString(){
			return "[" + x + "," + y + "]";
		}
	
}
