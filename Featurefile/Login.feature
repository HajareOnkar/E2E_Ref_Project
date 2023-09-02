@smoke
Feature: Verify Login feature

  @positive
  Scenario: User login with valid credentials
    Given User navigate to login screen
    When User enters valid username
    And User enters valid password
    And User clicks on submit button
    Then User navigate to home screen
    And user validate login massage

  @negative
  Scenario Outline: User login with invalid username and password
    Given User navigate to login screen
    When User enters invalid username <username>
    And User enters invalid password <password>
    And User clicks on submit button
    Then User gets error <error massge> on login page

    Examples: 
      | username     | password     | error massge              |
      | "InvlidUser"   | "InvalidPass"  | "Your username is invalid!" |
      | "InvalidUser2" | "InvalidPass2" | "Your username is invalid!" |

      