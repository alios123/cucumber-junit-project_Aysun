Feature: google search

  Scenario Outline: Google search for Capital city of countries
    Given user is on google home page
    When user searches for "<country>" capital
    Then  user should see "<capital>" result

    Examples:
      | country | capital          |
      | USA     | Washington, D.C. |
      | Turkey  | Ankara           |
      | China   | Beijing          |