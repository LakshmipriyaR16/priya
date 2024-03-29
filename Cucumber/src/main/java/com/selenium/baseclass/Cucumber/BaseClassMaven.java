package com.selenium.baseclass.Cucumber;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import javax.management.RuntimeErrorException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class BaseClassMaven {
		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("enter the browser name"); 
		//String Name=sc.nextLine();

		
		public static WebDriver driver;
		//private static Object FileUtils;
		
		
		public static WebDriver browserLaunch(String Name)
		{
			try {
				
				if(Name.equalsIgnoreCase("chrome"))
				{																								
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\com\\selenium\\driver\\chromedriver.exe");
				driver=new ChromeDriver();
				//driver.get("http://automationpractice.com/index.php");
				}
				else if(Name.equalsIgnoreCase("IE")) 
				{
				
				System.setProperty("webdiver.ie.driver",System.getProperty("user.dir")+"\\Driver\\IEDriverServer.exe");
				 driver=new InternetExplorerDriver();
				//driver.get("http://automationpractice.com/index.php");

				} 
				else {
					throw new RuntimeException("Print valid browser name");
				}
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
			}
			
					catch (Exception e) {
						e.printStackTrace();
						throw new RuntimeException();

				}
			return driver;
		}	
		public static void getUrl(String url) {
			try {
				driver.get(url);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
		public static boolean elementIsDisplayed(WebElement element)
		{
			
			try {
				boolean displayed = element.isDisplayed();	
					return displayed;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException();
			}
			
		}
			
			public static boolean elementIsEnabled(WebElement element)
			{
			
					try {
						boolean enabled = element.isEnabled();	
						return enabled;
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						throw new RuntimeException();
					}
				
				}
			public static void clickOnTheElement(WebElement element) {
				try {
					waitForElementVisibility(element);
					if(elementIsDisplayed(element))
						element.click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new RuntimeException();
				}
				

				
			}
			public static void inputValue(WebElement element,String value) {
				try {
					waitForElementVisibility(element);
					boolean elementIsDisplayed = elementIsDisplayed(element);
					boolean elementIsEnabled = elementIsEnabled(element);		
					if(elementIsDisplayed && elementIsEnabled)
						element.clear();
					element.sendKeys(value);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new RuntimeException();
				}
				
			}

			public static void waitForElementVisibility(WebElement element) {
				try {
					WebDriverWait wd= new WebDriverWait(driver,20);
					wd.until(ExpectedConditions.visibilityOf(element));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			public static void waitForText(WebElement element,String text) {			
			
			try {
				
					WebDriverWait wd= new WebDriverWait(driver,20);
					wd.until(ExpectedConditions.textToBePresentInElement(element, text));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					throw new RuntimeException();
				}
			}
				
		public static void mouseHover(WebElement element) {
			try {
				Actions ac=new Actions(driver);
				ac.moveToElement(element).build().perform();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
		public static void dropDownForNum(WebElement element, String num) {
			try {
				waitForElementVisibility(element);
				boolean elementIsDisplayed = elementIsDisplayed(element);
				Select s=new Select(element);
				s.selectByValue(num);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException();
			}
		}public static void dropDownForText(WebElement element, String text) {
			try {
				waitForElementVisibility(element);
				//boolean elementIsDisplayed = elementIsDisplayed(element);
				boolean elementIsEnabled = elementIsEnabled(element);		
				Select s=new Select(element);
				s.selectByVisibleText(text);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException();
						}
		}

		public static void dropDownMethod(WebElement element,String value, String option) throws Exception {
			try {
				waitForElementVisibility(element);
				Select sc= new Select(element);
				if(option.equalsIgnoreCase("value")){
				sc.selectByValue(value);
				}else if(option.equalsIgnoreCase("VisibleText")){
				sc.selectByVisibleText(value);
				}else if(option.equalsIgnoreCase("Index")){
				sc.selectByIndex(Integer.parseInt(value));
				}else {
					throw new Exception("Not a valid option");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException();
			}
			
		}
		public static void scrollByUsingElements(WebElement element) {
			try {
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView();", element);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException();
			}
			
		}public static void dragAndDropActions(WebElement src, WebElement tar) {
			try {
				Actions ac=new Actions(driver);
				ac.dragAndDrop(src,tar).build().perform();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException();
			}
			
		}public static String getTextOfTheElement(WebElement element) {
			try {
				String getTextvalue=element.getText();
				System.out.println(getTextvalue);
				return getTextvalue;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException();

			}
			
		}
		public static String getAttributeOfTheElement(WebElement element) {
			try {
				String getAttributevalue=element.getAttribute("value");
				System.out.println(getAttributevalue);
				return getAttributevalue;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException();

			}
			
		}
		public static String getDataFromExcelSheet(int rownum, int cellnum) throws Throwable {
			try {
				File xl=new File("C:\\Users\\Gautham\\Desktop\\ddf.xlsx");
						
						FileInputStream fin=new FileInputStream(xl);
						
						Workbook wb=new XSSFWorkbook(fin);
						
						Sheet sheetAt = wb.getSheetAt(0);
						
					Cell cell = sheetAt.getRow(rownum).getCell(cellnum);
					String value=null;
					CellType cellType = cell.getCellType();
					if(cellType.equals(cellType.STRING)) {
						 String value2 = cell.getStringCellValue();
						System.out.println(value2);
						return value2;
					}else if(cellType.equals(cellType.NUMERIC)) {
						double d = cell.getNumericCellValue();
						long l=(long)d;
						String valueOf = String.valueOf(l);
						System.out.println(valueOf);
						return valueOf;
					}
					return value;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException();
			}
				}
	}
		


