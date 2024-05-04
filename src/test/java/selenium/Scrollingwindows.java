package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrollingwindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver; 
		 //scroll down whole screen 
		 js.executeScript("window.scrollBy(0,500)"); 
		 Thread.sleep(3000); 
		 //scrolling only in one table 
		 js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		 
		 //getting the sum from the column of table 
		 List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)")); 
		 
		 int sum=0; 
		 
		 for(int i=0; i<values.size(); i++)
		 {
			 sum = sum +Integer.parseInt(values.get(i).getText()); 
			 
		 }
		 System.out.println(sum);
		 
		 String totalValue = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
		 
		 int total = Integer.parseInt(totalValue); 
		 Assert.assertEquals(sum, total); 
		 
		 
	}
	
	


}

