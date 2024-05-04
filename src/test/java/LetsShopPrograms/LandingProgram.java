package LetsShopPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractClasses.AbstarctProgram;

public class LandingProgram extends AbstarctProgram{
	
	WebDriver driver; 
	public LandingProgram(WebDriver driver)
	{
		super(driver); 
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "userEmail")
	WebElement userName; 
	
	@FindBy(id = "userPassword")
	WebElement passWord; 
	
	@FindBy(id = "login")
	WebElement submitButton; 
	
	@FindBy(css = "[class*='flyInOut']")
	WebElement errorMeassage; 
	
	public ProductCatalogue LoginToApp(String userNameData, String passwordData)
	{
		userName.sendKeys(userNameData);
		passWord.sendKeys(passwordData);
		submitButton.click();
		return new ProductCatalogue(driver); 
	}
	
	public String DisplayErrorMessage()
	{
		waitUntilWebElemetAppear(errorMeassage); 
		return errorMeassage.getText(); 
		
	}

	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	
}
