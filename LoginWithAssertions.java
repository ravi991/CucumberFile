package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithAssertions {

	ChromeDriver driver;
	@Given("^I am on the demo website \"([^\"]*)\"$")
	public void i_am_on_the_demo_website(String arg1) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(arg1);
	}
	 @When("^I type login = \"([^\"]*)\" and password = \"([^\"]*)\"$")
	public void i_type_login_and_password(String arg1, String arg2) throws Throwable {
	WebElement username = driver.findElement(By.name("Email"));
	WebElement password = driver.findElement(By.name("Password"));
	username.clear();
	username.sendKeys(arg1);
	password.clear();
	password.sendKeys(arg2);
	}
	@When("^I click sign-in button$")
	public void i_click_sign_in_button() throws Throwable {
	WebElement submitBtn = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
	submitBtn.click();
	}
	@Then("^I should get \"([^\"]*)\" text$")
	public void i_should_get_text(String arg1) throws Throwable {
	String actualValue=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
	assertEquals(actualValue,arg1);
	}
}
