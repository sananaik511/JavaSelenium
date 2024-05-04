package sahanaCart;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import LetsShopPrograms.CartPage;
import LetsShopPrograms.ProductCatalogue;
import sahanaCart.TestCompoenents.BaseTest;

public class ErrorValidation extends BaseTest{

		@Test(groups={"ErrorHandling"})
		public void loginErrorValidation() throws IOException, InterruptedException
		{
		String productName = "ZARA COAT 3";
		land.LoginToApp("sahananayak.02@gmaijshgdjsl.com", "Sana@1sdhjsk23");
		Assert.assertEquals("Incorrect email or password.", land.DisplayErrorMessage());
		}
		
		@Test
		public void CartErrorValidation() throws IOException, InterruptedException
		{
		String productName = "ZARA COAT 3";
		ProductCatalogue prod = land.LoginToApp("sana123@mailinator.com", "Sana@123");
		List<WebElement> productsFromCart = prod.ProductLists();
		prod.AddToCart(productName);
		CartPage cart = prod.GoToCartPage();
		boolean match = cart.VerifyProductByName("ZARA COAT 3334");
		Assert.assertFalse(match);
				
	}

}
