$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechFios_Login.feature");
formatter.feature({
  "line": 2,
  "name": "Validate Login Page functionality",
  "description": "",
  "id": "validate-login-page-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.before({
  "duration": 14938433400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on the TechFios Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefs.user_is_on_the_TechFios_Login_Page()"
});
formatter.result({
  "duration": 769850900,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User should be able to login with valid credentials(Making Variables work as Placeholders)",
  "description": "",
  "id": "validate-login-page-functionality;user-should-be-able-to-login-with-valid-credentials(making-variables-work-as-placeholders)",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enter password as \"abc123\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User clicks on Signin Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should land on Dashboard Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "StepDefs.user_enters_username_as(String)"
});
formatter.result({
  "duration": 215245500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 24
    }
  ],
  "location": "StepDefs.user_enter_password_as(String)"
});
formatter.result({
  "duration": 180256100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.user_clicks_on_Signin_Button()"
});
formatter.result({
  "duration": 2247260400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefs.user_should_land_on_Dashboard_Page()"
});
formatter.result({
  "duration": 834272900,
  "status": "passed"
});
formatter.after({
  "duration": 1754179500,
  "status": "passed"
});
});