$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/Resourses/feature/hoover.feature");
formatter.feature({
  "name": "Categories",
  "description": "",
  "keyword": "Feature"
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
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "org.example.MyStepdefs.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user should able to hoover over category link and navigate to sub-category link page successfully",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hoover"
    }
  ]
});
formatter.step({
  "name": "user hoover over \"Computers\" category link and click on subcategory link \"Notebooks\"",
  "keyword": "When "
});
formatter.match({
  "location": "org.example.MyStepdefs.userHooverOverCategoryLinkAndClickOnSubcategoryLink(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should able to navigate to subcategory page \"notebooks\" successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "org.example.MyStepdefs.user_should_able_to_navigate_to_subcategory_page_successfully(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});