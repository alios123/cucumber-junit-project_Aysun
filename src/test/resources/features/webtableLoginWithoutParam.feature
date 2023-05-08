Feature:login feature
  Background:
    Given user is on the login page of web table app
    @os
  Scenario: Login scenario without 1 param
    When user enters username test
    And user enters password tester
    And user clicks to login button
    Then user should see url contains orders