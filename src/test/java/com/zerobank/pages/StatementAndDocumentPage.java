package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;

import com.zerobank.utilities.Utils_2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class StatementAndDocumentPage extends BasePage {

    @FindBy(linkText = "Online Statements")
    public WebElement onlineStatementsModule;
    @FindBy(linkText = "2012")

    protected WebElement statement_2012;
    @FindBy(linkText = "2011")
    protected WebElement statement_2011;
    @FindBy(linkText = "2010")
    protected WebElement statement_2010;
    @FindBy(linkText = "2009")
    protected WebElement statement_2009;


    public void clickStatements(String year) {
        BrowserUtils.wait(3);
        switch (year) {
            case "2012":
                statement_2012.click();
                break;
            case "2011":
                statement_2011.click();
                break;
            case "2010":
                statement_2010.click();
                break;
            case "2009":
                statement_2009.click();
                break;
            default:
                throw new RuntimeException("there is no such a statement");
        }
    }

    public String getStatementsText(Integer year) {
        BrowserUtils.wait(3);
        switch (year) {
            case 2012:
                return statement_2012.getText();

            case 2011:
                return statement_2011.getText();

            case 2010:
                return statement_2010.getText();

            case 2009:
                return statement_2009.getText();

            default:
                throw new RuntimeException("there is no such a statement");
        }

    }

    public int NumberOfstatements(String year) {
        BrowserUtils.wait(2);
        String path = "//div[@id='os_" + year + "']//a";
        BrowserUtils.wait(2);
        List<WebElement> statements = Driver.getDriver().findElements(By.xpath(path));


        return statements.size();


    }

    public void userClickstatement(String statementName) {
        BrowserUtils.wait(4);
        wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(By.linkText(statementName))));

        Driver.getDriver().findElement(By.linkText(statementName)).click();

    }

    public String dowloadNameContainFileName(String fileName) {
        BrowserUtils.wait(4);
        String path = System.getProperty("user.home") + "/Downloads/8534567-" + fileName + ".pdf";
        return path;

    }  @FindBy(xpath = "//div[@class='tab-pane active']//tbody//tr")
    public List<WebElement> activeYearTable;

    public String getYearTableSize(){
        BrowserUtils.waitForPageToLoad(5);
        return String.valueOf(activeYearTable.size());
    }

    public void clickYearOrStatement(String type){
        BrowserUtils.wait(1);
        String path = "//a[text()='"+type+"']";
        WebElement tab = Driver.getDriver().findElement(By.xpath(path));
        Utils_2.waitForVisibility(tab,5).click();
        BrowserUtils.wait(1);
    }
}
