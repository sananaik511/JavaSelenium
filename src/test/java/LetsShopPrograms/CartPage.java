package LetsShopPrograms;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractClasses.AbstarctProgram;

public class CartPage extends AbstarctProgram {

	WebDriver driver; 
	public CartPage(WebDriver driver) 
	{
		super(driver);
		this.driver= driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//div[@class='cartSection']/h3")
	List<WebElement> CartListProducts; 
	
	@FindBy(css= "div[class*='ng-star-inserted'] button")
	WebElement checkOutButton;

	public List<WebElement> ListOfProductsInCart()
	{
		return CartListProducts; 
	}
	
	public boolean VerifyProductByName(String productName)
	{
		boolean match = ListOfProductsInCart().stream().anyMatch(s -> s.getText().equalsIgnoreCase(productName));
		return match; 
	}
	
	public CheckOutPage GoToCheckOutPage()
	{
		checkOutButton.click();
		return new CheckOutPage(driver); 
	}
	
	
	
	

}
