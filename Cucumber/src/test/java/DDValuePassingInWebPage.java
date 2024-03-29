import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
 

public class DDValuePassingInWebPage {
	
	public static String passValueOnToWebpage(int userID) throws Throwable {
	
	File xl=new File("C:\\Users\\Gautham\\Desktop\\ddf.xlsx");
	
	FileInputStream fin=new FileInputStream(xl);	
	Workbook wb=new XSSFWorkbook(fin);	
	Sheet sheetAt = wb.getSheetAt(0);
	
	String value=null;
	
	for (int i = 0; i < sheetAt.getPhysicalNumberOfRows() ; i++) {
		Cell cell = sheetAt.getRow(i).getCell(0);
		CellType cellType = cell.getCellType();
		if(cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}else if(cellType.equals(cellType.NUMERIC)) {
		double cellValue = cell.getNumericCellValue();
		long l=(long) cellValue;
if(l==userID) {	
	Cell cell2 = sheetAt.getRow(i).getCell(1);
	String un = cell2.getStringCellValue();
	Cell cell3 = sheetAt.getRow(i).getCell(2);
	String pw = cell3.getStringCellValue();


	System.out.println(un + pw);
	value= un+"="+pw;
	
}
	}
	}
	return value;
	
	}
	

public static void main(String[] args) throws Throwable {
	String passValueOnToWebpage = passValueOnToWebpage(1);
	String[] split = passValueOnToWebpage.split("=");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gautham\\eclipse-workspace\\SeleniumInstall\\JavaPrajectGST\\driver\\chromedriver.exe");
	WebDriver driver= new org.openqa.selenium.chrome.ChromeDriver();
	driver.navigate().to("https://www.adactin.com/HotelApp/");
WebElement userName=driver.findElement(By.xpath("//input[@id=\"username\"]"));

userName.sendKeys(split[0]);

WebElement passWord=driver.findElement(By.xpath("//input[@id=\"password\"]"));
passWord.sendKeys(split[1]);


	
}
}

