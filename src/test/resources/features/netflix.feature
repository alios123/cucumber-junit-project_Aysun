Feature: movie suggestion

  Scenario: Movie search
    Given  I like "actions"
    And  I like "drama"
    And I like "Cartoon"
    And I like "adventure"
    When I go to homepage
    Then I should get right recommendation


  Scenario: Movie search datatables list
    Given  I like

      | actions   |
      | drama     |
      | Cartoon   |
      | adventure |
    When I go to homepage
    Then I should get right recommendation

  @net
  Scenario: movie search datatable map
    Given I like below favorite movie with certain type
      | actions   | Jone Wick   |
      | drama     | Titanic     |
      | Cartoon   | Tom&Jerry   |
      | adventure | Tomb Raider |

    When I go to homepage
    Then I should get right recommendation