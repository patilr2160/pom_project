package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClasses.UtilityClass1;

public class homePage extends UtilityClass1 {
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchField;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchButton;
	
	@FindBy(xpath="//div[@class='YUhWwv']")
	private WebElement addCart;
	
	@FindBy(xpath="//div[text()='Akshay']")
	private WebElement profileName;
	

	public homePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void enterSearchText()
	{
		searchField.sendKeys("iphone");
	}
	
	public void clickSearchButton()
	{
		searchButton.click();
	}
	
	public void clickOnCartButton()
	{
		addCart.click();
	}
	
	public boolean isProfileNameVisiable()
	{
		try {
			WebElement element = explicitWait(driver,profileName);
			getScreenShot(driver);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
}
