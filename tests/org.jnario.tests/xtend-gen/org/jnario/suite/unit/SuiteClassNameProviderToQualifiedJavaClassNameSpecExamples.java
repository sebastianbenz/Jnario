package org.jnario.suite.unit;

import java.util.List;
import org.jnario.lib.ExampleTableRow;

@SuppressWarnings("all")
public class SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples extends ExampleTableRow {
  public SuiteClassNameProviderToQualifiedJavaClassNameSpecExamples(final List<String> cellNames, final String name, final String packageName, final String qualifiedName) {
    super(cellNames);
    this.name = name;
    this.packageName = packageName;
    this.qualifiedName = qualifiedName;
    
  }
  
  private String name;
  
  public String getName() {
    return this.name;
  }
  
  private String packageName;
  
  public String getPackageName() {
    return this.packageName;
  }
  
  private String qualifiedName;
  
  public String getQualifiedName() {
    return this.qualifiedName;
  }
}
