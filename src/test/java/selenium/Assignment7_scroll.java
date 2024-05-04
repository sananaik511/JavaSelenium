package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7_scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 List<WebElement> price = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr/td[3]")); 
		 int sum=0; 
		 for (int i=0; i<price.size(); i++)
		 {
			 sum = sum+Integer.parseInt(price.get(i).getText());  
		 }
		 System.out.println(sum); 

	}

}
