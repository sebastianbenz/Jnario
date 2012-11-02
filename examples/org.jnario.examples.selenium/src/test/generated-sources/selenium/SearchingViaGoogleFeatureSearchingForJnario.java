package selenium;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.hamcrest.StringDescription;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.runner.Extension;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import selenium.WebDriverExtension;

@RunWith(FeatureRunner.class)
@Named("Scenario: Searching for Jnario")
@SuppressWarnings("all")
public class SearchingViaGoogleFeatureSearchingForJnario {
  @Test
  @Order(0)
  @Named("Given I opened \\\"http://www.google.com\\\"")
  public void givenIOpenedHttpWwwGoogleCom() {
    StepArguments _stepArguments = new StepArguments("http://www.google.com");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    SearchingViaGoogleFeatureSearchingForJnario._webDriverExtension.get(_first);
  }
  
  @Test
  @Order(1)
  @Named("When I search for \\\"Jnario\\\"")
  public void whenISearchForJnario() {
    StepArguments _stepArguments = new StepArguments("Jnario");
    final StepArguments args = _stepArguments;
    By _name = By.name("q");
    WebElement _findElement = SearchingViaGoogleFeatureSearchingForJnario._webDriverExtension.findElement(_name);
    String _first = JnarioIterableExtensions.<String>first(args);
    String _plus = (_first + "\n");
    _findElement.sendKeys(_plus);
    By _name_1 = By.name("btnG");
    WebElement _findElement_1 = SearchingViaGoogleFeatureSearchingForJnario._webDriverExtension.findElement(_name_1);
    _findElement_1.click();
  }
  
  @Test
  @Order(2)
  @Named("Then the result should contain \\\"Jnario - Executable Specifications for Java\\\"")
  public void thenTheResultShouldContainJnarioExecutableSpecificationsForJava() {
    StepArguments _stepArguments = new StepArguments("Jnario - Executable Specifications for Java");
    final StepArguments args = _stepArguments;
    final Function1<WebDriver,Boolean> _function = new Function1<WebDriver,Boolean>() {
        public Boolean apply(final WebDriver it) {
          By _id = By.id("resultStats");
          WebElement _findElement = it.findElement(_id);
          boolean _notEquals = (!Objects.equal(_findElement, null));
          return Boolean.valueOf(_notEquals);
        }
      };
    SearchingViaGoogleFeatureSearchingForJnario._webDriverExtension.waitUntil(new Function<WebDriver,Boolean>() {
        public Boolean apply(WebDriver arg0) {
          return _function.apply(arg0);
        }
    });
    By _tagName = By.tagName("body");
    WebElement _findElement = SearchingViaGoogleFeatureSearchingForJnario._webDriverExtension.findElement(_tagName);
    String _text = _findElement.getText();
    String _first = JnarioIterableExtensions.<String>first(args);
    boolean _should_contain = Should.should_contain(_text, _first);
    Assert.assertTrue("\nExpected findElement(By::tagName(\"body\")).getText() should contain args.first but"
     + "\n     findElement(By::tagName(\"body\")).getText() is " + new StringDescription().appendValue(_text).toString()
     + "\n     findElement(By::tagName(\"body\")) is " + new StringDescription().appendValue(_findElement).toString()
     + "\n      is " + new StringDescription().appendValue(SearchingViaGoogleFeatureSearchingForJnario._webDriverExtension).toString()
     + "\n     By::tagName(\"body\") is " + new StringDescription().appendValue(_tagName).toString()
     + "\n     args.first is " + new StringDescription().appendValue(_first).toString()
     + "\n     args is " + new StringDescription().appendValue(args).toString() + "\n", _should_contain);
    
  }
  
  @Extension
  public static WebDriverExtension _webDriverExtension = new Function0<WebDriverExtension>() {
    public WebDriverExtension apply() {
      WebDriverExtension _webDriverExtension = new WebDriverExtension();
      return _webDriverExtension;
    }
  }.apply();
}
