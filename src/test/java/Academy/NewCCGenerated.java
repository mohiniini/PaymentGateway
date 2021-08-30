package Academy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.NewCCGeneratedPage;
import resources.base;

public class NewCCGenerated extends base{
	public WebDriver driver;
	public static String selectedAccountNo="";
	public static String selectedAccountCVV="";
	public static String selectedAccountExp="";
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
		 NewCCGeneratedPage lp=new  NewCCGeneratedPage(driver);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,450)");
		 Thread.sleep(5000);
		String s= lp.grabTextAccount().getText();
		s=s.replaceAll("[^0-9]", "");
		System.out.println(s);
		selectedAccountNo=s;
		
		String s1= lp.grabTextCVV().getText();
		s1=s1.replaceAll("[^0-9]", "");
		selectedAccountCVV=s1;
		System.out.println(s1);
		
		String s2= lp.grabTextExp().getText();
		  s2=s2.replaceAll("[^0-9/]", "");
		  selectedAccountExp=s2;
		System.out.println(s2);
		
		String s3= lp.grabTextCL().getText();
		 s3=s3.replaceAll("[^0-9$.]", "");
		System.out.println(s3);
		
	}
	
	public String copySelectedValue()
	{
		return selectedAccountNo;
	}
	
	public String copySelectedCVV()
	{
		return selectedAccountCVV;
	}
	
	public String copySelectedExp()
	{
		return selectedAccountExp;
	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	
	}
}
