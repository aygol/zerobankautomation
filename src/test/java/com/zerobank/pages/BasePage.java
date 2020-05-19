package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 25);

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//i[@class='icon-user']//..")
    public WebElement usernameMenu;
    @FindBy(id = "account_summary_tab")
    protected WebElement accountSummaryTab;
    @FindBy(id = "account_activity_tab")
    protected WebElement accountActivityTab;
    @FindBy(id = "transfer_funds_tab")
    protected WebElement transferFundsTab;
    @FindBy(id = "money_map_tab")
    protected WebElement moneyMapTab;
    @FindBy(id = "online_statements_tab")
    protected WebElement onlineStatementsTab;
    @FindBy(id = "pay_bills_tab")
    protected WebElement payBillsTab;
    @FindBy(id = "signin_button")
    public WebElement signInButton;
    public void navigateTo(String tabName) {
        switch (tabName) {
            case "Account Summary":
                accountSummaryTab.click();
                break;
            case "Pay Bills":
            payBillsTab.click();
            break;
            case "Transfer Funds":
                transferFundsTab.click();
                break;
            case "Account Activity":
                accountActivityTab.click();
                break;
            case "My Money Map":
                moneyMapTab.click();
                break;
            case "Online Statements":
                onlineStatementsTab.click();
                break;
            default:
                throw new RuntimeException("Wrong Tab name!");
        }
    }


}

