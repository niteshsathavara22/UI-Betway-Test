@RegressionPack
@SportArticles
Feature: As a sports user
  I would like to read about all articles related to sports


  Scenario: Use the search option to find all articles related to ‘sports’. Output the first heading and the last heading returned on the page.
    Given User is on homepage
    When  User click on the search box
    And   User enter text in search box
    Then  User see list of the sports articles name