@US20
Feature: Vytrack locate and click web elements verification.
	User story: As a user when I am on Vytrack => Fleet => Vehicles, I should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons

	Background:
		Given user is in Vytrack login page

	Scenario: positive login scenario
		When user logs in
		Then user should see title "Dashboard"


	#User should be able to click Export Grid dropdown
	#@B26G18-138 @B26G18-137 @VyTrack
	#Scenario Outline: #20 TC001 User should be able to click Export Grid dropdown
		#Given I'm a user on Home page.
		#When I go to Fleet Module.
		#And I click on Vehicles.
		#Then I should be able to click Export Grid dropdown.