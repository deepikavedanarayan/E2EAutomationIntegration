package Base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import AutomationUtility.Utility;

public class DriverInstance {
   public WebDriver driver;
   
   @BeforeMethod
	public void inititaeDriverInstance() throws IOException {
		
		if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers_Exe/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers_Exe/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "./Drivers_Exe/geckodriver.exe");
			driver = new InternetExplorerDriver();
		}
		else {
			System.setProperty("webdriver.chrome.driver", "./Drivers_Exe/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(Utility.fetchPropertyValue("applicationURL").toString());
	}
	@AfterMethod
	public void closeDriverInstance() {
		driver.quit();
	}
}
