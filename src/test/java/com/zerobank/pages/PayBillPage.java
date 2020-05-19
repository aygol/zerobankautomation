package com.zerobank.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class PayBillPage extends BasePage {
    @FindBy(css = "[id=alert_content]")
    protected WebElement sucsesAlert;
    @FindBy(xpath = "//*[@id='sp_payee']/option")
    protected List<WebElement> payeeOption;
    @FindBy(xpath = "//*[@id='sp_account']/option")
    protected List<WebElement> accountsType;
    @FindBy(id = "sp_date")
    protected WebElement dates;
    @FindBy(id = "sp_amount")
    protected WebElement amount;
    @FindBy(id = "sp_description")
    protected WebElement description;
    @FindBy(xpath = "//*[@type='submit']")
    protected WebElement submit;
    @FindBy(xpath = "//*[@data-dismiss='alert']")
    protected WebElement dismissAlert;
    @FindBy(xpath = "//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[4]/a")
    protected WebElement datePicker_13;


    public String getBilPageTitle() {
        return driver.getTitle();
    }

    public String getsuccessAlert() {
        return sucsesAlert.getText();
    }

    public void choosePaye() {
        payeeOption.get(0).click();
    }

    public void chooseAccountsType() {
        accountsType.get(0).click();
    }

    public void sendDate(String date) {
        dates.click();
        dates.sendKeys(date, Keys.TAB);
    }

    public void sendAmount(String amountmoney) {
        amount.sendKeys(amountmoney);
    }

    public void sendDescription(String descriptions) {
        description.sendKeys(descriptions);
    }

    public void submit() {
        submit.click();
    }

    public void alert_dismiss() {
        dismissAlert.click();

    }

    public String getalertText() {
        String message = driver.findElement(By.id("sp_amount")).getAttribute("validationMessage");
        return message;
    }
    public void cliclDate13(){
        dates.click();
        datePicker_13.click();
    }
}
