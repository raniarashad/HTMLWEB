package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;

import java.util.Optional;

public class CartTest extends TestBase {

    HomePage homeObject;
    CartPage CartObject;

    @Test(priority = 1)
    public void VerifyCartItemDetails() throws Exception {
        homeObject = new HomePage(driver);
        CartObject = new CartPage(driver);
//        homeObject.dismissAlert();
        Integer PriceInHome = Integer.valueOf(homeObject.getPrice());
        Integer PriceInCartPage = Integer.valueOf(CartObject.getProductPriceFromCartPage());
        Assert.assertEquals(PriceInHome, PriceInCartPage);
        Integer Subtotal = Integer.valueOf(CartObject.getSubTotal());
        Assert.assertEquals(Subtotal, PriceInCartPage);
        Integer tax = Integer.valueOf(CartObject.getTaxAmount());
        Integer total = Integer.valueOf(CartObject.getCartTotal());
        Assert.assertEquals(Optional.of(total), (tax + Subtotal));
    }

    @Test(priority = 2)
    public void ProceedToCheckoutBtn() {
        CartObject = new CartPage(driver);
        CartObject.ClickOnCheckOutBtn();
    }

    @Test(priority = 3)
    public void VerifyBillingDetails() {
        CartObject = new CartPage(driver);
        Integer tax = Integer.valueOf(CartObject.getTaxAmount());
        Integer total = Integer.valueOf(CartObject.getCartTotal());
        Integer Subtotal = Integer.valueOf(CartObject.getSubTotal());
        Assert.assertEquals(Optional.of(total), (tax + Subtotal));
    }

}
