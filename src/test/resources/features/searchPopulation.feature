Feature: google search
  @scenarioOutline
  Scenario Outline:search population of country
    Given user is on google home page
    When user searches for population of "<country>"
    Then user should see "<numbers of population>"
    Examples:
      | country | numbers of population |
      | USA     | 331.9 million (2021)  |
      | Canada  | 38.25 million (2021)  |