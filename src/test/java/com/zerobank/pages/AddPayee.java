package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AddPayee extends BasePage {
    @FindBy(linkText = "Add New Payee")
    protected WebElement addNewPayee;
    @FindBy(xpath="//*[@id='np_new_payee_name' and @name='name']")
    protected WebElement newPayeeName;
    @FindBy(xpath= "//*[@id='np_new_payee_address']")
    protected WebElement newPayeeAddres;
    @FindBy(id = "np_new_payee_account")
    protected WebElement newPayeeAccount;
    @FindBy(id = "np_new_payee_details")
    protected WebElement newPayeeDetails;
    @FindBy(id = "add_new_payee")
    protected WebElement addNewPayeeButton;
    @FindBy(id = "alert_content")
    protected WebElement addNewPayeeAlert;



    public void clickAddNewPayeeTab() {
        BrowserUtils.waitForPageToLoad(10);

        addNewPayee.click();
    }

    public void clickAddNewPayeeButton() {
        addNewPayeeButton.click();
    }

    public void sendPayeeName(String payeename) {
        BrowserUtils.waitForPageToLoad(10);
        wait.until(ExpectedConditions.visibilityOf(newPayeeName));
        newPayeeName.click();
        newPayeeName.sendKeys(payeename, Keys.TAB);
    }

    public void sendPayeeAddress(String address) {
        newPayeeAddres.sendKeys(address,Keys.TAB);
        BrowserUtils.wait(2);
    }

    public void sendPayeeAccount(String account) {
        BrowserUtils.wait(2);
        newPayeeAccount.sendKeys(account,Keys.TAB);
    }

    public void sendPayeeDetails(String details) {
        BrowserUtils.wait(2);
        newPayeeDetails.sendKeys(details,Keys.TAB);
    }
    public String alertDetails() {
wait.until(ExpectedConditions.visibilityOf(addNewPayeeAlert));

  return    addNewPayeeAlert.getText()  ;
    }
}