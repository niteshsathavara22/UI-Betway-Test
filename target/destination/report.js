$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginStep.feature");
formatter.feature({
  "line": 3,
  "name": "Login page",
  "description": "",
  "id": "login-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@RegressionPack"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "User logs in with an invalid credential",
  "description": "",
  "id": "login-page;user-logs-in-with-an-invalid-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Login"
    },
    {
      "line": 5,
      "name": "@sad"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enter \"\u003cEmail\u003e\" \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should not able to login and get Error message \"\u003cFail message\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "login-page;user-logs-in-with-an-invalid-credential;",
  "rows": [
    {
      "cells": [
        "Email",
        "Password",
        "Fail message"
      ],
      "line": 14,
      "id": "login-page;user-logs-in-with-an-invalid-credential;;1"
    },
    {
      "cells": [
        "nitesh@gmail.com",
        "14Mitusat",
        "Something\u0027s missing. Please check and try again."
      ],
      "line": 15,
      "id": "login-page;user-logs-in-with-an-invalid-credential;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7300230600,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User logs in with an invalid credential",
  "description": "",
  "id": "login-page;user-logs-in-with-an-invalid-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Login"
    },
    {
      "line": 1,
      "name": "@RegressionPack"
    },
    {
      "line": 5,
      "name": "@sad"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User click on login button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enter \"nitesh@gmail.com\" \"14Mitusat\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should not able to login and get Error message \"Something\u0027s missing. Please check and try again.\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Login_MyStepdefs.user_is_on_homepage()"
});
formatter.result({
  "duration": 113242900,
  "status": "passed"
});
formatter.match({
  "location": "Login_MyStepdefs.user_click_on_login_button()"
});
formatter.result({
  "duration": 87663400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nitesh@gmail.com",
      "offset": 12
    },
    {
      "val": "14Mitusat",
      "offset": 31
    }
  ],
  "location": "Login_MyStepdefs.user_enter(String,String)"
});
formatter.result({
  "duration": 2006967100,
  "status": "passed"
});
formatter.match({
  "location": "Login_MyStepdefs.user_click_on_Sign_in_button()"
});
formatter.result({
  "duration": 907911000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Something\u0027s missing. Please check and try again.",
      "offset": 53
    }
  ],
  "location": "Login_MyStepdefs.user_should_not_able_to_login_and_get_Error_message(String)"
});
formatter.result({
  "duration": 207927300,
  "status": "passed"
});
formatter.after({
  "duration": 1056724100,
  "status": "passed"
});
formatter.uri("SportArticlesList.feature");
formatter.feature({
  "line": 3,
  "name": "As a sports user",
  "description": "I would like to read about all articles related to sports",
  "id": "as-a-sports-user",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@RegressionPack"
    },
    {
      "line": 2,
      "name": "@SportArticles"
    }
  ]
});
formatter.before({
  "duration": 6586141500,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Use the search option to find all articles related to ‘sports’. Output the first heading and the last heading returned on the page.",
  "description": "",
  "id": "as-a-sports-user;use-the-search-option-to-find-all-articles-related-to-‘sports’.-output-the-first-heading-and-the-last-heading-returned-on-the-page.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User click on the search box",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User enter text in search box",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User see list of the sports articles name",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_MyStepdefs.user_is_on_homepage()"
});
formatter.result({
  "duration": 102300,
  "status": "passed"
});
formatter.match({
  "location": "SportArticles_MyStepdefs.userClickOnTheSearchBox()"
});
formatter.result({
  "duration": 188717700,
  "status": "passed"
});
formatter.match({
  "location": "SportArticles_MyStepdefs.userEnterTextInSearchBox()"
});
formatter.result({
  "duration": 3162607300,
  "status": "passed"
});
formatter.match({
  "location": "SportArticles_MyStepdefs.user_see_list_of_the_sports_articles_name()"
});
formatter.result({
  "duration": 206452500,
  "status": "passed"
});
formatter.after({
  "duration": 1011723100,
  "status": "passed"
});
formatter.uri("TodayPlayingteamList.feature");
formatter.feature({
  "line": 3,
  "name": "As a user I would like to make a record of all teams which are playing today",
  "description": "",
  "id": "as-a-user-i-would-like-to-make-a-record-of-all-teams-which-are-playing-today",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@RegressionPack"
    },
    {
      "line": 2,
      "name": "@TeamPlayToday"
    }
  ]
});
formatter.before({
  "duration": 6309000700,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Output all team names with a match today. If there are no matches today, output a message to convey this",
  "description": "",
  "id": "as-a-user-i-would-like-to-make-a-record-of-all-teams-which-are-playing-today;output-all-team-names-with-a-match-today.-if-there-are-no-matches-today,-output-a-message-to-convey-this",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "get a record all team name which are playing today",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_MyStepdefs.user_is_on_homepage()"
});
formatter.result({
  "duration": 86500,
  "status": "passed"
});
formatter.match({
  "location": "TodayMatchList_MyStepdefs.getARecordAllTeamNameWhichArePlayingToday()"
});
formatter.result({
  "duration": 5975219800,
  "status": "passed"
});
formatter.after({
  "duration": 1010117300,
  "status": "passed"
});
});