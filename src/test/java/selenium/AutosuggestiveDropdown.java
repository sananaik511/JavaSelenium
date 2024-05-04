package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 //checkbox selection 
		 System.out.println(driver.findElement(By.id("familyandfriend")).isSelected());
		 driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click(); 
		 System.out.println(driver.findElement(By.id("familyandfriend")).isSelected());
		 
		 List<WebElement> checkbox= driver.findElements(By.xpath("//input[@type='checkbox']")); 
		 System.out.println(checkbox.size()); 
		 
		 
		 driver.findElement(By.id("autosuggest")).sendKeys("Ind"); 
		 Thread.sleep(3000); 
		 List<WebElement> dropdown = driver.findElements(By.cssSelector("li[role=presentation] a")); 
		 
		 for(WebElement option :dropdown)
		 {
			 if(option.getText().equalsIgnoreCase("India"))
			 {
				 option.click(); 
				 break; 
				 
			 }
		 }
		 
		 	

	}

}
