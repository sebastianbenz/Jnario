package selenium

import com.google.common.base.Function
import org.junit.AfterClass
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.support.ui.Wait
import org.openqa.selenium.support.ui.WebDriverWait

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

    @AfterClass
    def void tearDown(){
       driver.close()
    }

}