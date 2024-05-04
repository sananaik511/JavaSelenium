package selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		 //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		 	
		 
		 driver.findElement(By.id("username")).sendKeys("rahulshettyacademy"); 
		 driver.findElement(By.id("password")).sendKeys("learning"); 
		 driver.findElement(By.xpath("//label[2]//span[2]")).click(); 
		 driver.findElement(By.id("okayBtn")).click(); 
		 
		 WebElement userDropdown = driver.findElement(By.xpath("//select[@data-style='btn-info']"));
		 
		 Select dropdown = new Select(userDropdown); 
		 dropdown.selectByValue("consult"); 
		 System.out.println(dropdown.getFirstSelectedOption().getText()); 
		 driver.findElement(By.id("terms")).click(); 
		 driver.findElement(By.id("signInBtn")).click(); 
		 Thread.sleep(7000); 
		 
		 //WebDriverWait wait = new WebDriverWait(driver, 5);
		 
		 String[] products = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"}; 
		 
		 List addedCart = Arrays.asList(products); 
		 
		List<WebElement> itemsCart = driver.findElements(By.cssSelector(".card-title")); 
		 for(int i=0; i<itemsCart.size(); i++)
		 {
			 String names = itemsCart.get(i).getText(); 
			 
			 if(addedCart.contains(names))
			 {
				 driver.findElements(By.cssSelector("button[class*='btn-info']")).get(i).click(); 
				
			 }
			 
			 
		 }
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

		 
		 
		

	}

}
