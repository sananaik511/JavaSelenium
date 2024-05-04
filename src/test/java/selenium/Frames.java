package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://jqueryui.com/droppable/");
	  
		 driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); 
		 
		 driver.findElement(By.id("draggable")).click(); 
		 WebElement source= driver.findElement(By.id("draggable")); 
		 WebElement dsetination = driver.findElement(By.id("droppable")); 
		 
		 Actions a =new Actions(driver); 
		 a.dragAndDrop(source, dsetination).build().perform(); 
		 driver.switchTo().defaultContent();
		 
		 

	}

}
