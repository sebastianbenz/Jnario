package gameoflife;

public interface Rule {
  
  boolean becomesAlive(int neighbourCount);

}
