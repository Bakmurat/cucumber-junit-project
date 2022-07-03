
  Feature: User should be able to login with correct credentials


    @wip @webAppLogin
    Scenario: Web table login scenario
      Given user is in web table login page
      When user enters username "Test"
      And user enters password "Tester"
      Then user should see url contains orders

