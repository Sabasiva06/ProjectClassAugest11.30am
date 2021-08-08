Feature: Validation of Facebook

  @reg
  Scenario: Validating the facebook with valid username and valid password
    Given User should open facebook page
    When User enters valid username and password
    And User clicks on login button
    Then User validates the login page

  @smoke
  Scenario: Validating the facebook with valid username and valid password
    Given User should open facebook page
    When User enters valid username and password
    And User clicks on login button
    Then User validates the login page

  @sanity
  Scenario: Validating the facebook with valid username and valid password
    Given User should open facebook page
    When User enters valid username and password
    And User clicks on login button
    Then User validates the login page

  @retest
  Scenario: Validating the facebook with valid username and valid password
    Given User should open facebook page
    When User enters valid username and password
    And User clicks on login button
    Then User validates the login page

  @reg
  Scenario: Validating the facebook with valid username and valid password
    Given User should open facebook page
    When User enters valid username and password
    And User clicks on login button
    Then User validates the login page
