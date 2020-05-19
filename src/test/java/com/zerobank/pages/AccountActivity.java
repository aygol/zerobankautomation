package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivity extends BasePage {

    @FindBy(xpath = "//*[@id='aa_accountId']/option")
    protected List<WebElement> accountSelection;

    @FindBy(xpath = "//table/thead/tr/th")
    protected List<WebElement> transactionsTable;
    @FindBy(id = "aa_accountId")
    protected WebElement accountInput;
    //    Select select1=new Select(driver.findElement(By.xpath("//*[@id='aa_accountId']/option[1]")));
//    Select select2=new Select(driver.findElement(By.xpath("//*[@id='aa_accountId']/option[2]")));
//    Select select3=new Select(driver.findElement(By.xpath("//*[@id='aa_accountId']/option[3]")));
//    Select select4=new Select(driver.findElement(By.xpath("//*[@id='aa_accountId']/option[4]")));
//    Select select5=new Select(driver.findElement(By.xpath("//*[@id='aa_accountId']/option[5]")));
//    Select select6=new Select(driver.findElement(By.xpath("//*[@id='aa_accountId']/option[6]")));
    @FindBy(xpath = "//*[@id='aa_accountId']/option[1]")
    protected WebElement accountSaving;
    @FindBy(xpath = "//*[@id='aa_accountId']/option[2]")
    protected WebElement accountChecking;
    @FindBy(xpath = "//*[@id='aa_accountId']/option[3]")
    protected WebElement accountSaving2;
    @FindBy(xpath = "//*[@id='aa_accountId']/option[4]")
    protected WebElement accountLoan;
    @FindBy(xpath = "//*[@id='aa_accountId']/option[5]")
    protected WebElement accountCreditCard;
    @FindBy(xpath = "//*[@id='aa_accountId']/option[6]")
    protected WebElement accountBrokerage;

    public List<String> getAccoutSelection() {
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='aa_accountId']/option")));
        return BrowserUtils.getTextFromWebElements(accountSelection);

    }

    public String firstAccountOption() {
        String savingOption = accountSelection.get(0).getText();
        return savingOption;
    }

    public List<String> getTransctionRow() {
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table/thead/tr/th")));
        return BrowserUtils.getTextFromWebElements(transactionsTable);

    }

    public String getActivityPagetitle() {
        return driver.getTitle();
    }


    public String accountActivityPageText() {
        return accountActivityTab.getText();
    }


     
}

