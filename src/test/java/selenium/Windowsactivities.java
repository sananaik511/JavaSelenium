package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsactivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize(); 
		 driver.manage().window().minimize(); 
		 driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/"); 
		 driver.navigate().back(); 
		 driver.navigate().forward(); 

	}

}
