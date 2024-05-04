package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		 WebElement webTable = driver.findElement(By.cssSelector(".table-display")); 
		 int columnCount = webTable.findElements(By.xpath("//table/tbody/tr[1]")).size(); 
		 System.out.println("Total number of coloums = " +columnCount); 
		 
		 int rowCount = webTable.findElements(By.xpath("//table[@class='table-display']/tbody/tr/td[1]")).size(); 
		 System.out.println("Total number of rows = "+rowCount); 
		 
		List<WebElement> tableName = webTable.findElements(By.xpath("//table[@class='table-display']/tbody/tr[3]"));    
		System.out.print(tableName.get(0).getText()); 
		 
		

	}

}
