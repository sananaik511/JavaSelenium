package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		 //finding the links in whole screen 
		 System.out.println(driver.findElements(By.tagName("a")).size()); 
		 
		 //finding the links only in the footer section of the screen 
		 WebElement footerDriver= driver.findElement(By.id("gf-BIG")); 
		 System.out.println(footerDriver.findElements(By.tagName("a")).size()); 
		 
		 //finding the links count only from the limited section from footerDriver 
		 WebElement subDriver = footerDriver.findElement(By.xpath("(//table[@class = 'gf-t']/tbody/tr/td/ul)[1]")); 
		 System.out.println(subDriver.findElements(By.tagName("a")).size());
		 
		 //click on each links in the subdriver and check if its opening or not 
		 for(int i=1; i<subDriver.findElements(By.tagName("a")).size(); i++)
		 {
			 String linkToClick = Keys.chord(Keys.CONTROL, Keys.ENTER); 
			 subDriver.findElements(By.tagName("a")).get(i).sendKeys(linkToClick);  
			 Thread.sleep(3000); 
			 
		 }
			 
			Set<String> windows = driver.getWindowHandles(); 
			Iterator<String> it = windows.iterator(); 
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next()); 
				System.out.println(driver.getTitle()); 
			}

	
	}
}

