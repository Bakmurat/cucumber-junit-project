@US20
Feature: Vytrack locate and click web elements verification.
	User story: As a user when I am on Vytrack => Fleet => Vehicles, I should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons

	Background:
		Given user is in Vytrack login page
		When user logs in
		Then user should see title "Dashboard"

	#Scenario: positive login scenario
		#When user logs in
		#Then user should see title "Dashboard"


	#User should be able to click Export Grid dropdown
	@AC1 @B26G18-138 @B26G18-137 @VyTrack
	Scenario: #20 TC001 User should be able to click Export Grid dropdown
		Given I'm a user on Home page.
		When I go to Fleet Module.
		And I click on Vehicles.
		Then I should be able to click Export Grid dropdown.


	#User can see Export Grid dropdown on left side.
	@AC2 @B26G18-156 @B26G18-137 @VyTrack
	Scenario: #20 TC002 Export Grid dropdown is on the left of the page
		Given I'm a user on Home page.
		When I go to Fleet Module.
		And I click on Vehicles.
		Then I should see Export Grid dropdown on left side.

	#User can click refresh button
	@AC3 @B26G18-163 @B26G18-137 @VyTrack
	Scenario: #20 TC003 User should be able to click refresh button
		Given I'm a user on Home page.
		When I go to Fleet Module.
		And I click on Vehicles.
		Then I should be able to click refresh button

	#User can click reset button.
	@AC4 @B26G18-165 @B26G18-137 @VyTrack
	Scenario: #20 TC004 User should be able click reset button
		Given I'm a user on Home page.
		When I go to Fleet Module.
		And I click on Vehicles.
		Then I should be able to click reset button

		#User can click Grid Settings button
	@AC5 @B26G18-166 @B26G18-137 @VyTrack
	Scenario: #20 TC005 User should be able to click Grid Settings button
		Given I'm a user on Home page.
		When I go to Fleet Module.
		And I click on Vehicles.
		Then I should be able to click Grid Settings button

		#User can see Refresh button on the left side of the Reset button
	@AC6 @B26G18-167 @B26G18-137 @VyTrack
	Scenario: #20 TC006 Refresh button should be on the left side of Reset button
		Given I'm a user on Home page.
		When I go to Fleet Module.
		And I click on Vehicles.
		Then I should be able to see Refresh button on the left side of the Reset button














