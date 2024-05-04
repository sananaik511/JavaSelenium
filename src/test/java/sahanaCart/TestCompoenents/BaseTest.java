package sahanaCart.TestCompoenents;

import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import LetsShopPrograms.LandingProgram;

public class BaseTest {
	
	public WebDriver driver;
	public LandingProgram land; 
	
	public WebDriver intitalizer() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\selenium\\resources\\GlobalData.properties");
		prop.load(fis);
		String browser = prop.getProperty("browser"); 
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Sahana.Naik\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver; 

	}
	
	/*public List<HashMap<String, String>> getJSONData(String filePath) throws IOException 
	{
		//read json to string 
		String jsonContent = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8); 
		
	
	    //Convert string to HashMap using Jackson datbind
		ObjectMapper mapper = new ObjectMapper(); 
		List<HashMap<String, String>> data =   mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String >>>(){
		}); 
		return data; 
		
	}	*/
		
	
	@BeforeMethod(alwaysRun=true)
	public LandingProgram luanchApp() throws IOException
	{
		driver = intitalizer(); 
		land = new LandingProgram(driver);
		land.goTo();
		return land; 
		
	}
	
	@AfterMethod(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
	}

}
