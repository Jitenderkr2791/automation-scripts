
package pageMethods;

import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

public class GuestUserEnrollmentPageMethods extends PredefinedActions {
    public PropOperation propOperation;

    public GuestUserEnrollmentPageMethods() {
        propOperation = new PropOperation(ConstantPath.GUESTUSERPAGELOCATORS);

    }

    public boolean isFindTrustedChildCareProvidersTextVisible() {
        return isElementVisible(propOperation.getValue("FindTrustedChildCareProvidersText"));
    }

    public boolean isHeaderLoginButtonVisible() {
        return isElementVisible(propOperation.getValue("HeaderLogInButton"));

    }

    public boolean isStartDateTitleVisible() {
        return isElementVisible(propOperation.getValue("StartDate"));
    }

    public boolean isChildBirthdateTitleVisible() {
        return isElementVisible(propOperation.getValue("Child'sBirthdate"));
    }

    public boolean isScheduleTypeTitleVisible() {
        return isElementVisible(propOperation.getValue("ScheduleType"));
    }

    public boolean isZipCodeTitleVisible() {
        return isElementVisible(propOperation.getValue("ZIPCode"));
    }

    public boolean isStartdatePlaceholderVisible() {
        return isElementVisible(propOperation.getValue("StartDaFieldPlaceholder"));
    }

    public boolean isChildBirthdatePlaceholderVisible() {
        return isElementVisible(propOperation.getValue("Child'sBirthdateFieldPlaceholder"));

    }

    public boolean isScheduleTypeplaceholderVisible() {
        return isElementVisible(propOperation.getValue("ScheduleTypeFieldPlaceholder"));
    }

    public boolean isZipCodePlaceholderVisible() {
        return isElementVisible(propOperation.getValue("ZIPCodeFieldPlaceholder"));
    }

    public void clickOnSearchIcon() {
        clickOnElement(propOperation.getValue("SearchButton"), true);
    }

    public boolean isStartDateValidationMsgVisible() {
        return isElementVisible(propOperation.getValue("StartDateValidationMsgVisible"));
    }

    public boolean isChildBirthDateValidationMsgVisible() {
        return isElementVisible(propOperation.getValue("Child'sBirthdateValidationMsgVisible"));

    }

    public boolean isScheduleTypeValidationMsgVisible() {
        return isElementVisible(propOperation.getValue("ScheduleTypeValidationMsgVisible"));
    }

    public boolean isZipCodeValidationMsgVisible() {
        return isElementVisible(propOperation.getValue("ZIPCodeValidationMsgVisible"));

    }

    public void clickOnStartDateField() {
        clickOnElement(propOperation.getValue("SelectedStartDateVisible"), true);
    }

    public boolean isCalendarvisible() {
        return isElementVisible(propOperation.getValue("MonthVisibleForStartDate"));
    }

    public void ClickOnTodayDateFromStartDateCalender() {
        clickOnElement(propOperation.getValue("StartDatefieldTodaysDate"), true);
    }

    public boolean isSelectedDateVisibleInStartDateField() {
        return isElementVisible(propOperation.getValue("SelectedStartDateVisible"));
    }

    public void ClickOnNextMonthFromStartDateCalender() {
        clickOnElement(propOperation.getValue("NextMonthCalenderInStartDate"), true);
    }

    public void ClickOnNextMonthSecondRowDate() {
        clickOnElement(propOperation.getValue("SecondRowDateSelectInStartDate"), true);
    }

    public void ClickOnChildBirthDateField() {
        clickOnElement(propOperation.getValue("ChildBirthdateField"), true);
    }

    public void ClickOnPreviousChildMonth() {
        clickOnElement(propOperation.getValue("PreviousMonthCalenderChildBirth"), true);
    }

    public void ClickOnChildBirthDate() {
        clickOnElement(propOperation.getValue("ChildBirthDateSelect"), true);
    }

    public boolean isSelectedChildDateVisible() {
        return isElementVisible(propOperation.getValue("ChildSelectedDateVisible"));
    }

    public void ClickOnScheduleTypeField() {
        clickOnElement(propOperation.getValue("ScheduleTypeField"), true);
    }

    public void ClikOnSchedukeType() {
        clickOnElement(propOperation.getValue("ScheduleTypeOption"), true);
    }

    public boolean isSelectedScheduleTypeVisible() {
        return isElementVisible(propOperation.getValue("ScheduleTypeSelectedVisible"));
    }

    public void ClickOnZipCodefield() {
        clickOnElement(propOperation.getValue("ZipCodeField"), true);
    }

    public void EnterZipCode(String zipCode) {
        setText(propOperation.getValue("ZipCodeField"), true, zipCode);
    }

    public boolean isEnterZipCodeVisible() {
        return isElementVisible(propOperation.getValue("ZipCodeField"));
    }

    public void ClickOnAddressFromDropDown() {
        clickOnElement(propOperation.getValue("AddressFromDropDown"), true);
    }

    public void ClickOnSearchButton() {
        clickOnElement(propOperation.getValue("SearchButton"), true);
    }

    public void ClickOnGuestlogin() {
        clickOnElement(propOperation.getValue("ProviderListLoginButtonGuest"), true);
    }

    public void EnterGuestEmailId(String EnterGuestEmailId) {
        setText(propOperation.getValue("GuestLoginEmailField"), true, EnterGuestEmailId);
    }

    public void EnterGuestPassword(String EnterGuestPassword) {
        setText(propOperation.getValue("GuestLoginPasswordField"), true, EnterGuestPassword);
    }

    public void ClickOnGuestLoginButton() {
        clickOnElement(propOperation.getValue("GuestLoginButton"), true);
    }

    public void ClickOnDropInTabGuest() {
        clickOnElement(propOperation.getValue("DropInTabGuest"), true);
    }

    public void ClickOnStartDateDropIn() {
        clickOnElement(propOperation.getValue("SelectStartDateVisibleDropIn"), true);
    }

    public void ClickOnChildBirthDateDropIn() {
        clickOnElement(propOperation.getValue("ChildBirthdateFieldDropIn"), true);
    }

    public void ClickOnZipCodeDropIn() {
        clickOnElement(propOperation.getValue("ZipCodeFieldDropIn"), true);
    }

    public void EnterZipCodeForDropIn(String zipCode) {
        setText(propOperation.getValue("ZipCodeFieldDropIn"), true, zipCode);
    }

    public void ClickOnSearchBtnDropIn() {
        clickOnElement(propOperation.getValue("SearchButtonDropIn"), true);
    }

    public boolean isFindTrustedChildCareProvidersTextVisibleD() {
        return isElementVisible(propOperation.getValue("FindTrustedChildCareProviders"));
    }

    public void ClickOnChildBirthFieldForRegular() {
        clickOnElement(propOperation.getValue("ChildFieldForRegular"), true);
    }

    public void ClickOnChildNameFromDropDown() {
        clickOnElement(propOperation.getValue("SelectChildFromDropDown"), true);
    }

    public void ClickOnChildBirthFieldForDropIn() {
        clickOnElement(propOperation.getValue("ChildFieldForDropIn"), true);
    }

    public void ClickOnSearchBtnLoginDropIn() {
        clickOnElement(propOperation.getValue("SearchButtonLoginDropIn"), true);
    }

    public void ClickOnEnrollButton() {
        clickOnElement(propOperation.getValue("EnrollButton"), true);
    }

    public void ClickOnRadioButtonSubsidyPopup() {
        clickOnElement(propOperation.getValue("RadioButtonWithOutSubsidy"), true);
    }

    public void ClickOnNextButtonSubsidyPopup() {
        clickOnElement(propOperation.getValue("NextButtonSubsidyPopup"), true);
    }

    public void ClickOnReviewTheConsentFormCheckBox() {
        clickOnElement(propOperation.getValue("ReviewTheConsentForm"), true);
    }

    public void ClickOnReviewTheConsentFormSubmitButton() {
        clickOnElement(propOperation.getValue("ReviewTheConsentFormSubmitButton"), true);
    }


}







