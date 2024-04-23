Feature: Find car

  @findCar
  Scenario: Find your car with valid Data
    Given User launches Chrome browser
    When User open ilCarro HomePage
    And User clicks on Login link
    And User enter valid data
    And User clicks on Yalla button
    And User click on Ok button
    And User enter the city
    And User enter dates
    And User click on Yalla button to find a car
    Then User verifies care page title is displayed
    And User quites browser