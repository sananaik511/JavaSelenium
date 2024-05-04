package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		 
		 //locators by name for username text field 
		 driver.findElement(By.name("username")).click(); 
		 
		//locators by class name for username text field (Sometimes there will be multiple classes seperated with space, we can select one amoung them 
		 driver.findElement(By.className("form-control")); 
		 
		 //locators by css selector for username text field
		 driver.findElement(By.cssSelector("input[type = 'text']")); 
		 driver.findElement(By.cssSelector("input.form-control"));   //tagname.classname
		 driver.findElement(By.cssSelector("input#username"));       //tagname#id 
		 driver.findElement(By.cssSelector("input[id='username']"));   //tagname[attribute = 'Value'] 
		 driver.findElement(By.cssSelector("div[class = 'form-group'][1]"));   //tagname[attribute = 'Value'][index] 
		 driver.findElement(By.cssSelector(".form-control")); //.classname
		 driver.findElement(By.cssSelector("div input:nth-child(1)"));   // Parenttagname childtagname:nth-child(index) 
		 driver.findElement(By.cssSelector("input[class*= form]"));    //8.	Tagname[attribute* = ‘value’]  
		 
		 
		 
		 
		 //locators using link text 
		 driver.findElement(By.linkText("terms and conditions")); 
		
		 //locators by Xpath for username text field, same as cssSelectors syntax 
		 driver.findElement(By.xpath("//input[@type = 'text']")); 
		 
		 //locators by tagname 
		 driver.findElement(By.tagName("p")); 
		 
		 
		 

	}

}
//