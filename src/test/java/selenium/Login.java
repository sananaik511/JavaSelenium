package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		 //Thread.sleep(8000);
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning"); 
		 driver.findElement(By.id("signInBtn")).click(); 
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		// driver.findElement(By.xpath("//input[@type='email'] ")).sendKeys("sahana"); 
		 
		 
		 //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sahana"); 
		
		 //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sahana"); 
		 //driver.findElement(By.id("email")).sendKeys("sahana.naik@qualitestgroup.com"); 
		 //driver.findElement(By.id("password")).sendKeys("Sahananaik02345"); 
		 //driver.findElement(By.id("next")).click(); 
		 
	}

}
