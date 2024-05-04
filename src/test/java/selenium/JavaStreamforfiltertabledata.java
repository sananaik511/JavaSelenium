package selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaStreamforfiltertabledata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		 driver.findElement(By.id("search-field")).sendKeys("Rice"); 
		 
		 List<WebElement> values = driver.findElements(By.xpath("//tr/td[1]")); 
		 List<WebElement> filteredValues = values.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());  
		 Assert.assertEquals(values.size(), filteredValues.size()); 

	}

}
