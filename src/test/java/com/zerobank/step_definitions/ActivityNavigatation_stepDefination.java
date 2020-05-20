package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivity;
import com.zerobank.pages.AccountSummary;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class ActivityNavigatation_stepDefination {

AccountSummary accountSummary=new AccountSummary();
AccountActivity accountActivity=new AccountActivity();
    @When("the user clicks on	Savings	link on	the	Account	Summary	page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
        System.out.println("user clicks on Savings link on the Account Summary page");
        accountSummary.clickSavingLink();
    }

    @Then("the	Account	Activity page should be	displayed")
    public void the_Account_Activity_page_should_be_displayed() {
        System.out.println("the Account Activity page should be displayed");
        Assert.assertEquals("Account Activity",accountActivity.accountActivityPageText());
    }

    @Then("Account	drop down should have Savings selected")
    public void account_drop_down_should_have_Savings_selected() {
        System.out.println("Account	drop down should have Savings selected");
        Assert.assertEquals("Savings",accountActivity.getAccoutSelection().get(0));
    }

    @When("the user clicks on	Brokerage link on the Account Summary page")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {
    accountActivity.navigateTo("Account Summary");

     accountSummary.clickBrokageLink();

    }
    @Then("Account	drop down should have Brokerage selected")
    public void account_drop_down_should_have_Brokerage_selected() {

        Assert.assertEquals("Brokerage",accountActivity.getAccoutSelection().get(5));
    }

    @When("the user clicks on	Checking link on the Account Summary page")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
        accountActivity.navigateTo("Account Summary");
        accountSummary.clickCheckingLink();
    }

    @Then("Account	drop down should have Checking selected")
    public void account_drop_down_should_have_Checking_selected() {
      ;
        Assert.assertEquals("Checking",accountActivity.getAccoutSelection().get(1));
    }

    @When("the user clicks on	Credit card	link on	the	Account	Summary	page")
    public void the_user_clicks_on_Credit_card_link_on_the_Account_Summary_page() {
        accountActivity.navigateTo("Account Summary");
        accountSummary.credidCardLink();
    }

    @Then("Account	drop down should have Credit Card selected")
    public void account_drop_down_should_have_Credit_Card_selected() {

        Assert.assertEquals("Credit Card",accountActivity.getAccoutSelection().get(4));
    }

    @When("the user clicks on	Loan link on the Account Summary page")
    public void the_user_clicks_on_Loan_link_on_the_Account_Summary_page()
    {
        accountActivity.navigateTo("Account Summary");
        accountSummary.loanLink();
    }

    @Then("Account	drop down should have Loan selected")
    public void account_drop_down_should_have_Loan_selected() {
        Assert.assertEquals("Loan",accountActivity.getAccoutSelection().get(3));

    }

}
