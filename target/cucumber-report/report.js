$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentification/Authentification.feature");
formatter.feature({
  "line": 2,
  "name": "Authentification-Orange",
  "description": "Entant que utilisateur je souhaite m\u0027enthentifier",
  "id": "authentification-orange",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@connexion"
    }
  ]
});
formatter.before({
  "duration": 20200653880,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Authentification-Orange",
  "description": "",
  "id": "authentification-orange;authentification-orange",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@cnx"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Open application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Set UserName",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Set Password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Clik on button Login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "welcome page appears",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationStepDefinition.openApplication()"
});
formatter.result({
  "duration": 2365746527,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.setUserName()"
});
formatter.result({
  "duration": 122187627,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.setPassword()"
});
formatter.result({
  "duration": 68854878,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.clikOnButtonLogin()"
});
formatter.result({
  "duration": 4286463350,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.welcomePageAppears()"
});
formatter.result({
  "duration": 68254131,
  "status": "passed"
});
formatter.after({
  "duration": 1446466717,
  "status": "passed"
});
});