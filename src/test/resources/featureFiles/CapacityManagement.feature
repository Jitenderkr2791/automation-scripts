Feature: Provider Capacity Management Page Functionalities and Element Visibility

  Background:
    Given user on the Sign in page for Provider

  Scenario: Create classroom
    And the user enter the email "hoptest.dev-provider@yopmail.com"
    And the user enter the provider password  "Test@12345"
    #  And the user click on login button provider
    When user clicks on the classrooms option in slider menu
    And user navigate to classroom list page
    And user click on the Create New Classroom button
    And user navigate to create classroom page
    And user enter the classroom name
    And user clicks on the start date field
    And user select start date for classroom
    And user enter the minimum age of child
    And user enter the maximum age of child
    And user enter Over Enrollment Capacity for classroom
    And user enter License Capacity for classroom
    And user clicks on the Enrollment Cutoff Window field
    And user select Enrollment Cutoff Window option
    And user enter Student Teacher Ratio

    And user enter Full Time Tuition fee
    And user clicks on the Full Time Tuition cadence field
    And user select on the Full Time Tuition cadence option
    And user enter Mornings Tuition fee
    And user clicks on the Mornings Tuition cadence field
    And user select on the Mornings Tuition cadence option
    And user enter Afternoons Tuition fee
    And user clicks on the Afternoons Tuition cadence field
    And user select on the Afternoons Tuition cadence option
    And user enter Mon, Wed, Fri Tuition fee
    And user clicks on the Mon, Wed, Fri  Tuition cadence field
    And user select on the Mon, Wed, Fri Tuition cadence option
    And user enter Tue, Thu Tuition fee
    And user clicks on the Tue, Thu Tuition  cadence field
    And user select on the Tue, Thu  Tuition cadence option
    And user enter Drop in Tuition fee
    And user click on the create button
    And user navigate to classroom list page

    And when user enter the random classroom name in the search box
    And user click on  view capacity button

    Then the user should see the title Capacity Management
    And the user should see the description below the title
    And the user should see the text Please select a classroom
    And the user should see the label License Capacity
    And the user should see the value for License Capacity
