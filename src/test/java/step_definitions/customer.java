package step_definitions;


import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.customerPage;
import utilities.Config;
import utilities.Driver;


public class customer {
	
	customerPage homePage= new customerPage();
	WebDriver driver = Driver.getInstance();
	JavascriptExecutor jse;
	

	
	@Given("^The user is on the main page$")
	public void the_user_is_on_the_main_page() throws Throwable {
	homePage.open();
	Thread.sleep(1000);
	
	    
	}

	@When("^The user verifies the title and the url$")
	public void the_user_verifies_the_title_and_the_url() throws Throwable {
	     String actualUrl = driver.getCurrentUrl();
	     String expectedUrl= Config.getProperty("url");
	    if(actualUrl.equals(expectedUrl)) {
	    	 System.out.println("Url matches");
	    }else {
	    	 System.out.println("No match");
	     }
	     
	     String actualTitle = homePage.title.getText();
	     String expectedTitle= Config.getProperty("title");
	     
	     Assert.assertEquals(expectedTitle, actualTitle);
	    
	}

	@When("^The user enters the zip code$")
	public void the_user_enters_the_zip_code() throws Throwable {
		Thread.sleep(2000);
		homePage.zipCodeBox.sendKeys(Config.getProperty("zip"));
	    Thread.sleep(1000);
	}

	@When("^The user clicks on start quote button$")
	public void the_user_clicks_on_start_quote_button() throws Throwable {
	    homePage.submitButton.click();
	    
	}

	@When("^The user enters first name$")
	public void the_user_enters_first_name() throws Throwable {
	  Thread.sleep(2000);
		homePage.firstNameBox.sendKeys(Config.getProperty("name"));
	    
	}

	@When("^The user enters last name$")
	public void the_user_enters_last_name() throws Throwable {
		homePage.lastNameBox.sendKeys(Config.getProperty("lastname"));
	    
	    
	}

	@When("^The user enters street address$")
	public void the_user_enters_street_address() throws Throwable {
	    
	    homePage.streetAddressBox.sendKeys(Config.getProperty("address"));
	}

	@When("^The user enters apt number$")
	public void the_user_enters_apt_number() throws Throwable {
		jse=(JavascriptExecutor)driver;
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0, 570)");
		Thread.sleep(1000);
		homePage.aptNumBox.sendKeys(Config.getProperty("apt"));
		
	    
	}

	@When("^The user fills date of birth boxes$")
	public void the_user_fills_date_of_birth_boxes() throws Throwable {
	    homePage.mmBox.sendKeys(Config.getProperty("mm"));
	    homePage.ddBox.sendKeys(Config.getProperty("dd"));
	    homePage.yyyyBox.sendKeys(Config.getProperty("yyyy"));
	    
	}

	@Then("^The user cliks next$")
	public void the_user_cliks_next() throws Throwable {
	    homePage.nextLink.click();
	    
	}



}
