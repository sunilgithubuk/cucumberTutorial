Feature: test the core features of cucumber like
      Basic keywords, scenario outline, pass variable and data tables from feature file to step def
      and CucumberHooks
  @SanityTest
  Scenario: test the normal scenario for basic keyword in cucumber
    Given User is on homepage
    When  sign up with valid personal data
    Then  user should get logged in
    And   my account page is displayed

  @SanityTest
  Scenario: pass the variable from feature file to stepDef
    Given user has a site url http://google.com

  @SanityTest
  Scenario Outline: test the scenario outline feature
    Given user has provided <status>
    When  sign up with valid personal data
    Then  user should get logged in
    Examples:
      | status      |
      | pass        |
      | Fail        |
      | In-progress |

  @SanityTest
  Scenario: pass the data table from feature file to StepDef
    Given user has provide personal details as
      | name  | age |
      | Alice | 37  |
      | Jack  | 35  |
