package com.zerobank.pages;


import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {
    @FindBy(id = "user_login")
    public WebElement username;

    @FindBy(id = "user_password")
    public WebElement password;

    @FindBy(name = "submit")
    public WebElement loginButton;

    @FindBy(xpath = "//div[contains(text(), 'Login and/or')]")
    public WebElement loginErrorMessage;
    @FindBy(id = "logout_link")
    public WebElement logOut;

    public void signInButonclick() {
        signInButton.click();
    }

        public String getWarningMessageText() {

            return loginErrorMessage.getText();
        }

        /**
         * Method to login, version #1
         * Login as a specific user
         *
         * @param usernameValue
         * @param passwordValue
         */
        public void login(String usernameValue, String passwordValue) {
            username.sendKeys(usernameValue);
            password.sendKeys(passwordValue, Keys.ENTER);
            BrowserUtils.waitForPageToLoad(15);
            BrowserUtils.wait(3);
        }

        /**
         * Method to login, version #2
         * Login as a default user
         * Credentials will be retrieved from configuration.properties file
         */
        public void login() {
            username.sendKeys(ConfigurationReader.getProperty("username"));
            password.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);
        BrowserUtils.waitForPageToLoad(15);
            BrowserUtils.wait(3);
        }
    }