$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/UseDataFromDatabase.feature");
formatter.feature({
  "line": 2,
  "name": "TechFios Billing Login Functionality validation",
  "description": "",
  "id": "techfios-billing-login-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DbLoginFeature"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 2472739500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "1 User should be able to login with valid credentials",
  "description": "",
  "id": "techfios-billing-login-functionality-validation;1-user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@DbScnenario1"
    },
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on the TechFios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters \"username\" from Techfios database",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters \"password\" from Techfios database",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User clicks signin button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User should land on the dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepsDefinition.user_is_on_techfios_login_page()"
});
formatter.result({
  "duration": 224645000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    }
  ],
  "location": "LoginStepsDefinition.user_enters_from_Techfios_database(String)"
});
formatter.result({
  "duration": 333534800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 13
    }
  ],
  "location": "LoginStepsDefinition.user_enters_from_Techfios_database(String)"
});
formatter.result({
  "duration": 83913300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepsDefinition.user_clicks_signin_button()"
});
formatter.result({
  "duration": 629533400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepsDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 4317053200,
  "status": "passed"
});
formatter.after({
  "duration": 602812900,
  "status": "passed"
});
});