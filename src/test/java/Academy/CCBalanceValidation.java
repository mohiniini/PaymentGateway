package Academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObjects.CCBalanceValidationPage;
import resources.base;

public class CCBalanceValidation extends base {
WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException
	{
		 driver =initializeDriver();
	}
	
	@Test
	public void basePageNavigation() throws IOException
	{
		 driver.get(prop.getProperty("url"));
		 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
		CCBalanceValidationPage lp=new  CCBalanceValidationPage(driver);
			lp.clickbalancelink().click();
			lp.enterAccountNo().sendKeys("40685");
			lp.clickButton().click();
		//	Thread.sleep(2000);      
			Alert alert = driver.switchTo().alert();		   		
	        String alertMessage= driver.switchTo().alert().getText();				
	        System.out.println(alertMessage);
	        driver.switchTo().alert().accept();
	    //    Thread.sleep(5000);
		
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	
	}
}
