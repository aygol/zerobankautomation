package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivity;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AccountActivity_StepDefinitions {
    AccountActivity accountActivity=new AccountActivity();
    @When("user navigate Account Activity page")
    public void user_navigate_Account_Activity_page() {
      accountActivity.navigateTo("Account Activity");
    }

    @Then("page title Zero - Account Activity displayed")
    public void page_title_Zero_Account_Activity_displayed() {
        System.out.println("page title Zero - Account Activity displayed");
        Assert.assertEquals("Zero - Account Activity",accountActivity.getActivityPagetitle());
    }

    @Then("In	the	Account	drop down default option should	be Savings")
    public void in_the_Account_drop_down_default_option_should_be_Savings() {
        System.out.println("the	Account	drop down default option should	be Savings");
        Assert.assertEquals("Savings",accountActivity.firstAccountOption());
    }

    @Then("Account	drop down should have following")
    public void account_drop_down_should_have_following(List<String> dataTable) {
        System.out.println("Account	drop down should have following "+dataTable);
        Assert.assertEquals(dataTable,accountActivity.getAccoutSelection());

    }

    @Then("Transactions table should have column names")
    public void transactions_table_should_have_column_names(List<String>dataTable) {
        System.out.println("Transactions table should have column names "+dataTable);
        Assert.assertEquals(dataTable,accountActivity.getTransctionRow());
    }

}
