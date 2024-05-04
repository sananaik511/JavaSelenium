package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 
		 //for static dropdown we should create 'select' object 
		 WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); 
		 
		 Select input = new Select(staticDropdown); 
		 input.selectByIndex(1); 
		 System.out.println(input.getFirstSelectedOption().getText());
		 input.selectByVisibleText("AED"); 
		 System.out.println(input.getFirstSelectedOption().getText());
		 input.selectByValue("USD");
		 System.out.println(input.getFirstSelectedOption().getText());
		 
		 driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/"); 
		 Thread.sleep(6000); 
		 WebElement newDropdown = driver.findElement(By.id("//p/select")); 
		 
		 Select dropdown = new Select(newDropdown); 
		 dropdown.selectByIndex(6); 
		 System.out.println(dropdown.getFirstSelectedOption().getText()); 
		 dropdown.selectByValue("ARG"); 
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 dropdown.selectByVisibleText("India"); 
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 
		 
		 
		 

	}

}
