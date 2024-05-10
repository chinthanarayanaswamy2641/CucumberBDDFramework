package utils;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.cucumber.messages.types.Duration;

import java.io.FileInputStream;
public class ExcelFileUtils {
	static XSSFWorkbook wb;
	static WebDriver driver=null;
	public ExcelFileUtils() throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\91934\\Desktop\\New folder\\CucumberLatest\\Cucumber\\Input\\TestInput.xlsx");
		 wb=new XSSFWorkbook(fis);
	}
	//row count`
	public int rowCount(String sheetname) {
		 return wb.getSheet(sheetname).getLastRowNum();
	}
	//col count
	public int colCount(String sheetname,int row) {
		return wb.getSheet(sheetname).getRow(row).getLastCellNum();
	}
	//Read the data from excel file
		public static String getData(String sheetname,int row,int column) {
		
			
			
		return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		
			
		}
//		public static void initializeBrowserAndOpenApplicationUrl(String browserName) {
//			//user is able to login
//			
//			if(browserName.equalsIgnoreCase("chrome")) {
//				driver=new ChromeDriver();
//			}else if(browserName.equalsIgnoreCase("firefox")) {
//				driver=new FirefoxDriver();
//			}else if(browserName.equalsIgnoreCase("edge")) {
//				driver=new EdgeDriver();
//			}else if(browserName.equalsIgnoreCase("safari")) {
//				driver=new SafariDriver();
//			}
//			
//			
//			 
//				driver.manage().window().maximize();
//				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
////				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(CommonUtils.PAGE_LOAD_TIME));
//				//driver.get(prop.getProperty("url"));
//				
//		}
//		public static WebDriver getDriver() {
//			return driver;
//		}
}
