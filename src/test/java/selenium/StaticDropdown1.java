package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticDropdown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 driver.findElement(By.id("divpaxinfo")).click();
		 Thread.sleep(3000); 
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 
		 //int i=0; 
		 //while(i<5)
		// {
			// driver.findElement(By.id("hrefIncAdt")).click(); 
			// i++; 
		 //}
		 for(int i=1; i<5; i++)
		 {
			 driver.findElement(By.id("hrefIncAdt")).click();  
		 }
		 driver.findElement(By.id("btnclosepaxoption")).click(); 
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 

	}

}
