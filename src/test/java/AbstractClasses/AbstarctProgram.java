package AbstractClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import LetsShopPrograms.CartPage;
import LetsShopPrograms.OrderPage;

public class AbstarctProgram {
	
	WebDriver driver; 
	public AbstarctProgram(WebDriver driver)
	{
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//ul/li[4]/button")
	WebElement cartButton; 
	
	@FindBy(css="[routerlink*='myorders']")
	WebElement orderButton; 
	
	public void waitUntilElemetAppear(By findBy)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	public void waitUntilWebElemetAppear(WebElement findBy)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(findBy));
	}
	
	public CartPage GoToCartPage()
	{
		cartButton.click();
		return new CartPage(driver); 
	}
	
	public LetsShopPrograms.OrderPage OrderPage()
	{
		orderButton.click();
		return new OrderPage(driver); 
	}
	
	public void waitUntilElementDisappear(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	
}
