package com.zerobank.step_definitions;

import com.zerobank.pages.ForeignCurrencyPage;

import com.zerobank.utilities.Utils_2;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.util.List;


public class ForeignCurrencyStepDefinitions {
    ForeignCurrencyPage foreignCurrencyPage = new ForeignCurrencyPage();


    @Then("the user accesses the Purchase foreign currency cash tab")
    public void the_user_accesses_the_Purchase_foreign_currency_cash_tab() {
        foreignCurrencyPage.clickForignCurrencyTab();
        System.out.println("User accessed foreignCurrency Tab");

    }

    @Then("following currencies should be available:")
    public void following_currencies_should_be_available(List<String>  dataTable) {
        Assert.assertEquals(foreignCurrencyPage.currencyName(),dataTable);

    }


    @When("user tries to calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {


         foreignCurrencyPage.setamount("3000");
        foreignCurrencyPage.setPc_calculate_costs();

    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {

        String message = foreignCurrencyPage.getAlertText();

        String expectedMessage = "Please, ensure that you have filled all the required fields with valid values.";
       Assert.assertEquals(expectedMessage, message);
    }

    @When("user tries to calculate cost without entering a value")
    public void user_tries_to_calculate_cost_without_entering_a_value() {
        foreignCurrencyPage.selectCurrency("Denmark\t(krone)");
        foreignCurrencyPage.selectedCurrency();
        foreignCurrencyPage.setPc_calculate_costs();
    }






}
