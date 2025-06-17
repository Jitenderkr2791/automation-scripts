package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageMethods.StaffManagementPageMethods;

public class StaffManagementPageSteps {


    pageMethods.StaffManagementPageMethods StaffManagementPageMethods = new StaffManagementPageMethods();


    @When("the user clicks on the staff management option from slider menu")
    public void theUserClicksOnTheStaffManagementOptionFromSliderMenu() {
        StaffManagementPageMethods.ClickStaffManagementSliderOption();
    }
    @And("the user clicks on the create new staff button")
    public void theUserClicksOnTheCreateNewStaffButton() {
        StaffManagementPageMethods.ClickOnCreateNewStaffButtonButton();
    }

    @Then("the user navigate to Manage Staff page")
    public void theUserNavigateToManageStaffPage() throws InterruptedException {
        Assert.assertTrue("the user is not navigate to Manage Staff page",
                StaffManagementPageMethods.isManageStaffTitleVisible());
        Thread.sleep(3000);
    }

    @And("the user navigate to create Staff page")
    public void theUserNavigateToCreateStaffPage() {
        Assert.assertTrue("the user is not navigate to create Staff page",
                StaffManagementPageMethods.isCreateStaffTitleTextVisible());
    }

    private String randomStaffName;
    @When("I enter valid data in the Name field")
    public void i_enter_valid_data_in_the_name_field() throws InterruptedException {
        randomStaffName = StaffManagementPageMethods.generateRandomStaffName();
        StaffManagementPageMethods.EnterRandomStaffName(randomStaffName);
        Thread.sleep(1000);
    }

    @And("I enter a valid email in the Email field")
    public void enterValidEmailInEmailField() {
        String email = StaffManagementPageMethods.generateRandomEmail();
        StaffManagementPageMethods.EnterStaffEmail(email);
       // StaffManagementPageMethods.EnterStaffEmail("test.user@yopmail.com");
    }

    @And("I enter a valid phone number in the Phone field")
    public void enterValidPhoneNumberInPhoneField() {
        StaffManagementPageMethods.EnterStaffPhone("3015478952");
    }

    @And("the user clicks on the role field")
    public void userClicksOnRoleField() {
        StaffManagementPageMethods.ClickOnStaffRoleField();
    }

    @And("I select a valid Role from the dropdown")
    public void selectValidRoleFromDropdown()  {
        StaffManagementPageMethods.SelectStaffRoleOption();
    }

    @And("I enter a valid address in the Address field")
    public void enterValidAddressInAddressField() throws InterruptedException {
        StaffManagementPageMethods.EnterStaffAddress("1117");
    }

    @And("I click a joining date field")
    public void iClickAJoiningDateField() {
        StaffManagementPageMethods.ClickOnStaffJoiningDateField();
    }

    @And("I select a valid Joining Date")
    public void selectValidJoiningDate() {
        StaffManagementPageMethods.SelectJoiningDate();
    }


    @And("I click the Create Staff button")
    public void clickCreateStaffButton() throws InterruptedException {
        StaffManagementPageMethods.ClickOnCreateStaffButton();
        Thread.sleep(3000);
    }


    @When("the user opens the Preferred Staff Timing popup")
    public void theUserOpensThePreferredStaffTimingPopup() {
        Assert.assertTrue("the user opens the Preferred Staff Timing text is not visible",
                StaffManagementPageMethods.isPreferredStaffTimingTitleVisible());

    }

    @And("the user sets Start Time")
    public void theUserSetsStartTime() throws InterruptedException {
        StaffManagementPageMethods.ClickOnStartTimeField();
    }

    @And("the user sets End Time")
    public void theUserSetsEndTime() throws InterruptedException {
        StaffManagementPageMethods.ClickOnEndTimeField();
    }

    @And("the user selects Lunch Break")
    public void theUserSelectsLunchBreak() {
        StaffManagementPageMethods.EnterLunchBreakField("30");
    }

    @And("the user selects the Break Length")
    public void theUserSelectsTheBreakLength() throws InterruptedException {
        StaffManagementPageMethods.EnterBreakLengthField("20");
        Thread.sleep(2000);
    }

    @And("the user clicks on the Add break button")
    public void theUserClicksOnTheAddBreakButton() throws InterruptedException {
        StaffManagementPageMethods.ClickOnAddBreakButton();
        Thread.sleep(1000);
    }

    @And("the user selects Break Type")
    public void theUserSelectsBreakType() throws InterruptedException {
        StaffManagementPageMethods.ClickOnBreakTypeField();

    }

    @And("the user sets the Break Start Time")
    public void theUserSetsTheBreakStartTime() throws InterruptedException {
        StaffManagementPageMethods.ClickOnBreakStartTime();
    }

    @And("the user sets the Break End Time")
    public void theUserSetsTheBreakEndTime() {
        StaffManagementPageMethods.ClickOnBreakEndTime();
    }

    @And("the user clicks the Update button")
    public void theUserClicksTheUpdateButton() throws InterruptedException {
        StaffManagementPageMethods.ClickOnUpdateButtonPopup();
        Thread.sleep(3000);
    }

    @And("the user clicks on the back button")
    public void theUserClicksOnTheBackButton() {
        StaffManagementPageMethods.ClickOnBackButtonTimingPage();
    }

    @And("the user click on action button")
    public void theUserClickOnActionButton() {
        StaffManagementPageMethods.ClickOnActionButton();
    }

    @And("user clicks on the Update Preferred Timing option")
    public void userClicksOnTheUpdatePreferredTimingOption() {
        StaffManagementPageMethods.ClickUpdatePreferredTimingOption();
    }

    @And("the user sets Start Time for update Preferred Timing")
    public void theUserSetsStartTimeForUpdatePreferredTiming() throws InterruptedException {
        StaffManagementPageMethods.ClickOnStartTimeFieldForUpdate();
    }

    @And("the user sets End Time for update Preferred Timing")
    public void theUserSetsEndTimeForUpdatePreferredTiming() throws InterruptedException {
        StaffManagementPageMethods.ClickOnEndTimeFieldForUpdate();
    }

    @And("the user selects Lunch Break for update Preferred Timing")
    public void theUserSelectsLunchBreakForUpdatePreferredTiming() throws InterruptedException {
        StaffManagementPageMethods.EnterLunchBreakField("40");
    }

    @And("the user selects the Break Length for update Preferred Timing")
    public void theUserSelectsTheBreakLengthForUpdatePreferredTiming() throws InterruptedException {
        StaffManagementPageMethods.EnterBreakLengthField("30");
        Thread.sleep(2000);
    }

    @And("the user selects Break Type for update Preferred Timing")
    public void theUserSelectsBreakTypeForUpdatePreferredTiming() throws InterruptedException {
        StaffManagementPageMethods.ClickOnBreakTypeField();

    }

    @And("the user sets the Break Start Time for update Preferred Timing")
    public void theUserSetsTheBreakStartTimeForUpdatePreferredTiming() throws InterruptedException {
        StaffManagementPageMethods.ClickOnBreakStartTimeForUpdate();
    }

    @And("the user sets the Break End Time for update Preferred Timing")
    public void theUserSetsTheBreakEndTimeForUpdatePreferredTiming() {
        StaffManagementPageMethods.ClickOnBreakEndTimeForUpdate();
    }

    @And("the user clicks on the Specific Day Staff Timing option")
    public void theUserClicksOnTheSpecificDayStaffTimingOption() {
        StaffManagementPageMethods.ClickOnUpdateSpecificTimingOption();
    }

    @And("user clicks on the pick a date field")
    public void userClicksOnThePickADateField() {
        StaffManagementPageMethods.ClickOnPickADate();
    }

    @And("user select a valid pick a date")
    public void userSelectAValidPickADate() {
        StaffManagementPageMethods.SelectJoiningDate();
    }

    @And("the user clicks on the start time field")
    public void theUserClicksOnTheStartTimeField() throws InterruptedException {
        StaffManagementPageMethods.ClickOnStartTimeFieldSpecificDayStaffTimingUpdate();
    }

    @And("the user clicks on the end time field")
    public void theUserClicksOnTheEndTimeField() {
       StaffManagementPageMethods.ClickOnEndTimeFieldSpecificDayStaffTimingUpdate();
    }

    @And("the user click on working lunch checkbox")
    public void theUserClickOnWorkingLunchCheckbox() {
        StaffManagementPageMethods.ClickOnWorkingLunchCheckBox();
    }

    @And("the user clicks on the Update Break option")
    public void theUserClicksOnTheUpdateBreakOption() {
        StaffManagementPageMethods.ClickOnUpdateBreakOption();
    }

    @And("user select a break type")
    public void userSelectABreakType() {
        StaffManagementPageMethods.ClickOnBreakTypeUpdateBreakOption();
    }

    @And("user select start time")
    public void userSelectStartTime() {
        StaffManagementPageMethods.ClickOnStartTimeUpdateBreakOption();
    }

    @And("user select End time")
    public void userSelectEndTime() {
        StaffManagementPageMethods.ClickOnEndTimeUpdateBreakOption();
    }

    @And("the user clicks on the filter start date")
    public void theUserClicksOnTheFilterStartDate() {
        StaffManagementPageMethods.ClickOnStaffDailyTimingStartDateField();
    }

    @And("the user select start date")
    public void theUserSelectStartDate() throws InterruptedException {
        StaffManagementPageMethods.ClickOnStaffDailyTimingStartDate();
    }

    @And("the user clicks on the filter end date")
    public void theUserClicksOnTheFilterEndDate() {
        StaffManagementPageMethods.ClickOnStaffDailyTimingEndDateField();
    }

    @And("the user select end date")
    public void theUserSelectEndDate() {
        StaffManagementPageMethods.ClickOnStaffDailyTimingEndDate();
    }

    @And("the user clicks on the apply filters")
    public void theUserClicksOnTheApplyFilters() throws InterruptedException {
        StaffManagementPageMethods.ClickOnApplyFiltersButton();
        Thread.sleep(3000);
    }

    @And("the user click on the reset button")
    public void theUserClickOnTheResetButton() throws InterruptedException {
        Thread.sleep(3000);
    }
//ErroMSG-createStaff
    @Then("Name field should display error message Required")
    public void nameFieldShouldDisplayErrorMessageRequired() {
        Assert.assertTrue("Name field is not display error message Required",
                StaffManagementPageMethods.isNameFieldErrorVisible());
    }

    @And("Email field should display error message Email is required")
    public void emailFieldShouldDisplayErrorMessageEmailIsRequired() {
        Assert.assertTrue("Email field is not display error message Required",
                StaffManagementPageMethods.isEmailFieldErrorVisible());
    }

    @And("Phone field should display error message Required")
    public void phoneFieldShouldDisplayErrorMessageRequired() {
        Assert.assertTrue("Phone field is not display error message Required",
                StaffManagementPageMethods.isPhoneFieldErrorVisible());
    }

    @And("Role field should display error message Required")
    public void roleFieldShouldDisplayErrorMessageRequired() {
        Assert.assertTrue("Role field is not display error message Required",
                StaffManagementPageMethods.isRoleFieldErrorVisible());
    }

    @And("Address field should display error message Required")
    public void addressFieldShouldDisplayErrorMessageRequired() {
        Assert.assertTrue("Address field is not display error message Required",
                StaffManagementPageMethods.isAddressFieldErrorVisible());
    }

    @And("City field should display error message Required")
    public void cityFieldShouldDisplayErrorMessageRequired() {
        Assert.assertTrue("City field is not display error message Required",
                StaffManagementPageMethods.isCityFieldErrorVisible());
    }

    @And("Zip Code field should display error message Required")
    public void zipCodeFieldShouldDisplayErrorMessageRequired() {
        Assert.assertTrue("Zip Code field is not display error message Required",
                StaffManagementPageMethods.isZipCodeFieldErrorVisible());
    }

    @And("Joining Date field should display error message joining date is required")
    public void joiningDateFieldShouldDisplayErrorMessageJoiningDateIsRequired() {
        Assert.assertTrue("Joining Date field is not display error message Required",
                StaffManagementPageMethods.isJoiningDateFieldErrorVisible());
    }

    @And("the user enter wrong staff name")
    public void theUserEnterWrongStaffName() {
        StaffManagementPageMethods.EnterStaffName("123");
    }

    @And("the user enter wrong staff email")
    public void theUserEnterWrongStaffEmail() {
        StaffManagementPageMethods.EnterStaffWrongEmail("abc@abc");
    }

    @And("the user enter wrong staff phone number")
    public void theUserEnterWrongStaffPhoneNumber() {
        StaffManagementPageMethods.EnterStaffWrongPhone("2222");
    }

    @And("the start date error message visible")
    public void theStartDateErrorMessageVisible() throws InterruptedException {
        Assert.assertTrue("start date field is not display error message Required",
                StaffManagementPageMethods.isStartTimeErrorVisible());
        Thread.sleep(3000);
    }

    @And("the end date error message visible")
    public void theEndDateErrorMessageVisible() {
        Assert.assertTrue("end date field is not display error message Required",
                StaffManagementPageMethods.isEndTimeErrorVisible());
    }
}
