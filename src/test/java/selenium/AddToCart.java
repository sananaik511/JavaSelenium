package selenium;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		String[] itemNeeded = { "Brocolli", "Beetroot", "Tomato", "Mushroom" };

		// declaring implicit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
			
		addItems(driver, itemNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
		
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		
		
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		

	}

	
	public static void addItems(WebDriver driver, String[] itemNeeded) {
		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] names = products.get(i).getText().split("-"); // the veggies are stored in names variable. here the
																	// output is "Cucumber -1Kg"
			String formattedName = names[0].trim(); // I will get output as = "Cucumber"

			// check name is present in the array list or not
			List itemAddedList = Arrays.asList(itemNeeded);

			// we should trim 'cucumber - 1kg' from the output
			if (itemAddedList.contains(formattedName)) // here we will check whether arraylist contains veggies or not
			{

				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();

				if (j == itemNeeded.length) {
					break;
				}

			}

		}
	}

}
