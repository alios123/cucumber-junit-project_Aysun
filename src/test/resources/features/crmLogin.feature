@wip
Feature: Login Functionality

  Scenario: successful login
    Given I am on the login page
    When I entered valid credentials
    And I clicked the login button
    Then I should be logged in

  Scenario: successful logout
    Given I am on the Dashboard page
    When I clicked the profile link
    Then I should be logged out


