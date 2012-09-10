package gameoflife;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class GameOfLifeRulesEvolveLivingCellsSpecLivingCells extends ExampleTableRow {
  public GameOfLifeRulesEvolveLivingCellsSpecLivingCells(final List<String> cellNames, final int liveNeighbourCount, final boolean becomesAlive) {
    super(cellNames);
    this.liveNeighbourCount = liveNeighbourCount;
    this.becomesAlive = becomesAlive;
  }
  
  public int liveNeighbourCount;
  
  public int getLiveNeighbourCount() {
    return liveNeighbourCount;
  }
  
  public boolean becomesAlive;
  
  public boolean getBecomesAlive() {
    return becomesAlive;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(liveNeighbourCount) , String.valueOf(becomesAlive));
  }
}
