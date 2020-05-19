package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummary;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.util.List;


public class  Account_Summary_stepDefinitions {
    AccountSummary accountSummary = new AccountSummary();

    @Then("page title 	Zero – Account Summary displayed")
    public void page_title_Zero_Account_Summary_displayed() {
        String title = accountSummary.getTitle();
        String expectedTitle = "Zero - Account Summary";
        System.out.println("page title 	Zero – Account Summary displayed");
        Assert.assertEquals(expectedTitle, title);
    }

    @Then("Summary page should have following")
    public void summary_page_should_have_following(List<String> dataTable) {
        Assert.assertEquals(dataTable, accountSummary.getheaderElements());
    }

    @Then("Credit	Accounts table	must have columns")
    public void credit_Accounts_table_must_have_columns(List<String> dataTable) {
     Assert.assertEquals(dataTable,accountSummary.getCreditColumnNames());
    }


}
