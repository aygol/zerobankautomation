package com.zerobank.step_definitions;

import com.zerobank.pages.AddPayee;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.util.Map;
public class AddNewPayee_stepDefinitions {
    AddPayee addPayee = new AddPayee();

    @Given("user navigate Pay Bills page")
    public void user_navigate_Pay_Bills_page() {
        addPayee.navigateTo("Pay Bills");
        System.out.println("user navigate Pay Bills page");
    }

    @Given("Add New Payee tab")
    public void add_New_Payee_tab() {
        addPayee.clickAddNewPayeeTab();
        System.out.println("Add New Payee tab");
    }

    @Given("creates	new	payee using following information")
    public void creates_new_payee_using_following_information(Map<String, String> dataTable) {

        BrowserUtils.wait(2);
        addPayee.sendPayeeName(dataTable.get("Payee Name"));
        addPayee.sendPayeeAddress(dataTable.get("Payee Address"));
        addPayee.sendPayeeAccount(dataTable.get("Account"));
        addPayee.sendPayeeDetails(dataTable.get("Payee details"));

        addPayee.clickAddNewPayeeButton();
    }

    @Then("message The new payee The Law Offices of Hyde, Price & Scharks was successfully created. should be displayed")
    public void message_The_new_payee_The_Law_Offices_of_Hyde_Price_Scharks_was_successfully_created_should_be_displayed() {

       String expected="The new payee The Law Offices of Hyde, Price & Scharks was successfully created.";
        Assert.assertEquals(expected,addPayee.alertDetails());
    }

}
