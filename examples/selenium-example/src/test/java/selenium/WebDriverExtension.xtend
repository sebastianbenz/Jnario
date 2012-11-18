package selenium

import com.google.common.base.Function
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.Wait
import org.openqa.selenium.support.ui.WebDriverWait
import org.openqa.selenium.firefox.FirefoxDriver
import org.junit.After

class WebDriverExtension  {
	
    WebDriver driver
    Wait<WebDriver> wait
    
    new(){
    	this(new FirefoxDriver)
    }
	
    new(WebDriver driver){
    	this.driver = driver
    	wait = new WebDriverWait(driver, 30)
    }
    
    def get(String url){
      driver.get(url)
    }

    def findElement(By arg){
      driver.findElement(arg)
    }
    
    def waitUntil(Function<WebDriver, Boolean> predicate){
      wait.until(predicate)
    }

    @After
    def void tearDown(){
       driver.close()
    }

}