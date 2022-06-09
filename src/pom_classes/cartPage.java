package pom_classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilityClasses.UtilityClass1;

public class cartPage extends UtilityClass1 {

	WebDriver driver;
	
	
	@FindBy(xpath="//button[@class='_2KpZ6l _1sbqEe _3AWRsL']")
	private WebElement cartLoginButton;
	
	
	public cartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void loginButtonAvailable () throws IOException
	{
		try
		{
			cartLoginButton.click();
			System.out.println("You are not logged in");
		}catch(Exception e)
		{
			System.out.println("Items in cart");
		}
		UtilityClass1.getScreenShot(driver);
		
	}
	
}
