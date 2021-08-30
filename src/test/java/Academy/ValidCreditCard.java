package Academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObjects.ValidCreditCardPage;
import resources.base;

public class ValidCreditCard extends base{
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
		ValidCreditCardPage lp=new  ValidCreditCardPage(driver);
		lp.clickcartlink().click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,450)");
	//	 Thread.sleep(3000);
		 lp.selectItem();
		 lp.submitBtn().click();
		// Thread.sleep(4000);
		 
		 NewCCGenerated p = new NewCCGenerated();
			String s1= p.copySelectedValue();
			System.out.println(s1);
		 lp.enterAccountNo(s1);
		 
		 String s2= p.copySelectedExp();
			   String[] parts = s2.split("/");
		        String part1 = parts[0]; 
		        String part2 = parts[1];// 004
		        System.out.println(part1);
		        lp.enterAccountMonth(part1);

		        System.out.println(part2);
		 lp.enterAccountYear(part2);
		 
		 String s4= p.copySelectedCVV();
			System.out.println(s4);
		 lp.enterAccountCVV(s4);
		 
		 lp.submitCartBtn().click();
		 
	//	Thread.sleep(7000);
		System.out.println(lp.grabpaymenttxt().getText());
		System.out.println(lp.getOrderText().getText());
	//	Thread.sleep(5000);
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	
	}
}
