package stepDefinition;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageMethods.IntakeFormPageMethods;


public class IntakeFromPageSteps {
    IntakeFormPageMethods IntakeFormPageMethods = new IntakeFormPageMethods();


    @When("user should navigate to intake form")
    public void user_should_navigate_to_intake_form() throws InterruptedException {
        Assert.assertTrue("user is not navigate to intake form", IntakeFormPageMethods.isWebSiteNameVisibleIntakeFrom());
    Thread.sleep(3000);
    }

    @When("the intake information Center header text is visible")
    public void the_intake_information_center_header_text_is_visible() {
        Assert.assertTrue("the intake information Center header text is not visible",
                IntakeFormPageMethods.isIntakeFormHeaderTextVisible());
    }

    @When("the intake information Center description text is visible")
    public void the_intake_information_center_description_text_is_visible() {
        Assert.assertTrue("the intake information Center description text is not visible",
                IntakeFormPageMethods.isIntakeFormHeaderDescriptionTextVisible());
    }

    @When("the intake form provider name is visible")
    public void the_intake_form_provider_name_is_visible() {
        Assert.assertTrue("the intake form provider name is not visible", IntakeFormPageMethods.isProviderNameIntakeFromVisible());

    }

    @When("the intake form provider description is visible")
    public void the_intake_form_provider_description_is_visible() {
        Assert.assertTrue("the intake form provider description is not visible",
                IntakeFormPageMethods.isProviderDescriptionIntakeFromVisible());
    }

    @When("the Intake form provider details logo is visible")
    public void the_intake_form_provider_details_little_logo_is_visible() {
        Assert.assertTrue("the Intake form provider details logo is not visible", IntakeFormPageMethods.isIntakeProviderLogoVisible());
    }

    @When("the Intake form provider details phone label is visible")
    public void the_intake_form_provider_details_phone_label_is_visible() {
        Assert.assertTrue("the Intake form provider details phone label is not visible",
                IntakeFormPageMethods.isProviderPhoneTitleTextIntakeFromVisible());
    }

    @When("the Intake form provider details phone number  is visible")
    public void the_intake_form_provider_details_phone_number_is_visible() {
        Assert.assertTrue("the Intake form provider details phone number  is not visible",
                IntakeFormPageMethods.isProviderPhoneNumberIntakeFromVisible());
    }

    @When("the Intake form provider details address label is visible")
    public void the_intake_form_provider_details_address_label_is_visible() {
        Assert.assertTrue("the Intake form provider details address label is not visible",
                IntakeFormPageMethods.isProviderAddressTitleTextIntakeFromVisible());
    }

    @When("the Intake form provider details address  is visible")
    public void the_intake_form_provider_details_address_is_visible() {
        Assert.assertTrue("the Intake form provider details address  is not visible",
                IntakeFormPageMethods.isProviderAddressIntakeFromVisible());
    }

    @When("the Intake form provider details city label is visible")
    public void the_intake_form_provider_details_city_label_is_visible() {
        Assert.assertTrue("the Intake form provider details city label is not visible",
                IntakeFormPageMethods.isProviderCityTitleTextIntakeFromVisible());
    }

    @When("the Intake form provider details city  is visible")
    public void the_intake_form_provider_details_city_is_visible() {
        Assert.assertTrue("the Intake form provider details city  is not visible",
                IntakeFormPageMethods.isProviderCityIntakeFromVisible());

    }

    @When("the Intake form provider details state label is visible")
    public void the_intake_form_provider_details_state_label_is_visible() {
        Assert.assertTrue("the Intake form provider details state label is not visible",
                IntakeFormPageMethods.isProviderStateTitleTextIntakeFromVisible());
    }

    @When("the Intake form provider details state  is visible")
    public void the_intake_form_provider_details_state_is_visible() {
        Assert.assertTrue("the Intake form provider details state  is not visible", IntakeFormPageMethods.isProviderStateIntakeFromVisible());
    }

    @When("the Intake form provider details SSPS Number label is visible")
    public void the_intake_form_provider_details_ssps_number_label_is_visible() {
        Assert.assertTrue("the Intake form provider details SSPS Number label is not visible",
                IntakeFormPageMethods.isProviderSSPSNumberTitleTextIntakeFromVisible());
    }

    @When("the Intake form provider details SSPS Number  is visible")
    public void the_intake_form_provider_details_ssps_number_is_visible() {
        Assert.assertTrue("the Intake form provider details SSPS Number  is not visible",
                IntakeFormPageMethods.isProviderSSPSNumberTextIntakeFromVisible());
    }

    @When("the Intake form provider details timing label is visible")
    public void the_intake_form_provider_details_timing_label_is_visible() {
        Assert.assertTrue("the Intake form provider details timing label is not visible",
                IntakeFormPageMethods.isProviderTimingTitleTextIntakeFromVisible());

    }

    @When("the Intake form provider details timing is visible")
    public void the_intake_form_provider_details_timing_is_visible() {
        Assert.assertTrue("the Intake form provider details timing is not visible",
                IntakeFormPageMethods.isProviderTimingIntakeFromVisible());
    }

    @When("the Intake form Child information section header is visible")
    public void the_intake_form_child_information_section_header_is_visible() {
        Assert.assertTrue("the Intake form Child information section header is not visible",
                IntakeFormPageMethods.isChildInformationSectionTitleTextVisible());
    }

    @When("the Intake form Child First name field is visible")
    public void the_intake_form_child_first_name_field_is_visible() {
        Assert.assertTrue("the Intake form Child First name field is not visible",
                IntakeFormPageMethods.isFirstNameChildIntakeTextVisible());
    }

    @When("the Intake form Child Last name field is visible")
    public void the_intake_form_child_last_name_field_is_visible() {
        Assert.assertTrue("the Intake form Child Last name field is not visible",
                IntakeFormPageMethods.isLastNameChildIntakeTextVisible());
    }

    @When("the Intake form Child Date of birth field is visible")
    public void the_intake_form_child_date_of_birth_field_is_visible() {
        Assert.assertTrue("the Intake form Child Date of birth field is not visible",
                IntakeFormPageMethods.isDateOfBirthChildIntakeTextVisible());

    }

    @When("the Intake form Child Gender dropdown is visible")
    public void the_intake_form_child_gender_dropdown_is_visible() {
        Assert.assertTrue("the Intake form Child Gender dropdown is not visible",
                IntakeFormPageMethods.isGenderChildIntakeTextVisible());
    }

    @When("the Intake form Parent information section header is visible")
    public void the_intake_form_parent_information_section_header_is_visible() {
        Assert.assertTrue("the Intake form Parent information section header is not visible",
                IntakeFormPageMethods.isParentInformationTitleTextIntakeTextVisible());
    }

    @When("the Intake form Parent First name field is visible")
    public void the_intake_form_parent_first_name_field_is_visible() {
        Assert.assertTrue("the Intake form Parent First name field is not visible",
                IntakeFormPageMethods.isFirstNameParentIntakeTextVisible());
    }

    @When("the Intake form Parent Last name field is visible")
    public void the_intake_form_parent_last_name_field_is_visible() {
        Assert.assertTrue("the Intake form Parent Last name field is not visible",
                IntakeFormPageMethods.isLastNameParentIntakeTextVisible());
    }

    @When("the Intake form Parent Email field is visible")
    public void the_intake_form_parent_email_field_is_visible() {
        Assert.assertTrue("the Intake form Parent Email field is not visible",
                IntakeFormPageMethods.isEmailParentIntakeTextVisible());
    }

    @When("the Intake form Parent Confirm email field is visible")
    public void the_intake_form_parent_confirm_email_field_is_visible() {
        Assert.assertTrue("the Intake form Parent Confirm Email field is not visible",
                IntakeFormPageMethods.isConfirmEmailParentIntakeTextVisible());
    }

    @When("the Intake form Parent Phone field is visible")
    public void the_intake_form_parent_phone_field_is_visible() {
        Assert.assertTrue("the Intake form Parent Phone field is not visible",
                IntakeFormPageMethods.isPhoneParentIntakeTextVisible());
    }

    @When("the Intake form Parent Relationship with child dropdown is visible")
    public void the_intake_form_parent_relationship_with_child_dropdown_is_visible() {
        Assert.assertTrue("the Intake form Parent Relationship with child dropdown is not visible",
                IntakeFormPageMethods.isRelationshipWithChildIntakeTextVisible());
    }

    //Enter valid information into all fields on the intake form
    private String randomFirstName;

    @When("the Intake form user enters the child First Name")
    public void theIntakeFormUserEntersTheChildFirstName() throws InterruptedException {
        randomFirstName = IntakeFormPageMethods.generateRandomFirstNameAddChildIntake();
        IntakeFormPageMethods.EnterChildFirstNameIntake(randomFirstName);
        Thread.sleep(1000);

    }

    @And("the Intake form user enters the child Last Name")
    public void theIntakeFormUserEntersTheChildLastName() {
        IntakeFormPageMethods.EnterIntakeChildLastNameInput("Smith");
    }

    @And("the Intake form user selects the child Date of Birth")
    public void theIntakeFormUserSelectsTheChildDateOfBirth() {
        String childBirthdate = IntakeFormPageMethods.EnterRandomChildBirthdate();
        IntakeFormPageMethods.EnterChildRandomSelectedBirthdateIntake(childBirthdate);
    }

    @And("the Intake form user click on the child Gender dropdown")
    public void theIntakeFormUserClickOnTheChildGenderDropdown() {
        IntakeFormPageMethods.ClickOnChildGenderFieldIntake();
    }

    @And("the Intake form user selects the child Gender")
    public void theIntakeFormUserSelectsTheChildGender() {
        IntakeFormPageMethods.ClickOnChildGenderOptionIntake();
    }

    @And("the Intake form user enters the parent First Name")
    public void theIntakeFormUserEntersTheParentFirstName() {
        IntakeFormPageMethods.EnterIntakeParentFirstName("Dom");
    }

    @And("the Intake form user enters the parent Last Name")
    public void theIntakeFormUserEntersTheParentLastName() {
        IntakeFormPageMethods.EnterIntakeParentLastName("Miller");
    }

    @And("the Intake form user enters the parent Email")
    public void theIntakeFormUserEntersTheParentEmail() {
        IntakeFormPageMethods.EnterIntakeParentEmail("jack@yopmail.com");
    }

    @And("the Intake form user confirms the Email")
    public void theIntakeFormUserConfirmsTheEmail() {
        IntakeFormPageMethods.EnterIntakeParentConfirmEmail("jack@yopmail.com");
    }

    @And("the Intake form user enters the parent Phone number")
    public void theIntakeFormUserEntersTheParentPhoneNumber() {
        IntakeFormPageMethods.EnterIntakeParentPhoneNumber("3210546987");
    }

    @And("the Intake form user click on the Relationship with child dropdown")
    public void theIntakeFormUserClickOnTheRelationshipWithChildDropdown() {
        IntakeFormPageMethods.ClickOnIntakeParentRelationshipDropdown();
    }

    @And("the Intake form user selects the Relationship with child")
    public void theIntakeFormUserSelectsTheRelationshipWithChild() {
        IntakeFormPageMethods.ClickOnIntakeParentRelationshipSelection();
    }


    @And("the Intake form user selects the subsidy status")
    public void theIntakeFormUserSelectsTheSubsidyStatus() {
        IntakeFormPageMethods.ClickOnIntakeSubsidyNoRadio();
    }


    @And("the Intake form click on Preferred Start Date field")
    public void theIntakeFormClickOnPreferredStartDateField() {
        IntakeFormPageMethods.ClickIntakePreferredStartDateInput();
    }

    @And("the Intake form user selects the Preferred Start Date")
    public void theIntakeFormUserSelectsThePreferredStartDate() throws InterruptedException {
        IntakeFormPageMethods.ClickIntakePreferredStartDateToday();
        Thread.sleep(1000);
    }


    @And("the Intake form user click on the Preferred Schedule Type")
    public void theIntakeFormUserClickOnThePreferredScheduleType() {
        IntakeFormPageMethods.ClickIntakePreferredScheduleTypeDropdown();
    }

    @And("the Intake form user selects the Preferred Schedule Type")
    public void theIntakeFormUserSelectsThePreferredScheduleType() {
        IntakeFormPageMethods.ClickIntakePreferredScheduleTypeOption();

    }

    @And("the Intake form user enters the Preferred Arrival Time")
    public void theIntakeFormUserEntersThePreferredArrivalTime() {
        IntakeFormPageMethods.EnterIntakeArrivalTimeInput("08001");
    }

    @And("the Intake form user enters the Preferred Departure Time")
    public void theIntakeFormUserEntersThePreferredDepartureTime() {
        IntakeFormPageMethods.EnterIntakeDepartureTimeInput("06002");
    }

    @And("the Intake form user enters additional Enrollment Description")
    public void theIntakeFormUserEntersAdditionalEnrollmentDescription() {
        IntakeFormPageMethods.EnterIntakeEnrollmentDescriptionTextarea("It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.");
    }

    @And("the Intake form user enters the Health Description")
    public void theIntakeFormUserEntersTheHealthDescription() {
        IntakeFormPageMethods.EnterIntakeHealthDescriptionTextarea("Not Well");
    }

    @And("the Intake form user checks the Privacy Policy and Terms & Conditions agreement checkbox")
    public void theIntakeFormUserChecksThePrivacyPolicyAndTermsConditionsAgreementCheckbox() {
        IntakeFormPageMethods.ClickIntakeTermsCheckbox();
    }

    @And("the Intake form user clicks on the Send request button")
    public void theIntakeFormUserClicksOnTheSendRequestButton() {
        IntakeFormPageMethods.ClickIntakeSendRequestButton();
    }

    @And("the provider search the enroll child for intake")
    public void theProviderSearchTheEnrollChildForIntake() {
        IntakeFormPageMethods.EnterCreatedNameOfProviderChildEnroll(randomFirstName);
    }

    @And("the Intake form Thank you for your submission popup visible")
    public void theIntakeFormThankYouForYourSubmissionPopupVisible() {
        Assert.assertTrue("the Intake form Thank you for your submission popup is not visible",
                IntakeFormPageMethods.isRequestSubmittedSuccessfullyMsgVisible());
    }

    @And("the Intake form Your request has been submitted successfully message is showing")
    public void theIntakeFormYourRequestHasBeenSubmittedSuccessfullyMessageIsShowing() {
        Assert.assertTrue("the Intake form Your request has been submitted successfully message " +
                "is not showing", IntakeFormPageMethods.isThankYouForYourSubmissionMsgVisible());
    }

    @And("the Intake form click on login button")
    public void theIntakeFormClickOnLoginButton() {
        IntakeFormPageMethods.ClickLoginButtonSuccessPopup();
    }

    @And("user click on the Enrollments tab")
    public void userClickOnTheEnrollmentsTab() {
        IntakeFormPageMethods.ClickEnrollmentsTabClient();
    }

    @And("when user enter the random name in the search box for client")
    public void whenUserEnterTheRandomNameInTheSearchBoxForClient() {
        IntakeFormPageMethods.SearchChildClientEnrollmentList(randomFirstName);
    }

    //Visible text in subsidy section
    @When("the Intake form Subsidy information section header is visible")
    public void theIntakeFormSubsidyInformationSectionHeaderIsVisible() {
        Assert.assertTrue("the Intake form Subsidy information section header is not visible",
                IntakeFormPageMethods.isSubsidyInformationLabelIntakeVisible());
    }

    @And("the Intake form Is the child subsidized? question is visible")
    public void theIntakeFormIsTheChildSubsidizedQuestionIsVisible() {
        Assert.assertTrue("the Intake form Is the child subsidized? question is not visible",
                IntakeFormPageMethods.isIsTheChildSubsidizedLabelIntakeVisible());
    }

    @And("the Intake form Enrollment information section header is visible")
    public void theIntakeFormEnrollmentInformationSectionHeaderIsVisible() {
        Assert.assertTrue("the Intake form Enrollment information section header is not visible",
                IntakeFormPageMethods.isEnrollmentInformationTitleTextIntakeVisible());
    }

    @And("the Intake form Preferred start date field is visible")
    public void theIntakeFormPreferredStartDateFieldIsVisible() {
        Assert.assertTrue("the Intake form Preferred start date field is not visible",
                IntakeFormPageMethods.isPreferredStartDateLabelIntakeVisible());
    }

    @And("the Intake form Preferred schedule type dropdown is visible")
    public void theIntakeFormPreferredScheduleTypeDropdownIsVisible() {
        Assert.assertTrue("the Intake form Preferred schedule type dropdown is not visible",
                IntakeFormPageMethods.isPreferredScheduleTypeLabelIntakeVisible());

    }

    @And("the Intake form Preferred Arrival Time field is visible")
    public void theIntakeFormPreferredArrivalTimeFieldIsVisible() {
        Assert.assertTrue("the Intake form Preferred Arrival Time field is not visible",
                IntakeFormPageMethods.isPreferredArrivalTimeLabelIntakeVisible());
    }

    @And("the Intake form Preferred Departure Time field is visible")
    public void theIntakeFormPreferredDepartureTimeFieldIsVisible() {
        Assert.assertTrue("the Intake form Preferred Departure Time field is not visible",
                IntakeFormPageMethods.isPreferredDepartureTimeLabelIntakeVisible());

    }

    @And("the Intake form Additional notes text area is visible")
    public void theIntakeFormAdditionalNotesTextAreaIsVisible() {
        Assert.assertTrue("the Intake form Additional notes text area is not visible",
                IntakeFormPageMethods.isAdditionalNotesLabelIntakeVisible());
    }

    @And("the Intake form Health information section header is visible")
    public void theIntakeFormHealthInformationSectionHeaderIsVisible() {
        Assert.assertTrue("the Intake form Health information section header is not visible",
                IntakeFormPageMethods.isHealthInformationTitleTextIntakeVisible());
    }

    @And("the Intake form Health details text area is visible")
    public void theIntakeFormHealthDetailsTextAreaIsVisible() {
        Assert.assertTrue("the Intake form Health details text area is not visible",
                IntakeFormPageMethods.isHealthInformationDescriptionLabelVisible());

    }

    @And("the Intake form agreement text with Privacy Policy and Terms & Conditions links is visible")
    public void theIntakeFormAgreementTextWithPrivacyPolicyAndTermsConditionsLinksIsVisible() {
        Assert.assertTrue("the Intake form Health details text area is not visible",
                IntakeFormPageMethods.isPrivacyPolicyAndTermsConditionsIntakeVisible());
    }

    @And("the Intake form disclaimer paragraph is visible")
    public void theIntakeFormDisclaimerParagraphIsVisible() {
        Assert.assertTrue("the Intake form disclaimer paragraph is not visible",
                IntakeFormPageMethods.isDisclaimerTextIntakeVisible());
    }
    //inkate validation msg

    @And("the system should display First name can only contain letters. for Child First Name")
    public void childFirstNameErrorIsVisible() {
        Assert.assertTrue("Child First Name error is not visible",
                IntakeFormPageMethods.isChildFirstNameErrorVisible());
    }

    @And("the system should display Last name can only contain letters. for Child Last Name")
    public void childLastNameErrorIsVisible() {
        Assert.assertTrue("Child Last Name error is not visible",
                IntakeFormPageMethods.isChildLastNameErrorVisible());
    }

    @And("the system should display Birthdate is required. for Child Date of Birth")
    public void childDOBErrorIsVisible() {
        Assert.assertTrue("Child Date of Birth error is not visible",
                IntakeFormPageMethods.isChildDOBErrorVisible());
    }

    @And("the system should display Gender is required. for Child Gender")
    public void childGenderErrorIsVisible() {
        Assert.assertTrue("Child Gender error is not visible",
                IntakeFormPageMethods.isChildGenderErrorVisible());
    }

    @And("the system should display First name can only contain letters. for Parent First Name")
    public void parentFirstNameErrorIsVisible() {
        Assert.assertTrue("Parent First Name error is not visible",
                IntakeFormPageMethods.isParentFirstNameErrorVisible());
    }

    @And("the system should display Last name can only contain letters. for Parent Last Name")
    public void parentLastNameErrorIsVisible() {
        Assert.assertTrue("Parent Last Name error is not visible",
                IntakeFormPageMethods.isParentLastNameErrorVisible());
    }

    @And("the system should display Email is required. for Parent Email")
    public void parentEmailErrorIsVisible() {
        Assert.assertTrue("Parent Email error is not visible",
                IntakeFormPageMethods.isParentEmailErrorVisible());
    }

    @And("the system should display Email confirmation is required. for Confirm Email")
    public void confirmEmailErrorIsVisible() {
        Assert.assertTrue("Confirm Email error is not visible",
                IntakeFormPageMethods.isConfirmEmailErrorVisible());
    }

    @And("the system should display Mobile number must be exactly 10 digits. for Parent Phone Number")
    public void parentPhoneErrorIsVisible() {
        Assert.assertTrue("Parent Phone Number error is not visible",
                IntakeFormPageMethods.isParentPhoneErrorVisible());
    }

    @And("the system should display Relationship is required. for Relationship with Child")
    public void relationshipWithChildErrorIsVisible() {
        Assert.assertTrue("Relationship with Child error is not visible",
                IntakeFormPageMethods.isRelationshipWithChildErrorVisible());
    }

    @And("the system should display Subsidy eligibility is required. for Subsidy Eligibility")
    public void subsidyEligibilityErrorIsVisible() {
        Assert.assertTrue("Subsidy Eligibility error is not visible",
                IntakeFormPageMethods.isSubsidyEligibilityErrorVisible());
    }

    @And("the system should display Start date is required. for Preferred Start Date")
    public void preferredStartDateErrorIsVisible() {
        Assert.assertTrue("Preferred Start Date error is not visible",
                IntakeFormPageMethods.isPreferredStartDateErrorVisible());
    }

    @And("the system should display Schedule type is required. for Preferred Schedule Type")
    public void preferredScheduleTypeErrorIsVisible() {
        Assert.assertTrue("Preferred Schedule Type error is not visible",
                IntakeFormPageMethods.isPreferredScheduleTypeErrorVisible());
    }

    @And("the system should display Arrival time is required. for Preferred Arrival Time")
    public void preferredArrivalTimeErrorIsVisible() {
        Assert.assertTrue("Preferred Arrival Time error is not visible",
                IntakeFormPageMethods.isPreferredArrivalTimeErrorVisible());
    }

    @And("the system should display Departure time is required. for Preferred Departure Time")
    public void preferredDepartureTimeErrorIsVisible() {
        Assert.assertTrue("Preferred Departure Time error is not visible",
                IntakeFormPageMethods.isPreferredDepartureTimeErrorVisible());
    }

    @And("the system should display You must agree to the terms and conditions. for Terms and Conditions Agreement")
    public void termsAgreementErrorIsVisible() {
        Assert.assertTrue("Terms and Conditions Agreement error is not visible",
                IntakeFormPageMethods.isTermsAgreementErrorVisible());
    }
//Placeholder

    @Then("the First name field placeholder in Child information should be First name")
    public void the_first_name_field_placeholder_in_child_information_should_be_first_name() {
        Assert.assertTrue("the First name field placeholder in Child information is not be First name",
                IntakeFormPageMethods.isChildFirstNamePlaceholderVisible());
    }

    @Then("the Last name field placeholder in Child information should be Last name")
    public void the_last_name_field_placeholder_in_child_information_should_be_last_name() {
        Assert.assertTrue("the Last name field placeholder in Child information is not be First name",
                IntakeFormPageMethods.isChildLastNamePlaceholderVisible());
    }

    @Then("the Date of birth field placeholder in Child information should be Select date")
    public void the_date_of_birth_field_placeholder_in_child_information_should_be_select_date() {
        Assert.assertTrue("the Date of birth field placeholder is not visible", IntakeFormPageMethods.isChildDOBPlaceholderVisible());
    }

    @Then("the Gender field placeholder in Child information should be Select gender")
    public void the_gender_field_placeholder_in_child_information_should_be_select_gender() {
        Assert.assertTrue("the Gender field placeholder is not visible", IntakeFormPageMethods.isChildGenderPlaceholderVisible());
    }

    @Then("the First name field placeholder in Parent information should be First name")
    public void the_first_name_field_placeholder_in_parent_information_should_be_first_name() {
        Assert.assertTrue("the Parent First name field placeholder is not visible", IntakeFormPageMethods.isParentFirstNamePlaceholderVisible());
    }

    @Then("the Last name field placeholder in Parent information should be Last name")
    public void the_last_name_field_placeholder_in_parent_information_should_be_last_name() {
        Assert.assertTrue("the Parent Last name field placeholder is not visible", IntakeFormPageMethods.isParentLastNamePlaceholderVisible());
    }


    @Then("the Parent Email field placeholder should be Email")
    public void the_parent_email_field_placeholder_should_be_email() {
        Assert.assertTrue("the Parent Email field placeholder is not visible ",
                IntakeFormPageMethods.isParentEmailPlaceholderVisible());
    }

    @Then("the Parent Confirm email field placeholder should be Confirm email")
    public void the_parent_confirm_email_field_placeholder_should_be_confirm_email() {
        Assert.assertTrue("the Parent Confirm email field placeholder is not visible",
                IntakeFormPageMethods.isConfirmEmailPlaceholderVisible());
    }

    @Then("the Parent Phone field placeholder should be Phone")
    public void the_parent_phone_field_placeholder_should_be_phone() {
        Assert.assertTrue("the Parent Phone field placeholder is not visible", IntakeFormPageMethods.isParentPhonePlaceholderVisible());
    }

    @Then("the Relationship with child field placeholder should be Select relationship")
    public void the_relationship_with_child_field_placeholder_should_be_select_relationship() {
        Assert.assertTrue("the Relationship with child field placeholder is not visible",
                IntakeFormPageMethods.isRelationshipWithChildPlaceholderVisible());
    }

    @Then("the Preferred start date field placeholder should be Select date")
    public void the_preferred_start_date_field_placeholder_should_be_select_date() {
        Assert.assertTrue("the Preferred start date field placeholder is not visible",
                IntakeFormPageMethods.isPreferredStartDatePlaceholderVisible());
    }

    @Then("the Preferred schedule type field placeholder should be Select type")
    public void the_preferred_schedule_type_field_placeholder_should_be_select_type() {
        Assert.assertTrue("the Preferred schedule type field placeholder is not visible",
                IntakeFormPageMethods.isPreferredScheduleTypePlaceholderVisible());
    }

    @Then("the Additional notes field placeholder Visible")
    public void the_additional_notes_field_placeholder_visible() {
        Assert.assertTrue("the Additional notes field placeholder is not Visible", IntakeFormPageMethods.isAdditionalNotesPlaceholderVisible());
    }

    @Then("the Health information field placeholder should be Please provide details related to the child's health.")
    public void the_health_information_field_placeholder_should_be_please_provide_details_related_to_the_child_s_health() {
        Assert.assertTrue("the Health information field placeholder is not visible",
                IntakeFormPageMethods.isHealthInformationPlaceholderVisible());
    }

    @And("the user click on the profile icon")
    public void theUserClickOnTheProfileIcon() {
        IntakeFormPageMethods.ClickOnTheProfileButton();
    }

    @And("the user clicks on login button")
    public void theUserClicksOnLoginButton() {
        IntakeFormPageMethods.ClickLoginButton();
    }

    @And("the user click on the Submit For Another Child")
    public void theUserClickOnTheSubmitForAnotherChild() {
        IntakeFormPageMethods.ClickOnSubmitForAnotherChild();
    }
}
