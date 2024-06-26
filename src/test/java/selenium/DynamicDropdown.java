package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
		 Thread.sleep(3000); 
		 driver.findElement(By.xpath("//a[@value='CJB']")).click(); 
		 //we can write above xapth with parent child exepression as //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='CJB']"
		 Thread.sleep(3000); 
		 driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click(); 

	}

}
