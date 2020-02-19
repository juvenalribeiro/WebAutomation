$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HitachiDemoWeb.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: en"
    }
  ],
  "line": 3,
  "name": "Home page of Senta Portal Verifications",
  "description": "",
  "id": "home-page-of-senta-portal-verifications",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8227453500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "People finder a existing person with sucess",
  "description": "",
  "id": "home-page-of-senta-portal-verifications;people-finder-a-existing-person-with-sucess",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "that accessing the Senta homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the page is loaded",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on \"My Apps\" label on HubNav",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "open \"People Finder\" application",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the People Finder is loaded",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "search for \"Juvenal Ribeiro\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "name \"Ribeiro, Juvenal\" is displyed on results",
  "keyword": "Then "
});
formatter.match({
  "location": "SentaHomePageStep.that_accessing_the_Senta_homepage()"
});
formatter.result({
  "duration": 3174503100,
  "status": "passed"
});
formatter.match({
  "location": "SentaHomePageStep.the_page_is_loaded()"
});
formatter.result({
  "duration": 10082619900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My Apps",
      "offset": 10
    }
  ],
  "location": "SentaHomePageStep.click_on(String)"
});
formatter.result({
  "duration": 25713766900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "People Finder",
      "offset": 6
    }
  ],
  "location": "SentaHomePageStep.open_application(String)"
});
formatter.result({
  "duration": 4510174100,
  "status": "passed"
});
formatter.match({
  "location": "SentaHomePageStep.the_People_Finder_is_loaded()"
});
formatter.result({
  "duration": 22144421900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Juvenal Ribeiro",
      "offset": 12
    }
  ],
  "location": "SentaHomePageStep.search_for(String)"
});
formatter.result({
  "duration": 242828500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ribeiro, Juvenal",
      "offset": 6
    }
  ],
  "location": "SentaHomePageStep.is_displyed_on_results(String)"
});
formatter.result({
  "duration": 1564846000,
  "status": "passed"
});
formatter.after({
  "duration": 121200,
  "status": "passed"
});
});