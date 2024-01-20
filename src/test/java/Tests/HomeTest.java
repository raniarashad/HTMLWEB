package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends TestBase{

    HomePage object;

    @Test(priority = 1)
    public void AddToBasket() throws Exception {
        object = new HomePage(driver);
        Assert.assertTrue(object.Thinking_In_HTML_Card.isDisplayed());
        object.ClickOnAddBasketBtnForThinkingInHTMLCard();
    }
    @Test(priority = 2)
    public void ViewShoppingCarr()
    {
        object = new HomePage(driver);
        object.ClickOnShoppingCartIcon();
        // object.dismissAlert();
    }
}
