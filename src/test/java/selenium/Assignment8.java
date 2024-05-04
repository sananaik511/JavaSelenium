package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 driver.findElement(By.id("autocomplete")).sendKeys("UNI"); 
		 
		 List<WebElement> contries = driver.findElements(By.id("ui-id-1"));
		 Thread.sleep(3000); 
		 
		 for(WebElement options :contries)
		 {
			 if(options.getText().equalsIgnoreCase("United Arab Emirates"));
			 {
				 options.click(); 
				 break; 
			 }
		 }
		 
		 

	}

}
