Feature:


  @Smoke_Testing34   @Parallel
  Scenario:
    Given The user wants to go to orangeHRM application
    When The user wants to login orange HRM
      |Username | Admin      |
      |Password |Mv@UE0@dR3f@|
    Then The user wants to click login
    And The user should be able to navigate dashboard
    Then The user wants to go to PIM page
    Then The user wants to see add employee page
    Then The user wants to add an employee
      |FirstName|Tom123  |
      |LastName |Jerry123|
    Then The user wants to save the information
#    Then The user should be able to see "Personal Details"


