package diverse;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class TablesSpecAdditions extends ExampleTableRow {
  public TablesSpecAdditions(final List<String> cellNames, final int a, final int b, final int sum) {
    super(cellNames);
    this.a = a;
    this.b = b;
    this.sum = sum;
    
  }
  
  private int a;
  
  public int getA() {
    return this.a;
  }
  
  private int b;
  
  public int getB() {
    return this.b;
  }
  
  private int sum;
  
  public int getSum() {
    return this.sum;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(toString(a) ,toString(b) ,toString(sum));
  }
}
