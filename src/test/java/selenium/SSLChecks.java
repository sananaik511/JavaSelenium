package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLChecks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions(); 
		options.setAcceptInsecureCerts(true); 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver(options);
		 driver.get("https://expired.badssl.com/");
		 System.out.println(driver.getTitle()); 

	}

}
