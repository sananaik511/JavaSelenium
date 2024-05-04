package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeDataUsingMultipleWindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/angularpractice/");
		 
		 //scenario is navigate to 'https://rahulshettyacademy.com/angularpractice/' fil the name with first course name available in 'https://rahulshettyacademy.com/' browser
		 driver.switchTo().newWindow(WindowType.TAB); //i can also use new window too for executing this program
		 
		 Set<String> window = driver.getWindowHandles(); 
		 Iterator<String> it = window.iterator(); 
		 String paretId = it.next(); 
		 String childId = it.next(); 
		 driver.switchTo().window(childId); 
		 driver.get("https://rahulshettyacademy.com/"); 
		 String data = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText(); 
		 driver.switchTo().window(paretId); 
		 driver.findElement(By.xpath("//input[@name='name']")).sendKeys(data); 
		 
		//capture name webelement screenshot 
		 WebElement name = driver.findElement(By.xpath("//input[@name='name']")); 
		 File screenshot = name.getScreenshotAs(OutputType.FILE); 
		 
		 FileUtils.copyFile(screenshot, new File("logo.png")); 
		 
		 //height and width of the name webelement 
		 System.out.println(name.getRect().getDimension().getHeight());
		 System.out.println(name.getRect().getDimension().getWidth());
		 
		 
		

	}

}
