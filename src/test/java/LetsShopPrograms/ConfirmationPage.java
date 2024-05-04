package LetsShopPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractClasses.AbstarctProgram;

public class ConfirmationPage extends AbstarctProgram{

	WebDriver driver; 
	public ConfirmationPage(WebDriver driver) 
	{
		super(driver); 
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".hero-primary")
	WebElement message; 
	
	public String ConfirmationMessage()
	{
		String name = message.getText();
		return name; 
	}

}
