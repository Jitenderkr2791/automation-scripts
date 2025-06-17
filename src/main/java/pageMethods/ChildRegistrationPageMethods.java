package pageMethods;


import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

import java.util.Random;

public class ChildRegistrationPageMethods extends PredefinedActions {
    public PropOperation propOperation;

    public ChildRegistrationPageMethods() {
        propOperation = new PropOperation(ConstantPath.CHILDREGISTRATIONPAGELOCATORS);
    }

    public void ClickOnChildrenTab() {
        clickOnElement(propOperation.getValue("ChildrenTab"), true);
    }

    public void ClickOnRegisterChildBtn() {
        clickOnElement(propOperation.getValue("RegisterChildButton"), true);
    }

    public String generateRandomFirstNameAddChild() {
        String prefix = "John";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder randomSuffix = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            randomSuffix.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }
        return prefix + randomSuffix;
    }


    public void EnterFirstName(String FirstName) {
        setText(propOperation.getValue("FirstNameField"), true, FirstName);

    }

    public void EnterMiddleName(String MiddleName) {
        setText(propOperation.getValue("MiddleNameField"), true, MiddleName);
    }

    public void EnterLastName(String LastName) {
        setText(propOperation.getValue("LastNameField"), true, LastName);

    }

    public void EnterNickName(String NickName) {
        setText(propOperation.getValue("NicknameField"), true, NickName);
    }

    public void ClickOnChildBirthdateField() {
        clickOnElement(propOperation.getValue("BirthdateField"), true);
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

    public void EnterRandomSelectedBirthdate(String ChildBirth) {
        setText(propOperation.getValue("BirthdateField"), true, ChildBirth);
    }

    public void ClickOnChildGenderField() {
        clickOnElement(propOperation.getValue("GenderField"), true);
    }

    public void ClickOnBoyGender() {
        clickOnElement(propOperation.getValue("GenderBoy"), true);
    }

    public void EnterStreetAddress(String StreetAddress) {
        setText(propOperation.getValue("StreetAddressField"), true, StreetAddress);
    }

    public void ClickOnTheAddressFromList() {
        clickOnElement(propOperation.getValue("ListingAddress"), true);
    }


    public void EnterAptAddress(String AptAddress) {
        setText(propOperation.getValue("AptAddressField"), true, AptAddress);
    }

    public void ClickOnNextButton() {
        clickOnElement(propOperation.getValue("NextButton"), true);
    }

    public boolean isParentInformationTextVisible() {
        return isElementVisible(propOperation.getValue("ParentInformationTextVisible"));
    }

    public void EnterParentFirstName(String ParentFirstName) {
        setText(propOperation.getValue("ParentFirstName"), true, ParentFirstName);
    }

    public void EnterParentMiddleName(String ParentMiddleName) {
        setText(propOperation.getValue("ParentMiddleName"), true, ParentMiddleName);
    }

    public void EnterParentLastName(String LastName) {
        setText(propOperation.getValue("ParentLastName"), true, LastName);
    }

    public void EnterParentEmail(String ParentEmail) {
        setText(propOperation.getValue("ParentEmail"), true, ParentEmail);
    }

    public void ClickOnRelationshipWithChildField() {
        clickOnElement(propOperation.getValue("ParentRelationshipwithChild"), true);
    }


    public void ClickOnRelationshipListOption() {
        clickOnElement(propOperation.getValue("ListingParentRelationshipwithChild"), true);
    }

    public void EnterParentPhone(String ParentPhone) {
        setText(propOperation.getValue("ParentPhone"), true, ParentPhone);
    }

    public void EnterParentHomePhone(String ParentHomePhone) {
        setText(propOperation.getValue("ParentHomePhone"), true, ParentHomePhone);
    }

    public void EnterParentAlternatePhone(String ParentAlternatePhone) {
        setText(propOperation.getValue("ParentAlternate"), true, ParentAlternatePhone);
    }

    public void ClickOnAddressCheckbox() {
        clickOnElement(propOperation.getValue("AddressCheckboxParent"), true);
    }

    public void ClickOnAddParentButton() {
        clickOnElement(propOperation.getValue("AddParentButton"), true);
    }

    public void EnterParentTwoFirstName(String ParentTwoFirstName) {
        setText(propOperation.getValue("ParentTwoFirstName"), true, ParentTwoFirstName);
    }

    public void EnterParentTwoMiddleName(String ParentTwoMiddleName) {
        setText(propOperation.getValue("ParentTwoMiddleName"), true, ParentTwoMiddleName);
    }

    public void EnterParentTwoLastName(String ParentTwoLastName) {
        setText(propOperation.getValue("ParentTwoLastName"), true, ParentTwoLastName);
    }

    public void EnterParentTwoEmail(String ParentTwoEmail) {
        setText(propOperation.getValue("ParentTwoEmail"), true, ParentTwoEmail);
    }

    public void ClickOnRelationshipWithChildFieldParentTwo() {
        clickOnElement(propOperation.getValue("ParentTwoRelationshipwithChild"), true);
    }

    public void ClickOnRelationshipListOptionMother() {
        clickOnElement(propOperation.getValue("ListingTwoParentRelationshipWithChild"), true);
    }

    public void EnterParentTwoPhone(String ParentTwoPhone) {
        setText(propOperation.getValue("ParentTwoPhone"), true, ParentTwoPhone);
    }

    public void EnterParentTwoHomePhone(String ParentTwoHomePhone) {
        setText(propOperation.getValue("ParentTwoHomePhone"), true, ParentTwoHomePhone);
    }

    public void EnterParentTwoAlternatePhone(String ParentTwoAlternatePhone) {
        setText(propOperation.getValue("ParentTwoAlternate"), true, ParentTwoAlternatePhone);
    }

    public void ClickOnAddressCheckboxParentTwo() {
        clickOnElement(propOperation.getValue("AddressCheckboxParentTwo"), true);
    }

    public boolean isEmergencyPageTextVisible() {
        return isElementVisible(propOperation.getValue("EmergencyContactTextVisible"));
    }

    public boolean isPickupContactPageTextVisible() {
        return isElementVisible(propOperation.getValue("PickupContactTextVisible"));
    }

    public boolean isHealthInformationPageTextVisible() {
        return isElementVisible(propOperation.getValue("HealthInformationTextVisible"));
    }

    public void EnterMedicalCareProvider(String EnterMedicalCareProvider) {
        setText(propOperation.getValue("MedicalCareProviderName"), true, EnterMedicalCareProvider);
    }

    public void ClickOnChildUnderRegularMedicalSupervision() {
        clickOnElement(propOperation.getValue("ChildUnderRegularMedicalSupervision"), true);

    }

    public void scrollup() {
        scrollUp();
    }

    public void EnterMedicalCareProviderPhone(String EnterMedicalCareProviderPhone) {
        setText(propOperation.getValue("MedicalCareProviderPhone"), true, EnterMedicalCareProviderPhone);
    }


    public String EnterRandomHealthPhysicianDate() {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Random random = new Random();
        int randomMonthIndex = random.nextInt(12);  // Month between 0 (January) and 11 (December)
        int randomDay = random.nextInt(daysInMonth[randomMonthIndex]) + 1;  // Day between 1 and the number of days in that month
        String randomDate = String.format("%s %d, 2024", months[randomMonthIndex], randomDay);
        return randomDate;
    }

    public void EnterRandomSelectedHealthPhysicDate(String DateLastSeenByPhysician) {
        setText(propOperation.getValue("MedicalDateLastSeenByPhysician"), true, DateLastSeenByPhysician);
    }

    public void EnterMedicalCareProviderAddress(String EnterMedicalCareProviderAddress) {
        setText(propOperation.getValue("MedicalAddress"), true, EnterMedicalCareProviderAddress);
    }

    public void EnterDentalCareProviderName(String EnterDentalCareProviderName) {
        setText(propOperation.getValue("DentalCareProviderName"), true, EnterDentalCareProviderName);
    }

    public void EnterDentalCareProviderPhone(String EnterDentalCareProviderPhone) {
        setText(propOperation.getValue("DentalCareProviderPhone"), true, EnterDentalCareProviderPhone);
    }


    public String EnterRandomDentalPhysicianDate() {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Random random = new Random();
        int randomMonthIndex = random.nextInt(12);  // Month between 0 (January) and 11 (December)
        int randomDay = random.nextInt(daysInMonth[randomMonthIndex]) + 1;  // Day between 1 and the number of days in that month
        String randomDate = String.format("%s %d, 2024", months[randomMonthIndex], randomDay);
        return randomDate;
    }

    public void EnterRandomSelectedDentalPhysicDate(String DateLastSeenByPhysicianDental) {
        setText(propOperation.getValue("DentalDateLastSeenByPhysician"), true, DateLastSeenByPhysicianDental);
    }

    public void EnterDentalCareProviderAddress(String EnterDentalCareProviderAddress) {
        setText(propOperation.getValue("DentalAddress"), true, EnterDentalCareProviderAddress);
    }

    public void EnterHealthInsuranceProviderName(String HealthInsuranceProviderName) {
        setText(propOperation.getValue("HealthProviderName"), true, HealthInsuranceProviderName);
    }


    public void EnterHealthInsuranceGroupName(String HealthInsuranceGroupName) {
        setText(propOperation.getValue("HealthProviderGroupNumber"), true, HealthInsuranceGroupName);
    }

    public void EnterHealthInsurancePolicyNumber(String HealthInsurancePolicyNumber) {
        setText(propOperation.getValue("HealthPolicyNumber"), true, HealthInsurancePolicyNumber);
    }

    public void EnterHealthInsurancePrimaryInsuredName(String HealthInsurancePrimaryInsuredName) {
        setText(propOperation.getValue("HealthPrimaryInsuredName"), true, HealthInsurancePrimaryInsuredName);
    }


    public void EnterHealthConditions(String HealthConditions) {
        setText(propOperation.getValue("HealthConditionDescriptionField"), true, HealthConditions);
    }

    public void EnterHealthAllergies(String HealthAllergies) {
        setText(propOperation.getValue("HealthAllergiesField"), true, HealthAllergies);
    }

    public void EnterHealthChronicIllnesses(String HealthChronicIllnesses) {
        setText(propOperation.getValue("ChronicIllnessesField"), true, HealthChronicIllnesses);
    }

    public void EnterHealthRegularMedications(String HealthRegularMedications) {
        setText(propOperation.getValue("RegularMedicationsField"), true, HealthRegularMedications);
    }

    public void EntertherPertinentInformation(String OtherPertinentInformation) {
        setText(propOperation.getValue("OtherPertinentInformation"), true, OtherPertinentInformation);
    }

    public void ClickOnCISForm() {
        clickOnElement(propOperation.getValue("CISForm"), true);

    }

    public boolean isConsentTextVisible() {
        return isElementVisible(propOperation.getValue("ConsentTextVisible"));
    }

    public void ClickOnSchoolByPersonalVehicleCheckbox() {
        clickOnElement(propOperation.getValue("SchoolByPersonalVehicleCheckbox"), true);

    }

    public void ClickOnRidingWithMyChildOnPublicTransportationCheckbox() {
        clickOnElement(propOperation.getValue("RidingWithMyChildOnPublicTransportationCheckbox"), true);
    }

    public void ClickOnOccasionalErrandsByWalkingWithMyChildCheckbox() {
        clickOnElement(propOperation.getValue("OccasionalErrandsByWalkingWithMyChildCheckbox"), true);
    }

    public void ClickOnWaterActivitiesCheckbox() {
        clickOnElement(propOperation.getValue("WaterActivitiesCheckbox"), true);
    }

    public void ClickOnBathingCheckbox() {
        clickOnElement(propOperation.getValue("BathingCheckbox"), true);
    }

    public void ClickOnPhotoVideoSurveillanceActivityBathingCheckbox() {
        clickOnElement(propOperation.getValue("PhotoVideoSurveillanceActivityBathingCheckbox"), true);
    }

    public boolean isReviewChildInfoPageTextVisible() {
        return isElementVisible(propOperation.getValue("ReviewChildInformation"));
    }

    public void ClickOnSubmitButtonOnReviewInfo() {
        clickOnElement(propOperation.getValue("SubmitButtonOnReviewInfo"), true);
    }

    public boolean isChildRegisteredSuccessfullyTextVisible() {
        return isElementVisible(propOperation.getValue("ChildRegisteredSuccessfully"));
    }

    public void ClickOnOkButtOnChildRegisteredSuccessfullyPopup() {
        clickOnElement(propOperation.getValue("OkButtOnChildRegisteredSuccessfullyPopup"), true);
    }

    public boolean isMyChildrenListTextVisible() {
        return isElementVisible(propOperation.getValue("MyChildrenList"));
    }


    public void EnterCreatedNameOfChild(String ChildFirstName) {
        setText(propOperation.getValue("SearchChild"), true, ChildFirstName);
    }

    public void ClickOnEnrollButtonOnChildList() {
        clickOnElement(propOperation.getValue("EnrollButtonOnChildList"), true);
    }

    public boolean isChildInformationHeaderTextVisible() {
        return isElementVisible(propOperation.getValue("ChildInformationHeaderText"));
    }

    public boolean isChildInformationTitleTextVisible() {
        return isElementVisible(propOperation.getValue("ChildInformationTitleText"));
    }

    public boolean isChildFirstNameTitleTextVisible() {
        return isElementVisible(propOperation.getValue("FirstNameTitleText"));
    }

    public boolean isChildMiddleNameTitleTextVisible() {
        return isElementVisible(propOperation.getValue("MiddleNameTitleText"));
    }

    public boolean isChildLastNameTitleTextVisible() {
        return isElementVisible(propOperation.getValue("LastNameTitleText"));
    }

    public boolean isChildNickNameTitleTextVisible() {
        return isElementVisible(propOperation.getValue("NickNameTitleText"));
    }

    public boolean isChildBirthdateTitleTextVisible() {
        return isElementVisible(propOperation.getValue("BirthdateTitleText"));
    }

    public boolean isChildGenderTitleTextVisible() {
        return isElementVisible(propOperation.getValue("GenderTitleText"));
    }

    public boolean isStreetAddressTitleTextVisible() {
        return isElementVisible(propOperation.getValue("StreetAddressTitleText"));
    }

    public boolean isAptTitleTextVisible() {
        return isElementVisible(propOperation.getValue("AptTitleText"));
    }

    public boolean isCityTitleTextVisible() {
        return isElementVisible(propOperation.getValue("CityTitleText"));
    }

    public boolean isZIPCodeTitleTextVisible() {
        return isElementVisible(propOperation.getValue("ZIPCodeTitleText"));
    }

    public boolean isFirstNameFieldErrorMSGVisible() {
        return isElementVisible(propOperation.getValue("FirstNameFieldErrorMSG"));
    }

    public boolean isLastNameFieldErrorMSGVisible() {
        return isElementVisible(propOperation.getValue("LastNameFieldErrorMSG"));
    }

    public boolean isBirthdateFieldErrorMSGVisible() {
        return isElementVisible(propOperation.getValue("BirthdateFieldErrorMSG"));
    }

    public boolean isStreetAddressFieldErrorMSGVisible() {
        return isElementVisible(propOperation.getValue("StreetAddressFieldErrorMSG"));
    }

    public boolean isCityFieldErrorMSGVisible() {
        return isElementVisible(propOperation.getValue("CityFieldErrorMSG"));
    }

    public boolean isZipCodeFieldErrorMSGVisible() {
        return isElementVisible(propOperation.getValue("ZipCodeFieldErrorMSG"));
    }

    public void selectChildRandomNameFromDropdown(String enterChildFirstName) {
        String locatorTemplate = propOperation.getValue("randomNameLocator");
        String dynamicLocator = locatorTemplate.replace("${name}", enterChildFirstName);
        clickOnElement(dynamicLocator, true);
    }

    public void ClickOnAddressFromDropDownEnrollChild() throws InterruptedException {
        // isElementClickable(propOperation.getValue("EnrollAddress1"), true);
        pressDownArrowKey();
        pressEnterKey();
        Thread.sleep(2000);
    }

    public void openEnvironmentTab(String environment) {
        String url = ConstantPath.getHopscotchURL(environment);
        ((org.openqa.selenium.JavascriptExecutor) getDriver("https://dev-provider.hopscotchconnect.com/login")).executeScript("window.open('" + url + "', '_blank');");  //  switchToLatestTab();}

    }

    public void ClickOnLoginButtonClient() {
        clickOnElement(propOperation.getValue("LogInButtonClient"), true);
    }
// provider login


    public void EnterEmailProvider(String EnterEmailProvider) {
        setText(propOperation.getValue("ProviderEmail"), true, EnterEmailProvider);
    }

    public void EnterPasswordProvider(String EnterPasswordProvider) {
        setText(propOperation.getValue("ProviderPassword"), true, EnterPasswordProvider);
    }

    public void ClickOnLoginButtonProvider() throws InterruptedException {
        clickOnElement(propOperation.getValue("ProviderLoginButton"), true);
        Thread.sleep(2000);
    }

    public void ClickMoreButtonForEnrollmentOnDashboardProvider() throws InterruptedException {
        clickOnElement(propOperation.getValue("MoreButtonForEnrollmentOnDashboard"), true);
        Thread.sleep(3000);
    }

    public void EnterCreatedNameOfProviderChildEnroll(String ChildFirstName) {
        setText(propOperation.getValue("SearchFieldProviderEnrollmentList"), true, ChildFirstName);
    }

    public void ClickOnEditEnrollmentStatusButton() throws InterruptedException {
        clickOnElement(propOperation.getValue("EditEnrollmentStatusButton"), true);
        Thread.sleep(1000);
    }

    public void ClickOnEnrollmentStatusDropdown() throws InterruptedException {
        clickOnElement(propOperation.getValue("EnrollmentStatusDropdown"), true);
        Thread.sleep(1000);
    }

    public void ClickOnEnrollmentStatusDropdownOptionApproved() throws InterruptedException {
        clickOnElement(propOperation.getValue("EnrollmentStatusDropdownOptionApproved"), true);
        Thread.sleep(2000);

    }

    public void ClickOnApprovedPopupUpdateButton() throws InterruptedException {
        clickOnElement(propOperation.getValue("ApprovedPopupUpdateButton"), true);
        Thread.sleep(2000);

    }

    public void SwitchToProvider() {
        switchToSecondTab();
    }

    public void SwitchToClient() {
        switchTofirstTab();
    }

    public void ReloadTheClientEnrollPage() {
        refreshTab();
    }

    public void ClickOnPayFeeButton() throws InterruptedException {
        clickOnElement(propOperation.getValue("PayFeeButton"), true);
        Thread.sleep(1000);

    }

    public boolean isConfirmPaymentPopupVisible() {
        return isElementVisible(propOperation.getValue("ConfirmPaymentPopup"));
    }

    public void ClickOnMakePaymentButton() throws InterruptedException {
        clickOnElement(propOperation.getValue("MakePaymentButton"), true);
        Thread.sleep(3000);

    }

    public void EnterPaymentEmail(String PaymentEmail) {
        setText(propOperation.getValue("PaymentEmail"), true, PaymentEmail);
    }

    public void EnterCreditCardNumber(String CreditCardNumber) {
        setText(propOperation.getValue("CreditCardNumber"), true, CreditCardNumber);
    }

    public void EnterCardExpiryDate(String CardExpiryDate) {
        setText(propOperation.getValue("CardExpiryDate"), true, CardExpiryDate);
    }

    public void EnterCardCVV(String CardCVV) {
        setText(propOperation.getValue("CardCVV"), true, CardCVV);
    }

    public void EnterCardholderName(String CardholderName) throws InterruptedException {
        setText(propOperation.getValue("CardholderName"), true, CardholderName);
        // Thread.sleep(4000);
    }

    public void ClickCreditPaymentPayButton() throws InterruptedException {
        clickOnElementUsingJavaScript(propOperation.getValue("PaymentPayButton"), true);
        Thread.sleep(5000);

    }

    public boolean isPaymentSuccessfulTextVisible() {
        return isElementVisible(propOperation.getValue("PaymentSuccessfulTextVisible"));
    }

    public void ClickViewEnrollmentsButton() throws InterruptedException {
        clickOnElement(propOperation.getValue("ViewEnrollmentsButton"), true);
        Thread.sleep(2000);

    }

    public void ClickOnDropInButtonProviderEnroll() throws InterruptedException {
        clickOnElement(propOperation.getValue("DropInButtonProviderEnroll"), true);
        Thread.sleep(3000);
    }

    public void EnterCreatedNameOfProviderChildEnrollDropIn(String ChildFirstName) {
        setText(propOperation.getValue("SearchFieldProviderEnrollmentListDropIn"), true, ChildFirstName);
    }

    public void ClickOnEditEnrollmentStatusButtonDropIn() throws InterruptedException {
        clickOnElement(propOperation.getValue("EditEnrollmentStatusButtonDropIn"), true);
        Thread.sleep(1000);
    }

    public void ClickOnEnrollmentStatusDropdownDropIn() throws InterruptedException {
        clickOnElement(propOperation.getValue("EnrollmentStatusDropdownDropIn"), true);
        Thread.sleep(1000);
    }

    public void ClickOnApprovedForDropIn() throws InterruptedException {
        pressDownArrowKey();
        pressDownArrowKey();
        pressEnterKey();
        Thread.sleep(1000);
    }

    public void EnterSearchFieldClientEnrollmentListDropIn(String ChildFirstName) {
        setText(propOperation.getValue("SearchFieldClientEnrollmentListDropIn"), true, ChildFirstName);
    }

    public void ClickPayFeeButtonClientDropIn() throws InterruptedException {
        clickOnElement(propOperation.getValue("PayFeeButtonClientDropIn"), true);
        Thread.sleep(1000);

    }

    //parent information child creation
    public boolean isParentInformationHeaderTextVisible() {
        return isElementVisible(propOperation.getValue("ParentInformationHeaderText"));
    }

    public boolean isParentInformationTitleTextVisible() {
        return isElementVisible(propOperation.getValue("ParentInformationTitleText"));
    }

    public boolean isParentFirstNameTitleTextVisible() {
        return isElementVisible(propOperation.getValue("ParentFirstNameTitleText"));
    }

    public boolean isParentMiddleNameTitleTextVisible() {
        return isElementVisible(propOperation.getValue("ParentMiddleNameTitleText"));
    }
    public boolean isParentLastNameTitleTextVisible() {
        return isElementVisible(propOperation.getValue("ParentLastNameTitleText"));
    }
    public boolean isParentEmailTitleTextVisible() {
        return isElementVisible(propOperation.getValue("ParentEmailTitleText"));
    }
    public boolean isParentRelationshipWithTheChildVisible() {
        return isElementVisible(propOperation.getValue("ParentRelationshipWithTheChild"));
    }
    public boolean isParentCellPhoneTitleTextVisible() {
        return isElementVisible(propOperation.getValue("ParentCellPhoneTitleText"));
    }
    public boolean isParentHomePhoneTitleTextVisible() {
        return isElementVisible(propOperation.getValue("ParentHomePhoneTitleText"));
    }

    public boolean isAlternatePhoneTitleTextVisible() {
        return isElementVisible(propOperation.getValue("AlternatePhoneTitleText"));
    }
    public boolean isParenStreetAddressTitleTextVisible() {
        return isElementVisible(propOperation.getValue("ParenStreetAddressTitleText"));
    }
    public boolean isParentAptTitleTextVisible() {
        return isElementVisible(propOperation.getValue("ParentAptTitleText"));
    }
    public boolean isParentCityTitleTextVisible() {
        return isElementVisible(propOperation.getValue("ParentCityTitleText"));
    }
    public boolean isParentZIPCodeTitleTextVisible() {
        return isElementVisible(propOperation.getValue("ParentZIPCodeTitleText"));
    }
    public boolean isParentCellPhoneFieldErrorMSGVisible() {
        return isElementVisible(propOperation.getValue("ParentCellPhoneFieldErrorMSG"));
    }

    public boolean isParentEmailFieldErrorMSGErrorMSGVisible() {
        return isElementVisible(propOperation.getValue("ParentEmailFieldErrorMSGErrorMSG"));
    }
    public boolean isParentRelationshipWithTheChildErrorMSGErrorMSGVisible() {
        return isElementVisible(propOperation.getValue("ParentRelationshipWithTheChildErrorMSGErrorMSG"));
    }

    public void EnterParentWrongEmail(String ParentWrongEmail) throws InterruptedException {
        setText(propOperation.getValue("ParentEmail"), true, ParentWrongEmail);
        pressBackspace();
        pressBackspace();
        pressBackspace();
        Thread.sleep(3000);
    }

    public boolean isEmergencyContactHeaderTextVisible() {
        return isElementVisible(propOperation.getValue("EmergencyContactHeaderTextVisible"));
    }

    public boolean isEmergencyContactTitleTextVisible() {
        return isElementVisible(propOperation.getValue("EmergencyContactTitleTextVisible"));
    }

    public boolean isPickupContactHeaderTextVisible() {
        return isElementVisible(propOperation.getValue("PickupContactHeaderTextVisible"));
    }

    public boolean isPickupContactTitleTextVisible() {
        return isElementVisible(propOperation.getValue("PickupContactTitleTextVisible"));
    }
    public boolean isApprovedStatusOfChildEnrollProviderSideTextVisible() {
        return isElementVisible(propOperation.getValue("ApprovedStatusOfChildEnrollProviderSide"));
    }

    public void ClickViewEnrollmentButtonAfterEnroll() throws InterruptedException {
        clickOnElement(propOperation.getValue("ViewEnrollmentButtonAfterEnroll"), true);
        Thread.sleep(1000);


    }

    public void ClickEnrollmentsTab() throws InterruptedException {
        clickOnElement(propOperation.getValue("EnrollmentsTab"), true);
        Thread.sleep(1000);

    }
}