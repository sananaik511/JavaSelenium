package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		
		while(!driver.findElement(By.xpath("//div/div[@class='flatpickr-current-month']")).getText().contains("August"));
		{
			driver.findElement(By.cssSelector(".flatpickr-next-month")).click(); 
		}
		
		driver.findElement(By.cssSelector("input[name='form_fields[travel_comp_date]']")).click();
		List<WebElement> dates = driver.findElements(By.xpath("//span[@class='flatpickr-day ']"));
		int count = driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).size();

		for (int i = 0; i < count; i++) {
		
			String names = driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).getText();

			if (names.equalsIgnoreCase("23")) {
				driver.findElements(By.xpath("//span[@class='flatpickr-day ']")).get(i).click();
				break;
			}
		}
	}
}