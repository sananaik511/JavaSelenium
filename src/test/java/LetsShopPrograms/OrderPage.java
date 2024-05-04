package LetsShopPrograms;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractClasses.AbstarctProgram;

public class OrderPage extends AbstarctProgram{

	WebDriver driver; 
	public OrderPage(WebDriver driver) 
	{
		super(driver); 
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[2]")
	List<WebElement> namesOfProducts; 
	
	public boolean VerifyOrderByName(String productName)
	{
		boolean match = namesOfProducts.stream().anyMatch(s->s.getText().equalsIgnoreCase(productName)); 
		return match; 
	}
	

}
