package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class loginPageSteps {
  WebDriver driver = new ChromeDriver();
 public void intializeDriver(){
   System.setProperty("webdriver.chrome.driver", "F:\\BrownBag\\tools\\chromedriver.exe");
 }
  @Given("user navigates to facebook login page")
  public void user_navigates_to_facebook_login_page() {
    driver.get("https://www.facebook.com/");
  }

  @Given("enters his {string} and {string}")
  public void enters_his_and(String string, String string2) {
    driver.findElement(By.cssSelector("#email")).sendKeys("abctest");
    driver.findElement(By.cssSelector("#pass")).sendKeys("abctest");
    driver.findElement(By.cssSelector("#loginbutton")).click();
  }

  @Then("assert validion error message")
  public void assert_validion_error_message() {
    System.out.println("I am here");
  }
}
