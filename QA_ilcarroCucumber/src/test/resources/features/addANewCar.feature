Feature: add a new car

  @addANewCar
  Scenario: Add a new car on the page Let the car work
    Given User launches Chrome browser
    When User open ilCarro HomePage
    And User clicks on Login link
    And User enter valid data
    And User clicks on Yalla button
    And User clicks on Let the car work
    And User enter location
    And User enter manufacture
    And User enter model
    And User enter year
    And User enter fuel
    And User enter seats
    And User enter car class
    And User enter car registration number
    And User enter price
    And click on submit button
    Then User verifies Success message
    And User quites browser


