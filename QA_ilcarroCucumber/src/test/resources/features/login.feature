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

  @invalidData
  Scenario Outline: Login with valid email and invalid password
    Given User launches Chrome browser
    When User open ilCarro HomePage
    And User clicks on Login link
    And User enter valid email and invalid password
      | email | password |
      | <email>|<password>|
    And User clicks on Yalla button
    Then User verifies Error Message is displayed
    And User quites browser
    Examples:
      | email | password |
      | olesia123@yahoo.com   |	Olesia20244 |
      | olesia123@yahoo.com   |	O2024442024 |
      | olesia123@yahoo.com   |	olesia$2024 |
      | olesia123@yahoo.com   |	OlesiaIvan! |