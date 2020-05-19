package Assertions;

import org.openqa.selenium.WebDriver;

public class CompareState {
	 
	public static boolean verifyPageURL(WebDriver driver,String expectedURL) {
		if(driver.getCurrentUrl().equals(expectedURL)) {
			return true;
		}
		return false;
	}
	public static boolean verifyPageTitle(WebDriver driver,String expectedTitle) {
		if(driver.getCurrentUrl().equals(expectedTitle)) {
			return true;
		}
		return false;
	}

}
