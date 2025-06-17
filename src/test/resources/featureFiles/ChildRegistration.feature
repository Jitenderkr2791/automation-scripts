Feature: Child registration UI Functionalities and Element Visibility

  Background:
    Given user on the Sign in page for client

  @client
  Scenario: Parent Successful login with valid credentials
    Given user on the Sign in page for client
    When the user enter username "pankaj@yopmail.com"
    And the user enter the password "Test@12345"
    And user clicks on the sign in button
    And the user clicks on the Children tab
    And the user clicks on the Register Child button
  @client
  Scenario: Successfully register a child with valid information
    Given user on the Sign in page for client
    When the user enter username "pankaj@yopmail.com"
    And the user enter the password "Test@12345"
    And user clicks on the sign in button
    And the user clicks on the Children tab
    And the user clicks on the Register Child button
    When the user enters the random First Name
    And enters the Middle Name "Claire"
    And enters the Last Name "Miller"
    And enters the Nickname "Joy"
    And enters the Child Birthdate
    And user clicks on the Gender field
    And selects Gender from the Gender dropdown
    And enters Street Address on the field
    And user Select the address from list
    And enters the Apt.
    And clicks the Next button

  @client
  Scenario:Successfully register a Parent/Guardian with valid information
    Given user on the Sign in page for client
    When the user enter username "pankaj@yopmail.com"
    And the user enter the password "Test@12345"
    And user clicks on the sign in button
    And the user clicks on the Children tab
    And the user clicks on the Register Child button
    When the user enters the random First Name
    And enters the Middle Name "Claire"
    And enters the Last Name "Miller"
    And enters the Nickname "Joy"
    And enters the Child Birthdate
    And user clicks on the Gender field
    And selects Gender from the Gender dropdown
    And enters Street Address on the field
    And user Select the address from list
    And enters the Apt.
    And clicks the Next button
    And user should navigate to Parent Information page
    When the user enter the parent name "jack"
    And enters the parent Middle Name "Claire"
    And enters the parent Last Name "Miller"
    And enters the parent email id "pankaj@yopmail.com"
    And user clicks on the Relationship with the Child field
    And Select the Relationship with the Child
    And enters the parent phone number
    And enters the parent Home Phone number
    And enters the parent Alternate Phone number
    And select the address checkbox
    When user click on add parent button
    When the user enter the parent two name "Emma"
    And enters the parent two Middle Name "Claire"
    And enters the parent two Last Name "Miller"
    And enters the parent two email id "emma@yopmail.com"
    And user clicks on the Relationship with the Child Parent two field
    And Select the Relationship with the Child mother
    And enters the parent two phone number
    And enters the parent two Home Phone number
    And enters the parent two Alternate Phone number
    And select the address checkbox for parent two
    And clicks the Parent Information page Next button
    And the user should navigated to Emergency page
    And clicks the Emergency Contact page Next button
    And the user should navigated to Pickup Contact page
    And clicks the Pickup Contact page Next button

#Child register
  @client
  Scenario:Successfully complete and submit the Child Registration form
    Given user on the Sign in page for client
    When the user enter username "jack@yopmail.com"
    And the user enter the password "Test@12345"
    And user clicks on the sign in button
    And the user clicks on the Children tab
    And the user clicks on the Register Child button
    When the user enters the random First Name
    And enters the Middle Name "Claire"
    And enters the Last Name "Miller"
    And enters the Nickname "Joy"
    And enters the Child Birthdate
    And user clicks on the Gender field
    And selects Gender from the Gender dropdown
    And enters Street Address on the field
    And user Select the address from list
    And enters the Apt.
    And clicks the Next button
    And user should navigate to Parent Information page
    When the user enter the parent name "jack"
    And enters the parent Middle Name "Claire"
    And enters the parent Last Name "Miller"
    And enters the parent email id "jack@yopmail.com"
    And user clicks on the Relationship with the Child field
    And Select the Relationship with the Child
    And enters the parent phone number
    And enters the parent Home Phone number
    And enters the parent Alternate Phone number
    And select the address checkbox
    When user click on add parent button
    When the user enter the parent two name "Emma"
    And enters the parent two Middle Name "Claire"
    And enters the parent two Last Name "Miller"
    And enters the parent two email id "emma@yopmail.com"
    And user clicks on the Relationship with the Child Parent two field
    And Select the Relationship with the Child mother
    And enters the parent two phone number
    And enters the parent two Home Phone number
    And enters the parent two Alternate Phone number
    And select the address checkbox for parent two
    And clicks the Parent Information page Next button
    And the user should navigated to Emergency page
    And clicks the Emergency Contact page Next button
    And the user should navigated to Pickup Contact page
    And clicks the Pickup Contact page Next button
    Given the user is on the Health Information page
    When the user enables the Is Child under regular medical supervision? toggle
    When  the user enters a valid medical care provider name
    And  the user enters a valid phone number in the Medical Care Provider section
    And  the user enters a valid date in the Date Last Seen by Physician field
    And  the user enters a valid ZIP code in the Medical Care Provider section
    And user Select the address from list
    When  the user enters a valid dental care provider name "Hazel"
    When the user enters a valid phone number in the Dental Care Provider section
    When the user enters a valid date in the Date Last Seen by Dentist field
    When the user enters a valid ZIP code in the Dental Care Provider section
    And user Select the address from list
    When the user enters a valid health insurance provider name
    When the user enters a valid group number
    When the user enters a valid policy number
    When the user enters a valid name in the Primary Insured Name field
    When the user enters known health conditions in the Health Conditions field
    When the user enters allergy information under Allergies
    When the user enters chronic illnesses information
    When the user enters valid information in the Regular Medications field
    When the user enters valid data in the Other Pertinent Information field
    And the user select the CIS form Checkbox
    And the user clicks Health Information Next button
    And the User navigate to Consent page
    And the user select Transportation and off-site activity checkbox for school
    And the user select Transportation and off-site activity checkbox for trips
    And the user select Transportation and off-site activity checkbox for occasional errands
    And the user select Water activities checkbox
    And the user select Bathing checkbox
    And the user select Photo and video surveillance activity checkbox
    And the user click on the Consent next button
    And the user navigate to Review Child Information page
    And the user click on the Review Child Information next button
    And the Child Registered Successfully message visible on popup
    And the user click on Ok button of the Child Registered Successfully popup
    And the user navigate to My Children List page
    And when user enter the random name in the search box
    And the user click on the enroll button on the child list
    When The user clicks on the drop-in tab
    When The user clicks on the Start Date field
    And the user selects today's date from the calendar
    When The user clicks on the Child's Birthdate Date field for regular
    And select the registered child from drop down list
    When The user clicks on the Schedule Type field
    And The user select Schedule Type
    Then The selected  Schedule Type should be visible Schedule Type field
    When The user Click on the Zip code Field
    And The user Enter the Zipcode
    And The user select the address from dropdown child Enroll
    And The user clicks in Search Button
    And The user Clicks on the Enroll button
    And The user clicks on the radio button for without subsidy child
    And The user clicks on the next button the subsidy popup
    And The user select Review the consent form Child Care Agreement checkbox
    And The user click on the review the consent form submit button
    #And The Verify successful child enrollment and confirmation message is visible

  @client
  Scenario: Verify visibility of all fields and required error messages on Child Registration page
    Given user on the Sign in page for client
    When the user enter username "jack@yopmail.com"
    And the user enter the password "Test@12345"
    And user clicks on the sign in button
    And the user clicks on the Children tab
    And the user clicks on the Register Child button
    When the child information header text is visible
    And the child information title text is visible
    And the child first name text is visible
    And the child Middle name text is visible
    And the child last name text is visible
    And the child nickname text is visible
    And the child birthdate text is visible
    And the child gender text is visible
    And the child Street Address text is visible
    And the child Apt text is visible
    And the child city text is visible
    And the child zipcode text is visible
    And clicks the Next button
    And the child First name is required error message is visible
    And the child Last name is required error message is visible
    And the child Birthdate is required error message is visible
    And  the child Street address is required error message is visible
    And the child City is required error message is visible
    And the ZIP code is required error message is visible
    When the user enters the random First Name
    And enters the Middle Name "Claire"
    And enters the Last Name "Miller"
    And enters the Nickname "Joy"
    And enters the Child Birthdate
    And user clicks on the Gender field
    And selects Gender from the Gender dropdown
    And enters Street Address on the field
    And user Select the address from list
    And enters the Apt.
    And clicks the Next button
                      # Parent/Guardian Information page
    When the parent information header text is visible
    And the parent title text is visible
    And the parent first name text is visible
    And the parent middle name text is visible
    And the parent last name text is visible
    And the parent email address text is visible
    And the parent relationship to child text is visible
    And the parent phone number text is visible
    And he parent home phone number text is visible
    And he parent Alternate phone number text is visible
    And the parent Street Address text is visible
    And the parent Apt text is visible
    And the parent City text is visible
    And the parent ZIP code text is visible
    And clicks the Next button
    And the parent First name is required error message is visible
    And the parent Last name is required error message is visible
    And the parent Phone number is required error message is visible
    And the parent Email address is required error message is visible
    And the parent Relationship to child is required error message is visible
    And the parent Street address is required error message is visible
    And the parent City is required error message is visible
    And the parent ZIP code is required error message is visible
    When the user enter the parent name "jack"
    And enters the parent Middle Name "Claire"
    And enters the parent Last Name "Miller"
    And enters the parent wrong email id "j@j"
    And enters the parent email id "jack@yopmail.com"
    And user clicks on the Relationship with the Child field
    And Select the Relationship with the Child
    And enters the parent phone number
    And enters the parent Home Phone number
    And enters the parent Alternate Phone number
    And select the address checkbox
    And clicks the Next button
    #emergency contact page of child register
    When the emergency contact information header text is visible
    And the emergency contact title text is visible
    And the emergency contact first name text is visible
    And the emergency contact middle name text is visible
    And the emergency contact last name text is visible
    And the emergency contact email address text is visible
    And the emergency contact phone number text is visible
    And the emergency contact home phone number text is visible
    And the emergency contact alternate phone number text is visible
    And clicks the Next button
    #pickup contact page of child register
    When the pickup contact information header text is visible
    And the pickup contact title text is visible
    And the pickup contact first name text is visible
    And the pickup contact middle name text is visible
    And the pickup contact last name text is visible
    And the pickup contact email address text is visible
    And the pickup contact phone number text is visible
    And the pickup contact home phone number text is visible
    And the pickup contact alternate phone number text is visible


 # Scenario:Provider logs in and approves a child’s enrollment
   # When the provider navigate to login page and provider enters valid email and password



#In the provider login, allow the provider to approve the child and process the child's payment
# Open and switch between client and provider.
  #Regular
  @ChildRegisterWorkFlow
  @client
  Scenario: Provider approves a child and processes payment after logging in for regular
    Given user on the Sign in page for client
    When the user enter username "jack@yopmail.com"
    And the user enter the password "Test@12345"
    And user clicks on the sign in button
    And the user clicks on the Children tab
    And the user clicks on the Register Child button
    When the user enters the random First Name
    And enters the Middle Name "Claire"
    And enters the Last Name "Miller"
    And enters the Nickname "Joy"
    And enters the Child Birthdate
    And user clicks on the Gender field
    And selects Gender from the Gender dropdown
    And enters Street Address on the field
    And user Select the address from list
    And enters the Apt.
    And clicks the Next button
    And user should navigate to Parent Information page
    When the user enter the parent name "jack"
    And enters the parent Middle Name "Claire"
    And enters the parent Last Name "Miller"
    And enters the parent email id "jack@yopmail.com"
    And user clicks on the Relationship with the Child field
    And Select the Relationship with the Child
    And enters the parent phone number
    And enters the parent Home Phone number
    And enters the parent Alternate Phone number
    And select the address checkbox
    When user click on add parent button
    When the user enter the parent two name "Emma"
    And enters the parent two Middle Name "Claire"
    And enters the parent two Last Name "Miller"
    And enters the parent two email id "emma@yopmail.com"
    And user clicks on the Relationship with the Child Parent two field
    And Select the Relationship with the Child mother
    And enters the parent two phone number
    And enters the parent two Home Phone number
    And enters the parent two Alternate Phone number
    And select the address checkbox for parent two
    And clicks the Parent Information page Next button
    And the user should navigated to Emergency page
    And clicks the Emergency Contact page Next button
    And the user should navigated to Pickup Contact page
    And clicks the Pickup Contact page Next button
    Given the user is on the Health Information page
    When the user enables the Is Child under regular medical supervision? toggle
    When  the user enters a valid medical care provider name
    And  the user enters a valid phone number in the Medical Care Provider section
    And  the user enters a valid date in the Date Last Seen by Physician field
    And  the user enters a valid ZIP code in the Medical Care Provider section
    And user Select the address from list
    When  the user enters a valid dental care provider name "Hazel"
    When the user enters a valid phone number in the Dental Care Provider section
    When the user enters a valid date in the Date Last Seen by Dentist field
    When the user enters a valid ZIP code in the Dental Care Provider section
    And user Select the address from list
    When the user enters a valid health insurance provider name
    When the user enters a valid group number
    When the user enters a valid policy number
    When the user enters a valid name in the Primary Insured Name field
    When the user enters known health conditions in the Health Conditions field
    When the user enters allergy information under Allergies
    When the user enters chronic illnesses information
    When the user enters valid information in the Regular Medications field
    When the user enters valid data in the Other Pertinent Information field
    And the user select the CIS form Checkbox
    And the user clicks Health Information Next button
    And the User navigate to Consent page
    And the user select Transportation and off-site activity checkbox for school
    And the user select Transportation and off-site activity checkbox for trips
    And the user select Transportation and off-site activity checkbox for occasional errands
    And the user select Water activities checkbox
    And the user select Bathing checkbox
    And the user select Photo and video surveillance activity checkbox
    And the user click on the Consent next button
    And the user navigate to Review Child Information page
    And the user click on the Review Child Information next button
    And the Child Registered Successfully message visible on popup
    And the user click on Ok button of the Child Registered Successfully popup
    And the user navigate to My Children List page
    And when user enter the random name in the search box
    And the user click on the enroll button on the child list

    When The user clicks on the drop-in tab
    When The user clicks on the Start Date field
    And the user selects today's date from the calendar
    When The user clicks on the Child's Birthdate Date field for regular
    And select the registered child from drop down list
    When The user clicks on the Schedule Type field
    And The user select Schedule Type
    Then The selected  Schedule Type should be visible Schedule Type field
    When The user Click on the Zip code Field
    And The user Enter the Zipcode
    And The user select the address from dropdown child Enroll
    And The user clicks in Search Button
    And The user Clicks on the Enroll button
    And The user clicks on the radio button for without subsidy child
    And The user clicks on the next button the subsidy popup
    And The user select Review the consent form Child Care Agreement checkbox
    And The user click on the review the consent form submit button
    And The user click on the View Enrollment button after enrollment
    And The user click on the  Enrollments tab
    Given I open client and provider in separate tabs
    Then Switch to Provider tab
    And the user enter the email "hoptest.dev-provider@yopmail.com"
    And the user enter the provider password  "Test@12345"
    And the user click on login button provider
    And the provider clicks on the Total Drop-in Enrollments Today more button
    And the provider search the enroll child
    And the provider click on Enrollment Status edit icon
    And the provider click on edit Enrollment status dropdown
    And the provider click on the Approve option
     # And Approved popup open and verify the popup visibility
    And the provider clicks on the Approved update button
    And Switch to Client tab
    And reload the page of client enrollment
    And when user enter the random name in the search box
    And client clicks on the pay button
    And confirm payment popup visible
    And click on make payment button
    And enter the payment email "abc@abc.com"
    And enter the card number "4242424242424242"
    And enter the card expiry date "1236"
    And enter the cvv "123"
    And enter card holder name "Test"
    And click on the credit card pay button
   # And Payment Successful Text is Visible
    And click on View Enrollments Button on Payment Successful page
    And the provider search the enroll child
    Then Switch to Provider tab
    And reload the page of client enrollment
    And the provider search the enroll child
    And Check the Approved status of child enrollment provider side

#Drop-in
  @client
  Scenario: Provider approves a child and processes payment after logging in for Drop in
    Given user on the Sign in page for client
    When the user enter username "jack@yopmail.com"
    And the user enter the password "Test@12345"
    And user clicks on the sign in button
    And the user clicks on the Children tab
    And the user clicks on the Register Child button
    When the user enters the random First Name
    And enters the Middle Name "Claire"
    And enters the Last Name "Miller"
    And enters the Nickname "Joy"
    And enters the Child Birthdate
    And user clicks on the Gender field
    And selects Gender from the Gender dropdown
    And enters Street Address on the field
    And user Select the address from list
    And enters the Apt.
    And clicks the Next button
    And user should navigate to Parent Information page
    When the user enter the parent name "jack"
    And enters the parent Middle Name "Claire"
    And enters the parent Last Name "Miller"
    And enters the parent email id "jack@yopmail.com"
    And user clicks on the Relationship with the Child field
    And Select the Relationship with the Child
    And enters the parent phone number
    And enters the parent Home Phone number
    And enters the parent Alternate Phone number
    And select the address checkbox
    When user click on add parent button
    When the user enter the parent two name "Emma"
    And enters the parent two Middle Name "Claire"
    And enters the parent two Last Name "Miller"
    And enters the parent two email id "emma@yopmail.com"
    And user clicks on the Relationship with the Child Parent two field
    And Select the Relationship with the Child mother
    And enters the parent two phone number
    And enters the parent two Home Phone number
    And enters the parent two Alternate Phone number
    And select the address checkbox for parent two
    And clicks the Parent Information page Next button
    And the user should navigated to Emergency page
    And clicks the Emergency Contact page Next button
    And the user should navigated to Pickup Contact page
    And clicks the Pickup Contact page Next button
    Given the user is on the Health Information page
    When the user enables the Is Child under regular medical supervision? toggle
    When  the user enters a valid medical care provider name
    And  the user enters a valid phone number in the Medical Care Provider section
    And  the user enters a valid date in the Date Last Seen by Physician field
    And  the user enters a valid ZIP code in the Medical Care Provider section
    And user Select the address from list
    When  the user enters a valid dental care provider name "Hazel"
    When the user enters a valid phone number in the Dental Care Provider section
    When the user enters a valid date in the Date Last Seen by Dentist field
    When the user enters a valid ZIP code in the Dental Care Provider section
    And user Select the address from list
    When the user enters a valid health insurance provider name
    When the user enters a valid group number
    When the user enters a valid policy number
    When the user enters a valid name in the Primary Insured Name field
    When the user enters known health conditions in the Health Conditions field
    When the user enters allergy information under Allergies
    When the user enters chronic illnesses information
    When the user enters valid information in the Regular Medications field
    When the user enters valid data in the Other Pertinent Information field
    And the user select the CIS form Checkbox
    And the user clicks Health Information Next button
    And the User navigate to Consent page
    And the user select Transportation and off-site activity checkbox for school
    And the user select Transportation and off-site activity checkbox for trips
    And the user select Transportation and off-site activity checkbox for occasional errands
    And the user select Water activities checkbox
    And the user select Bathing checkbox
    And the user select Photo and video surveillance activity checkbox
    And the user click on the Consent next button
    And the user navigate to Review Child Information page
    And the user click on the Review Child Information next button
    And the Child Registered Successfully message visible on popup
    And the user click on Ok button of the Child Registered Successfully popup
    And the user navigate to My Children List page
    And when user enter the random name in the search box
    And the user click on the enroll button on the child list
   # When The user clicks on the drop-in tab
    When The user clicks on the Start Date field For Drop-in
    And the user selects today's date from the calendar
    When The user clicks on the Child's field For Drop-in
    #And The user selects  Child's from the Child list
    And select the registered child from drop down list
    When The user Click on the Zip code Field for Drop-in
    And The user Enter the Zipcode For Drop-in
    And The user select the address from dropdown child Enroll
    And The user clicks in Search Button for DropIn
    And The user Clicks on the Enroll button
    And The user select Review the consent form Child Care Agreement checkbox
    And The user click on the review the consent form submit button
    And The user click on the View Enrollment button after enrollment
    And The user click on the  Enrollments tab
    Given I open client and provider in separate tabs
    Then Switch to Provider tab
    And the user enter the email "hoptest.dev-provider@yopmail.com"
    And the user enter the provider password  "Test@12345"
    And the user click on login button provider
    And the provider clicks on the Total Drop-in Enrollments Today more button
    And the provider click on drop in button

    And the provider search the enroll child drop in
    And the provider click on Enrollment Status edit icon for drop in
    And the provider click on edit Enrollment status dropdown for drop in
    And the provider click on the Approve option for drop in
     # And Approved popup open and verify the popup visibility
    And the provider clicks on the Approved update button
    And Switch to Client tab
    And reload the page of client enrollment
    And the provider click on drop in button
    And when user enter the random name in the search box dro in for client
    And client clicks on the pay button for client Drop in
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
    And the provider click on drop in button
    And when user enter the random name in the search box dro in for client
    Then Switch to Provider tab
    And the provider search the enroll child drop in
   # And Check the Approved status of child enrollment provider side drop-in










