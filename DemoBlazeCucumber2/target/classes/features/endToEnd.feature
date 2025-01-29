Feature: E2E Checkout Flow with happy acenario
  Scenario:
    Given user opens url of website and open login link
    Then user can move to home page
    When click on laptop category and click on first product in it
    Then user can accept alert message and check correct message
    When user press on cart link and click on place holder
    And user add all valid data and click on purchase btn
    Then user check confirmation msg and click on confirm btn