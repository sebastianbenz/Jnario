package selenium;

@SuppressWarnings("all")
public class WebDriverExtension {
  private /* WebDriver */Object driver;
  
  private /* Wait<WebDriver> */Object wait;
  
  public WebDriverExtension() {
    throw new Error("Unresolved compilation problems:"
      + "\nFirefoxDriver cannot be resolved.");
  }
  
  public WebDriverExtension(final /* WebDriver */Object driver) {
    throw new Error("Unresolved compilation problems:"
      + "\nWebDriverWait cannot be resolved.");
  }
  
  public Object get(final String url) {
    throw new Error("Unresolved compilation problems:"
      + "\nget cannot be resolved");
  }
  
  public Object findElement(final String name) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field By is undefined for the type WebDriverExtension"
      + "\nfindElement cannot be resolved"
      + "\nname cannot be resolved");
  }
  
  public Object findElement(final /* By */Object by) {
    throw new Error("Unresolved compilation problems:"
      + "\nfindElement cannot be resolved");
  }
  
  public Object waitUntil(final /* Function<WebDriver, Boolean> */Object predicate) {
    throw new Error("Unresolved compilation problems:"
      + "\nuntil cannot be resolved");
  }
  
  /* @After
   */public void tearDown() {
    throw new Error("Unresolved compilation problems:"
      + "\nclose cannot be resolved");
  }
}
