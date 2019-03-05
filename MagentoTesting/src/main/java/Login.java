

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	WebDriver driver;
	public Login(WebDriver driver) 
	{
		this.driver=driver;
	}
	By email=By.id("email");
	By pwd=By.id("pass");
	By login=By.id("send2");
	public void typeEmail(String un) 
	{
		driver.findElement(email).sendKeys(un);
	}
	public void typePassword(String password)
	{
		driver.findElement(pwd).sendKeys(password);
	}
	
	public void clickOnLogin() 
	{
		driver.findElement(login).click();
	}
	
	
	



}
