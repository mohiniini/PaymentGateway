package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ValidCreditCardPage {
	WebDriver ldriver;
	By cart=By.linkText("Cart");
	By accnumberr =By.id("card_nmuber");
	By monthtxt =By.id("month");
	By yeartxt =By.id("year");
	By cvv_codetxt =By.id("cvv_code");
	By paymentsuccess=By.xpath("//*[@id=\"three\"]/div/div/h2");
	By submit = By.xpath("//*[@id=\"three\"]/div/form/div/div[8]/ul/li/input");
	By orderid = By.xpath("//*[@id=\"three\"]/div/div/table/tbody/tr[1]/td[2]/h3/strong");
	
	By submitcart =By.name("submit");
	public ValidCreditCardPage(WebDriver rdriver) {
		 this.ldriver=rdriver;
	}

	public WebElement clickcartlink()
	{
		return ldriver.findElement(cart);
	}
	
	public  void selectItem()
	{
		Select s = new Select(ldriver.findElement(By.name("quantity")));
		s.selectByValue("1");
	}
	
	public WebElement submitBtn()
	{
		return ldriver.findElement(submit);
	}
	
	public void enterAccountNo(String accnumber)
	{
		
		 ldriver.findElement(accnumberr).sendKeys(accnumber);
	}
	
	
	public void enterAccountMonth(String accnumber1)
	{
		
		 ldriver.findElement(monthtxt).sendKeys(accnumber1);
	}
	
	
	public void enterAccountYear(String accnumber2)
	{
		
		 ldriver.findElement(yeartxt).sendKeys(accnumber2);
	}
	
	
	public void enterAccountCVV(String accnumber3)
	{
		
		 ldriver.findElement(cvv_codetxt).sendKeys(accnumber3);
	}
	
	public WebElement submitCartBtn()
	{
		return ldriver.findElement(submitcart);
	}
	
	public WebElement grabpaymenttxt()
	{
		return ldriver.findElement(paymentsuccess);
	}
	
	public WebElement getOrderText()
	{
		return ldriver.findElement(orderid);
	}
}
