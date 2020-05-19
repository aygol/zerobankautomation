package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import com.zerobank.utilities.Utils_2;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ForeignCurrencyPage extends BasePage {


    @FindBy(linkText = "Purchase Foreign Currency")
    protected WebElement foreignCurrencyTab;

    @FindBy(xpath = "//select[@id='pc_currency' and @class='span4']")
    protected WebElement selectCurrency;
    @FindBy(id = "pc_amount")
    protected WebElement pcAmount;
    @FindBy(id = "pc_inDollars_true")
    protected WebElement usaDolar;
    @FindBy(id = "pc_inDollars_false")
    protected WebElement selectedCurrency;
    @FindBy(id = "pc_calculate_costs")
    protected WebElement pc_calculate_costs;
    @FindBy(xpath = "//*[@for='pc_amount' and text()='Conversion Amount']")
    protected WebElement conversionAmount;
    @FindBy(id = "purchase_cash")
    protected WebElement purchase_cash;
    @FindBy(id = "pc_currency")
    public WebElement currencySelect;
    Select select = new Select((currencySelect));
    List<WebElement> currencyTypeOptions = select.getOptions();
    public List<String >currencyName(){

     return  BrowserUtils.getTextFromWebElements(currencyTypeOptions);
   }



    public boolean avaliableCurrency(List<String> currencyType) {

        if (currencyTypeOptions.containsAll(currencyType)) {
            return true;
        }
        return false;
    }

    public void clickForignCurrencyTab() {
        BrowserUtils.waitForPageToLoad(10);
        driver.switchTo().frame(foreignCurrencyTab);
        foreignCurrencyTab.click();

    }
public void selectCurrency(String currencyType)
{
    BrowserUtils.wait(4);
        select.selectByVisibleText(currencyType);
}
public void setamount(String money){
    wait.until(ExpectedConditions.visibilityOf(pcAmount));
    pcAmount.click();
    pcAmount.sendKeys(money);
}
public void selectUSDolar(){

        usaDolar.click();
}
    public void selectedCurrency(){
        selectedCurrency.click();
    }
    public void setPc_calculate_costs(){
        pc_calculate_costs.click();
    }public void setConversionAmount(){
        conversionAmount.click();
    }
    public void setPurchase_cash(){
        purchase_cash.click();
    }

    public String getAlertText() {
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = Driver.getDriver().switchTo().alert();

        if (alert.getText().isEmpty()) {
        return    "No Alert Appeared";

        } else {
            return alert.getText();
        }}}
