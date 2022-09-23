package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobject.AccountPage;
import pageobject.LandingPage;
import pageobject.Loginpage;
import pageobject.ShoppingCart;
import resources.Base;

public class mainTest extends Base {

	@Test
	public void login() throws IOException {
		
		
		
		LandingPage lp =new LandingPage(driver);
		
		lp.accountbutton().click();
		lp.loginbutton().click();
		
		
		
		Loginpage lp1=new Loginpage(driver);
		lp1.email().sendKeys(prop.getProperty("email"));
		lp1.password().sendKeys(prop.getProperty("passw"));
		lp1.loginclick().click();
		
		
		
		AccountPage ap=new AccountPage(driver);
		Assert.assertTrue(ap.accountopt().isDisplayed());
	
		ap.search().sendKeys("iphone");
	
		ap.searchclick().click();
		
		
		
         String temp=ap.price1().getText();
        
        String words[]=temp.split(" ");
        
        System.out.println(words[0]);
        
        String temp2= words[0];
        
        String iphoneProductPrice= temp2.replaceAll("[^\\d.]", "");
        
        String iphoneprice = "$"+iphoneProductPrice;
        
        System.out.println("product price is "+iphoneprice);
      
		
		ap.addtc().click();
		
		ap.cart().click();
		
		ap.viewcart().click();
		
		
		ShoppingCart sc=new ShoppingCart(driver);
		String TotalPrice = sc.price().getText();
		
		System.out.println("end price is "+TotalPrice);
		
		Assert.assertEquals(iphoneprice, TotalPrice);
	
		}
	
	
	
	
}
