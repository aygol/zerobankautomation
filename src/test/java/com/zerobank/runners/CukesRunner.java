package com.zerobank.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/zerobank/step_definitions",
        features = "src/test/resources/features",
        dryRun =false,

        tags ="@statement_documents",
        plugin = {
                "html:target/default-report",
                "json:target/cucumber2.json"
        }

)

public class CukesRunner {


}
//tags ="@statement_documents"
//tags="@LoginTest",
//tags="@PayBill",
//tags="@currency",
//tags =@account_activity
//tags =@Account_summary
//tags =@navigate
//tags ="@addnew",
//tags ="@trans_action",