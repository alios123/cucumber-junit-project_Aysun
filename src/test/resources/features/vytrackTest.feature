Feature: validate if navigation bar visible





  Scenario: validate navigation bar

    Given user go to vyTrack login page
    When user enters "salesmanager123" , "UserUser123" and click login button
    Then user should see difference navigation
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

  @manger
  Scenario Outline: login with different role
    Given user go to vyTrack login page
    When user choose manager "<role>"
    Then user should be able see dashboard page
    Examples:
      | role  |
      | sales |
      | store |

