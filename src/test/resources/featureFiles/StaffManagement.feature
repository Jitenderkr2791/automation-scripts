Feature:Create Staff Member

  Background:
    Given user on the Sign in page for Provider


  Scenario: Successfully create a new staff member with all valid data
    When the user clicks on the staff management option from slider menu
    Then the user navigate to Manage Staff page
    And the user clicks on the create new staff button
     And the user navigate to create Staff page
    When I enter valid data in the Name field
    And I enter a valid email in the Email field
    And I enter a valid phone number in the Phone field
    And the user clicks on the role field
    And I select a valid Role from the dropdown
    And I enter a valid address in the Address field
   And I click a joining date field
    And I select a valid Joining Date
   And I click the Create Staff button

    When the user opens the Preferred Staff Timing popup
    And the user sets Start Time
    And the user sets End Time
    And the user selects Lunch Break
    And the user selects the Break Length
    And the user clicks on the Add break button
    And the user selects Break Type
    And the user sets the Break Start Time
    And the user sets the Break End Time
    And the user clicks the Update button
   # And the user clicks on the back button

    And the user click on action button
    And user clicks on the Update Preferred Timing option
    And the user sets Start Time for update Preferred Timing
    And the user sets End Time for update Preferred Timing
    And the user selects Lunch Break for update Preferred Timing
    And the user selects the Break Length for update Preferred Timing
    And the user selects Break Type for update Preferred Timing
    And the user sets the Break Start Time for update Preferred Timing
    And the user sets the Break End Time for update Preferred Timing
    And the user clicks the Update button

    And the user click on action button
    And the user clicks on the Specific Day Staff Timing option
    And user clicks on the pick a date field
    And user select a valid pick a date
    And the user clicks on the start time field
    And the user clicks on the end time field
    And the user click on working lunch checkbox
    And the user clicks the Update button

    And the user click on action button
    And the user clicks on the Update Break option
    And user clicks on the pick a date field
    And user select a valid pick a date
    And user select a break type
    And user select start time
    And user select End time
    And the user clicks the Update button
   # When the user clicks on the staff management option from slider menu

    And the user clicks on the filter start date
    And the user select start date
    And the user clicks on the filter end date
    And the user select end date
    And the user clicks on the apply filters
    And the user click on the reset button
  #  When the user clicks on the staff management option from slider menu

  Scenario: Verify validation errors when all required fields are empty
    When the user clicks on the staff management option from slider menu
    Then the user navigate to Manage Staff page
    And the user clicks on the create new staff button
    And the user navigate to create Staff page
    And I click the Create Staff button
    Then Name field should display error message Required
    And Email field should display error message Email is required
    And Phone field should display error message Required
    And Role field should display error message Required
    And Address field should display error message Required
    And City field should display error message Required
    And Zip Code field should display error message Required
    And Joining Date field should display error message joining date is required

    And the user enter wrong staff name
    And I click the Create Staff button
    Then Name field should display error message Required
    When I enter valid data in the Name field
    And the user enter wrong staff email
    And I click the Create Staff button
    And Email field should display error message Email is required
    And I enter a valid email in the Email field
    And the user enter wrong staff phone number
    And I click the Create Staff button
    And Phone field should display error message Required
    And I enter a valid phone number in the Phone field
    And the user clicks on the role field
    And I select a valid Role from the dropdown
    And I enter a valid address in the Address field
    And I click a joining date field
    And I select a valid Joining Date
    And I click the Create Staff button

    And the user clicks the Update button
    And the start date error message visible
    And the end date error message visible
