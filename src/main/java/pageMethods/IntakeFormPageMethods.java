package pageMethods;


import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

import java.util.Random;

public class IntakeFormPageMethods extends PredefinedActions {
    public PropOperation propOperation;

    public IntakeFormPageMethods() {
        propOperation = new PropOperation(ConstantPath.INTAKEFORMPAGELOCATORS);

    }

    public boolean isWebSiteNameVisibleIntakeFrom() throws InterruptedException {
        return isElementVisible(propOperation.getValue("WebsiteHeaderNameIntakeForm"));
    }

    public boolean isIntakeFormHeaderTextVisible() {
        return isElementVisible(propOperation.getValue("IntakeFormHeaderText"));
    }

    public boolean isIntakeFormHeaderDescriptionTextVisible() {
        return isElementVisible(propOperation.getValue("IntakeFormHeaderDescriptionText"));
    }

    public boolean isIntakeProviderLogoVisible() {
        return isElementVisible(propOperation.getValue("IntakeProviderLogo"));
    }

    public boolean isProviderNameIntakeFromVisible() {
        return isElementVisible(propOperation.getValue("ProviderNameIntakeFrom"));
    }

    public boolean isProviderDescriptionIntakeFromVisible() {
        return isElementVisible(propOperation.getValue("ProviderDescriptionIntakeFrom"));
    }

    public boolean isProviderPhoneTitleTextIntakeFromVisible() {
        return isElementVisible(propOperation.getValue("ProviderPhoneTitleTextIntakeFrom"));
    }

    public boolean isProviderPhoneNumberIntakeFromVisible() {
        return isElementVisible(propOperation.getValue("ProviderPhoneNumberIntakeFrom"));
    }

    public boolean isProviderAddressTitleTextIntakeFromVisible() {
        return isElementVisible(propOperation.getValue("ProviderAddressTitleTextIntakeFrom"));
    }

    public boolean isProviderAddressIntakeFromVisible() {
        return isElementVisible(propOperation.getValue("ProviderAddressIntakeFrom"));
    }

    public boolean isProviderCityTitleTextIntakeFromVisible() {
        return isElementVisible(propOperation.getValue("ProviderCityTitleTextIntakeFrom"));
    }

    public boolean isProviderCityIntakeFromVisible() {
        return isElementVisible(propOperation.getValue("ProviderCityIntakeFrom"));
    }

    public boolean isProviderStateTitleTextIntakeFromVisible() {
        return isElementVisible(propOperation.getValue("ProviderStateTitleTextIntakeFrom"));
    }

    public boolean isProviderStateIntakeFromVisible() {
        return isElementVisible(propOperation.getValue("ProviderStateIntakeFrom"));
    }

    public boolean isProviderSSPSNumberTitleTextIntakeFromVisible() {
        return isElementVisible(propOperation.getValue("ProviderSSPSNumberTitleTextIntakeFrom"));
    }

    public boolean isProviderSSPSNumberTextIntakeFromVisible() {
        return isElementVisible(propOperation.getValue("ProviderSSPSNumberTextIntakeFrom"));
    }

    public boolean isProviderTimingTitleTextIntakeFromVisible() {
        return isElementVisible(propOperation.getValue("ProviderTimingTitleTextIntakeFrom"));
    }

    public boolean isProviderTimingIntakeFromVisible() {
        return isElementVisible(propOperation.getValue("ProviderTimingIntakeFrom"));
    }

    public boolean isChildInformationSectionTitleTextVisible() {
        return isElementVisible(propOperation.getValue("ChildInformationSectionTitleText"));
    }

    public boolean isFirstNameChildIntakeTextVisible() {
        return isElementVisible(propOperation.getValue("FirstNameChildIntake"));
    }

    public boolean isLastNameChildIntakeTextVisible() {
        return isElementVisible(propOperation.getValue("LastNameChildIntake"));
    }

    public boolean isDateOfBirthChildIntakeTextVisible() {
        return isElementVisible(propOperation.getValue("DateOfBirthChildIntake"));
    }

    public boolean isGenderChildIntakeTextVisible() {
        return isElementVisible(propOperation.getValue("GenderChildIntake"));
    }

    //Parent Info
    public boolean isParentInformationTitleTextIntakeTextVisible() {
        return isElementVisible(propOperation.getValue("ParentInformationTitleTextIntake"));
    }

    public boolean isFirstNameParentIntakeTextVisible() {
        return isElementVisible(propOperation.getValue("FirstNameParentIntake"));
    }

    public boolean isLastNameParentIntakeTextVisible() {
        return isElementVisible(propOperation.getValue("LastNameParentIntake"));
    }

    public boolean isEmailParentIntakeTextVisible() {
        return isElementVisible(propOperation.getValue("EmailParentIntake"));
    }

    public boolean isConfirmEmailParentIntakeTextVisible() {
        return isElementVisible(propOperation.getValue("ConfirmEmailParentIntake"));
    }

    public boolean isPhoneParentIntakeTextVisible() {
        return isElementVisible(propOperation.getValue("PhoneParentIntake"));
    }

    public boolean isRelationshipWithChildIntakeTextVisible() {
        return isElementVisible(propOperation.getValue("RelationshipWithChildIntake"));
    }
    //Enter valid information into all fields on the intake form

    public String generateRandomFirstNameAddChildIntake() {
        String prefix = "William";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder randomSuffix = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            randomSuffix.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }
        return prefix + randomSuffix;
    }

    public void EnterChildFirstNameIntake(String ChildFirstName) {
        setText(propOperation.getValue("ChildFirstName"), true, ChildFirstName);
    }

    public void EnterIntakeChildLastNameInput(String intakeChildLastNameInput) {
        setText(propOperation.getValue("intakeChildLastNameInput"), true, intakeChildLastNameInput);
    }

    public String EnterRandomChildBirthdate() {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Random random = new Random();
        int randomMonthIndex = random.nextInt(12);  // Month between 0 (January) and 11 (December)
        int randomDay = random.nextInt(daysInMonth[randomMonthIndex]) + 1;  // Day between 1 and the number of days in that month
        String randomDate = String.format("%s %d, 2024", months[randomMonthIndex], randomDay);
        return randomDate;
    }

    public void EnterChildRandomSelectedBirthdateIntake(String ChildBirth) {
        setText(propOperation.getValue("intakeChildDobInput"), true, ChildBirth);
    }

    public void ClickOnChildGenderFieldIntake() {
        clickOnElement(propOperation.getValue("intakeChildGenderDropdown"), true);
    }

    public void ClickOnChildGenderOptionIntake() {
        clickOnElement(propOperation.getValue("intakeSelectGenderBoy"), true);
    }

    public void EnterIntakeParentFirstName(String intakeParentFirstNameInput) {
        setText(propOperation.getValue("intakeParentFirstNameInput"), true, intakeParentFirstNameInput);
    }

    public void EnterIntakeParentLastName(String intakeParentLastNameInput) {
        setText(propOperation.getValue("intakeParentLastNameInput"), true, intakeParentLastNameInput);
    }

    public void EnterIntakeParentEmail(String intakeParentEmailInput) {
        setText(propOperation.getValue("intakeParentEmailInput"), true, intakeParentEmailInput);
    }

    public void EnterIntakeParentConfirmEmail(String intakeParentConfirmEmailInput) {
        setText(propOperation.getValue("intakeParentConfirmEmailInput"), true, intakeParentConfirmEmailInput);
    }

    public void EnterIntakeParentPhoneNumber(String intakeParentPhoneInput) {
        setText(propOperation.getValue("intakeParentPhoneInput"), true, intakeParentPhoneInput);
    }

    public void ClickOnIntakeParentRelationshipDropdown() {
        clickOnElement(propOperation.getValue("intakeParentRelationshipDropdown"), true);
    }

    public void ClickOnIntakeParentRelationshipSelection() {
        clickOnElement(propOperation.getValue("intakeParentRelationshipSelection"), true);
    }

    public void ClickOnIntakeSubsidyNoRadio() {
        clickOnElement(propOperation.getValue("intakeSubsidyNoRadio"), true);
    }

    public void ClickIntakePreferredStartDateInput() {
        clickOnElement(propOperation.getValue("intakePreferredStartDateInput"), true);
    }

    public void ClickIntakePreferredStartDateToday() {
        clickOnElement(propOperation.getValue("intakePreferredStartDateToday"), true);
    }

    public void ClickIntakePreferredScheduleTypeDropdown() {
        clickOnElement(propOperation.getValue("intakePreferredScheduleTypeDropdown"), true);
    }

    public void ClickIntakePreferredScheduleTypeOption() {
        clickOnElement(propOperation.getValue("intakePreferredScheduleTypeOption"), true);
    }

    public void EnterIntakeArrivalTimeInput(String intakeArrivalTimeInput) {
        setText(propOperation.getValue("intakeArrivalTimeInput"), true, intakeArrivalTimeInput);
    }

    public void EnterIntakeDepartureTimeInput(String intakeDepartureTimeInput) {
        setText(propOperation.getValue("intakeDepartureTimeInput"), true, intakeDepartureTimeInput);
    }

    public void EnterIntakeEnrollmentDescriptionTextarea(String intakeEnrollmentDescriptionTextarea) {
        setText(propOperation.getValue("intakeEnrollmentDescriptionTextarea"), true, intakeEnrollmentDescriptionTextarea);
    }

    public void EnterIntakeHealthDescriptionTextarea(String intakeHealthDescriptionTextarea) {
        setText(propOperation.getValue("intakeHealthDescriptionTextarea"), true, intakeHealthDescriptionTextarea);
    }

    public void ClickIntakeTermsCheckbox() {
        clickOnElement(propOperation.getValue("intakeTermsCheckbox"), true);
    }

    public void ClickIntakeSendRequestButton() {
        clickOnElement(propOperation.getValue("intakeSendRequestButton"), true);
    }

    public void EnterCreatedNameOfProviderChildEnroll(String ChildFirstName) {
        setText(propOperation.getValue("SearchFieldProviderEnrollmentList"), true, ChildFirstName);
    }

    public boolean isRequestSubmittedSuccessfullyMsgVisible() {
        return isElementVisible(propOperation.getValue("requestSubmittedSuccessfullyMsg"));
    }

    public boolean isThankYouForYourSubmissionMsgVisible() {
        return isElementVisible(propOperation.getValue("ThankYouForYourSubmissionMsg"));
    }

    public void ClickLoginButtonSuccessPopup() {
        clickOnElement(propOperation.getValue("ExploreHopscotch"), true);

    }

    public void ClickLoginButton() {
        clickOnElement(propOperation.getValue("LoginButtonD"), true);
    }

    public void ClickEnrollmentsTabClient() {
        clickOnElement(propOperation.getValue("EnrollmentsTabClient"), true);
    }

    public void SearchChildClientEnrollmentList(String ChildFirstName) {
        setText(propOperation.getValue("SearchChildClientEnrollmentList"), true, ChildFirstName);
    }

    //Visible text in subsidy section
    public boolean isSubsidyInformationLabelIntakeVisible() {
        return isElementVisible(propOperation.getValue("SubsidyInformationLabelIntake"));
    }

    public boolean isIsTheChildSubsidizedLabelIntakeVisible() {
        return isElementVisible(propOperation.getValue("IsTheChildSubsidizedLabelIntake"));
    }

    public boolean isEnrollmentInformationTitleTextIntakeVisible() {
        return isElementVisible(propOperation.getValue("EnrollmentInformationTitleTextIntake"));
    }

    public boolean isPreferredStartDateLabelIntakeVisible() {
        return isElementVisible(propOperation.getValue("PreferredStartDateLabelIntake"));
    }

    public boolean isPreferredScheduleTypeLabelIntakeVisible() {
        return isElementVisible(propOperation.getValue("PreferredScheduleTypeLabelIntake"));
    }

    public boolean isPreferredArrivalTimeLabelIntakeVisible() {
        return isElementVisible(propOperation.getValue("PreferredArrivalTimeLabelIntake"));
    }

    public boolean isPreferredDepartureTimeLabelIntakeVisible() {
        return isElementVisible(propOperation.getValue("PreferredDepartureTimeLabelIntake"));
    }

    public boolean isAdditionalNotesLabelIntakeVisible() {
        return isElementVisible(propOperation.getValue("AdditionalNotesLabelIntake"));
    }

    public boolean isHealthInformationTitleTextIntakeVisible() {
        return isElementVisible(propOperation.getValue("HealthInformationTitleTextIntake"));
    }

    public boolean isHealthInformationDescriptionLabelVisible() {
        return isElementVisible(propOperation.getValue("HealthInformationDescriptionTextArea"));
    }

    public boolean isPrivacyPolicyAndTermsConditionsIntakeVisible() {
        return isElementVisible(propOperation.getValue("PrivacyPolicyAndTermsConditionsIntake"));
    }

    public boolean isDisclaimerTextIntakeVisible() {
        return isElementVisible(propOperation.getValue("DisclaimerTextIntake"));
    }

    //intake validation

    public boolean isChildFirstNameErrorVisible() {
        return isElementVisible(propOperation.getValue("childFirstNameError"));
    }

    public boolean isChildLastNameErrorVisible() {
        return isElementVisible(propOperation.getValue("childLastNameError"));
    }

    public boolean isChildDOBErrorVisible() {
        return isElementVisible(propOperation.getValue("childDOBError"));
    }

    public boolean isChildGenderErrorVisible() {
        return isElementVisible(propOperation.getValue("childGenderError"));
    }

    public boolean isParentFirstNameErrorVisible() {
        return isElementVisible(propOperation.getValue("parentFirstNameError"));
    }

    public boolean isParentLastNameErrorVisible() {
        return isElementVisible(propOperation.getValue("parentLastNameError"));
    }

    public boolean isParentEmailErrorVisible() {
        return isElementVisible(propOperation.getValue("parentEmailError"));
    }

    public boolean isConfirmEmailErrorVisible() {
        return isElementVisible(propOperation.getValue("confirmEmailError"));
    }

    public boolean isParentPhoneErrorVisible() {
        return isElementVisible(propOperation.getValue("parentPhoneError"));
    }

    public boolean isRelationshipWithChildErrorVisible() {
        return isElementVisible(propOperation.getValue("relationshipWithChildError"));
    }

    public boolean isSubsidyEligibilityErrorVisible() {
        return isElementVisible(propOperation.getValue("subsidyEligibilityError"));
    }

    public boolean isPreferredStartDateErrorVisible() {
        return isElementVisible(propOperation.getValue("preferredStartDateError"));
    }

    public boolean isPreferredScheduleTypeErrorVisible() {
        return isElementVisible(propOperation.getValue("preferredScheduleTypeError"));
    }

    public boolean isPreferredArrivalTimeErrorVisible() {
        return isElementVisible(propOperation.getValue("preferredArrivalTimeError"));
    }

    public boolean isPreferredDepartureTimeErrorVisible() {
        return isElementVisible(propOperation.getValue("preferredDepartureTimeError"));
    }

    public boolean isTermsAgreementErrorVisible() {
        return isElementVisible(propOperation.getValue("termsAgreementError"));
    }

    //placeholder

    public boolean isChildFirstNamePlaceholderVisible() {
        return isElementVisible(propOperation.getValue("childFirstNamePlaceholder"));
    }

    public boolean isChildLastNamePlaceholderVisible() {
        return isElementVisible(propOperation.getValue("childLastNamePlaceholder"));
    }

    public boolean isChildDOBPlaceholderVisible() {
        return isElementVisible(propOperation.getValue("childDOBPlaceholder"));
    }


    public boolean isChildGenderPlaceholderVisible() {
        return isElementVisible(propOperation.getValue("childGenderPlaceholder"));
    }

    public boolean isParentFirstNamePlaceholderVisible() {
        return isElementVisible(propOperation.getValue("parentFirstNamePlaceholder"));
    }

    public boolean isParentLastNamePlaceholderVisible() {
        return isElementVisible(propOperation.getValue("parentLastNamePlaceholder"));
    }

    public boolean isParentEmailPlaceholderVisible() {
        return isElementVisible(propOperation.getValue("parentEmailPlaceholder"));
    }

    public boolean isConfirmEmailPlaceholderVisible() {
        return isElementVisible(propOperation.getValue("confirmEmailPlaceholder"));
    }

    public boolean isParentPhonePlaceholderVisible() {
        return isElementVisible(propOperation.getValue("parentPhonePlaceholder"));
    }

    public boolean isRelationshipWithChildPlaceholderVisible() {
        return isElementVisible(propOperation.getValue("relationshipWithChildPlaceholder"));
    }

    public boolean isPreferredStartDatePlaceholderVisible() {
        return isElementVisible(propOperation.getValue("preferredStartDatePlaceholder"));
    }

    public boolean isPreferredScheduleTypePlaceholderVisible() {
        return isElementVisible(propOperation.getValue("preferredScheduleTypePlaceholder"));
    }

    public boolean isAdditionalNotesPlaceholderVisible() {
        return isElementVisible(propOperation.getValue("additionalNotesPlaceholder"));
    }

    public boolean isHealthInformationPlaceholderVisible() {
        return isElementVisible(propOperation.getValue("healthInformationPlaceholder"));
    }

    //Profile click
    public void ClickOnTheProfileButton() {
        clickOnElement(propOperation.getValue("ProfileButton"), true);
    }


    //SubmitForAnotherChild
    public void ClickOnSubmitForAnotherChild() {
        clickOnElement(propOperation.getValue("SubmitForAnotherChild"), true);
    }
}