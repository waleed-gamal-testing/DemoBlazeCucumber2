package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//h3[@id=\"totalp\"]")
    WebElement totalPriceMsg ;
    @FindBy(xpath = "//button[contains(text(),\"Place Order\")]")
    WebElement placeOrderBtn ;
    @FindBy(xpath = "//*[contains(text(),\"Delete\")]")
    WebElement deleteBtn ;
    public String validateTotalPrice()
    {
        return totalPriceMsg.getText();
    }
    public PurchasePage clickOnPlaceHolderBtn() throws InterruptedException {
        placeOrderBtn.click();
        Thread.sleep(1000);
        return new PurchasePage(driver);
    }
    public CartPage clickOnDeleteBtn() throws InterruptedException {
        deleteBtn.click();
        Thread.sleep(700);
        return this ;
    }

}
