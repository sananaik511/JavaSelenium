package extendReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter; 


public class DemoOnExtendReporst {
	
	ExtentReports extent; 
	
	
	@BeforeTest 
	public void config()
	{
		//We should create these 2 objects: ExtentReport ExtentSparkReporter
		String path = System.getProperty("user.dir") + "\\reports\\index.html"; 
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Web Automation Results");
		report.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports(); 
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Sahana Naik");
		
	}
	
	
	@Test
	public void initialDemo()
	{
		extent.createTest("Initial Demo"); 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/");
		 System.out.println(driver.getTitle()); 
		 extent.flush(); 
		 
	}
	

}
