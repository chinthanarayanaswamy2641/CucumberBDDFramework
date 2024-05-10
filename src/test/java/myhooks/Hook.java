package myhooks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.DriverFactory;
import utils.ExcelFileUtils;

public class Hook{
	
		static WebDriver driver;
		@Before
		public static void setUp() throws Throwable {
			ExcelFileUtils excel=new ExcelFileUtils();
			 driver=DriverFactory.getDriver();
			driver=DriverFactory.initializeBrowser(excel.getData("Vaishnav",12, 1));
		driver.get(excel.getData("Vaishnav", 0, 1));

			
			 
			
		}
		@After
		public void tearDown(Scenario scenario) throws IOException {
			
		    String  scenarioName = scenario.getName().replaceAll(" ","_");
				
		        System.out.println(scenario);     

				if(scenario.isFailed()) {
					
					File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					byte[] fileContent = FileUtils.readFileToByteArray(file);
					scenario.attach(fileContent,"image/png", scenarioName);
				
				}
				
			driver.quit();
				
			
			}

}
