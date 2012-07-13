package org.jnario.suite.unit;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

public class SuiteClassNameProviderGetQualifiedClassNameSpecExamples extends ExampleTableRow {
  public SuiteClassNameProviderGetQualifiedClassNameSpecExamples(final List<String> cellNames, final String name, final String packageName, final String qualifiedName) {
    super(cellNames);
    this.name = name;
    this.packageName = packageName;
    this.qualifiedName = qualifiedName;
  }
  
  public String name;
  
  public String getName() {
    return name;
  }
  
  public String packageName;
  
  public String getPackageName() {
    return packageName;
  }
  
  public String qualifiedName;
  
  public String getQualifiedName() {
    return qualifiedName;
  }
  
  public List<String> getCells() {
    return java.util.Arrays.asList(String.valueOf(name) , String.valueOf(packageName) , String.valueOf(qualifiedName));
  }
}
