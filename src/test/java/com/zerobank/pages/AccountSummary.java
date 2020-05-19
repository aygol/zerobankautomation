package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AccountSummary extends BasePage {



    @FindBy(className = "brand")
    protected WebElement brand;
    @FindBy(xpath = "//h2[@class='board-header'][text()='Cash Accounts']")
    protected WebElement cashAccounts;
    @FindBy(xpath = "//h2[@class='board-header'][text()='Investment Accounts']")
    protected WebElement invesmentAccounts;
    @FindBy(xpath = "//h2[@class='board-header'][text()='Loan Accounts']")
    protected WebElement loanAccounts;
    @FindBy(xpath = "//h2[text()='Credit Accounts']")
    protected WebElement creditAccounts;
    @FindBy(xpath = "//div[3]/div/table/thead/tr/th[1]")
    protected WebElement account;
    @FindBy(xpath = "//div[3]/div/table/thead/tr/th[2]")
    protected WebElement creditCard;
    @FindBy(xpath = "//div[3]/div/table/thead/tr/th[3]")
    protected WebElement balance;
    @FindBy(xpath = "(//table/tbody/tr[1]/td[1]/a)[1]")
    protected WebElement savingLink;
    @FindBy(xpath = "//table/tbody/tr[1]/td[1]/a[@href='/bank/account-activity.html?accountId=1' ]")
    protected WebElement brokorageLink;
    @FindBy(xpath = "(//table/tbody/tr[1]/td[1]/a)[3]")
    protected WebElement checkingLink;
    @FindBy(xpath = "(//table/tbody/tr[1]/td[1]/a)[4]")
    protected WebElement loanLink;
    @FindBy(xpath = "(//table/tbody/tr[2]/td[1]/a)[2]")
    protected WebElement credidCardLink;
//
@FindBy(className= "board-header")
protected List< WebElement> headerElement;

    public List<String> getheaderElements() {
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("board-header")));

        return BrowserUtils.getTextFromWebElements(headerElement);
    }


    public String getBrand() {


        return brand.getText();
    }

    public String getCashAccounts() {
        return cashAccounts.getText();
    }

    public String getLoanAccounts() {
        return loanAccounts.getText();
    }

    public String getCreditAccounts() {
        return creditAccounts.getText();
    }

    public String getInvesmentAccount() {
        return invesmentAccounts.getText();
    }

    public String getBalance() {
        return balance.getText();
    }

    @FindBy(xpath = "//h2[text()='Credit Accounts']/..//tr/th[contains(text(),'Credit')]/..//th")
    public List<WebElement> creditCardAccountColumns;


    public List<String> getCreditColumnNames(){
        return BrowserUtils.getTextFromWebElements(creditCardAccountColumns);
    }


    public String getAccount()
    {
        return account.getText();
    }
    public String getTitle(){
        String title=driver.getTitle();
        return title;
    }public String getCreditCard(){

        return getCreditCard();
    }public void clickBrokageLink(){

        brokorageLink.click();
    }
    public void clickSavingLink(){

        savingLink.click();
    }
    public void clickCheckingLink(){
        checkingLink.click();
    }
    public void loanLink(){

        loanLink.click();
    }
    public void credidCardLink(){
        credidCardLink.click();
    }
}
