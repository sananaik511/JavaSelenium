package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndtoEndfordropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 
		 //autosuggestive dropdown
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
		 	 
		 //selecting adult from the dropdown 
		 driver.findElement(By.id("divpaxinfo")).click(); 
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 
		 Thread.sleep(3000); 
		 int i = 1; 
		 while(i<5)
		 {
			 driver.findElement(By.id("hrefIncAdt")).click(); 
			 i++; 
		 }
		 System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); 
		 driver.findElement(By.id("btnclosepaxoption")); 
		 
		 //Selecting the Currency dropdown 
		 WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); 
		 
		 Select input = new Select(staticDropdown); 
		 input.selectByVisibleText("AED");
		 System.out.println(input.getFirstSelectedOption().getText()); 
		 input.selectByIndex(1);
		 System.out.println(input.getFirstSelectedOption().getText()); 
		 input.selectByValue("USD"); 
		 System.out.println(input.getFirstSelectedOption().getText()); 
		 
		 driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click(); 
		 
		 //selecting the checkbox 
		 driver.findElement(By.cssSelector("input[id*=friendsandfamily]")).click(); 
		 List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']")); 
		 System.out.println(checkBox.size()); 
		 
		 //radio button
		 //System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date1")).isEnabled()); 
		 driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); 
		 
		 if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("1")) 
				 {
			 System.out.println("its enabled"); 
			 Assert.assertTrue(true);
				 }
		 else
		 {
			 Assert.assertTrue(false); 
		 }
		 
		 
		 
	
		 
		 //selecting source and destination 
		 driver.findElement(By.cssSelector("input[id*='originStation1_CTXT']")).click(); 
		 driver.findElement(By.xpath("//a[@value='MAA']")).click(); 
		 Thread.sleep(3000); 
		 driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click();
		 
		 //Selecting current date from the calendar 
		 //driver.findElement(By.cssSelector("a[class*='ui-state-active']")).click(); 
		 
		 
		 
		 } 
		 
		 
		 	 

	}

}
