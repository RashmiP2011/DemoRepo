$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/RashmiP2/eclipse-workspace/FreeCrmBDDFramwork/src/main/java/Features/FreeCRM_Companies.feature");
formatter.feature({
  "line": 1,
  "name": "FreeCRM Company Feature",
  "description": "",
  "id": "freecrm-company-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "FreeCRM add new Company",
  "description": "",
  "id": "freecrm-company-feature;freecrm-add-new-company",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Title of login page is \u003c\"Cogmento CRM\"\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User login into application",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify login successful",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Navigate to Companies page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click on add new Company",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Enter \"\u003ccompanyname\u003e\" , \"\u003ccompanyurl\u003e\" , \"\u003cdescription\u003e\" and save",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Logout",
  "keyword": "And "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "freecrm-company-feature;freecrm-add-new-company;",
  "rows": [
    {
      "cells": [
        "companyname",
        "companyurl",
        "description"
      ],
      "line": 16,
      "id": "freecrm-company-feature;freecrm-add-new-company;;1"
    },
    {
      "cells": [
        "CitiusTech",
        "www.citiustech.com",
        "CitiusTech is a specialist provider of healthcare technology services and solutions, with strong presence across the globe"
      ],
      "line": 17,
      "id": "freecrm-company-feature;freecrm-add-new-company;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "FreeCRM add new Company",
  "description": "",
  "id": "freecrm-company-feature;freecrm-add-new-company;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Title of login page is \u003c\"Cogmento CRM\"\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User login into application",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify login successful",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Navigate to Companies page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click on add new Company",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Enter \"CitiusTech\" , \"www.citiustech.com\" , \"CitiusTech is a specialist provider of healthcare technology services and solutions, with strong presence across the globe\" and save",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Logout",
  "keyword": "And "
});
formatter.match({
  "location": "CompaniesStepDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 7960146700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cogmento CRM",
      "offset": 25
    }
  ],
  "location": "CompaniesStepDefinition.title_of_login_page_is(String)"
});
formatter.result({
  "duration": 78902200,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Cogmento CRM]\u003e but was:\u003c[ui.freecrm.com]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.qa.pages.LoginPage.verifyLoginTitle(LoginPage.java:37)\r\n\tat CompaniesStepDefinition.CompaniesStepDefinition.title_of_login_page_is(CompaniesStepDefinition.java:25)\r\n\tat ✽.When Title of login page is \u003c\"Cogmento CRM\"\u003e(C:/Users/RashmiP2/eclipse-workspace/FreeCrmBDDFramwork/src/main/java/Features/FreeCRM_Companies.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CompaniesStepDefinition.user_login_into_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CompaniesStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CompaniesStepDefinition.navigate_to_Companies_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CompaniesStepDefinition.click_on_add_new_Company()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CitiusTech",
      "offset": 7
    },
    {
      "val": "www.citiustech.com",
      "offset": 22
    },
    {
      "val": "CitiusTech is a specialist provider of healthcare technology services and solutions, with strong presence across the globe",
      "offset": 45
    }
  ],
  "location": "CompaniesStepDefinition.enter_and_save(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CompaniesStepDefinition.logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 18,
      "value": "#\t|Accenture\t\t|www.accenture.com/in-en  |Accenture Development Partnerships brings the best of Accenture to address social, economic and environmental issues.    |"
    }
  ],
  "line": 21,
  "name": "FreeCRM delete Company",
  "description": "",
  "id": "freecrm-company-feature;freecrm-delete-company",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 23,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "Title of login page is \u003c\"Cogmento CRM\"\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User login into application",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Verify login successful",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Navigate to Companies page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Identify the Company with \"\u003ccompanyname\u003e\" and delete the record",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Logout",
  "keyword": "And "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": "freecrm-company-feature;freecrm-delete-company;",
  "rows": [
    {
      "cells": [
        "companyname"
      ],
      "line": 32,
      "id": "freecrm-company-feature;freecrm-delete-company;;1"
    },
    {
      "cells": [
        "CitiusTech"
      ],
      "line": 33,
      "id": "freecrm-company-feature;freecrm-delete-company;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 33,
  "name": "FreeCRM delete Company",
  "description": "",
  "id": "freecrm-company-feature;freecrm-delete-company;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 23,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "Title of login page is \u003c\"Cogmento CRM\"\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "User login into application",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Verify login successful",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Navigate to Companies page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Identify the Company with \"CitiusTech\" and delete the record",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Logout",
  "keyword": "And "
});
formatter.match({
  "location": "CompaniesStepDefinition.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 7409842500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cogmento CRM",
      "offset": 25
    }
  ],
  "location": "CompaniesStepDefinition.title_of_login_page_is(String)"
});
formatter.result({
  "duration": 2125284400,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d81.0.4044.138)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027RASHMIP2-MSD1\u0027, ip: \u0027169.254.63.35\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 81.0.4044.138, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: C:\\Users\\RashmiP2\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:49948}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 6f5b3cacdd083dab2f541762120d1c50\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:281)\r\n\tat com.qa.pages.LoginPage.verifyLoginTitle(LoginPage.java:37)\r\n\tat CompaniesStepDefinition.CompaniesStepDefinition.title_of_login_page_is(CompaniesStepDefinition.java:25)\r\n\tat ✽.When Title of login page is \u003c\"Cogmento CRM\"\u003e(C:/Users/RashmiP2/eclipse-workspace/FreeCrmBDDFramwork/src/main/java/Features/FreeCRM_Companies.feature:24)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CompaniesStepDefinition.user_login_into_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CompaniesStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CompaniesStepDefinition.navigate_to_Companies_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "CitiusTech",
      "offset": 27
    }
  ],
  "location": "CompaniesStepDefinition.identify_the_Company_with_and_delete_the_record(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CompaniesStepDefinition.logout()"
});
formatter.result({
  "status": "skipped"
});
});