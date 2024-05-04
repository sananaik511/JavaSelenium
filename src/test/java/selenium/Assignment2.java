package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/angularpractice/");
		 driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Sahana Naik");
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sahana.naik@gmail.com"); 
		 driver.findElement(By.id("exampleInputPassword1")).sendKeys("Sahananaik02");
		 driver.findElement(By.id("exampleCheck1")).click();
		 WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1")); 
		 Thread.sleep(3000); 
		 Select input = new Select(dropdown);
		 input.selectByIndex(1); 
		 System.out.println(input.getFirstSelectedOption().getText());
		 input.selectByVisibleText("Female"); 
		 System.out.println(input.getFirstSelectedOption().getText());
		 Thread.sleep(3000); 
		 
		 driver.findElement(By.cssSelector("input[id='inlineRadio1']")).click(); 
		 driver.findElement(By.xpath("//input[@name='bday']")).click(); 
		 Thread.sleep(3000); 
		 driver.findElement(By.cssSelector(".btn-success")).click();	
		 Thread.sleep(5000);
		 
		 System.out.println(driver.findElement(By.cssSelector("div[class*='alert-dismissible']"))); 
		 

	}

}
