Feature: Categories

  Background:
    Given user is on home page

  @hoover
  Scenario: user should able to hoover over category link and navigate to sub-category link page successfully
    When user hoover over "Computers" category link and click on subcategory link "Notebooks"
    Then user should able to navigate to subcategory page "notebooks" successfully