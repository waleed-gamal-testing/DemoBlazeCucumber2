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

public class EndToEndStep {
    Faker faker = new Faker();
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

   /* @Given("user opens homepage and click on login link and add valid used username and password and press on login button")
    public void userOpensHomepageAndClickOnLoginLinkAndAddValidUsedUsernameAndPasswordAndPressOnLoginButton() throws InterruptedException {
        mainPage.clickOnLoginBtnNavBar();
        loginPage.addUserNameAndPassword("test","test");
        loginPage.clickOnLoginBtn();
    }*/

   /* @And("check correct welcome message")
    public void checkCorrectWelcomeMessage() throws InterruptedException {
        String actualWelcomeMsg  = homePage.validateWelcomeMsg();
        String expectedWelcomeMsg = "Welcome test";
        System.out.println(actualWelcomeMsg);
        Assert.assertTrue(actualWelcomeMsg.contains(expectedWelcomeMsg));
    }*/

    @When("click on laptop category and click on first product in it")
    public void clickOnLaptopCategoryAndClickOnFirstProductInIt() {
        homePage.clickOnLaptopCategory();
        homePage.clickOnFirstProduct();
    }

    @And("user switched to product page and click on add to cart button")
    public void userSwitchedToProductPageAndClickOnAddToCartButton() throws InterruptedException {
        productPage.clickOnAddToCartBtn1();

    }

    @And("check alert message appears when product is added and accept alert message")
    public void checkAlertMessageAppearsWhenProductIsAddedAndAcceptAlertMessage() throws InterruptedException {
        String actualAlertMsg = productPage.validateAlertMsgWhenAddProduct();
        String expectedAlertMsg = "Product added.";
        Assert.assertTrue(actualAlertMsg.contains(expectedAlertMsg));
        productPage.acceptAlert();
    }

    @And("click on home button in nav bar")
    public void clickOnHomeButtonInNavBar() throws InterruptedException {
        productPage.clickOnHomeBtn();
    }

    @And("click on laptop category and click on second product in it")
    public void clickOnLaptopCategoryAndClickOnSecondProductInIt() throws InterruptedException {
        homePage.clickOnLaptopCategory();
        homePage.clickOnSecondProduct();
        productPage.clickOnAddToCartBtn2();
        productPage.acceptAlert();
    }

    @And("click on cart button in nav bar and check total price is correct")
    public void clickOnCartButtonInNavBarAndCheckTotalPriceIsCorrect() throws InterruptedException {
        productPage.clickOnCartBtn();
        String actualTotalPrice = cartPage.validateTotalPrice();
        String expectedTotalPrice = "1580";
        Assert.assertTrue(actualTotalPrice.contains(expectedTotalPrice));

    }

    @And("click on placeHolder button and add all valid credential data and click on purchase button")
    public void clickOnPlaceHolderButtonAndAddAllValidCredentialDataAndClickOnPurchaseButton() throws InterruptedException {
        cartPage.clickOnPlaceHolderBtn();
        purchasePage.addDataInPurchasingCart(userNameFake,countryFake,cityFake,cardFake,monthFake,yearFake);

    }

    @Then("check alert message that show complete purchasing process")
    public void checkAlertMessageThatShowCompletePurchasingProcess() {
        String actualConfirmationMsg = purchasePage.validateConfirmationMsg();
        String expectedConfirmationMsg ="Thank you for your purchase!";
        Assert.assertTrue(actualConfirmationMsg.contains(expectedConfirmationMsg));
    }

    @Given("user opens homepage and click on login link and add valid used username and password and press on login buttonAnd check correct welcome message")
    public void userOpensHomepageAndClickOnLoginLinkAndAddValidUsedUsernameAndPasswordAndPressOnLoginButtonAndCheckCorrectWelcomeMessage() throws InterruptedException {
        mainPage.clickOnLoginBtnNavBar();
        loginPage.addUserNameAndPassword("test","test");
        loginPage.clickOnLoginBtn();
        /*String actualWelcomeMsg  = homePage.validateWelcomeMsg();
        String expectedWelcomeMsg = "Welcome test";
        System.out.println(actualWelcomeMsg);
        Assert.assertTrue(actualWelcomeMsg.contains(expectedWelcomeMsg));*/
    }
}
