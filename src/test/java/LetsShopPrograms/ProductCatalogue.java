package LetsShopPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import AbstractClasses.AbstarctProgram;

public class ProductCatalogue extends AbstarctProgram{
	
	WebDriver driver; 
	public ProductCatalogue(WebDriver driver)
	{
		super(driver); 
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	By waitProduct = By.cssSelector(".mb-3"); 
	By addToCartButton = By.cssSelector(".w-10"); 
	By toastMessage = By.cssSelector(".toast-message"); 
	
	@FindBy(css=".mb-3")
	List<WebElement> products; 
	
	@FindBy(css="ng-animating")
	WebElement animation; 
	
	public List<WebElement> ProductLists()
	{
		waitUntilElemetAppear(waitProduct); 
		return products; 
	}
	
	public WebElement getProductFromList(String productName)
	{
		WebElement prod = ProductLists().stream().filter(s -> s.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);
		return prod; 
	}
	
	public void AddToCart(String productName)
	{
		WebElement produ= getProductFromList(productName);  
		produ.findElement(addToCartButton).click();; 
		waitUntilElemetAppear(toastMessage); 
		waitUntilElementDisappear(animation); 
	}
	
	

}
