package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.DriverInstance;
import DataGenerators.DataGenerator;
import PageDesigns.LoginPage;

public class VerifyLoginFunction extends DriverInstance{

	//@Test(dataProvider="Excel", dataProviderClass = DataGenerator.class)
	public void validateLogin(String username,String password) throws IOException{
		
		LoginPage login = new LoginPage(driver);
		login.EnterUserName(username);
		login.EnterPassword(password);
		login.clickLoginButton();
	}
	
	@Test
	public void createNewAccount() throws IOException {
		LoginPage login = new LoginPage(driver);
		login.enterFirstName("deepika");
		login.enterLastName("ved");
		login.enterEmail("ved@gmail.com");
	}
}
