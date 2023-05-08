@taskModule
Feature: test modules on dashboard

  Scenario: test tasks module
    Given that I am logged in to the Nextbase CRM dashboard
    When I navigate to the "Tasks" module
    Then I should see a header named "My tasks"

  Scenario: test tasks module
    Given that I am logged in to the Nextbase CRM dashboard
    When I click new task button
    Then I should see a header named "New task"
