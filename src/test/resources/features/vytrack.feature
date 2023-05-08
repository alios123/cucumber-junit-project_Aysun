Feature: Validate if navigation bar is visible

  @vy
  Scenario: validate navigation bar
    Given user go to vyTrack login page
    When user enters "user1" , "UserUser123" and click login button
    Then user should be able to see options

      | Fleet      |
      | Customers  |
      | Activities |
      | System     |





