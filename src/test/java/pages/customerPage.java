package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Config;
import utilities.Driver;

public class customerPage {
	
	public customerPage() {
		PageFactory.initElements(Driver.getInstance(), this);
		
	}
	@FindBy(xpath=".//*[@id='section1heading']")
	public WebElement title;
	
	@FindBy(xpath=".//*[@id='zip']")
	public WebElement zipCodeBox;
	
	@FindBy(xpath=".//*[@id='submitButton']")
	public WebElement submitButton;
	
	@FindBy(xpath=".//*[@id='firstName']")
	public WebElement firstNameBox;
	
	@FindBy(xpath=".//*[@id='lastName']")
	public WebElement lastNameBox;
	
	@FindBy(xpath=".//*[@id='street']")
	public WebElement streetAddressBox;
	
	@FindBy(xpath=".//*[@id='apt']")
	public WebElement aptNumBox;
	
	@FindBy(xpath=".//*[@id='date-monthdob']")
	public WebElement mmBox;
	
	@FindBy(xpath=".//*[@id='date-daydob']")
	public WebElement ddBox;
	
	@FindBy(xpath=".//*[@id='date-yeardob']")
	public WebElement yyyyBox;
	
	@FindBy(xpath=".//*[@id='btnSubmit']")
	public WebElement nextLink;
		
	public void open() {
		Driver.getInstance().get(Config.getProperty("url"));
	}

}
