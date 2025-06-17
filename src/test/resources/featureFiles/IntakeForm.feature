Feature: Intake form UI Functionalities and Element Visibility

  @intake
  Scenario: Successfully complete and submit the intake form
    When user should navigate to intake form
    And the intake information Center header text is visible
    And the intake information Center description text is visible
    And the intake form provider name is visible
    And the intake form provider description is visible
    And the Intake form provider details logo is visible
    And the Intake form provider details phone label is visible
    And the Intake form provider details phone number  is visible
    And the Intake form provider details address label is visible
    And the Intake form provider details address  is visible
    And the Intake form provider details city label is visible
    And the Intake form provider details city  is visible
    And the Intake form provider details state label is visible
    And the Intake form provider details state  is visible
    And the Intake form provider details SSPS Number label is visible
    And the Intake form provider details SSPS Number  is visible
    And the Intake form provider details timing label is visible
    And the Intake form provider details timing is visible
    When the Intake form Child information section header is visible
    And the Intake form Child First name field is visible
    And the Intake form Child Last name field is visible
    And the Intake form Child Date of birth field is visible
    And the Intake form Child Gender dropdown is visible
    And the Intake form Parent information section header is visible
    And the Intake form Parent First name field is visible
    And the Intake form Parent Last name field is visible
    And the Intake form Parent Email field is visible
    And the Intake form Parent Confirm email field is visible
    And the Intake form Parent Phone field is visible
    And the Intake form Parent Relationship with child dropdown is visible
    When the Intake form Subsidy information section header is visible
    And the Intake form Is the child subsidized? question is visible
    And the Intake form Enrollment information section header is visible
    And the Intake form Preferred start date field is visible
    And the Intake form Preferred schedule type dropdown is visible
    And the Intake form Preferred Arrival Time field is visible
    And the Intake form Preferred Departure Time field is visible
    And the Intake form Additional notes text area is visible
    And the Intake form Health information section header is visible
    And the Intake form Health details text area is visible
    And the Intake form agreement text with Privacy Policy and Terms & Conditions links is visible
    And the Intake form disclaimer paragraph is visible

  @intake
  Scenario: Enter valid information into all fields on the intake form
    When user should navigate to intake form
    When the Intake form user enters the child First Name
    And the Intake form user enters the child Last Name
    And the Intake form user selects the child Date of Birth
    And the Intake form user click on the child Gender dropdown
    And the Intake form user selects the child Gender
    And the Intake form user enters the parent First Name
    And the Intake form user enters the parent Last Name
    And the Intake form user enters the parent Email
    And the Intake form user confirms the Email
    And the Intake form user enters the parent Phone number
    And the Intake form user click on the Relationship with child dropdown
    And the Intake form user selects the Relationship with child
    And the Intake form user selects the subsidy status
    And the Intake form click on Preferred Start Date field
    And the Intake form user selects the Preferred Start Date
    And the Intake form user click on the Preferred Schedule Type
    And the Intake form user selects the Preferred Schedule Type
    And the Intake form user enters the Preferred Arrival Time
    And the Intake form user enters the Preferred Departure Time
    And the Intake form user enters additional Enrollment Description
    And the Intake form user enters the Health Description
    And the Intake form user checks the Privacy Policy and Terms & Conditions agreement checkbox
    And the Intake form user clicks on the Send request button
    And the Intake form Thank you for your submission popup visible
    And the Intake form Your request has been submitted successfully message is showing
    And the Intake form click on login button
    Given I open client and provider in separate tabs
    Then Switch to Provider tab
    And the user enter the email "hoptest.dev-provider@yopmail.com"
    And the user enter the provider password  "Test@12345"
    And the user click on login button provider
    And the provider clicks on the Total Drop-in Enrollments Today more button
    And the provider search the enroll child for intake
    And the provider click on Enrollment Status edit icon
    And the provider click on edit Enrollment status dropdown
    And the provider click on the Approve option
     # And Approved popup open and verify the popup visibility
    And the provider clicks on the Approved update button
    And Switch to Client tab
    And the user clicks on login button
    When the user enter username "jack@yopmail.com"
    And the user enter the password "Test@12345"
    And user clicks on the sign in button
    And user click on the Enrollments tab
    And when user enter the random name in the search box for client
    And client clicks on the pay button
    And confirm payment popup visible
    And click on make payment button
    And enter the payment email "abc@abc.com"
    And enter the card number "4242424242424242"
    And enter the card expiry date "1236"
    And enter the cvv "123"
    And enter card holder name "Test"
    And click on the credit card pay button
    And Payment Successful Text is Visible
    And click on View Enrollments Button on Payment Successful page
    And when user enter the random name in the search box for client
    Then Switch to Provider tab
    And reload the page of client enrollment
    And the provider search the enroll child for intake
    And Check the Approved status of child enrollment provider side


 #validationerrormessages
  @intake
  Scenario: Display validation error messages when required fields are empty
    When user should navigate to intake form
    And the Intake form user clicks on the Send request button
    And the system should display First name can only contain letters. for Child First Name
    And the system should display Last name can only contain letters. for Child Last Name
    And the system should display Birthdate is required. for Child Date of Birth
    And the system should display Gender is required. for Child Gender
    And the system should display First name can only contain letters. for Parent First Name
    And the system should display Last name can only contain letters. for Parent Last Name
    And the system should display Email is required. for Parent Email
    And the system should display Email confirmation is required. for Confirm Email
    And the system should display Mobile number must be exactly 10 digits. for Parent Phone Number
    And the system should display Relationship is required. for Relationship with Child
    And the system should display Subsidy eligibility is required. for Subsidy Eligibility
    And the system should display Start date is required. for Preferred Start Date
    And the system should display Schedule type is required. for Preferred Schedule Type
    And the system should display Arrival time is required. for Preferred Arrival Time
    And the system should display Departure time is required. for Preferred Departure Time
    And the system should display You must agree to the terms and conditions. for Terms and Conditions Agreement
    When the Intake form user enters the child First Name
    And the Intake form user enters the child Last Name
    And the Intake form user selects the child Date of Birth
    And the Intake form user click on the child Gender dropdown
    And the Intake form user selects the child Gender
    And the Intake form user enters the parent First Name
    And the Intake form user enters the parent Last Name
    And the Intake form user enters the parent Email
    And the Intake form user confirms the Email
    And the Intake form user enters the parent Phone number
    And the Intake form user click on the Relationship with child dropdown
    And the Intake form user selects the Relationship with child
    And the Intake form user selects the subsidy status
    And the Intake form click on Preferred Start Date field
    And the Intake form user selects the Preferred Start Date
    And the Intake form user click on the Preferred Schedule Type
    And the Intake form user selects the Preferred Schedule Type
    And the Intake form user enters the Preferred Arrival Time
    And the Intake form user enters the Preferred Departure Time
    And the Intake form user enters additional Enrollment Description
    And the Intake form user enters the Health Description
    And the Intake form user checks the Privacy Policy and Terms & Conditions agreement checkbox
    And the Intake form user clicks on the Send request button
    And the Intake form Thank you for your submission popup visible
    And the Intake form Your request has been submitted successfully message is showing
    And the Intake form click on login button
    Given I open client and provider in separate tabs
    Then Switch to Provider tab
    And the user enter the email "hoptest.dev-provider@yopmail.com"
    And the user enter the provider password  "Test@12345"
    And the user click on login button provider
    And the provider clicks on the Total Drop-in Enrollments Today more button
    And the provider search the enroll child for intake
    And the provider click on Enrollment Status edit icon
    And the provider click on edit Enrollment status dropdown
    And the provider click on the Approve option
     # And Approved popup open and verify the popup visibility
    And the provider clicks on the Approved update button
    And Switch to Client tab
    And the user clicks on login button
    When the user enter username "jack@yopmail.com"
    And the user enter the password "Test@12345"
    And user clicks on the sign in button
    And user click on the Enrollments tab
    And when user enter the random name in the search box for client
    And client clicks on the pay button
    And confirm payment popup visible
    And click on make payment button
    And enter the payment email "abc@abc.com"
    And enter the card number "4242424242424242"
    And enter the card expiry date "1236"
    And enter the cvv "123"
    And enter card holder name "Test"
    And click on the credit card pay button
    And Payment Successful Text is Visible
    And click on View Enrollments Button on Payment Successful page
    And when user enter the random name in the search box for client
    Then Switch to Provider tab
    And reload the page of client enrollment
    And the provider search the enroll child for intake
    And Check the Approved status of child enrollment provider side

  @intake
  Scenario: Verify placeholders in all sections of the childcare request form
    Then the First name field placeholder in Child information should be First name
    And the Last name field placeholder in Child information should be Last name
    And the Date of birth field placeholder in Child information should be Select date
    And the Gender field placeholder in Child information should be Select gender
    And the First name field placeholder in Parent information should be First name
    And the Last name field placeholder in Parent information should be Last name
    And the Parent Email field placeholder should be Email
    And the Parent Confirm email field placeholder should be Confirm email
    And the Parent Phone field placeholder should be Phone
    And the Relationship with child field placeholder should be Select relationship
    And the Preferred start date field placeholder should be Select date
    And the Preferred schedule type field placeholder should be Select type
    And the Additional notes field placeholder Visible
    And the Health information field placeholder should be Please provide details related to the child's health.

  @intake
  Scenario: Enter valid information into all fields on the intake form for multiple user
    When user should navigate to intake form
    When the Intake form user enters the child First Name
    And the Intake form user enters the child Last Name
    And the Intake form user selects the child Date of Birth
    And the Intake form user click on the child Gender dropdown
    And the Intake form user selects the child Gender
    And the Intake form user enters the parent First Name
    And the Intake form user enters the parent Last Name
    And the Intake form user enters the parent Email
    And the Intake form user confirms the Email
    And the Intake form user enters the parent Phone number
    And the Intake form user click on the Relationship with child dropdown
    And the Intake form user selects the Relationship with child
    And the Intake form user selects the subsidy status
    And the Intake form click on Preferred Start Date field
    And the Intake form user selects the Preferred Start Date
    And the Intake form user click on the Preferred Schedule Type
    And the Intake form user selects the Preferred Schedule Type
    And the Intake form user enters the Preferred Arrival Time
    And the Intake form user enters the Preferred Departure Time
    And the Intake form user enters additional Enrollment Description
    And the Intake form user enters the Health Description
    And the Intake form user checks the Privacy Policy and Terms & Conditions agreement checkbox
    And the Intake form user clicks on the Send request button
    And the Intake form Thank you for your submission popup visible
    And the Intake form Your request has been submitted successfully message is showing
    And the user click on the Submit For Another Child

    When user should navigate to intake form
    When the Intake form user enters the child First Name
    And the Intake form user enters the child Last Name
    And the Intake form user selects the child Date of Birth
    And the Intake form user click on the child Gender dropdown
    And the Intake form user selects the child Gender
    And the Intake form user enters the parent First Name
    And the Intake form user enters the parent Last Name
    And the Intake form user enters the parent Email
    And the Intake form user confirms the Email
    And the Intake form user enters the parent Phone number
    And the Intake form user click on the Relationship with child dropdown
    And the Intake form user selects the Relationship with child
    And the Intake form user selects the subsidy status
    And the Intake form click on Preferred Start Date field
    And the Intake form user selects the Preferred Start Date
    And the Intake form user click on the Preferred Schedule Type
    And the Intake form user selects the Preferred Schedule Type
    And the Intake form user enters the Preferred Arrival Time
    And the Intake form user enters the Preferred Departure Time
    And the Intake form user enters additional Enrollment Description
    And the Intake form user enters the Health Description
    And the Intake form user checks the Privacy Policy and Terms & Conditions agreement checkbox
    And the Intake form user clicks on the Send request button
    And the Intake form Thank you for your submission popup visible
    And the Intake form Your request has been submitted successfully message is showing


