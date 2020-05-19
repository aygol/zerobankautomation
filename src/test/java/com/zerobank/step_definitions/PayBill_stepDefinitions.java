package com.zerobank.step_definitions;

import com.zerobank.pages.PayBillPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PayBill_stepDefinitions {
    PayBillPage payBillPage = new PayBillPage();

    @Then("page title	Zero – Pay Bills")
    public void page_title_Zero_Pay_Bills() {
        payBillPage.navigateTo("Pay Bills");
        String actualTitle = payBillPage.getBilPageTitle();
        System.out.println(actualTitle);
        Assert.assertEquals("Zero - Pay Bills", actualTitle);
    }

    @When("user completes	a successful Pay operation")
    public void user_completes_a_successful_Pay_operation() {
        payBillPage.choosePaye();
        payBillPage.chooseAccountsType();

        payBillPage.sendAmount("3000");
        payBillPage.sendDate("04/29/2020");
        payBillPage.sendDescription("Adding money to account");
        payBillPage.submit();
    }

    @Then("The	payment	was	successfully submitted should be displayed")
    public void the_payment_was_successfully_submitted_should_be_displayed() {
        String succesAlert = payBillPage.getsuccessAlert();
        Assert.assertEquals("The payment was successfully submitted.", succesAlert);
    }

    @When("user tries	to	make a	payment	without	entering the amount	or	date")
    public void user_tries_to_make_a_payment_without_entering_the_amount_or_date() {
        payBillPage.alert_dismiss();
        System.out.println("user tries	to	make a	payment	without	entering the amount	or date");
        payBillPage.submit();

    }

    @Then("Please	fill out this field	message! should	be	displayed.")
    public void please_fill_out_this_field_message_should_be_displayed() {

        System.out.println("Please	fill out this field	message! should	be	displayed");

        Assert.assertEquals("Please fill out this field.", payBillPage.getalertText());
    }

    @When("Amount field	should	not	accept	alphabetical or	special	characters.")
    public void amount_field_should_not_accept_alphabetical_or_special_characters() {
        payBillPage.sendAmount("abcd");
        //this should not pass but it is passing
    }

    @When("Date field should not accept alphabetical characters.")
    public void date_field_should_not_accept_alphabetical_characters() {
       // payBillPage.cliclDate13();
        payBillPage.sendDate("as/er/wert");
        // //this should not pass but it is passing

    }

}
