package com.zerobank.step_definitions;


import com.zerobank.pages.FindTransaction;

import com.zerobank.utilities.Utils_2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class FindTransActionStepDefinition {
    FindTransaction findTransaction = new FindTransaction();


    @Given("the  user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
        findTransaction.navigateTo("Account Activity");
        findTransaction.clickTransaction();
        System.out.println("The  user accesses the Find Transactions tab");
    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String string, String string2) {
        findTransaction.sendDateInputBox(string, string2);
    }

    @When("clicks search")
    public void clicks_search() {
        findTransaction.clickFindButton();

    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String startDate, String endDate) {
        int fromDate = Integer.parseInt(startDate.replace("-", ""));
        int toDate = Integer.parseInt(endDate.replace("-", ""));
        List<Integer> list = findTransaction.dateListColumn();
        Collections.sort(list);
        Assert.assertTrue(list.get(0) >= fromDate && list.get(list.size() - 1) <= toDate);
    }


    @Then("the  results  should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {
        List<Integer> actualOrder = findTransaction.dateListColumn();
        List<Integer> expectedOrder = Utils_2.sortListDescending(actualOrder);
        Assert.assertEquals(expectedOrder, actualOrder);
    }

    @Then("the  results  table  should only not  contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String date) {
        Integer temp = Integer.parseInt(date.replace("-", ""));

        List<Integer> list = findTransaction.dateListColumn();
        //compare each element of the list with the expected date result
        for (Integer each : list) {
            Assert.assertFalse(temp.equals(each));
        }

    }

    @When("the user enters {string} {string}")
    public void the_user_enters(String string, String string2) {
        findTransaction.sendInfoToBox(string, string2);
    }
    @Then("{string} results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String string, String string2) {
   boolean actual=findTransaction.Stringcontaining(string2);
   Assert.assertTrue(actual);
    }

    @Then("{string} results table should not show descriptions containing {string}")
    public void results_table_should_not_show_descriptions_containing(String string, String string2) {
        boolean actual=findTransaction.containsList(string2);
        Assert.assertFalse(actual);
    }
    @Then("results table should show at least one result under {string}")
    public void results_table_should_show_at_least_one_result_under(String string) {
    int size=findTransaction.depositColumnSize(string);
        System.out.println(size);

     Assert.assertTrue(size>=1);

    }
    @When("user selects type {string}")
    public void user_selects_type(String selectType) {
        Select select = new Select(findTransaction.selectType);
        select.selectByVisibleText(selectType);
        findTransaction.clickFindButton();

    }

    @Then("results table should show no result under {string}")
    public void results_table_should_show_no_result_under(String string) {
        int totalResults;
        Utils_2.waitForPresenceOfElement(By.xpath("//div[@id='filtered_transactions_for_account']//tr[1]/td[1]"), 5);
        switch (string) {
            case "Deposit":
                for (WebElement webElement : findTransaction.depositColumn) {
                    Assert.assertTrue(webElement.getText().isEmpty());
                }
                break;
            case "Withdrawal":
                for (WebElement webElement :findTransaction.withdrawalColumn) {
                    Assert.assertTrue(webElement.getText().isEmpty());
                }
                break;
            case "Date":
                for (WebElement webElement : findTransaction.dateColumn) {
                    Assert.assertTrue(webElement.getText().isEmpty());
                }
                break;
            case "Description":
                for (WebElement webElement : findTransaction.descriptionColumn) {
                    Assert.assertTrue(webElement.getText().isEmpty());
                }
                break;
            default:
                System.out.println("no such column");
                throw new NoSuchElementException();
        }
    }
    }







