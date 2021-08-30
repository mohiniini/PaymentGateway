package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewCCGeneratedPage {
	By grabText=By.xpath("//*[@id=\"three\"]/div/h4[1]");
	By grabText1=By.xpath("//*[@id=\"three\"]/div/h4[2]");
	By grabText2=By.xpath("//*[@id=\"three\"]/div/h4[3]");
	By grabText3=By.xpath("//*[@id=\"three\"]/div/h4[4]");
	
	
	WebDriver driver;
	String txtdriver;
	public NewCCGeneratedPage(WebDriver driver) {
		 this.driver=driver;
	}


	public WebElement grabTextAccount()
	{
		return driver.findElement(grabText);
	}
	
	
	public WebElement grabTextCVV()
	{
		return driver.findElement(grabText1);
	}
	public WebElement grabTextExp()
	{
		return driver.findElement(grabText2);
	}
	public WebElement grabTextCL()
	{
		return driver.findElement(grabText3);
	}


	
}
