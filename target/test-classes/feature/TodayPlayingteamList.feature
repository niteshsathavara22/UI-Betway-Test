@RegressionPack
@TeamPlayToday
Feature: As a user I would like to make a record of all teams which are playing today


  Scenario: Output all team names with a match today. If there are no matches today, output a message to convey this
    Given User is on homepage
    Then  get a record all team name which are playing today