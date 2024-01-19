package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h3[text()='Thinking in HTML']")
    public WebElement Thinking_In_HTML_Card;

    @FindBy(xpath = "//h3[text()='Thinking in HTML']/../../a[2]")
    WebElement AddBasketBtnForThinkingInHTMLCard;

    @FindBy(className = "wpmenucart-icon-shopping-cart-0")
    WebElement ShoppingCartICon;

    public void ClickOnAddBasketBtnForThinkingInHTMLCard() {
        ClickButton(AddBasketBtnForThinkingInHTMLCard);
    }

    public void ClickOnShoppingCartIcon()
    {
        ClickButton(ShoppingCartICon);
    }
}
