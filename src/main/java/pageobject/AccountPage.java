package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {

	public WebDriver driver;
	
	private By accountc=By.linkText("Account");
	
	private By search=By.xpath("//input[@placeholder='Search']");
    
	private By searchclick=By.xpath("//i[@class='fa fa-search']");
	
	private By addtc=By.xpath("(//button[@type='button'])[9]");
	
	private By price1=By.xpath("//p[@class='price']");
	
	private By cart=By.xpath("(//button[@data-toggle='dropdown'])[2]");
	
	private By viewcart=By.xpath("(//i[@class='fa fa-shopping-cart'])[3]");
	
	
	public AccountPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}




	public WebElement accountopt() {
		return driver.findElement(accountc);
	}
	
	public WebElement search() {
		return driver.findElement(search);
	}
	
	public WebElement searchclick() {
		return driver.findElement(searchclick);
	}
	
	
	public WebElement addtc() {
		return driver.findElement(addtc);
	}
	
	
	public WebElement cart() {
		return driver.findElement(cart);
	}
	
	
	public WebElement viewcart() {
		return driver.findElement(viewcart);
	}
	
	
	
	public WebElement price1() {
		return driver.findElement(price1);
	}
	
}
