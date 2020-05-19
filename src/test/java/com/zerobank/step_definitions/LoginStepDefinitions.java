package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
;


public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();



    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.signInButonclick();
    }

    @Then("user enters credentials")
    public void user_enters_credentials() {

        loginPage.login();

    }

    @Then("authorized user should be able to login")
    public void authorized_user_should_be_able_to_login() {
        Assert.assertEquals("username", loginPage.usernameMenu.getText());
    }

    @Then("account summary page should be displayed")
    public void account_summary_page_should_be_displayed() {
        String expectedURL = "http://zero.webappsecurity.com/bank/account-summary.html";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }


    @Then("user enters credentials with Wrong UserName")
    public void user_enters_credentials_with_Wrong_UserName() {

        loginPage.login("wrongUsername","password");

    }

    @Then("user should not able to login")
    public void user_should_not_able_to_login() {
        String expectedURL = "http://zero.webappsecurity.com/login.html?login_error=true";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }

    @Then("user enters credentials with Wrong Password")
    public void user_enters_credentials_with_Wrong_Password() {


        loginPage.login("username","wrongPassword");
    }

    @When("user enters credentials with Blank Username")
    public void user_enters_credentials_with_Blank_Username() {
        loginPage.login("    ","password");

    }

    @When("user enters credentials with Blank Password")
    public void user_enters_credentials_with_Blank_Password() {
        loginPage.login("username","      ");

    }

    @Then("login error message should be displayed")
    public void login_error_message_should_be_displayed() {
        Assert.assertTrue(loginPage.loginErrorMessage.isDisplayed());
    }

}
