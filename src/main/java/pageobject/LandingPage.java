package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	//this driver dont hv scope
	
	
	
	public WebDriver driver;
	
	
	
	private By account=By.xpath("//span[contains(text(),'My Account')]");
	
	private By login=By.xpath("//a[contains(text(),'Login')]");
	
	
	
	
	
	public LandingPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver2;
	}

	public WebElement accountbutton() {
		return driver.findElement(account);
	}

	public WebElement loginbutton() {
		return driver.findElement(login);
	}
	

}
