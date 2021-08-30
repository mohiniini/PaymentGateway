package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CCBalancePage {
	WebDriver driver;

	By balancelink=By.xpath("//*[@id=\"nav\"]/a[3]");
	By accno1=By.id("card_nmuber");
	By submit=By.name("submit");
	By txt = By.xpath("//*[@id=\"three\"]/div/font[2]");
	By label = By.id("message1");
	
	@FindBy(how = How.NAME, using = "card_nmuber")
	@CacheLookup
	WebElement txtCustomerId;
	public WebElement clickbalancelink()
	{
		return driver.findElement(balancelink);
	}
	
	public void enterAccountNo(String accnumber)
	{
		
		 driver.findElement(accno1).sendKeys(accnumber);
	}
	
	public WebElement enterAccountNo1()
	{
		
		return driver.findElement(accno1);
	}
	
	public WebElement clickButton()
	{
		return driver.findElement(submit);
	}
	
	public WebElement grabtxt()
	{
		return driver.findElement(txt);
	}
	
	public WebElement grabvalidationtxt()
	{
		return driver.findElement(label);
	}
	
	public CCBalancePage(WebDriver driver) {
		 this.driver=driver;
	}


	
}
