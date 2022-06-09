package testClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import BaseClasses.BaseClass1;
import pom_classes.cartPage;
import pom_classes.homePage;
import pom_classes.loginPage;

public class testClass1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = BaseClass1.getDriver("chrome");
		
		loginPage lp = new loginPage(driver);
		lp.putemail();
		lp.putPassword();
		lp.hitButton();
		
		Thread.sleep(3000);
		
		homePage hp = new homePage(driver);
		
		if(hp.isProfileNameVisiable())
		{
			System.out.println("Logged in");
		}
		else
		{
			System.out.println("not logged in");
		}
		
		hp.enterSearchText();
		hp.clickSearchButton();
		hp.clickOnCartButton();
		
		Thread.sleep(3000);
		
		cartPage cp = new cartPage(driver);
		cp.loginButtonAvailable();
	}

}

