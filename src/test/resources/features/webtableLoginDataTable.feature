Feature: WebTable Application login with data table


  @dataTable
  Scenario: Login scenario with using datatable
    Given user is on the login page of web table app
    When user enters follow credentials
      | username | Test   |
      | password | Tester |
   Then user should see url contains orders