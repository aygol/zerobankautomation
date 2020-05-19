package com.zerobank.pages;


import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Utils_2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.NoSuchElementException;

public class FindTransaction extends BasePage {
    @FindBy(xpath = "//a[@ href='#ui-tabs-2']")
    protected WebElement findTransaction;

    @FindBy(id = "aa_description")
    protected WebElement findescription;
    @FindBy(id = "aa_fromDate")
    protected WebElement findFromdate;
    @FindBy(id = "aa_toDate")
    protected WebElement findToDate;
    @FindBy(id = "aa_fromAmount")
    protected WebElement findFromAmount;
    @FindBy(id = "aa_type")
    public WebElement selectType;
    @FindBy(id = "aa_toAmount")
    protected WebElement findToAmount;
    @FindBy(xpath = "//*[@id='aa_type']/option")
    protected List<WebElement> findType;
    @FindBy(xpath = "//*[@id='find_transactions_form']/div[2]/button")
    protected WebElement findButton;
    @FindAll(@FindBy(xpath = "//div[@id='filtered_transactions_for_account']//tr/td[3]"))
    public List<WebElement> depositColumn;
    @FindBy(xpath = "//*[@id='filtered_transactions_for_account']/table/tbody/tr[1]/td[1]")
    protected List<WebElement> filteredDateColumn;
    @FindAll(@FindBy(xpath = "//div[@id='filtered_transactions_for_account']//tr/td[4]"))
    public List<WebElement> withdrawalColumn;
    @FindAll(@FindBy(xpath = "//div[@id='filtered_transactions_for_account']//tr/td[2]"))
    public List<WebElement> descriptionColumn;
    @FindAll(@FindBy(xpath = "//div[@id='filtered_transactions_for_account']//tr/td[1]"))
    public List<WebElement> dateColumn;

    public void sendDateInputBox(String startDate, String endDate) {
        wait.until(ExpectedConditions.visibilityOf(findFromdate));
        findFromdate.clear();
        BrowserUtils.wait(3);
        findFromdate.sendKeys(startDate);
        wait.until(ExpectedConditions.visibilityOf(findToDate));
        findToDate.clear();
        findToDate.sendKeys(endDate);


    }

    public boolean Stringcontaining(String input) {
        try {
            Utils_2.waitForPresenceOfElement(By.xpath("//div[@id='filtered_transactions_for_account']//tr[1]/td[1]"), 5);
            List<String> list = BrowserUtils.getTextFromWebElements(descriptionColumn);
            for (String eachElement : list) {
                Assert.assertTrue(eachElement.contains(input));
                return true;
            }
        } catch (NoSuchElementException e) {

        } catch (TimeoutException e) {
            System.out.println("0 search results");
            System.out.println("Table is not displayed on the page if the are no search results");
            Assert.fail("0 search results");
        }
        return false;
    }

    public List<Integer> dateListColumn() {
        Utils_2.waitForPresenceOfElement(By.xpath("//div[@id='filtered_transactions_for_account']//tr[1]/td[1]"), 10);
        List<Integer> list = Utils_2.convertListtoInteger(filteredDateColumn);
        return list;
    }

    public void clickFindButton() {
        wait.until(ExpectedConditions.visibilityOf(findButton));
        findButton.click();
    }

    public void clickTransaction() {
        BrowserUtils.waitForPageToLoad(15);
        findTransaction.click();

    }

    public int depositColumnSize(String column) {


        int totalResults;
        Utils_2.waitForPresenceOfElement(By.xpath("//div[@id='filtered_transactions_for_account']//tr[1]/td[1]"), 15);
        switch (column) {
            case "Deposit":
                totalResults = depositColumn.size();
                return totalResults;

            case "Withdrawal":
                totalResults = withdrawalColumn.size();
                return totalResults;

            case "Date":
                totalResults = dateColumn.size();
                return totalResults;

            case "Description":
                totalResults = descriptionColumn.size();
                return totalResults;

            default:
                System.out.println("no such column");

                throw new NoSuchElementException();

        }

    }

    public void sendInfoToBox(String boxName, String info) {
        BrowserUtils.wait(5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("aa_" + boxName))));
        driver.findElement(By.id("aa_" + boxName)).clear();
        driver.findElement(By.id("aa_" + boxName)).sendKeys(info, Keys.TAB);
    }


    public boolean containsList(String word) {
        wait.until(ExpectedConditions.visibilityOfAllElements(descriptionColumn));
        List<String> list = BrowserUtils.getTextFromWebElements(descriptionColumn);
        for (String each : list) {
            if (each.contains(word)) {
                return true;
            }
        }
        return false;
    }
}

