Feature: SignUp Feature
  Scenario: signUp with valid credentials
    Given user opens homePage and click on signUp link
    When user enters unique valid userName and valid password and click on signUp button
    Then alert message appears that Sign up successful

  Scenario Outline: signUp with invalid credentials
    Given user opens homePage and click on signUp link
    When user enters exist  "<userName>" and  "<password>" and click on signUp button
    Then alert error message appears that user already exist

  Examples:
  | userName    | password                   |
  | test        | test                       |
  | waleed      |123                         |
  | Ahmed       | abc                        |
