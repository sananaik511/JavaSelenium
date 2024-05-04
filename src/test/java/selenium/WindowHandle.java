package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		 driver.findElement(By.cssSelector(".blinkingText")).click(); 
		 Set<String> windows = driver.getWindowHandles();   //parentID, ChildID 
		 Iterator<String> it = windows.iterator(); 
		 String parentId = it.next(); 
		 String childIdId = it.next(); 
		 driver.switchTo().window(childIdId); 
		 Thread.sleep(3000); 
		 System.out.println(driver.findElement(By.cssSelector("p[class*='red']")).getText()); 
		 
		 String userName = driver.findElement(By.cssSelector("p[class*='red']")).getText().split("at")[1].trim().split(" ")[0];
		 System.out.println(userName); 
		 driver.switchTo().window(parentId); 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName); 

	}

}
