package Academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.CCBalancePage;
import PageObjects.NewCCGeneratedPage;
import resources.base;

public class CCBalance extends base{
	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException
	{
		 driver =initializeDriver();
	}
	
	@Test
	public void basePageNavigation() throws IOException, InterruptedException
	{
		 driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
		CCBalancePage lp=new  CCBalancePage(driver);
		lp.clickbalancelink().click();
		lp.enterAccountNo1().sendKeys("hjklmv");
		String s=lp.grabvalidationtxt().getText();
		System.out.println(s);
		lp.enterAccountNo1().clear();
	//	Thread.sleep(4000);
	
		
		NewCCGenerated p = new NewCCGenerated();
		String s1= p.copySelectedValue();
		System.out.println(s1);
		lp.enterAccountNo(s1);
	//	Thread.sleep(4000);
		lp.clickButton().click();
		String text=lp.grabtxt().getText();
		System.out.println(text);
	//	Thread.sleep(5000);
		
		

		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	
	}
}
