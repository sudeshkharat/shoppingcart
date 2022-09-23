package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public WebDriver driver;
	
	public Properties prop;
	
	
	public WebDriver initializeDriver() throws IOException {
		
		
	    prop = new Properties();
		
		String proppath = System.getProperty("user.dir")+("\\src\\main\\java\\resources\\data.properties");				
		
		FileInputStream inStream = new  FileInputStream(proppath);
		
		prop.load(inStream);
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver();
			driver=new FirefoxDriver();
			}
		
		else if(browsername.equalsIgnoreCase("IE")) {
				WebDriverManager.iedriver();
				driver=new InternetExplorerDriver();
				}
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		return driver;
	}
	
	@AfterTest
	public void closure() {
		driver.quit();
	}
	
	@BeforeMethod
	public void openApp() throws IOException {
		initializeDriver();
		
		driver.get(prop.getProperty("url"));
		
	}
	
}
