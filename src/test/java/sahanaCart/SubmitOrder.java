package sahanaCart;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import LetsShopPrograms.CartPage;
import LetsShopPrograms.CheckOutPage;
import LetsShopPrograms.ConfirmationPage;
import LetsShopPrograms.OrderPage;
import LetsShopPrograms.ProductCatalogue;
import sahanaCart.TestCompoenents.BaseTest;

public class SubmitOrder extends BaseTest{

	String productName = "ZARA COAT 3";
	
		@Test(dataProvider="getData", groups= {"Purchase"})
		public void SubmitOrder(HashMap<String, String> input) throws IOException, InterruptedException
		{
		ProductCatalogue prod = land.LoginToApp(input.get("email"), input.get("password"));
		List<WebElement> productsFromCart = prod.ProductLists();
		prod.AddToCart(input.get("product"));
		CartPage cart = prod.GoToCartPage();
		boolean match = cart.VerifyProductByName(input.get("product"));
		Assert.assertTrue(match);
		CheckOutPage checkout = cart.GoToCheckOutPage();
		checkout.SelectCountry("India");
		ConfirmationPage message = checkout.submitOrder();
		String name = message.ConfirmationMessage();
		Assert.assertEquals(name, "THANKYOU FOR THE ORDER."); 
	}
		
		@Test(dependsOnMethods = {"SubmitOrder"})
		public void OrderHistory()
		{
			ProductCatalogue prod = land.LoginToApp("sahananayak.02@gmail.com", "Sana@123");
			OrderPage order = land.OrderPage(); 
			Assert.assertTrue(order.VerifyOrderByName(productName));	
			
		}
		
		@DataProvider
		public void getData() throws IOException
		{
			HashMap<String, String> map = new HashMap<String, String>(); 
			map.put("email", "sahananayak.02@gmail.com");
			map.put("password", "Sana@123"); 
			map.put("product", "ZARA COAT 3"); 
			
			HashMap<String, String> map1 = new HashMap<String, String>(); 
			map1.put("email", "sana123@mailinator.com");
			map1.put("password", "Sana@123"); 
			map1.put("product", "ADIDAS ORIGINAL");
			
			//List<HashMap<String, String>> data= getJSONData("C://Users//Sahana.Naik//eclipse-workspace//selenium//src//test//java//Data//purchaseOrder.json"); 
			//return new Object[][] { {data.get(0)},{data.get(1)} }; 
		}
		
		//First I have tried with this data provider 
		//@DataProvider
		/*public Object[][] getData()
		{
			return new Object[][] { {"sahananayak.02@gmail.com", "Sana@123", "ZARA COAT 3"},{"sana123@mailinator.com", "Sana@123", "ADIDAS ORIGINAL"} }; 
}*/
		


}
