$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "User should be able to login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginTest"
    },
    {
      "name": "@smoke_test"
    }
  ]
});
formatter.background({
  "name": "",
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
formatter.scenario({
  "name": "Authorized user able to login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginTest"
    },
    {
      "name": "@smoke_test"
    }
  ]
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
  "name": "authorized user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.authorized_user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "account summary page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.account_summary_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
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
formatter.scenario({
  "name": "User with wrong username can\u0027t login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginTest"
    },
    {
      "name": "@smoke_test"
    }
  ]
});
formatter.step({
  "name": "user enters credentials with Wrong UserName",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_enters_credentials_with_Wrong_UserName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should not able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_should_not_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login error message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.login_error_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
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
formatter.scenario({
  "name": "User with wrong password should not able login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginTest"
    },
    {
      "name": "@smoke_test"
    }
  ]
});
formatter.step({
  "name": "user enters credentials with Wrong Password",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_enters_credentials_with_Wrong_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should not able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_should_not_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login error message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.login_error_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
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
formatter.scenario({
  "name": "User with Blank Username should not able to login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginTest"
    },
    {
      "name": "@smoke_test"
    }
  ]
});
formatter.step({
  "name": "user enters credentials with Blank Username",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_enters_credentials_with_Blank_Username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should not able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_should_not_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login error message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.login_error_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
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
formatter.scenario({
  "name": "User with Blank Password should not able to login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LoginTest"
    },
    {
      "name": "@smoke_test"
    }
  ]
});
formatter.step({
  "name": "user enters credentials with Blank Password",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_enters_credentials_with_Blank_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should not able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.user_should_not_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login error message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.step_definitions.LoginStepDefinitions.login_error_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});