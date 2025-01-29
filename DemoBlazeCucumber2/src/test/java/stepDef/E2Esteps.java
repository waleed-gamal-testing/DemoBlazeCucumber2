package stepDef;

import com.github.javafaker.Faker;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.*;

public class E2Esteps {

    Faker faker = new Faker();
    String username = "test";
    String password = "test";
    String userNameFake = faker.name().firstName().concat("1081996");
    String countryFake = faker.internet().password().concat("1081996");
    String monthFake = faker.internet().password().concat("1081996");
    String cardFake = faker.internet().password().concat("1081996");
    String cityFake = faker.internet().password().concat("1081996");
    String yearFake = faker.internet().password().concat("1081996");
    WebDriver driver = Hooks.getDriver();
    MainPage mainPage = new MainPage(driver);
    // SignUpPage signUpPage = new SignUpPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    ProductPage productPage = new ProductPage(driver);
    CartPage cartPage = new CartPage(driver);
    PurchasePage purchasePage = new PurchasePage(driver);

//
    @Given("user opens url of website and open login link")
    public void userOpensUrlOfWebsiteAndOpenLoginLink() throws InterruptedException {

        mainPage.clickOnLoginBtnNavBar().addUserNameAndPassword(username,password).clickOnLoginBtn();
        throw new io.cucumber.java.PendingException();
    }

    @Then("user can move to home page")
    public void userCanMoveToHomePage() throws InterruptedException {
        String actualWelcomeMsg = homePage.validateWelcomeMsg();
        String expectedWelcomeMsg = "Welcome test";
        Assert.assertTrue(actualWelcomeMsg.contains(expectedWelcomeMsg));
        throw new io.cucumber.java.PendingException();

    }

    @Then("user can move to product page and check price of item correctly")
    public void userCanMoveToProductPageAndCheckPriceOfItemCorrectly() throws InterruptedException {
        homePage
                .clickOnLaptopCategory()
                .clickOnFirstProduct()
                .clickOnAddToCartBtn1()
                .acceptAlert()
                .clickOnHomeBtn()
                .clickOnLaptopCategory()
                .clickOnSecondProduct()
                .clickOnAddToCartBtn2()
                .acceptAlert();
        throw new io.cucumber.java.PendingException();
    }

    @Then("user can accept alert message and check correct message")
    public void userCanAcceptAlertMessageAndCheckCorrectMessage() {
        productPage.validateAlertMsgWhenAddProduct();
        throw new io.cucumber.java.PendingException();
    }

    @When("user press on cart link and click on place holder")
    public void userPressOnCartLinkAndClickOnPlaceHolder() throws InterruptedException {
        productPage.clickOnCartBtn().clickOnPlaceHolderBtn();
        throw new io.cucumber.java.PendingException();
    }

    @And("user add all valid data and click on purchase btn")
    public void userAddAllValidDataAndClickOnPurchaseBtn() throws InterruptedException {
        purchasePage.addDataInPurchasingCart(userNameFake,cityFake,cardFake,monthFake,yearFake,countryFake).clickONConfirmationBtn();
        throw new io.cucumber.java.PendingException();
    }

    @Then("user check confirmation msg and click on confirm btn")
    public void userCheckConfirmationMsgAndClickOnConfirmBtn() {
        String actualConfirmationMsg = purchasePage.validateConfirmationMsg();
        String expectedConfirmationMsg = "Thank you for your purchase!";
        throw new io.cucumber.java.PendingException();
    }
}
