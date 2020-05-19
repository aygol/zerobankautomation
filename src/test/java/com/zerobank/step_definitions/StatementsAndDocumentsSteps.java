package com.zerobank.step_definitions;
import com.zerobank.pages.StatementAndDocumentPage;
import com.zerobank.utilities.Utils_2;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class StatementsAndDocumentsSteps {

    StatementAndDocumentPage statementAndDocumentPage = new StatementAndDocumentPage();
    @When("user navigates to {string} tab")
    public void user_navigates_to_tab(String string) {
        statementAndDocumentPage.navigateTo(string);
    }



    @When("the user selects the Recent Statements Year {string}")
    public void the_user_selects_the_Recent_Statements_Year(String string) {
        statementAndDocumentPage.clickYearOrStatement(string);
    }
    @Then("{string} statements should be displayed for that year")
    public void statements_should_be_displayed_for_that_year(String string) {
  Assert.assertEquals(string,statementAndDocumentPage.getYearTableSize());
    }
    @When("the user clicks on statement {string}")
    public void the_user_clicks_on_statement(String string) {
        statementAndDocumentPage.clickYearOrStatement(string);
    }
    @Then("the downloaded file name should contain {string}")
    public void the_downloaded_file_name_should_contain(String string) {
     Assert.   assertTrue(Utils_2.isFileDownloaded(string));
    }
    @Then("the file type should be {string}")
    public void the_file_type_should_be(String string) {
      Assert.assertEquals(string,Utils_2.verifyFileExtension(string));

    }
}
