package step_definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.vehiclePage;
import utilities.Driver;

public class vehicle {
	
	
	vehiclePage homePage = new vehiclePage();
	WebDriver driver = Driver.getInstance();
	JavascriptExecutor jse;
	
	
	@Given("^The user is on the Add vehicle page$")
	public void the_user_is_on_the_Add_vehicle_page() throws Throwable {
	  Thread.sleep(1000);
		String actualTitle = homePage.title.getText();
		String expectedTitle = "Your Info";
		Assert.assertEquals(expectedTitle, actualTitle);
	    
	}

	@When("^the user selects a year$")
	public void the_user_selects_a_year() throws Throwable {
		Thread.sleep(2000);
		Select yearSelect = new Select(homePage.yearList);
		
		for(int i = 1; i<41; i++) {
		yearSelect.selectByIndex(i);
		}
		yearSelect.selectByIndex(5);
	}

	@When("^the user selects make$")
	public void the_user_selects_make() throws Throwable {
	   Thread.sleep(2000);
	   Select makeSelect = new Select(homePage.makeList);
	   
	   for (int i=1; i<43; i++) {
		   makeSelect.selectByIndex(i);
	   }
	   makeSelect.selectByValue("AUDI");
	    
	}

	@When("^the user selects model$")
	public void the_user_selects_model() throws Throwable {
	    Thread.sleep(2000);
		for (int i =1; i<105; i++) {
			driver.findElement(By.xpath("//*[@id=\"vehicleModel\"]/option["+i+"]")).click();
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"vehicleModel\"]/option[16]")).click();
		
	}

	@When("^the user selects ofl$")
	public void the_user_selects_ofl() throws Throwable {
	    Thread.sleep(2000);
	    
	    for(int i =3; i>0; i--) {
	    	driver.findElement(By.xpath(".//*[@id='vehicleForm']/div[1]/div[1]/div[16]/div/div[2]/div/div[1]/div["+i+"]/label")).click();
	    	Thread.sleep(300);
	    } 
	    Thread.sleep(500);
	    
	}

	@When("^the user selects primary use$")
	public void the_user_selects_primary_use() throws Throwable {
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 600)");
		Thread.sleep(1000);
		
		for(int i = 1; i<4; i++) {
			driver.findElement(By.xpath(".//*[@id='vehicleForm']/div[1]/div[1]/div[17]/div[3]/div/div[2]/div/div[1]/div["+i+"]/label")).click();
			Thread.sleep(300);
		}
	    
	}

	@When("^the user selects how$")
	public void the_user_selects_how() throws Throwable {
		Select howSelect = new Select(homePage.howList);
		Thread.sleep(2000);
		for (int i =0; i<24; i++) {
			howSelect.selectByIndex(i);
		}
		
		
	    
	    
	}

	@When("^the user selects milage$")
	public void the_user_selects_milage() throws Throwable {
	    Thread.sleep(1000);
		Select milageSelect = new Select(homePage.milageList);
	    for(int i=0; i<30; i++) {
	    	milageSelect.selectByIndex(i);
	    
	    }
	    
	}

	@Then("^the user clicks no$")
	public void the_user_clicks_no() throws Throwable {
		Thread.sleep(2500);
		homePage.noButton.click();
	    
	    
	}

}
