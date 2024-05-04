package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import org.openqa.selenium.By; 

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/angularpractice/");
		 //above relative locators 
		 WebElement name = driver.findElement(By.xpath("//form/div[1]/input")); 
		 System.out.println(driver.findElement(with(By.tagName("label")).above(name)).getText()); 
		 
		 //below 
		 WebElement dateOfBirth = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		 driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click(); 
		 
		 //left 
		 WebElement checkBox = driver.findElement(By.xpath("//label[@for='exampleCheck1']"));
		 driver.findElement(with(By.tagName("input")).toLeftOf(checkBox)).click(); 
		 
		 //right
		 WebElement status = driver.findElement(By.id("inlineRadio1"));
		 System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(status)).getText()); 

	}

}
