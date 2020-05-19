package PageDesigns;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AutomationUtility.Utility;

public class LoginPage {
	 
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public void EnterUserName(String username) throws IOException {
	 /*driver.findElement(By.id("email")).sendKeys(username); 
		instead of this write the code as below to help in reuse and maintainence*/
		
	  driver.findElement(By.id(Utility.fetchWebElementLocators("login_username_id"))).sendKeys(username);
	}
    public void EnterPassword(String password) throws IOException {
		driver.findElement(By.id(Utility.fetchWebElementLocators("login_password_id"))).sendKeys(password);
	}
    public void clickLoginButton() throws IOException {
    	driver.findElement(By.xpath(Utility.fetchWebElementLocators("signin_xpath"))).click();
    }
    
   public void enterFirstName(String firstName) throws IOException {
	   driver.findElement(By.xpath(Utility.fetchWebElementLocators("register_firstname_xpath"))).sendKeys(firstName);
   }
   public void enterLastName(String lastName) throws IOException {
	   driver.findElement(By.xpath(Utility.fetchWebElementLocators("resgister_lastname_xpath"))).sendKeys(lastName);
   }
   public void enterEmail(String email) throws IOException {
	 driver.findElement(By.xpath(Utility.fetchWebElementLocators("register_email_xpath"))).sendKeys(email);	   
	   
   }

}
