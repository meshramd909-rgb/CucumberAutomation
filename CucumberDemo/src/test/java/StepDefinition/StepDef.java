package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	public WebDriver driver;
	public LoginPage loginpg;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	loginpg = new LoginPage(driver);
	    
	}

	@Given("User Opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	    
	}

	@Given("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailadd, String pass) {
		loginpg.enterEmail(emailadd);
		loginpg.enterPassword(pass);
	    
	}

	@Given("Click on Login")
	public void click_on_login() {
		loginpg.clickLoginbtn();
	    
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		String actualTitle=driver.getTitle();
	
		if(actualTitle.equals(expectedTitle))
		{
		 Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	

	@When("User Click on Log Out link")
	public void user_click_on_log_out_link() {
		loginpg.clickLogout();
	    
	}

	@Then("User should be redirected to Login Page")
	public void user_should_be_redirected_to_login_page() {
	    
	}

	@Then("Close Browser")
	public void close_browser() {
		driver.close();
		driver.quit();
	    
	}


}
