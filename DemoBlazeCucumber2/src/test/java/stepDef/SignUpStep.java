package stepDef;

import com.github.javafaker.Faker;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.MainPage;
import pages.SignUpPage;

public class SignUpStep {
    Faker faker = new Faker();
    String userNameFake = faker.name().firstName().concat("1081996");
    String passwordFake = faker.internet().password().concat("1081996");
    WebDriver driver = Hooks.getDriver();
    MainPage mainPage = new MainPage(driver);
    SignUpPage signUpPage = new SignUpPage(driver);

    @Given("user opens homePage and click on signUp link")
    public void userOpensHomePageAndClickOnSignUpLink() {
        mainPage.clickOnSignUpBtnNavBar();
    }

    @When("user enters unique valid userName and valid password and click on signUp button")
    public void userEntersUniqueValidUserNameAndValidPasswordAndClickOnSignUpButton() throws InterruptedException {
        signUpPage.addNewUsernameAndPassword(userNameFake,passwordFake);
        signUpPage.clickOnSignUpBtn();

    }

    @Then("alert message appears that Sign up successful")
    public void alertMessageAppearsThatSignUpSuccessful() {
        String actualMsg = signUpPage.validateSuccessMsg();
        String expectedMsg = "Sign up successful.";
        Assert.assertTrue(actualMsg.contains(expectedMsg));
    }

    @When("user enters exist  {string} and  {string} and click on signUp button")
    public void userEntersExistAndAndClickOnSignUpButton(String useName, String password) throws InterruptedException {
        signUpPage.addNewUsernameAndPassword(useName,password);
        signUpPage.clickOnSignUpBtn();
    }

    @Then("alert error message appears that user already exist")
    public void alertErrorMessageAppearsThatUserAlreadyExist() {
        String actualMsg = signUpPage.validateSuccessMsg();
        String expectedMsg = "This user already exist.";
        Assert.assertTrue(actualMsg.contains(expectedMsg));
    }
}
