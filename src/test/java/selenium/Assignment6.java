package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String options = driver.findElement(By.xpath("//div[@class='right-align']/fieldset/label[2]")).getText();

		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Select input = new Select(dropDown);
		input.selectByVisibleText(options);
		driver.findElement(By.id("name")).sendKeys(options);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000);
		String message = driver.switchTo().alert().getText();
		if (message.contains(options)) {
			System.out.println(message);

		} else {
			System.out.println("error");
		}

	}

}
