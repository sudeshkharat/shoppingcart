package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart {

	public WebDriver driver;
	
	
	private By TotalPrice=By.xpath("(//td[text()='$123.20'])[5]");
	
	public ShoppingCart(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public WebElement price() {
		return driver.findElement(TotalPrice);
	}
	
}
