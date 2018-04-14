package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class vehiclePage {
	
	public vehiclePage() {
		
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(xpath=".//*[@id='wrapper']/div[2]/div/section/div/div/div[1]/div/div[1]/h2")
	public WebElement title;
	
	@FindBy(xpath="//*[@id=\"vehicleYear\"]")
	public WebElement yearList;
	
	@FindBy(xpath="//*[@id=\"vehicleMake\"]")
	public WebElement makeList;
	
	@FindBy(xpath= "//*[@id=\"typeOfBusinessUse\"]")
	public WebElement howList;
	
	@FindBy(xpath="//*[@id=\"annualMileage\"]")
	public WebElement milageList;
	
	@FindBy(xpath ="//*[@id=\"btnSubmit\"]")
	public WebElement noButton;

}
