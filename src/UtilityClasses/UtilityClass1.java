package UtilityClasses;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityClass1 {
	
	public static void getScreenShot (WebDriver driver) throws IOException
	{
		Date date = new Date();
		SimpleDateFormat f = new SimpleDateFormat("YYYY-MM-dd-hh-mm-ss");
		String currentDate = f.format(date);
	    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest = new File("D:\\Softwear Testing\\Selenium Screenshots\\image "+currentDate+" .jpg");
	    FileHandler.copy(source, dest);
       
	}

	public static WebElement explicitWait(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(5));
		WebElement element01 = wait.until(ExpectedConditions.visibilityOf(element));
		return element01;
	}

	
}
