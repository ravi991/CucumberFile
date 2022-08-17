package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssertionIsDisplayed {

	WebDriver driver;
    WebElement googleLogo;
    @Given("^I am on the google page \"([^\"]*)\"$")
    public void i_am_on_the_google_page(String urlString) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(urlString);
    }
    @When("^I search for Google Logo webelement$")
    public void i_search_for_Google_Logo_webelement() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        googleLogo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));
        System.out.println("find and stor the web element for the Google Logo");
    }
    @Then("^I should get webelement isDisplayed$")
    public void i_should_get_webelement_isDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(true, googleLogo.isDisplayed());
        System.out.println("Google logo is displayed – Assert passed");
    }
}
