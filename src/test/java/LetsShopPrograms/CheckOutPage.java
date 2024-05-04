package LetsShopPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractClasses.AbstarctProgram;

public class CheckOutPage extends AbstarctProgram{
	
	WebDriver driver;
	public CheckOutPage(WebDriver driver)
	{
		super(driver); 
		this.driver=driver; 
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="[placeholder='Select Country']")
	WebElement selectCountryTextfield; 
	
	@FindBy(xpath="//section/button[2]/span")
	WebElement SelectCoutry; 
	
	@FindBy(css=".action__submit")
	WebElement submitButton; 

	By listOfCountries = By.cssSelector(".ta-results"); 
	
	
	public void SelectCountry(String CountryName)
	{
		Actions a = new Actions(driver);
		a.sendKeys(selectCountryTextfield,CountryName).build().perform();
		waitUntilElemetAppear(listOfCountries);
		SelectCoutry.click();	
	}
	
	public ConfirmationPage submitOrder()
	{
		submitButton.click();
		return new ConfirmationPage(driver); 
	}
	
	

}
