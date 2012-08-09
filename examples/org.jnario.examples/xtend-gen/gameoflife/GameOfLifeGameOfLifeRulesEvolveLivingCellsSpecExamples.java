package gameoflife;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class GameOfLifeGameOfLifeRulesEvolveLivingCellsSpecExamples extends ExampleTableRow {
  public GameOfLifeGameOfLifeRulesEvolveLivingCellsSpecExamples(final List<String> cellNames, final int livingNeighbours, final boolean becomesAlive) {
    super(cellNames);
    this.livingNeighbours = livingNeighbours;
    this.becomesAlive = becomesAlive;
  }
  
  public int livingNeighbours;
  
  public int getLivingNeighbours() {
    return livingNeighbours;
  }
  
  public boolean becomesAlive;
  
  public boolean getBecomesAlive() {
    return becomesAlive;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(livingNeighbours) , String.valueOf(becomesAlive));
  }
}
