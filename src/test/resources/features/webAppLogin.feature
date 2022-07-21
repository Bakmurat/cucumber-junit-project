Feature: User should be able to login with correct credentials

  Background:
    Given user is in web table login page

  @webAppLogin
  Scenario: Web table login scenario
    When user enters username "Test"
    And user enters password "Tester"
    And user click login button
    Then user should see url contains orders


  Scenario: positive login scenario
    When user enters username "Test" , password "Tester" and login
    Then user should see url contains orders


  Scenario: map data table practice
    When user enters below credentials
      | username | Test   |
      | password | Tester |

  Scenario Outline: Create contact using map
    When I create new contact
      | first_name | <first_name>   |
      | last_name | <last_name> |
      | cell_phone | <cell_phone> |
      | off_phone | <off_phone> |
    Then I should see contact info for "<first_name><last_name><cell_phone>"
    Examples:
    |first_name|last_name|cell_phone|off_phone|
    |     Fara     |     Shuk    |    123      |      321   |
    |     Dasha     |      Dovgal   |     789     |    987     |
    |Baha           |Kuban          |456          |654         |
