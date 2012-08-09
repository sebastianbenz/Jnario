package gameoflife;

import java.util.HashSet;
import java.util.Set;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Data
@SuppressWarnings("all")
public class CellPosition {
  public final static HashSet<CellPosition> NEIGHBOUR_OFFSETS = new Function0<HashSet<CellPosition>>() {
    public HashSet<CellPosition> apply() {
      CellPosition _cell = CellPosition.cell(1, 0);
      CellPosition _cell_1 = CellPosition.cell(1, 1);
      CellPosition _cell_2 = CellPosition.cell(0, 1);
      int _minus = (-1);
      int _minus_1 = (-1);
      CellPosition _cell_3 = CellPosition.cell(_minus, _minus_1);
      int _minus_2 = (-1);
      CellPosition _cell_4 = CellPosition.cell(_minus_2, 0);
      int _minus_3 = (-1);
      CellPosition _cell_5 = CellPosition.cell(_minus_3, 1);
      int _minus_4 = (-1);
      CellPosition _cell_6 = CellPosition.cell(0, _minus_4);
      int _minus_5 = (-1);
      CellPosition _cell_7 = CellPosition.cell(1, _minus_5);
      HashSet<CellPosition> _newHashSet = CollectionLiterals.<CellPosition>newHashSet(_cell, _cell_1, _cell_2, _cell_3, _cell_4, _cell_5, _cell_6, _cell_7);
      return _newHashSet;
    }
  }.apply();
  
  public static CellPosition cell(final int x, final int y) {
    CellPosition _cellPosition = new CellPosition(x, y);
    return _cellPosition;
  }
  
  private final int _x;
  
  public int getX() {
    return this._x;
  }
  
  private final int _y;
  
  public int getY() {
    return this._y;
  }
  
  public Set<CellPosition> neighbours() {
    final Function1<CellPosition,CellPosition> _function = new Function1<CellPosition,CellPosition>() {
        public CellPosition apply(final CellPosition it) {
          CellPosition _plus = CellPosition.this.plus(it);
          return _plus;
        }
      };
    Iterable<CellPosition> _map = IterableExtensions.<CellPosition, CellPosition>map(CellPosition.NEIGHBOUR_OFFSETS, _function);
    Set<CellPosition> _set = IterableExtensions.<CellPosition>toSet(_map);
    return _set;
  }
  
  public CellPosition plus(final CellPosition other) {
    int _x = this.getX();
    int _x_1 = other.getX();
    int _plus = (_x + _x_1);
    int _y = this.getY();
    int _y_1 = other.getY();
    int _plus_1 = (_y + _y_1);
    CellPosition _cell = CellPosition.cell(_plus, _plus_1);
    return _cell;
  }
  
  public String toString() {
    int _x = this.getX();
    String _plus = ("[" + Integer.valueOf(_x));
    String _plus_1 = (_plus + ",");
    int _y = this.getY();
    String _plus_2 = (_plus_1 + Integer.valueOf(_y));
    String _plus_3 = (_plus_2 + "]");
    return _plus_3;
  }
  
  public CellPosition(final int x, final int y) {
    super();
    this._x = x;
    this._y = y;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + _x;
    result = prime * result + _y;
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    CellPosition other = (CellPosition) obj;
    if (other._x != _x)
      return false;
    if (other._y != _y)
      return false;
    return true;
  }
}
