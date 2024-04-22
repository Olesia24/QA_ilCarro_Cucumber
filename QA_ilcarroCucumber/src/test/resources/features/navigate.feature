Feature: Home Page

  @navigate
  Scenario: Verify HomePage title is displayed
    Given User launches Chrome browser
    When User open ilCarro HomePage
    Then User verifies HomePage title is displayed
    Then User enter the city
    Then User enter dates
    Then User click on Yalla button to find a car
    And User quites browser