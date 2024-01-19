package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends TestBase{

    HomePage object;
//
//    @DataProvider(name = "ExcelData")
//    public Object[][] LoginData() throws IOException {
//        // get data from ExcelReader Class
//        DataReaderExcelSheet Reader = new DataReaderExcelSheet();
//        return Reader.getExcelData(0);
//    }

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
    }
}
