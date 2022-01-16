@RegressionPack

Feature: Login page
  @Login
    @sad
  Scenario Outline: User logs in with an invalid credential
    Given User is on homepage
    When User click on login button
    And  User enter "<Email>" "<Password>"
    And  User click on Sign in button
    Then User should not able to login and get Error message "<Fail message>"

    Examples:
      | Email            | Password  | Fail message                                                                                          |
      | nitesh@gmail.com | 14Mitusat | Something's missing. Please check and try again.                                                      |
#      |                  | 14mitunit | Sorry, we can’t find an account with that email. You can register for a new account or get help here. |
#      | nitesh@gmail.com |           | Sorry, that password is too short. It needs to be eight characters or more.                           |
#      |                  |           | Something's missing. Please check and try again.                                                      |
#      | /'@@             |           | Sorry, that email doesn’t look right. Please check it's a proper email.                                                      |


