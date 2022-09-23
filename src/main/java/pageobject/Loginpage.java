package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	public WebDriver driver;
	
	
	
	private By email = By.xpath("//input[@id='input-email']");

	private By password = By.xpath("//input[@id='input-password']");

	private By loginclick = By.xpath("//input[@value='Login']");

	
	public Loginpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
	public WebElement email() {
		return driver.findElement(email);
	}
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement loginclick() {
		return driver.findElement(loginclick);
	}
	
	
	
}
