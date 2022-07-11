Feature: User should be able to login using correct credentials

  @wip
  Scenario: Positiv login scenario
    Given user is on the  login page
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks to login button
    Then user should see url contains orders
