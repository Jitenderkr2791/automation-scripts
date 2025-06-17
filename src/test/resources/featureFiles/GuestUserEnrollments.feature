Feature: Guest User Enrollments Page UI Functionalities and Element Visibility

  Background:
    #Given user on the Sign in page for client
  @client
  Scenario:Guest User Enrollments Page elements visibility for client
    Then Logo should be visible
    Then Company name text should be visible
    Then Header signup button should be visible
    Then Find Trusted Child Care Providers text should be visible
    Then Looking for childcare? Start your search below for Regular care or Drop-in and discover trusted options near you! text should be visible
    Then Header login button should be visible
    When The user clicks on the drop-in tab
    Then Start Date title text should be visible in Regular enrollment
    Then Child's Birthdate title text should be visible  in Regular enrollment
    Then Schedule Type title text should be visible  in Regular enrollment
    Then ZIP Code * title text should be visible  in Regular enrollment
    Then Start Date placeholder text should be visible in Regular enrollment
    Then Child's Birthdate placeholder text should be visible  in Regular enrollment
    Then Schedule Type placeholder text should be visible  in Regular enrollment
    Then ZIP Code * placeholder text should be visible  in Regular enrollment
    Then Footer logo should be visible
    Then Footer company name should be visible
    Then Footer Connecting you to trusted childcare text should be visible
    Then Instagram logo should be visible
    Then Facebook logo should be visible
    Then Phone number icon should be visible
    Then Email icon should be visible
    Then Contact number should be visible
    Then Email should be visible
    Then Privacy Policy text should be visible
    Then Term and condition text should be visible
    Then © 2025 Hopscotch Connect. All rights reserved. text should be visible

  @client
  Scenario: Validate mandatory fields on guest child regular enrollment
    When The user clicks on the drop-in tab
    When The user clicks on the Search button on the enrollment page
    Then The Start Date validation message should be visible
    And The Child's Birthdate validation message should be visible
    And The Schedule Type validation message should be visible
    And The ZIP Code validation message should be visible

  @client
  Scenario: Verify the visibility of the Start Date calendar
    When The user clicks on the drop-in tab
    When The user clicks on the Start Date field
    Then The calendar should be visible to the user

  @client
  Scenario: Verify selecting today's and future date from the calendar
    When The user clicks on the drop-in tab
    When The user clicks on the Start Date field
    And the user selects today's date from the calendar
    Then the today's date should be visible in the Start Date field
    When The user clicks on the Start Date field
    And the user selects future any random date from the calendar
    Then the future any random date should be Selected in the Start Date field
    Then The calendar should be visible to the user

  @client
  Scenario: Verify the visibility of the Child's Birthdate Date calendar
    When The user clicks on the drop-in tab
    When The user clicks on the Child's Birthdate Date field
    Then The calendar should be visible to the user

  @client
  Scenario: Verify selecting past Child's Birthdate date from the calendar
    When The user clicks on the drop-in tab
    When The user clicks on the Child's Birthdate Date field
    And The user clicks on previous child birth month
    And The user clicks on previous child birth month
    And The user clicks on previous child birth month
    And The user selects past Child's Birthdate date from the calendar
    Then The selected  date should be visible in the Child's Birthdate Date field
  @client
  Scenario: Verify selecting Schedule type from the dropdown
    When The user clicks on the drop-in tab
    When The user clicks on the Schedule Type field
    And The user select Schedule Type
    Then The selected  Schedule Type should be visible Schedule Type field
  @client
  Scenario: Verify the Zip code
    When The user clicks on the drop-in tab
    When The user Click on the Zip code Field
    And The user Enter the Zipcode
    And The user select the address from dropdown
    And The selected Zip code should be visible in zipcode field
    And The user clicks in Search Button
  @client
  Scenario: Guest user enrollment process  for Regular
    When The user clicks on the drop-in tab
    When The user clicks on the Start Date field
    And the user selects today's date from the calendar
    When The user clicks on the Child's Birthdate Date field
    And The user clicks on previous child birth month
    And The user clicks on previous child birth month
    And The user clicks on previous child birth month
    And The user selects past Child's Birthdate date from the calendar
    Then The selected  date should be visible in the Child's Birthdate Date field
    When The user clicks on the Schedule Type field
    And The user select Schedule Type
    Then The selected  Schedule Type should be visible Schedule Type field
    When The user Click on the Zip code Field
    And The user Enter the Zipcode
    And The user select the address from dropdown
    And The selected Zip code should be visible in zipcode field
    And The user clicks in Search Button
    And The user clicks in Search Button
    Then The user clicks on the Login Button
  @client
  Scenario: Successful Guest login with valid credentials
    When The user clicks on the drop-in tab
    When The user clicks on the Start Date field
    And the user selects today's date from the calendar
    When The user clicks on the Child's Birthdate Date field
    And The user clicks on previous child birth month
    And The user clicks on previous child birth month
    And The user clicks on previous child birth month
    And The user selects past Child's Birthdate date from the calendar
    Then The selected  date should be visible in the Child's Birthdate Date field
    When The user clicks on the Schedule Type field
    And The user select Schedule Type
    Then The selected  Schedule Type should be visible Schedule Type field
    When The user Click on the Zip code Field
    And The user Enter the Zipcode
    And The user select the address from dropdown
    And The selected Zip code should be visible in zipcode field
    And The user clicks in Search Button
    And The user clicks in Search Button
    Then The user clicks on the Login Button
    When The user enters valid username
    When The user enters valid password
    And  Clicks on the Guest login button
    Then The user should be redirected to the dashboard
  @client
  Scenario: Guest user enrollment process  for Drop-in
  #  When The user clicks on the drop-in tab
    When The user clicks on the Start Date field For Drop-in
    And the user selects today's date from the calendar
    When The user clicks on the Child's Birthdate Date field For Drop-in
    And The user clicks on previous child birth month
    And The user clicks on previous child birth month
    And The user clicks on previous child birth month
    And The user selects past Child's Birthdate date from the calendar
    When The user Click on the Zip code Field for Drop-in
    And The user Enter the Zipcode For Drop-in
    And The user select the address from dropdown
    And The user clicks in Search Button for Drop-in
    And The user clicks in Search Button for Drop-in
    Then The user clicks on the Login Button
    When The user enters valid username
    When The user enters valid password
    And  Clicks on the Guest login button
    Then The user should be redirected to the dashboard

  @client
    Scenario: Verify the Child Care Providers for Regular
      Given user on the Sign in page for client
      When the user enter username "pankaj@yopmail.com"
      And the user enter the password "Test@12345"
      And user clicks on the sign in button
      Then the user should be logged in successfully
      When The user clicks on the drop-in tab
      When The user clicks on the Start Date field
      And the user selects today's date from the calendar
      When The user clicks on the Child's Birthdate Date field for regular
      And The user selects  Child's from the Child list
      When The user clicks on the Schedule Type field
      And The user select Schedule Type
      Then The selected  Schedule Type should be visible Schedule Type field
      When The user Click on the Zip code Field
      And The user Enter the Zipcode
      And The user select the address from dropdown
      And The selected Zip code should be visible in zipcode field
      And The user clicks in Search Button
      And The user clicks in Search Button
      And The user Clicks on the Enroll button
      And The user clicks on the radio button for without subsidy child
      And The user clicks on the next button the subsidy popup
      And The user select Review the consent form Child Care Agreement checkbox
      And The user click on the review the consent form submit button

  @client
  Scenario: Verify the Child Care Providers for Drop-in
    Given user on the Sign in page for client
    When the user enter username "pankaj@yopmail.com"
    And the user enter the password "Test@12345"
    And user clicks on the sign in button
    Then the user should be logged in successfully
 #   When The user clicks on the drop-in tab
    When The user clicks on the Start Date field For Drop-in
    And the user selects today's date from the calendar
    When The user clicks on the Child's field For Drop-in
    And The user selects  Child's from the Child list
    When The user Click on the Zip code Field for Drop-in
    And The user Enter the Zipcode For Drop-in
   And The user select the address from dropdown
    And The user clicks in Search Button for DropIn
   And The user clicks in Search Button for DropIn
    And The user Clicks on the Enroll button
    And The user select Review the consent form Child Care Agreement checkbox
    And The user click on the review the consent form submit button

    #And The user click on the View Enrollment button after enrollment
   # And The user click on the  Enrollments tab