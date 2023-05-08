Feature: Verify Test
  @verifyTitle
  Scenario: Verify Dashboard Title
    Given user go to vyTrack login page
    When user enters credentials and click login button
    Then user should be able see dashboard title

 Scenario Outline: Verify Dashboard Title
    Given user go to vyTrack login page
    When user enters "<credentials>" and click login button
   Then user should be able see dashboard title
   Examples:
     |credentials  |
     | sales |
     | store |
