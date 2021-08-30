package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CCBalanceValidationPage {

	WebDriver ldriver;
	By balancelink=By.xpath("//*[@id=\"nav\"]/a[3]");
	By accnumber=By.id("card_nmuber");
	By submit=By.name("submit");
	public CCBalanceValidationPage(WebDriver rdriver) {
		 this.ldriver=rdriver;
	}

	public WebElement clickbalancelink()
	{
		return ldriver.findElement(balancelink);
	}
	public WebElement enterAccountNo()
	{
		return ldriver.findElement(accnumber);
	}
	
	public WebElement clickButton()
	{
		return ldriver.findElement(submit);
	}
}
