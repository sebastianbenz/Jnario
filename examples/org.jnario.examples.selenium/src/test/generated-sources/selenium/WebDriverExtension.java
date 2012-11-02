package selenium;

import com.google.common.base.Function;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.junit.AfterClass;
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
    this(new Function0<FirefoxDriver>() {
      public FirefoxDriver apply() {
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
  
  public WebElement findElement(final By arg) {
    WebElement _findElement = this.driver.findElement(arg);
    return _findElement;
  }
  
  public Boolean waitUntil(final Function<WebDriver,Boolean> predicate) {
    Boolean _until = this.wait.<Boolean>until(predicate);
    return _until;
  }
  
  @AfterClass
  public void tearDown() {
    this.driver.close();
  }
}
