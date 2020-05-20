$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/StatmentAndDocument.feature");
formatter.feature({
  "name": "Statements and Documents",
  "description": "  As user, I should be able to view my statements and documents year in pdf format",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@statement_documents"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Recent statements per year",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user selects the Recent Statements Year \"\u003cyear\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "\"\u003ccount\u003e\" statements should be displayed for that year",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "year",
        "count"
      ]
    },
    {
      "cells": [
        "2009",
        "2"
      ]
    },
    {
      "cells": [
        "2010",
        "2"
      ]
    },
    {
      "cells": [
        "2011",
        "2"
      ]
    },
    {
      "cells": [
        "2012",
        "1"
      ]
    }
  ]
});
formatter.background({
  "name": "Log in and navigate to statements and documents tab",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_enters_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Online Statements\" tab",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.user_navigates_to_tab(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Recent statements per year",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@statement_documents"
    }
  ]
});
formatter.step({
  "name": "the user selects the Recent Statements Year \"2009\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.the_user_selects_the_Recent_Statements_Year(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"2\" statements should be displayed for that year",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.statements_should_be_displayed_for_that_year(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Log in and navigate to statements and documents tab",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_enters_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Online Statements\" tab",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.user_navigates_to_tab(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Recent statements per year",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@statement_documents"
    }
  ]
});
formatter.step({
  "name": "the user selects the Recent Statements Year \"2010\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.the_user_selects_the_Recent_Statements_Year(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"2\" statements should be displayed for that year",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.statements_should_be_displayed_for_that_year(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Log in and navigate to statements and documents tab",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_enters_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Online Statements\" tab",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.user_navigates_to_tab(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Recent statements per year",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@statement_documents"
    }
  ]
});
formatter.step({
  "name": "the user selects the Recent Statements Year \"2011\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.the_user_selects_the_Recent_Statements_Year(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"2\" statements should be displayed for that year",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.statements_should_be_displayed_for_that_year(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Log in and navigate to statements and documents tab",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_enters_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Online Statements\" tab",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.user_navigates_to_tab(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Recent statements per year",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@statement_documents"
    }
  ]
});
formatter.step({
  "name": "the user selects the Recent Statements Year \"2012\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.the_user_selects_the_Recent_Statements_Year(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"1\" statements should be displayed for that year",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.statements_should_be_displayed_for_that_year(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Download statements",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user selects the Recent Statements Year \"\u003cyear\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user clicks on statement \"\u003cstatement\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the downloaded file name should contain \"\u003cname\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "the file type should be \"pdf\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "year",
        "statement",
        "name"
      ]
    },
    {
      "cells": [
        "2009",
        "Statement 31/11/09(57K)",
        "31-11-09"
      ]
    },
    {
      "cells": [
        "2010",
        "Statement 01/12/10(57K)",
        "01-12-10"
      ]
    },
    {
      "cells": [
        "2011",
        "Statement 05/12/11(57K)",
        "05-12-11"
      ]
    },
    {
      "cells": [
        "2012",
        "Statement 01/10/12(57K)",
        "01-10-12"
      ]
    }
  ]
});
formatter.background({
  "name": "Log in and navigate to statements and documents tab",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_enters_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Online Statements\" tab",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.user_navigates_to_tab(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Download statements",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@statement_documents"
    }
  ]
});
formatter.step({
  "name": "the user selects the Recent Statements Year \"2009\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.the_user_selects_the_Recent_Statements_Year(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on statement \"Statement 31/11/09(57K)\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.the_user_clicks_on_statement(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the downloaded file name should contain \"31-11-09\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.the_downloaded_file_name_should_contain(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the file type should be \"pdf\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.the_file_type_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Log in and navigate to statements and documents tab",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_enters_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Online Statements\" tab",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.user_navigates_to_tab(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Download statements",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@statement_documents"
    }
  ]
});
formatter.step({
  "name": "the user selects the Recent Statements Year \"2010\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.the_user_selects_the_Recent_Statements_Year(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on statement \"Statement 01/12/10(57K)\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.the_user_clicks_on_statement(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the downloaded file name should contain \"01-12-10\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.the_downloaded_file_name_should_contain(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the file type should be \"pdf\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.the_file_type_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Log in and navigate to statements and documents tab",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_enters_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Online Statements\" tab",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.user_navigates_to_tab(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Download statements",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@statement_documents"
    }
  ]
});
formatter.step({
  "name": "the user selects the Recent Statements Year \"2011\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.the_user_selects_the_Recent_Statements_Year(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on statement \"Statement 05/12/11(57K)\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.the_user_clicks_on_statement(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the downloaded file name should contain \"05-12-11\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.the_downloaded_file_name_should_contain(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the file type should be \"pdf\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.the_file_type_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Log in and navigate to statements and documents tab",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_enters_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Online Statements\" tab",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.user_navigates_to_tab(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Download statements",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@statement_documents"
    }
  ]
});
formatter.step({
  "name": "the user selects the Recent Statements Year \"2012\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.the_user_selects_the_Recent_Statements_Year(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on statement \"Statement 01/10/12(57K)\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.the_user_clicks_on_statement(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the downloaded file name should contain \"01-10-12\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.the_downloaded_file_name_should_contain(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the file type should be \"pdf\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.step_definitions.StatementsAndDocumentsSteps.the_file_type_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});