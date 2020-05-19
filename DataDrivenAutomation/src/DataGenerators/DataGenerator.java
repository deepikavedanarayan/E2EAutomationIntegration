package DataGenerators;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataGenerator {
	@DataProvider(name="Excel")
	public static  Object[][] testDataGenerator() throws IOException {
		
		FileInputStream file = new FileInputStream("./Data/DataProvider.xlsx");
		XSSFWorkbook myBook = new XSSFWorkbook(file);
		XSSFSheet mySheet = myBook.getSheet("Login");
		int noOfRow = mySheet.getPhysicalNumberOfRows(); 
		int column = mySheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[noOfRow][column];
		//return data;
		for(int i =0 ; i<noOfRow;i++) {
			XSSFRow row = mySheet.getRow(i);
			int noOfCells= row.getPhysicalNumberOfCells();
		   // data = new Object[noOfRow][noOfCells];
			for(int j=0;j<noOfCells-1;j++) {
				XSSFCell userNamecell = row.getCell(j);
				XSSFCell passwordcell = row.getCell(j+1);
				data[i][j] = userNamecell.getStringCellValue();
				System.out.println(userNamecell.getStringCellValue());
				data[i][j+1]=passwordcell.getStringCellValue();
				System.out.println(passwordcell.getStringCellValue());
			}
			
		}
		return data;	
	}
}
