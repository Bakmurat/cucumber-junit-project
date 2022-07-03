
Feature: Data Driven testing using Scenario Outline

  Scenario Outline: Google capital cities search
    Given User is on Google search page
    When User searches for country capital
    Then User should see capital in the result
    Examples: