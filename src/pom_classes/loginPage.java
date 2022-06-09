package pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement loginButton;
	
//	private By email = By.xpath("(//input[@type='text'])[2]");
//	private By password = By.xpath("//input[@type='password']");
//	private By loginButton = By.xpath("(//button[@type='submit'])[2]");
	
	
	public loginPage(WebDriver driver) //constructor
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void putemail()
	{
		email.sendKeys("akshaynarhare1541@gmail.com");
		//driver.findElement(email).sendKeys("akshaynarhare1541@gmail.com");
	}
	
	public void putPassword()
	{
		password.sendKeys("Akshay123");
		//driver.findElement(password).sendKeys("Akshay123");
	}
	
	public void hitButton()
	{
		loginButton.click();
		//driver.findElement(loginButton).click();
	}
}
