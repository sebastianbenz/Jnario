package gameoflife;

import de.bmw.carit.jnario.runner.Contains;
import de.bmw.carit.jnario.runner.ExampleGroupRunner;
import de.bmw.carit.jnario.runner.Named;
import gameoflife.Cell;
import gameoflife.CellAliveCellSpec;
import gameoflife.CellDeadCellSpec;
import org.junit.runner.RunWith;

@RunWith(ExampleGroupRunner.class)
@Named("Cell")
@Contains({CellAliveCellSpec.class,CellDeadCellSpec.class})
public class CellSpec {
  protected Cell subject;
  
  public Cell evolveWithNeighbours(final int neighbourCount) {
    Cell _evolve = this.subject.evolve(neighbourCount);
    return _evolve;
  }
}
