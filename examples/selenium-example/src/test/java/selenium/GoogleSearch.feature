package selenium

import org.openqa.selenium.By
 
Feature: Searching via Google

  Scenario: Searching for Jnario
    extension WebDriverExtension = new WebDriverExtension
   
	Given I opened "http://www.google.com"
          get(args.first)
    When I search for "Jnario"
          findElement(By::name("q")).sendKeys(args.first + "\n")
      findElement(By::name("btnG")).click()
    Then the result should contain "Jnario - Executable Specifications for Java"
           waitUntil[findElement(By::id("resultStats")) != null]
      findElement(By::tagName("body")).getText() should contain args.first

  Scenario: Searching for Xtend
  	
  	Given I opened "http://www.google.com"
  	When I search for "Xtend Lang"
  	Then the result should contain "Xtend - Modernized Java"

  	  