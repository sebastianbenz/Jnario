package gameoflife;

public interface WorldVisitor {

	void visit(Cell cell, Position position);
	
}
