package pageMethods;

import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

import java.util.Random;

public class StaffManagementPageMethods extends PredefinedActions {
    public PropOperation propOperation;

    public StaffManagementPageMethods() {
        propOperation = new PropOperation(ConstantPath.STAFFMANAGEMENTLOCATORS);

    }

    public void ClickOnCreateNewStaffButtonButton() {
        clickOnElement(propOperation.getValue("CreateNewStaffButton"), true);
    }

    public boolean isCreateStaffTitleTextVisible() {
        return isElementVisible(propOperation.getValue("CreateStaffTitleText"));
    }

    public String generateRandomStaffName() {
        String prefix = "Test Staff";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder randomSuffix = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            randomSuffix.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }
        return prefix + randomSuffix;
    }

    public void EnterRandomStaffName(String StaffName) {
        setText(propOperation.getValue("StaffNameField"), true, StaffName);
    }


    public void ClickStaffManagementSliderOption() {
        clickOnElement(propOperation.getValue("StaffManagementSliderOption"), true);
    }

    public boolean isManageStaffTitleVisible() {
        return isElementVisible(propOperation.getValue("ManageStaffTitle"));
    }

    public String generateRandomEmail() {
        String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomPart = new StringBuilder();
        Random random = new Random();

        int length = 3; // Length of the random part after 'teststaff'
        for (int i = 0; i < length; i++) {
            randomPart.append(characters.charAt(random.nextInt(characters.length())));
        }

        String email = "teststaff" + randomPart + "@yopmail.com";
        return email;
    }

    public void EnterStaffEmail(String email) {
        setText(propOperation.getValue("StaffEmailField"), true, email);
    }

    public void EnterStaffPhone(String phone) {
        setText(propOperation.getValue("StaffPhoneField"), true, phone);
    }

    public void ClickOnStaffRoleField() {
        clickOnElement(propOperation.getValue("StaffRoleField"), true);
    }

    public void SelectStaffRoleOption() {
        clickOnElement(propOperation.getValue("StaffRoleOption"), true);

    }

    public void EnterStaffAddress(String address) throws InterruptedException {
        setText(propOperation.getValue("StaffAddressField"), true, address);
        Thread.sleep(2000);
        pressDownArrowKey();
        pressEnterKey();
        Thread.sleep(2000);

    }

    public void ClickOnStaffJoiningDateField() {
        clickOnElement(propOperation.getValue("StaffJoiningDateField"), true);
    }

    public void SelectJoiningDate() {
        clickOnElement(propOperation.getValue("StaffJoiningDate"), true);
    }


    public void ClickOnCreateStaffButton() {
        clickOnElement(propOperation.getValue("CreateStaffButton"), true);
    }

    //perferred staff Timeing

    public boolean isPreferredStaffTimingTitleVisible() {
        return isElementVisible(propOperation.getValue("PreferredStaffTiming"));
    }


    public void ClickOnStartTimeField() throws InterruptedException {
        clickOnElement(propOperation.getValue("StartTimeField"), true);
        Thread.sleep(2000);
        pressDownArrowKey();
        pressDownArrowKey();
        pressDownArrowKey();
        pressDownArrowKey();
        pressEnterKey();
        Thread.sleep(2000);
    }

    public void ClickOnEndTimeField() throws InterruptedException {
        clickOnElement(propOperation.getValue("EndTimeField"), true);
        Thread.sleep(2000);
        pressDownArrowKey();
        pressDownArrowKey();
        pressDownArrowKey();
        pressDownArrowKey();
        pressDownArrowKey();
        pressEnterKey();
        Thread.sleep(2000);
    }


    public void EnterLunchBreakField(String phone) {
        setText(propOperation.getValue("LunchBreakField"), true, phone);
    }

    public void EnterBreakLengthField(String phone) {
        setText(propOperation.getValue("BreakLengthField"), true, phone);
    }

    public void ClickOnAddBreakButton() {
        clickOnElement(propOperation.getValue("AddBreakButton"), true);
    }

    public void ClickOnBreakTypeField() throws InterruptedException {
        clickOnElement(propOperation.getValue("BreakTypeField"), true);
        Thread.sleep(2000);
        pressDownArrowKey();
        pressEnterKey();
    }

    public void ClickOnBreakStartTime() throws InterruptedException {
        clickOnElement(propOperation.getValue("BreakStartTime"), true);
        Thread.sleep(2000);
        pressDownArrowKey();
        pressDownArrowKey();
        pressDownArrowKey();
        pressDownArrowKey();
        pressEnterKey();
        Thread.sleep(2000);
    }

    public void ClickOnBreakEndTime() {
        clickOnElement(propOperation.getValue("BreakEndTime"), true);
        pressDownArrowKey();
        pressDownArrowKey();
        pressDownArrowKey();
        pressDownArrowKey();
        pressDownArrowKey();
        pressDownArrowKey();
        pressEnterKey();
    }

    public void ClickOnUpdateButtonPopup() {
        clickOnElement(propOperation.getValue("UpdateButtonPopup"), true);
    }

    public void ClickOnBackButtonTimingPage() {
        clickOnElement(propOperation.getValue("BackButtonTimingPage"), true);
    }

    public void ClickOnActionButton() {
        clickOnElement(propOperation.getValue("ActionButton"), true);
    }

    public void ClickUpdatePreferredTimingOption() {
        clickOnElement(propOperation.getValue("UpdatePreferredTiming"), true);
    }

    public void ClickOnStartTimeFieldForUpdate() throws InterruptedException {
        clickOnElement(propOperation.getValue("StartTimeField"), true);
        Thread.sleep(2000);
        pressDownArrowKey();
        pressEnterKey();
        Thread.sleep(2000);
    }

    public void ClickOnEndTimeFieldForUpdate() throws InterruptedException {
        clickOnElement(propOperation.getValue("EndTimeField"), true);
        Thread.sleep(2000);
        pressDownArrowKey();
        pressEnterKey();
        Thread.sleep(2000);
    }

    public void ClickOnBreakStartTimeForUpdate() throws InterruptedException {
        clickOnElement(propOperation.getValue("BreakStartTime"), true);
        Thread.sleep(2000);
        pressDownArrowKey();
        pressEnterKey();
        Thread.sleep(2000);
    }

    public void ClickOnBreakEndTimeForUpdate() {
        clickOnElement(propOperation.getValue("BreakEndTime"), true);
        pressDownArrowKey();
        pressDownArrowKey();
        pressDownArrowKey();
        pressEnterKey();
    }

    public void ClickOnUpdateSpecificTimingOption() {
        clickOnElement(propOperation.getValue("UpdateSpecificTiming"), true);
    }

    public void ClickOnPickADate() {
        clickOnElement(propOperation.getValue("PickADate"), true);
    }

    public void ClickOnStartTimeFieldSpecificDayStaffTimingUpdate() throws InterruptedException {
        clickOnElement(propOperation.getValue("StartTimeFieldSpecificDayStaffTimingUpdate"), true);
        Thread.sleep(2000);
        pressDownArrowKey();
        pressEnterKey();
        Thread.sleep(2000);
    }

    public void ClickOnEndTimeFieldSpecificDayStaffTimingUpdate() {
        clickOnElement(propOperation.getValue("EndTimeFieldSpecificDayStaffTimingUpdate"), true);
        pressDownArrowKey();
        pressDownArrowKey();
        pressDownArrowKey();
        pressEnterKey();
    }

    public void ClickOnWorkingLunchCheckBox() {
        clickOnElement(propOperation.getValue("WorkingLunchCheckBox"), true);
    }

    public void ClickOnUpdateBreakOption() {
        clickOnElement(propOperation.getValue("UpdateBreak"), true);
    }

    public void ClickOnBreakTypeUpdateBreakOption() {
        clickOnElement(propOperation.getValue("BreakTypeUpdateBreakOption"), true);
        pressDownArrowKey();
        pressEnterKey();
    }

    public void ClickOnStartTimeUpdateBreakOption() {
        clickOnElement(propOperation.getValue("StartTimeUpdateBreakOption"), true);
        pressDownArrowKey();
        pressEnterKey();
    }

    public void ClickOnEndTimeUpdateBreakOption() {
        clickOnElement(propOperation.getValue("EndTimeUpdateBreakOption"), true);
        pressDownArrowKey();
        pressDownArrowKey();
        pressDownArrowKey();
        pressDownArrowKey();
        pressEnterKey();
    }

    //filter
    public void ClickOnStaffDailyTimingStartDateField() {
        clickOnElement(propOperation.getValue("StaffDailyTimingStartDateField"), true);
    }

    public void ClickOnStaffDailyTimingStartDate() throws InterruptedException {
        clickOnElement(propOperation.getValue("StaffDailyTimingStartDate"), true);
        Thread.sleep(2000);
    }

    public void ClickOnStaffDailyTimingEndDateField() {
        clickOnElement(propOperation.getValue("StaffDailyTimingEndDateField"), true);
    }


    public void ClickOnStaffDailyTimingEndDate() {
        clickOnElement(propOperation.getValue("StaffDailyTimingEndDate"), true);
    }

    public void ClickOnApplyFiltersButton() {
        clickOnElement(propOperation.getValue("ApplyFiltersButton"), true);
    }

    public void ClickOnResetButton() {
        clickOnElement(propOperation.getValue("ResetButton"), true);
    }

    //ErroMSG-createStaff
    public boolean isNameFieldErrorVisible() {
        return isElementVisible(propOperation.getValue("NameFieldErrorVisible"));
    }

    public boolean isEmailFieldErrorVisible() {
        return isElementVisible(propOperation.getValue("EmailFieldErrorVisible"));
    }

    public boolean isPhoneFieldErrorVisible() {
        return isElementVisible(propOperation.getValue("PhoneFieldErrorVisible"));
    }

    public boolean isRoleFieldErrorVisible() {
        return isElementVisible(propOperation.getValue("RoleFieldErrorVisible"));
    }
    public boolean isAddressFieldErrorVisible() {
        return isElementVisible(propOperation.getValue("AddressFieldErrorVisible"));
    }
    public boolean isCityFieldErrorVisible() {
        return isElementVisible(propOperation.getValue("CityFieldErrorVisible"));
    }
    public boolean isZipCodeFieldErrorVisible() {
        return isElementVisible(propOperation.getValue("ZipCodeFieldErrorVisible"));
    }
    public boolean isJoiningDateFieldErrorVisible() {
        return isElementVisible(propOperation.getValue("JoiningDateFieldErrorVisible"));
    }

    public void EnterStaffName(String phone) {
        setText(propOperation.getValue("StaffNameField"), true, phone);
    }

    public void EnterStaffWrongEmail(String phone) {
        setText(propOperation.getValue("StaffEmailField"), true, phone);
    }
    public void EnterStaffWrongPhone(String phone) {
        setText(propOperation.getValue("StaffPhoneField"), true, phone);
    }
    public boolean isStartTimeErrorVisible() {
        return isElementVisible(propOperation.getValue("StartTimeErrorVisible"));
    }
    public boolean isEndTimeErrorVisible() {
        return isElementVisible(propOperation.getValue("EndTimeErrorVisible"));
    }
}