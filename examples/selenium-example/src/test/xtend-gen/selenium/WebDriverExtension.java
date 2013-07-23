package selenium;

import com.google.common.base.Function;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("all")
public class WebDriverExtension {
  private WebDriver driver;
  
  private Wait<WebDriver> wait;
  
  public WebDriverExtension() {
    this(new Function0<WebDriver>() {
      public WebDriver apply() {
        FirefoxDriver _firefoxDriver = new FirefoxDriver();
        return _firefoxDriver;
      }
    }.apply());
  }
  
  public WebDriverExtension(final WebDriver driver) {
    this.driver = driver;
    WebDriverWait _webDriverWait = new WebDriverWait(driver, 30);
    this.wait = _webDriverWait;
  }
  
  public void get(final String url) {
    this.driver.get(url);
  }
  
  public WebElement findElement(final String name) {
    By _name = By.name(name);
    WebElement _findElement = this.driver.findElement(_name);
    return _findElement;
  }
  
  public WebElement findElement(final By by) {
    WebElement _findElement = this.driver.findElement(by);
    return _findElement;
  }
  
  public Boolean waitUntil(final Function<WebDriver,Boolean> predicate) {
    Boolean _until = this.wait.<Boolean>until(predicate);
    return _until;
  }
  
  @After
  public void tearDown() {
    this.driver.close();
  }
}
