package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SearchClass {
	ChromeDriver browserObject;
	@Given("I am on google page {string}")
	public void i_am_on_google_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
op.addArguments("--remote-allow-origins=*");
        browserObject = new ChromeDriver(op);
        browserObject.get(string);
	}

	@When("I search = {string}")
	public void i_search(String string) {
	    // Write code here that turns the phrase above into concrete actions
		browserObject.findElement(By.name("q")).sendKeys(string);
	    
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		 browserObject.findElement(By.name("btnK")).submit();
	   
	}

}
