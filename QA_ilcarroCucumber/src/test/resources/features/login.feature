Feature: Login

@validData
  Scenario: Login with valid data
    Given User launches Chrome browser
    When User open ilCarro HomePage
    And User clicks on Login link
    And User enter valid data
    And User clicks on Yalla button
    Then User verifies Success Message is displayed
    And User quites browser