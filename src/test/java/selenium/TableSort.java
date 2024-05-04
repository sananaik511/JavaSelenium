package selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSort {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		 
		 //click on the column 
		 driver.findElement(By.xpath("//table/thead/tr/th[1]")).click(); 
		 
		 //capture all the elements from the list 
		 List<WebElement> veggies = driver.findElements(By.xpath("//table/tbody/tr/td[1]")); 
		 
		 //capture text of all elements in one list (original list get from the browser already sorted)
		 List<String> namesList= (List<String>) veggies.stream().map(s->s.getText()).collect(Collectors.toList()); 
		 System.out.println(namesList); 
		 
		 //we will apply sort from stream to orginal sorted list 
		List<String> nameList1= namesList.stream().sorted().collect(Collectors.toList());
		System.out.println(nameList1);
		
		
		 //we will check both the lists are equal 
		Assert.assertTrue(nameList1.equals(namesList)); 
		
		//scan the columns with gettext - Rice - print the price of the Rice 
		
		List<String> price; 
		
		
		do
		{
		List<WebElement> rows = driver.findElements(By.xpath("/tr/td[1]"));
		price = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getVeggiesPrice(s)).collect(Collectors.toList()); 	 
		price.forEach(a->System.out.println(a)); 
		
		if(price.size()<1)
		{
			 
			driver.findElement(By.cssSelector("[aria-label='Next']")).click(); 
			
		}
		
		}while(price.size()<1); 	

	}

	private static String getVeggiesPrice(WebElement s) {
		// TODO Auto-generated method stub
		String PriceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText(); 
		return PriceValue;
	}

}
