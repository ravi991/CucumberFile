package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MultiSteps {

	ChromeDriver driver;
    @Given("^user is on Google home page \"([^\"]*)\"$")
    public void user_is_on_Google_home_page(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(arg1);
        System.out.println(arg1 + "\t is the site");
    }
    @Then("^user enters keyword \"([^\"]*)\"$")
    public void user_enters_keyword(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("q")).sendKeys(arg1);
        System.out.println(arg1 + "\t is the keyword");
    }
    @Then("^user submits the page$")
    public void user_submits_the_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("btnK")).submit();
        System.out.println("\t submit here");
    }
    @Then("^user waits for (\\d+) seconds for google$")
    public void user_waits_for_seconds_for_google(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(arg1 * 1000);
        System.out.println("wait of 5 secs");
        driver.close();
    }
    @Given("^user is on GitHub home page \"([^\"]*)\"$")
    public void user_is_on_GitHub_home_page(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(arg1);
        System.out.println(arg1 + "\t is the site");
    }
    @Then("^user waits for (\\d+) seconds for github$")
    public void user_waits_for_seconds_for_github(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(arg1 * 1000);
        System.out.println("wait of 5 secs");
        driver.close();
    }
    @Given("^user is on Twitter home page \"([^\"]*)\"$")
    public void user_is_on_Twitter_home_page(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(arg1);
        System.out.println(arg1 + "\t is the site");
    }
    @Given("^user waits for (\\d+) seconds for twitter$")
    public void user_waits_for_seconds_for_twitter(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(arg1 * 1000);
        System.out.println("wait of 5 secs");
        driver.close();
    }
}
