package stepDefinition;


import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import pageMethods.ChildRegistrationPageMethods;
import pageMethods.ProviderSignInPageMethods;


public class ChildRegistrationPageSteps {
    ChildRegistrationPageMethods ChildRegistrationPageMethods = new ChildRegistrationPageMethods();

    @When("the user clicks on the Children tab")
    public void the_user_clicks_on_the_children_tab() {
        ChildRegistrationPageMethods.ClickOnChildrenTab();
    }

    @When("the user clicks on the Register Child button")
    public void the_user_clicks_on_the_register_child_button() {
        ChildRegistrationPageMethods.ClickOnRegisterChildBtn();
    }

    private String randomFirstName;

    @When("the user enters the random First Name")
    public void theUserEntersTheRandomFirstName() {
        randomFirstName = ChildRegistrationPageMethods.generateRandomFirstNameAddChild();
        ChildRegistrationPageMethods.EnterFirstName(randomFirstName);
    }

    @And("enters the Middle Name {string}")
    public void entersTheMiddleName(String string) {
        ChildRegistrationPageMethods.EnterMiddleName("Claire");
    }

    @And("enters the Last Name {string}")
    public void entersTheLastName(String string) {
        ChildRegistrationPageMethods.EnterLastName("Miller");
    }

    @And("enters the Nickname {string}")
    public void entersTheNickname(String string) {
        ChildRegistrationPageMethods.EnterNickName("Joy");
    }

    @And("user click on the Birthdate field")
    public void userClickOnTheBirthdateField() {
        ChildRegistrationPageMethods.ClickOnChildBirthdateField();
    }

    @And("enters the Child Birthdate")
    public void EnterRandomChildBirthdate() {
        String childBirthdate = ChildRegistrationPageMethods.EnterRandomChildBirthdate();
        ChildRegistrationPageMethods.EnterRandomSelectedBirthdate(childBirthdate);
    }

    @And("user clicks on the Gender field")
    public void userClicksOnTheGenderField() {
        ChildRegistrationPageMethods.ClickOnChildGenderField();
    }

    @And("selects Gender from the Gender dropdown")
    public void selectsGenderFromTheGenderDropdown() throws InterruptedException {
        ChildRegistrationPageMethods.ClickOnBoyGender();
        Thread.sleep(1000);
    }

    @And("enters Street Address on the field")
    public void entersStreetAddressOnTheField() throws InterruptedException {
        ChildRegistrationPageMethods.EnterStreetAddress("1117");
        Thread.sleep(2000);
    }

    @And("user Select the address from list")
    public void userSelectTheAddressFromList() {
        ChildRegistrationPageMethods.ClickOnTheAddressFromList();
    }

    @And("enters the Apt.")
    public void entersTheApt() throws InterruptedException {
        ChildRegistrationPageMethods.EnterAptAddress("23 Main St, Apt 4B");
        Thread.sleep(2000);
    }


    @And("clicks the Next button")
    public void clicksTheNextButton() throws InterruptedException {
        ChildRegistrationPageMethods.ClickOnNextButton();
        Thread.sleep(2000);
    }

    @And("user should navigate to Parent Information page")
    public void userShouldNavigateToParentInformationPage() {
        Assert.assertTrue("User is not navigate to Parent Information page", ChildRegistrationPageMethods.isParentInformationTextVisible());
    }

    @When("the user enter the parent name {string}")
    public void the_user_enter_the_parent_name(String string) {
        ChildRegistrationPageMethods.EnterParentFirstName("Jack");
    }

    @When("enters the parent Middle Name {string}")
    public void enters_the_parent_middle_name(String string) {
        ChildRegistrationPageMethods.EnterParentMiddleName("Claire");
    }

    @When("enters the parent Last Name {string}")
    public void enters_the_parent_last_name(String string) {
        ChildRegistrationPageMethods.EnterParentLastName("Miller");
    }

    @When("enters the parent email id {string}")
    public void enters_the_parent_email_id(String string) throws InterruptedException {
        ChildRegistrationPageMethods.EnterParentEmail("jack@yopmail.com");
        Thread.sleep(2000);
    }

    @When("user clicks on the Relationship with the Child field")
    public void user_clicks_on_the_relationship_with_the_child_field() {
        ChildRegistrationPageMethods.ClickOnRelationshipWithChildField();
    }

    @When("Select the Relationship with the Child")
    public void select_the_relationship_with_the_child() {
        ChildRegistrationPageMethods.ClickOnRelationshipListOption();
    }

    @When("enters the parent phone number")
    public void enters_the_parent_phone_number() {
        ChildRegistrationPageMethods.EnterParentPhone("3331112225");
    }

    @When("enters the parent Home Phone number")
    public void enters_the_parent_home_phone_number() {
        ChildRegistrationPageMethods.EnterParentHomePhone("3300054562");
    }

    @When("enters the parent Alternate Phone number")
    public void enters_the_parent_alternate_phone_number() {
        ChildRegistrationPageMethods.EnterParentAlternatePhone("3000456123");
    }

    @When("select the address checkbox")
    public void select_the_address_checkbox() {
        ChildRegistrationPageMethods.ClickOnAddressCheckbox();
    }

    @When("user click on add parent button")
    public void userClickOnAddParentButton() {
        ChildRegistrationPageMethods.ClickOnAddParentButton();
    }

    @When("the user enter the parent two name {string}")
    public void theUserEnterTheParentTwoName(String string) {
        ChildRegistrationPageMethods.EnterParentTwoFirstName("Emma");
    }

    @And("enters the parent two Middle Name {string}")
    public void entersTheParentTwoMiddleName(String string) {
        ChildRegistrationPageMethods.EnterParentTwoMiddleName("Claire");
    }

    @And("enters the parent two Last Name {string}")
    public void entersTheParentTwoLastName(String string) {
        ChildRegistrationPageMethods.EnterParentTwoLastName("Miller");
    }

    @And("enters the parent two email id {string}")
    public void entersTheParentTwoEmailId(String string) {
        ChildRegistrationPageMethods.EnterParentTwoEmail("emma@yopmail.com");
    }

    @And("user clicks on the Relationship with the Child Parent two field")
    public void userClicksOnTheRelationshipWithTheChildParentTwoField() {
        ChildRegistrationPageMethods.ClickOnRelationshipWithChildFieldParentTwo();
    }

    @And("Select the Relationship with the Child mother")
    public void selectTheRelationshipWithTheChildMother() {
        ChildRegistrationPageMethods.ClickOnRelationshipListOptionMother();

    }

    @And("enters the parent two phone number")
    public void entersTheParentTwoPhoneNumber() {
        ChildRegistrationPageMethods.EnterParentTwoPhone("3322114455");
    }

    @And("enters the parent two Home Phone number")
    public void entersTheParentTwoHomePhoneNumber() {
        ChildRegistrationPageMethods.EnterParentTwoHomePhone("30323265410");
    }

    @And("enters the parent two Alternate Phone number")
    public void entersTheParentTwoAlternatePhoneNumber() {
        ChildRegistrationPageMethods.EnterParentTwoAlternatePhone("3020504162");
    }

    @And("select the address checkbox for parent two")
    public void selectTheAddressCheckboxForParentTwo() {
        ChildRegistrationPageMethods.ClickOnAddressCheckboxParentTwo();
    }


    @And("clicks the Parent Information page Next button")
    public void clicksTheParentInformationPageNextButton() throws InterruptedException {
        ChildRegistrationPageMethods.ClickOnNextButton();
        Thread.sleep(2000);
    }

    @And("the user should navigated to Emergency page")
    public void theUserShouldNavigatedToEmergencyPage() {
        Assert.assertTrue("The user is not navigated to Emergency page",
                ChildRegistrationPageMethods.isEmergencyPageTextVisible());
    }

    @And("clicks the Emergency Contact page Next button")
    public void clicksTheEmergencyContactPageNextButton() throws InterruptedException {
        ChildRegistrationPageMethods.ClickOnNextButton();
        Thread.sleep(2000);
    }

    @And("the user should navigated to Pickup Contact page")
    public void theUserShouldNavigatedToPickupContactPage() {
        Assert.assertTrue("The user is not navigated to Pickup Contact page",
                ChildRegistrationPageMethods.isPickupContactPageTextVisible());
    }

    @And("clicks the Pickup Contact page Next button")
    public void clicksThePickupContactPageNextButton() throws InterruptedException {
        ChildRegistrationPageMethods.ClickOnNextButton();
        // Thread.sleep(1000);
    }

    @Given("the user is on the Health Information page")
    public void theUserIsOnTheHealthInformationPage() throws InterruptedException {
        Assert.assertTrue("the user is not the Health Information page",
                ChildRegistrationPageMethods.isHealthInformationPageTextVisible());
        // Thread.sleep(4000);
    }

    @When("the user enables the Is Child under regular medical supervision? toggle")
    public void theUserEnablesTheIsChildUnderRegularMedicalSupervisionToggle() throws InterruptedException {
        ChildRegistrationPageMethods.scrollup();
        Thread.sleep(3000);
        ChildRegistrationPageMethods.ClickOnChildUnderRegularMedicalSupervision();
    }

    @When("the user enters a valid medical care provider name")
    public void theUserEntersAValidMedicalCareProviderName() {
        ChildRegistrationPageMethods.EnterMedicalCareProvider("MH care");
    }

    @And("the user enters a valid phone number in the Medical Care Provider section")
    public void theUserEntersAValidPhoneNumberInTheMedicalCareProviderSection() {
        ChildRegistrationPageMethods.EnterMedicalCareProviderPhone("3020105060");
    }

    @And("the user enters a valid date in the Date Last Seen by Physician field")
    public void theUserEntersAValidDateInTheDateLastSeenByPhysicianField() {
        String DateLastSeenByPhysician = ChildRegistrationPageMethods.EnterRandomHealthPhysicianDate();
        ChildRegistrationPageMethods.EnterRandomSelectedHealthPhysicDate(DateLastSeenByPhysician);
    }

    @And("the user enters a valid ZIP code in the Medical Care Provider section")
    public void theUserEntersAValidZIPCodeInTheMedicalCareProviderSection() throws InterruptedException {
        ChildRegistrationPageMethods.EnterMedicalCareProviderAddress("1117");
        Thread.sleep(2000);
    }


    @When("the user enters a valid dental care provider name {string}")
    public void theUserEntersAValidDentalCareProviderName(String arg0) {
        ChildRegistrationPageMethods.EnterDentalCareProviderName("Hazel");
    }

    @When("the user enters a valid phone number in the Dental Care Provider section")
    public void theUserEntersAValidPhoneNumberInTheDentalCareProviderSection() {
        ChildRegistrationPageMethods.EnterDentalCareProviderPhone("3216548520");
    }

    @When("the user enters a valid date in the Date Last Seen by Dentist field")
    public void theUserEntersAValidDateInTheDateLastSeenByDentistField() {
        String DateLastSeenByPhysicianDental = ChildRegistrationPageMethods.EnterRandomDentalPhysicianDate();
        ChildRegistrationPageMethods.EnterRandomSelectedDentalPhysicDate(DateLastSeenByPhysicianDental);

    }

    @When("the user enters a valid ZIP code in the Dental Care Provider section")
    public void theUserEntersAValidZIPCodeInTheDentalCareProviderSection() throws InterruptedException {
        ChildRegistrationPageMethods.EnterDentalCareProviderAddress("1117");
        Thread.sleep(2000);
    }

    @When("the user enters a valid health insurance provider name")
    public void theUserEntersAValidHealthInsuranceProviderName() {
        ChildRegistrationPageMethods.EnterHealthInsuranceProviderName("Physician Assistant");
    }

    @When("the user enters a valid group number")
    public void theUserEntersAValidGroupNumber() {
        ChildRegistrationPageMethods.EnterHealthInsuranceGroupName("MH Group");
    }

    @When("the user enters a valid policy number")
    public void theUserEntersAValidPolicyNumber() {
        ChildRegistrationPageMethods.EnterHealthInsurancePolicyNumber("552041");
    }

    @When("the user enters a valid name in the Primary Insured Name field")
    public void theUserEntersAValidNameInThePrimaryInsuredNameField() {
        ChildRegistrationPageMethods.EnterHealthInsurancePrimaryInsuredName("Star health");
    }

    @When("the user enters known health conditions in the Health Conditions field")
    public void theUserEntersKnownHealthConditionsInTheHealthConditionsField() {
        ChildRegistrationPageMethods.EnterHealthConditions("Heart Disease,");
    }

    @When("the user enters allergy information under Allergies")
    public void theUserEntersAllergyInformationUnderAllergies() {
        ChildRegistrationPageMethods.EnterHealthAllergies("No");
    }

    @When("the user enters chronic illnesses information")
    public void theUserEntersChronicIllnessesInformation() {
        ChildRegistrationPageMethods.EnterHealthChronicIllnesses("lasting three months");
    }

    @When("the user enters valid information in the Regular Medications field")
    public void theUserEntersValidInformationInTheRegularMedicationsField() {
        ChildRegistrationPageMethods.EnterHealthRegularMedications("hydrochlorothiazide");
    }

    @When("the user enters valid data in the Other Pertinent Information field")
    public void theUserEntersValidDataInTheOtherPertinentInformationField() {
        ChildRegistrationPageMethods.EntertherPertinentInformation("In a medical diagnosis");
    }

    @And("the user select the CIS form Checkbox")
    public void theUserSelectTheCISFormCheckbox() {
        ChildRegistrationPageMethods.ClickOnCISForm();
    }


    @And("the user clicks Health Information Next button")
    public void theUserClicksHealthInformationNextButton() throws InterruptedException {
        ChildRegistrationPageMethods.ClickOnNextButton();
        Thread.sleep(2000);
    }

    @And("the User navigate to Consent page")
    public void theUserNavigateToConsentPage() throws InterruptedException {
        Assert.assertTrue("The User is not navigate to Consent page", ChildRegistrationPageMethods.isConsentTextVisible());
        ChildRegistrationPageMethods.scrollup();
        Thread.sleep(2000);
    }

    @And("the user select Transportation and off-site activity checkbox for school")
    public void theUserSelectTransportationAndOffSiteActivityCheckboxForSchool() {
        ChildRegistrationPageMethods.ClickOnSchoolByPersonalVehicleCheckbox();
    }

    @And("the user select Transportation and off-site activity checkbox for trips")
    public void theUserSelectTransportationAndOffSiteActivityCheckboxForTrips() {
        ChildRegistrationPageMethods.ClickOnRidingWithMyChildOnPublicTransportationCheckbox();
    }

    @And("the user select Transportation and off-site activity checkbox for occasional errands")
    public void theUserSelectTransportationAndOffSiteActivityCheckboxForOccasionalErrands() {
        ChildRegistrationPageMethods.ClickOnOccasionalErrandsByWalkingWithMyChildCheckbox();
    }

    @And("the user select Water activities checkbox")
    public void theUserSelectWaterActivitiesCheckbox() {
        ChildRegistrationPageMethods.ClickOnWaterActivitiesCheckbox();
    }

    @And("the user select Bathing checkbox")
    public void theUserSelectBathingCheckbox() {
        ChildRegistrationPageMethods.ClickOnBathingCheckbox();
    }

    @And("the user select Photo and video surveillance activity checkbox")
    public void theUserSelectPhotoAndVideoSurveillanceActivityCheckbox() {
        ChildRegistrationPageMethods.ClickOnPhotoVideoSurveillanceActivityBathingCheckbox();
    }

    @And("the user click on the Consent next button")
    public void theUserClickOnTheConsentNextButton() throws InterruptedException {
        ChildRegistrationPageMethods.ClickOnNextButton();
        Thread.sleep(2000);
    }

    @And("the user navigate to Review Child Information page")
    public void theUserNavigateToReviewChildInformationPage() {
        Assert.assertTrue("The user is not navigate to Review Child Information page",
                ChildRegistrationPageMethods.isReviewChildInfoPageTextVisible());
    }

    @And("the user click on the Review Child Information next button")
    public void theUserClickOnTheReviewChildInformationNextButton() {
        ChildRegistrationPageMethods.ClickOnSubmitButtonOnReviewInfo();
    }

    @And("the Child Registered Successfully message visible on popup")
    public void theChildRegisteredSuccessfullyMessageVisibleOnPopup() {
        Assert.assertTrue("the Child Registered Successfully message is not visible on popup",
                ChildRegistrationPageMethods.isChildRegisteredSuccessfullyTextVisible());
    }

    @And("the user click on Ok button of the Child Registered Successfully popup")
    public void theUserClickOnOkButtonOfTheChildRegisteredSuccessfullyPopup() {
        ChildRegistrationPageMethods.ClickOnOkButtOnChildRegisteredSuccessfullyPopup();
    }

    @And("the user navigate to My Children List page")
    public void theUserNavigateToMyChildrenListPage() {
        Assert.assertTrue("The user is not navigate to My Children List page",
                ChildRegistrationPageMethods.isMyChildrenListTextVisible());
    }


    @And("when user enter the random name in the search box")
    public void whenUserEnterTheRandomNameInTheSearchBox() {
        ChildRegistrationPageMethods.EnterCreatedNameOfChild(randomFirstName);

    }

    @And("the user click on the enroll button on the child list")
    public void theUserClickOnTheEnrollButtonOnTheChildList() throws InterruptedException {
        ChildRegistrationPageMethods.ClickOnEnrollButtonOnChildList();
        Thread.sleep(3000);
    }

    @When("the child information header text is visible")
    public void theChildInformationHeaderTextIsVisible() {
        Assert.assertTrue("The child information header text is not visible",
                ChildRegistrationPageMethods.isChildInformationHeaderTextVisible());
    }

    @And("the child information title text is visible")
    public void theChildInformationTitleTextIsVisible() {
        Assert.assertTrue("The child information title text is not visible",
                ChildRegistrationPageMethods.isChildInformationTitleTextVisible());

    }

    @And("the child first name text is visible")
    public void theChildFirstNameTextIsVisible() {
        Assert.assertTrue("the child first name text is not visible", ChildRegistrationPageMethods.isChildFirstNameTitleTextVisible());
    }

    @And("the child Middle name text is visible")
    public void theChildMiddleNameTextIsVisible() {
        Assert.assertTrue("the child Middle name text is not visible",
                ChildRegistrationPageMethods.isChildMiddleNameTitleTextVisible());
    }

    @And("the child last name text is visible")
    public void theChildLastNameTextIsVisible() {
        Assert.assertTrue("the child last name text is not visible", ChildRegistrationPageMethods.isChildLastNameTitleTextVisible());
    }

    @And("the child nickname text is visible")
    public void theChildNicknameTextIsVisible() {
        Assert.assertTrue("The child nickname text is not visible", ChildRegistrationPageMethods.isChildNickNameTitleTextVisible());
    }

    @And("the child birthdate text is visible")
    public void theChildBirthdateTextIsVisible() {
        Assert.assertTrue("The child birthdate text is not visible", ChildRegistrationPageMethods.isChildBirthdateTitleTextVisible());
    }

    @And("the child gender text is visible")
    public void theChildGenderTextIsVisible() {
        Assert.assertTrue("The child gender text is not visible", ChildRegistrationPageMethods.isChildGenderTitleTextVisible());
    }

    @And("the child Street Address text is visible")
    public void theChildStreetAddressTextIsVisible() {
        Assert.assertTrue("The child Street Address text is not visible",
                ChildRegistrationPageMethods.isStreetAddressTitleTextVisible());
    }

    @And("the child Apt text is visible")
    public void theChildAptTextIsVisible() {
        Assert.assertTrue("The child Apt text is not visible", ChildRegistrationPageMethods.isAptTitleTextVisible());
    }

    @And("the child city text is visible")
    public void theChildCityTextIsVisible() {
        Assert.assertTrue("The child city text is not visible", ChildRegistrationPageMethods.isCityTitleTextVisible());
    }

    @And("the child zipcode text is visible")
    public void theChildZipcodeTextIsVisible() {
        Assert.assertTrue("The child zipcode text is not visible", ChildRegistrationPageMethods.isZIPCodeTitleTextVisible());
    }

    @And("the child First name is required error message is visible")
    public void theChildFirstNameIsRequiredErrorMessageIsVisible() {
        Assert.assertTrue("The child First name is required error message is not visible",
                ChildRegistrationPageMethods.isFirstNameFieldErrorMSGVisible());
    }

    @And("the child Last name is required error message is visible")
    public void theChildLastNameIsRequiredErrorMessageIsVisible() {
        Assert.assertTrue("the child Last name is required error message is not visible",
                ChildRegistrationPageMethods.isLastNameFieldErrorMSGVisible());
    }

    @And("the child Birthdate is required error message is visible")
    public void theChildBirthdateIsRequiredErrorMessageIsVisible() {
        Assert.assertTrue("The child Birthdate is required error message is not visible",
                ChildRegistrationPageMethods.isBirthdateFieldErrorMSGVisible());
    }

    @And("the child Street address is required error message is visible")
    public void theChildStreetAddressIsRequiredErrorMessageIsVisible() {
        Assert.assertTrue("The child Street address is required error message is not visible",
                ChildRegistrationPageMethods.isStreetAddressFieldErrorMSGVisible());
    }

    @And("the child City is required error message is visible")
    public void theChildCityIsRequiredErrorMessageIsVisible() {
        Assert.assertTrue("The child City is required error message is not visible",
                ChildRegistrationPageMethods.isCityFieldErrorMSGVisible());
    }

    @And("the ZIP code is required error message is visible")
    public void theZIPCodeIsRequiredErrorMessageIsVisible() {
        Assert.assertTrue("The ZIP code is required error message is not visible",
                ChildRegistrationPageMethods.isZipCodeFieldErrorMSGVisible());
    }

    @And("select the registered child from drop down list")
    public void selectTheRegisteredChildFromDropDownList() throws InterruptedException {
        String enterChildFirstName = randomFirstName;
        ChildRegistrationPageMethods.selectChildRandomNameFromDropdown(enterChildFirstName);
        Thread.sleep(2000);
    }

    @And("The user select the address from dropdown child Enroll")
    public void theUserSelectTheAddressFromDropdownEnroll() throws InterruptedException {
        ChildRegistrationPageMethods.ClickOnAddressFromDropDownEnrollChild();

    }


    @Given("I open client and provider in separate tabs")
    public void iOpenClientAndProviderInSeparateTabs() {
        // ChildRegistrationPageMethods.openEnvironmentTab("client");
        ChildRegistrationPageMethods.openEnvironmentTab("provider");
    }

    @Given("user clicks on the login in button")
    public void userClicksOnTheLoginInButton() {
        ChildRegistrationPageMethods.ClickOnLoginButtonClient();
    }

    //Provider login
    @And("the user enter the email {string}")
    public void theUserEnterTheEmail(String arg0) {
        ChildRegistrationPageMethods.EnterEmailProvider("hoptest.dev-provider@yopmail.com");
    }

    @And("the user enter the provider password  {string}")
    public void theUserEnterTheProviderPassword(String arg0) {
        ChildRegistrationPageMethods.EnterPasswordProvider("Test@12345");
    }

    @And("the user click on login button provider")
    public void theUserClickOnLoginButtonProvider() throws InterruptedException {
        ChildRegistrationPageMethods.ClickOnLoginButtonProvider();
        Thread.sleep(2000);
    }

    @And("the provider clicks on the Total Drop-in Enrollments Today more button")
    public void theProviderClicksOnTheTotalDropInEnrollmentsTodayMoreButton() throws InterruptedException {
        ChildRegistrationPageMethods.ClickMoreButtonForEnrollmentOnDashboardProvider();
    }

    @And("the provider search the enroll child")
    public void theProviderSearchTheEnrollChild() {
        ChildRegistrationPageMethods.EnterCreatedNameOfProviderChildEnroll(randomFirstName);
    }

    @And("the provider click on Enrollment Status edit icon")
    public void theProviderClickOnEnrollmentStatusEditIcon() throws InterruptedException {
        ChildRegistrationPageMethods.ClickOnEditEnrollmentStatusButton();
    }

    @And("the provider click on edit Enrollment status dropdown")
    public void theProviderClickOnEditEnrollmentStatusDropdown() throws InterruptedException {
        ChildRegistrationPageMethods.ClickOnEnrollmentStatusDropdown();
    }

    @And("the provider click on the Approve option")
    public void theProviderClickOnTheApproveOption() throws InterruptedException {
        ChildRegistrationPageMethods.ClickOnEnrollmentStatusDropdownOptionApproved();
    }


    @And("the provider clicks on the Approved update button")
    public void theProviderClicksOnTheApprovedUpdateButton() throws InterruptedException {
        ChildRegistrationPageMethods.ClickOnApprovedPopupUpdateButton();
    }

    @Then("Switch to Provider tab")
    public void switchToProviderTab() {
        ChildRegistrationPageMethods.SwitchToProvider();
    }

    @And("Switch to Client tab")
    public void switchToClientTab() {
        ChildRegistrationPageMethods.SwitchToClient();
    }

    @And("reload the page of client enrollment")
    public void reloadThePageOfClientEnrollment() {
        ChildRegistrationPageMethods.ReloadTheClientEnrollPage();
    }

    @And("client clicks on the pay button")
    public void clientClicksOnThePayButton() throws InterruptedException {
        ChildRegistrationPageMethods.ClickOnPayFeeButton();
        Thread.sleep(1000);
    }

    @And("confirm payment popup visible")
    public void confirmPaymentPopupVisible() {
        Assert.assertTrue("confirm payment popup is not visible",
                ChildRegistrationPageMethods.isConfirmPaymentPopupVisible());
    }

    @And("click on make payment button")
    public void clickOnMakePaymentButton() throws InterruptedException {
        ChildRegistrationPageMethods.ClickOnMakePaymentButton();
    }

    @And("enter the payment email {string}")
    public void enterThePaymentEmail(String arg0) {
        ChildRegistrationPageMethods.EnterPaymentEmail("abc@abc.com");
    }

    @And("enter the card number {string}")
    public void enterTheCardNumber(String arg0) {
        ChildRegistrationPageMethods.EnterCreditCardNumber("4242424242424242");
    }

    @And("enter the card expiry date {string}")
    public void enterTheCardExpiryDate(String arg0) {
        ChildRegistrationPageMethods.EnterCardExpiryDate("1236");
    }

    @And("enter the cvv {string}")
    public void enterTheCvv(String arg0) {
        ChildRegistrationPageMethods.EnterCardCVV("123");
    }

    @And("enter card holder name {string}")
    public void enterCardHolderName(String arg0) throws InterruptedException {
        ChildRegistrationPageMethods.EnterCardholderName("Test");
    }

    @And("click on the credit card pay button")
    public void clickOnTheCreditCardPayButton() throws InterruptedException {
        ChildRegistrationPageMethods.ClickCreditPaymentPayButton();
    }

    @And("Payment Successful Text is Visible")
    public void paymentSuccessfulTextIsVisible() {
        Assert.assertTrue("Payment Successful Text is not Visible",
                ChildRegistrationPageMethods.isPaymentSuccessfulTextVisible());
    }

    @And("click on View Enrollments Button on Payment Successful page")
    public void clickOnViewEnrollmentsButtonOnPaymentSuccessfulPage() throws InterruptedException {
        ChildRegistrationPageMethods.ClickViewEnrollmentsButton();
    }


    @And("the provider click on drop in button")
    public void theProviderClickOnDropInButton() throws InterruptedException {
        ChildRegistrationPageMethods.ClickOnDropInButtonProviderEnroll();
        Thread.sleep(3000);
    }

    @And("the provider search the enroll child drop in")
    public void theProviderSearchTheEnrollChildDropIn() throws InterruptedException {
        ChildRegistrationPageMethods.EnterCreatedNameOfProviderChildEnrollDropIn(randomFirstName);
        Thread.sleep(3000);
    }

    @And("the provider click on Enrollment Status edit icon for drop in")
    public void theProviderClickOnEnrollmentStatusEditIconForDropIn() throws InterruptedException {
        ChildRegistrationPageMethods.ClickOnEditEnrollmentStatusButtonDropIn();
    }

    @And("the provider click on edit Enrollment status dropdown for drop in")
    public void theProviderClickOnEditEnrollmentStatusDropdownForDropIn() throws InterruptedException {
        ChildRegistrationPageMethods.ClickOnEnrollmentStatusDropdownDropIn();
    }

    @And("the provider click on the Approve option for drop in")
    public void theProviderClickOnTheApproveOptionForDropIn() throws InterruptedException {
        ChildRegistrationPageMethods.ClickOnApprovedForDropIn();
    }


    @And("when user enter the random name in the search box dro in for client")
    public void whenUserEnterTheRandomNameInTheSearchBoxDroInForClient() {
        ChildRegistrationPageMethods.EnterSearchFieldClientEnrollmentListDropIn(randomFirstName);
    }

    @And("client clicks on the pay button for client Drop in")
    public void clientClicksOnThePayButtonForClientDropIn() throws InterruptedException {
        ChildRegistrationPageMethods.ClickPayFeeButtonClientDropIn();
    }

    //parent information child creation
    @When("the parent information header text is visible")
    public void theParentInformationHeaderTextIsVisible() throws InterruptedException {
        Assert.assertTrue("the parent information header text is not visible", ChildRegistrationPageMethods.isParentInformationHeaderTextVisible());
        Thread.sleep(2000);

    }

    @And("the parent title text is visible")
    public void theParentTitleTextIsVisible() {
        Assert.assertTrue("the parent title text is not visible",
                ChildRegistrationPageMethods.isParentInformationTitleTextVisible());
    }

    @And("the parent first name text is visible")
    public void theParentFirstNameTextIsVisible() {
        Assert.assertTrue("the parent first name text is not visible",
                ChildRegistrationPageMethods.isParentFirstNameTitleTextVisible());
    }

    @And("the parent middle name text is visible")
    public void theParentMiddleNameTextIsVisible() {
        Assert.assertTrue("the parent middle name text is not visible",
                ChildRegistrationPageMethods.isParentMiddleNameTitleTextVisible());
    }

    @And("the parent last name text is visible")
    public void theParentLastNameTextIsVisible() {
        Assert.assertTrue("the parent last name text is not visible",
                ChildRegistrationPageMethods.isParentLastNameTitleTextVisible());
    }


    @And("the parent email address text is visible")
    public void theParentEmailAddressTextIsVisible() {
        Assert.assertTrue("the parent email address text is not visible",
                ChildRegistrationPageMethods.isParentEmailTitleTextVisible());
    }

    @And("the parent relationship to child text is visible")
    public void theParentRelationshipToChildTextIsVisible() {
        Assert.assertTrue("the parent relationship to child text is not visible",
                ChildRegistrationPageMethods.isParentRelationshipWithTheChildVisible());
    }

    @And("the parent phone number text is visible")
    public void theParentPhoneNumberTextIsVisible() {
        Assert.assertTrue("the parent phone number text is not visible",
                ChildRegistrationPageMethods.isParentCellPhoneTitleTextVisible());

    }

    @And("he parent home phone number text is visible")
    public void heParentHomePhoneNumberTextIsVisible() {
        Assert.assertTrue("he parent home phone number text is not visible",
                ChildRegistrationPageMethods.isParentHomePhoneTitleTextVisible());

    }

    @And("he parent Alternate phone number text is visible")
    public void heParentAlternatePhoneNumberTextIsVisible() {
        Assert.assertTrue("he parent Alternate phone number text is not visible",
                ChildRegistrationPageMethods.isAlternatePhoneTitleTextVisible());
    }

    @And("the parent Street Address text is visible")
    public void theParentStreetAddressTextIsVisible() {
        Assert.assertTrue("the parent Street Address text is not visible",
                ChildRegistrationPageMethods.isParenStreetAddressTitleTextVisible());
    }

    @And("the parent Apt text is visible")
    public void theParentAptTextIsVisible() {
        Assert.assertTrue("the parent Apt text is not visible", ChildRegistrationPageMethods.isParentAptTitleTextVisible());


    }

    @And("the parent City text is visible")
    public void theParentCityTextIsVisible() {
        Assert.assertTrue("the parent City text is not visible", ChildRegistrationPageMethods.isParentCityTitleTextVisible());
    }

    @And("the parent ZIP code text is visible")
    public void theParentZIPCodeTextIsVisible() {
        Assert.assertTrue("the parent ZIP code text is not visible", ChildRegistrationPageMethods.isParentZIPCodeTitleTextVisible());
    }

    @And("the parent First name is required error message is visible")
    public void theParentFirstNameIsRequiredErrorMessageIsVisible() {
        Assert.assertTrue("The child First name is required error message is not visible",
                ChildRegistrationPageMethods.isFirstNameFieldErrorMSGVisible());
    }

    @And("the parent Last name is required error message is visible")
    public void theParentLastNameIsRequiredErrorMessageIsVisible() {
        Assert.assertTrue("the child Last name is required error message is not visible",
                ChildRegistrationPageMethods.isLastNameFieldErrorMSGVisible());
    }

    @And("the parent Phone number is required error message is visible")
    public void theParentPhoneNumberIsRequiredErrorMessageIsVisible() {
        Assert.assertTrue("the parent Phone number is required error message is not visible",
                ChildRegistrationPageMethods.isParentCellPhoneFieldErrorMSGVisible());

    }

    @And("the parent Email address is required error message is visible")
    public void theParentEmailAddressIsRequiredErrorMessageIsVisible() {
        Assert.assertTrue("the parent Email address is required error message is not visible",
                ChildRegistrationPageMethods.isParentEmailFieldErrorMSGErrorMSGVisible());
    }

    @And("the parent Relationship to child is required error message is visible")
    public void theParentRelationshipToChildIsRequiredErrorMessageIsVisible() {
        Assert.assertTrue("the parent Relationship to child is required error message is not visible", ChildRegistrationPageMethods.isParentRelationshipWithTheChildErrorMSGErrorMSGVisible());

    }

    @And("the parent Street address is required error message is visible")
    public void theParentStreetAddressIsRequiredErrorMessageIsVisible() {
        Assert.assertTrue("The child Street address is required error message is not visible",
                ChildRegistrationPageMethods.isStreetAddressFieldErrorMSGVisible());

    }

    @And("the parent City is required error message is visible")
    public void theParentCityIsRequiredErrorMessageIsVisible() {
        Assert.assertTrue("The child City is required error message is not visible",
                ChildRegistrationPageMethods.isCityFieldErrorMSGVisible());
    }

    @And("the parent ZIP code is required error message is visible")
    public void theParentZIPCodeIsRequiredErrorMessageIsVisible() {
        Assert.assertTrue("The ZIP code is required error message is not visible",
                ChildRegistrationPageMethods.isZipCodeFieldErrorMSGVisible());

    }

    @And("enters the parent wrong email id {string}")
    public void entersTheParentWrongEmailId(String arg0) throws InterruptedException {
        ChildRegistrationPageMethods.EnterParentWrongEmail("j@j");


    }

    //emergency contact information page child register
    @When("the emergency contact information header text is visible")
    public void theEmergencyContactInformationHeaderTextIsVisible() {
        Assert.assertTrue("the emergency contact information header text is not visible",
                ChildRegistrationPageMethods.isEmergencyContactHeaderTextVisible());
    }

    @And("the emergency contact title text is visible")
    public void theEmergencyContactTitleTextIsVisible() {
        Assert.assertTrue("the emergency contact title text is not visible",
                ChildRegistrationPageMethods.isEmergencyContactTitleTextVisible());
    }

    @And("the emergency contact first name text is visible")
    public void theEmergencyContactFirstNameTextIsVisible() {
        Assert.assertTrue("the emergency contact first name text is not visible",
                ChildRegistrationPageMethods.isParentFirstNameTitleTextVisible());

    }

    @And("the emergency contact middle name text is visible")
    public void theEmergencyContactMiddleNameTextIsVisible() {
        Assert.assertTrue("the emergency contact middle name text is not visible",
                ChildRegistrationPageMethods.isParentMiddleNameTitleTextVisible());
    }

    @And("the emergency contact last name text is visible")
    public void theEmergencyContactLastNameTextIsVisible() {
        Assert.assertTrue("the emergency contact last name text is not visible",
                ChildRegistrationPageMethods.isParentLastNameTitleTextVisible());
    }

    @And("the emergency contact email address text is visible")
    public void theEmergencyContactEmailAddressTextIsVisible() {
        Assert.assertTrue("the parent email address text is not visible",
                ChildRegistrationPageMethods.isParentEmailTitleTextVisible());
    }

    @And("the emergency contact phone number text is visible")
    public void theEmergencyContactPhoneNumberTextIsVisible() {
        Assert.assertTrue("the  emergency contact phone number text is not visible",
                ChildRegistrationPageMethods.isParentCellPhoneTitleTextVisible());
    }

    @And("the emergency contact home phone number text is visible")
    public void theEmergencyContactHomePhoneNumberTextIsVisible() {
        Assert.assertTrue("the emergency contact home phone number text is not visible",
                ChildRegistrationPageMethods.isParentHomePhoneTitleTextVisible());
    }

    @And("the emergency contact alternate phone number text is visible")
    public void theEmergencyContactAlternatePhoneNumberTextIsVisible() {
        Assert.assertTrue("the emergency contact alternate phone number text is not visible",
                ChildRegistrationPageMethods.isAlternatePhoneTitleTextVisible());
    }

    @When("the pickup contact information header text is visible")
    public void thePickupContactInformationHeaderTextIsVisible() {
        Assert.assertTrue("the pickup contact information header text is not visible",
                ChildRegistrationPageMethods.isPickupContactHeaderTextVisible());

    }

    @And("the pickup contact title text is visible")
    public void thePickupContactTitleTextIsVisible() {
        Assert.assertTrue("the pickup contact title text is not visible",
                ChildRegistrationPageMethods.isPickupContactTitleTextVisible());

    }

    @And("the pickup contact first name text is visible")
    public void thePickupContactFirstNameTextIsVisible() {
        Assert.assertTrue("the pickup contact first name text is not visible",
                ChildRegistrationPageMethods.isParentFirstNameTitleTextVisible());
    }

    @And("the pickup contact middle name text is visible")
    public void thePickupContactMiddleNameTextIsVisible() {
        Assert.assertTrue("the pickup contact middle name text is not visible",
                ChildRegistrationPageMethods.isParentMiddleNameTitleTextVisible());
    }

    @And("the pickup contact last name text is visible")
    public void thePickupContactLastNameTextIsVisible() {
        Assert.assertTrue("the pickup contact last name text is not visible",
                ChildRegistrationPageMethods.isParentLastNameTitleTextVisible());
    }

    @And("the pickup contact email address text is visible")
    public void thePickupContactEmailAddressTextIsVisible() {
        Assert.assertTrue("the pickup email address text is not visible",
                ChildRegistrationPageMethods.isParentEmailTitleTextVisible());
    }

    @And("the pickup contact phone number text is visible")
    public void thePickupContactPhoneNumberTextIsVisible() {
        Assert.assertTrue("the  pickup contact phone number text is not visible",
                ChildRegistrationPageMethods.isParentCellPhoneTitleTextVisible());
    }

    @And("the pickup contact home phone number text is visible")
    public void thePickupContactHomePhoneNumberTextIsVisible() {
        Assert.assertTrue("the pickup contact home phone number text is not visible",
                ChildRegistrationPageMethods.isParentHomePhoneTitleTextVisible());
    }

    @And("the pickup contact alternate phone number text is visible")
    public void thePickupContactAlternatePhoneNumberTextIsVisible() {
        Assert.assertTrue("the pickup contact alternate phone number text is not visible",
                ChildRegistrationPageMethods.isAlternatePhoneTitleTextVisible());
    }

    @And("Check the Approved status of child enrollment provider side")
    public void checkTheApprovedStatusOfChildEnrollmentProviderSide() {
        Assert.assertTrue("Approved status is not visible of child enrollment provider side", ChildRegistrationPageMethods.isApprovedStatusOfChildEnrollProviderSideTextVisible());
    }

    @And("The user click on the View Enrollment button after enrollment")
    public void theUserClickOnTheViewEnrollmentButtonAfterEnrollment() throws InterruptedException {
        ChildRegistrationPageMethods.ClickViewEnrollmentButtonAfterEnroll();
        
    }

    @And("The user click on the  Enrollments tab")
    public void theUserClickOnTheEnrollmentsTab() throws InterruptedException {
        ChildRegistrationPageMethods.ClickEnrollmentsTab();
    }
}


