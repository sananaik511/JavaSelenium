package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/");
		 driver.findElement(By.xpath("//a[text()='Nested Frames']")).click(); 
		 Thread.sleep(3000); 
		 driver.switchTo().frame("frame-top"); 
		 driver.switchTo().frame("frame-middle"); 
		 System.out.println(driver.findElement(By.id("content")).getText());
		 driver.switchTo().defaultContent(); 

	}

}
