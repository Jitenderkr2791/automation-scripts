package stepDefinition;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageMethods.GuestUserEnrollmentPageMethods;


public class GuestUserEnrollmentPageSteps {
    GuestUserEnrollmentPageMethods GuestUserEnrollmentPageMethods = new GuestUserEnrollmentPageMethods();

    @Then("Find Trusted Child Care Providers text should be visible")
    public void find_trusted_child_care_providers_text_should_be_visible() {
        Assert.assertTrue("Find Trusted Child Care Providers is not visible", GuestUserEnrollmentPageMethods.isFindTrustedChildCareProvidersTextVisible());
    }

    @Then("Looking for childcare? Start your search below for Regular care or Drop-in and discover trusted options near you! text should be visible")
    public void looking_for_childcare_start_your_search_below_for_regular_care_or_drop_in_and_discover_trusted_options_near_you_text_should_be_visible() {

    }

    @Then("Header login button should be visible")
    public void header_login_button_should_be_visible() {
        Assert.assertTrue("Header login button is not visible", GuestUserEnrollmentPageMethods.isHeaderLoginButtonVisible());
    }

    @Then("Start Date title text should be visible in Regular enrollment")
    public void start_date_title_text_should_be_visible_in_regular_enrollment() {
        Assert.assertTrue("Start date title is not visible", GuestUserEnrollmentPageMethods.isStartDateTitleVisible());
    }

    @Then("Child's Birthdate title text should be visible  in Regular enrollment")
    public void child_s_birthdate_title_text_should_be_visible_in_regular_enrollment() {
        Assert.assertTrue("Child's Birthdate is not visible", GuestUserEnrollmentPageMethods.isChildBirthdateTitleVisible());
    }

    @Then("Schedule Type title text should be visible  in Regular enrollment")
    public void schedule_type_title_text_should_be_visible_in_regular_enrollment() {
        Assert.assertTrue("Schedule Type is not visible", GuestUserEnrollmentPageMethods.isScheduleTypeTitleVisible());
    }

    @Then("ZIP Code * title text should be visible  in Regular enrollment")
    public void zip_code_title_text_should_be_visible_in_regular_enrollment() {
        Assert.assertTrue("Zip code is not visible", GuestUserEnrollmentPageMethods.isZipCodeTitleVisible());
    }

    @Then("Start Date placeholder text should be visible in Regular enrollment")
    public void start_date_placeholder_text_should_be_visible_in_regular_enrollment() {
        Assert.assertTrue("Start Date placeholder text is not visible", GuestUserEnrollmentPageMethods.isStartdatePlaceholderVisible());
    }

    @Then("Child's Birthdate placeholder text should be visible  in Regular enrollment")
    public void child_s_birthdate_placeholder_text_should_be_visible_in_regular_enrollment() {
        Assert.assertTrue("Child's Birthdate placeholder text is not visible", GuestUserEnrollmentPageMethods.isChildBirthdatePlaceholderVisible());
    }

    @Then("Schedule Type placeholder text should be visible  in Regular enrollment")
    public void schedule_type_placeholder_text_should_be_visible_in_regular_enrollment() {
        Assert.assertTrue("Schedule Type placeholder text is not visible", GuestUserEnrollmentPageMethods.isScheduleTypeplaceholderVisible());
    }

    @Then("ZIP Code * placeholder text should be visible  in Regular enrollment")
    public void zip_code_placeholder_text_should_be_visible_in_regular_enrollment() {
        Assert.assertTrue("ZIP Code * placeholder text is not visible", GuestUserEnrollmentPageMethods.isZipCodePlaceholderVisible());
    }


    @When("The user clicks on the Search button on the enrollment page")
    public void the_user_clicks_on_the_search_button_on_the_enrollment_page() {
        GuestUserEnrollmentPageMethods.clickOnSearchIcon();
    }

    @Then("The Start Date validation message should be visible")
    public void the_start_date_validation_message_should_be_visible() {
        Assert.assertTrue("The Start Date validation message is not visible", GuestUserEnrollmentPageMethods.isStartDateValidationMsgVisible());
    }

    @Then("The Child's Birthdate validation message should be visible")
    public void the_child_s_birthdate_validation_message_should_be_visible() {
        Assert.assertTrue("Child's Birthdate validation message should be visible", GuestUserEnrollmentPageMethods.isChildBirthDateValidationMsgVisible());
    }

    @Then("The Schedule Type validation message should be visible")
    public void the_schedule_type_validation_message_should_be_visible() {
        Assert.assertTrue("Schedule Type validation message is not visible", GuestUserEnrollmentPageMethods.isScheduleTypeValidationMsgVisible());
    }

    @Then("The ZIP Code validation message should be visible")
    public void the_zip_code_validation_message_should_be_visible() {
        Assert.assertTrue("ZIP Code validation message is not visible", GuestUserEnrollmentPageMethods.isZipCodeValidationMsgVisible());
    }


    @When("The user clicks on the Start Date field")
    public void the_user_clicks_on_the_start_date_field() {
        GuestUserEnrollmentPageMethods.clickOnStartDateField();
    }

    @Then("The calendar should be visible to the user")
    public void the_calendar_should_be_visible_to_the_user() {
        Assert.assertTrue("The calendar is not visible to the user", GuestUserEnrollmentPageMethods.isCalendarvisible());
    }

    @When("the user selects today's date from the calendar")
    public void the_user_selects_today_s_date_from_the_calendar() {
        GuestUserEnrollmentPageMethods.ClickOnTodayDateFromStartDateCalender();
    }

    @Then("the today's date should be visible in the Start Date field")
    public void the_today_s_date_should_be_visible_in_the_start_date_field() {
        Assert.assertTrue("The today's date is not visible in the Start Date field", GuestUserEnrollmentPageMethods.isSelectedDateVisibleInStartDateField());
    }

    @When("the user selects future any random date from the calendar")
    public void the_user_selects_future_any_random_date_from_the_calendar() {
        GuestUserEnrollmentPageMethods.ClickOnNextMonthFromStartDateCalender();
    }

    @Then("the future any random date should be Selected in the Start Date field")
    public void the_future_any_random_date_should_be_Selected_in_the_start_date_field() {
        GuestUserEnrollmentPageMethods.ClickOnNextMonthSecondRowDate();
    }

    @When("The user clicks on the Child's Birthdate Date field")
    public void the_user_clicks_on_the_child_s_birthdate_date_field() throws InterruptedException {
        GuestUserEnrollmentPageMethods.ClickOnChildBirthDateField();
        Thread.sleep(3000);
    }

    @When("The user clicks on previous child birth month")
    public void the_user_clicks_on_previous_child_birth_month() throws InterruptedException {
        GuestUserEnrollmentPageMethods.ClickOnPreviousChildMonth();
        Thread.sleep(3000);
    }

    @When("The user selects past Child's Birthdate date from the calendar")
    public void The_user_selects_past_child_s_birthdate_date_from_the_calendar() {
        GuestUserEnrollmentPageMethods.ClickOnChildBirthDate();
    }

    @Then("The selected  date should be visible in the Child's Birthdate Date field")
    public void The_selected_date_should_be_visible_in_the_child_s_birthdate_date_field() {
        Assert.assertTrue("The selected  date is not visible in the Child's Birthdate Date field",
                GuestUserEnrollmentPageMethods.isSelectedChildDateVisible());
    }

    @When("The user clicks on the Schedule Type field")
    public void the_user_clicks_on_the_schedule_type_field() {
        GuestUserEnrollmentPageMethods.ClickOnScheduleTypeField();
    }

    @When("The user select Schedule Type")
    public void the_user_select_schedule_type() {
        GuestUserEnrollmentPageMethods.ClikOnSchedukeType();
    }

    @Then("The selected  Schedule Type should be visible Schedule Type field")
    public void the_selected_schedule_type_should_be_visible_schedule_type_field() {
        Assert.assertTrue("The selected  Schedule Type is not visible Schedule Type field",
                GuestUserEnrollmentPageMethods.isScheduleTypeTitleVisible());
    }

    @When("The user Click on the Zip code Field")
    public void the_user_click_on_the_zip_code_field() {
        GuestUserEnrollmentPageMethods.ClickOnZipCodefield();
    }

    @When("The user Enter the Zipcode")
    public void the_user_enter_the_zipcode() throws InterruptedException {
        GuestUserEnrollmentPageMethods.EnterZipCode("Oak Harbor, WA 98277, USA");
        Thread.sleep(5000);
    }

    @When("The user select the address from dropdown")
    public void the_user_select_the_address_from_dropdown() {
        GuestUserEnrollmentPageMethods.ClickOnAddressFromDropDown();

    }


    @When("The selected Zip code should be visible in zipcode field")
    public void the_selected_zip_code_should_be_visible_in_zipcode_field() {
        Assert.assertTrue("The selected Zip code is not visible in zipcode field",
                GuestUserEnrollmentPageMethods.isEnterZipCodeVisible());
    }

    @When("The user clicks in Search Button")
    public void the_user_clicks_in_search_button() throws InterruptedException {
        GuestUserEnrollmentPageMethods.ClickOnSearchButton();
        Thread.sleep(4000);
    }

    @Then("The user clicks on the Login Button")
    public void the_user_clicks_on_the_login_button() throws InterruptedException {
        GuestUserEnrollmentPageMethods.ClickOnGuestlogin();
        Thread.sleep(3000);
    }

    @When("The user enters valid username")
    public void the_user_enters_valid_username() {
        GuestUserEnrollmentPageMethods.EnterGuestEmailId("jack@yopmail.com");
    }

    @When("The user enters valid password")
    public void the_user_enters_valid_password() throws InterruptedException {
        GuestUserEnrollmentPageMethods.EnterGuestPassword("Test@12345");
        Thread.sleep(3000);
    }

    @When("Clicks on the Guest login button")
    public void Clicks_on_the_Guest_login_button() {
        GuestUserEnrollmentPageMethods.ClickOnGuestLoginButton();

    }

    @Then("The user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {
        Assert.assertTrue("The user is not redirected to the dashboard", GuestUserEnrollmentPageMethods.isFindTrustedChildCareProvidersTextVisibleD());
    }

    @When("The user clicks on the drop-in tab")
    public void the_user_clicks_on_the_drop_in_tab() {
        GuestUserEnrollmentPageMethods.ClickOnDropInTabGuest();
    }

    @When("The user clicks on the Start Date field For Drop-in")
    public void the_user_clicks_on_the_start_date_field_for_drop_in() {
        GuestUserEnrollmentPageMethods.ClickOnStartDateDropIn();
    }

    @When("The user clicks on the Child's Birthdate Date field For Drop-in")
    public void the_user_clicks_on_the_child_s_birthdate_date_field_for_drop_in() throws InterruptedException {
        GuestUserEnrollmentPageMethods.ClickOnChildBirthDateDropIn();
        Thread.sleep(2000);
    }

    @When("The user Click on the Zip code Field for Drop-in")
    public void the_user_click_on_the_zip_code_field_for_drop_in() throws InterruptedException {
        GuestUserEnrollmentPageMethods.ClickOnZipCodeDropIn();
        Thread.sleep(2000);
    }

    @When("The user Enter the Zipcode For Drop-in")
    public void the_user_enter_the_zipcode_for_drop_in() throws InterruptedException {
        GuestUserEnrollmentPageMethods.EnterZipCodeForDropIn("Oak Harbor, WA 98277, USA");
        Thread.sleep(4000);
    }

    @When("The user clicks in Search Button for Drop-in")
    public void the_user_clicks_in_search_button_for_drop_in() throws InterruptedException {
        GuestUserEnrollmentPageMethods.ClickOnSearchBtnDropIn();
        Thread.sleep(4000);

    }

    @When("The user clicks on the Child's Birthdate Date field for regular")
    public void the_user_clicks_on_the_child_s_birthdate_date_field_for_regular() {
        GuestUserEnrollmentPageMethods.ClickOnChildBirthFieldForRegular();
    }

    @When("The user selects  Child's from the Child list")
    public void the_user_selects_child_s_from_the_child_list() throws InterruptedException {
        GuestUserEnrollmentPageMethods.ClickOnChildNameFromDropDown();
        Thread.sleep(2000);
    }

    @When("The user clicks on the Child's field For Drop-in")
    public void the_user_clicks_on_the_child_s_field_for_drop_in() {
        GuestUserEnrollmentPageMethods.ClickOnChildBirthFieldForDropIn();
    }

    @When("The user clicks in Search Button for DropIn")
    public void the_user_clicks_in_search_button_for_drop_In() throws InterruptedException {
        GuestUserEnrollmentPageMethods.ClickOnSearchBtnLoginDropIn();
        Thread.sleep(3000);
    }

    @When("The user Clicks on the Enroll button")
    public void the_user_clicks_on_the_enroll_button() throws InterruptedException {
        GuestUserEnrollmentPageMethods.ClickOnEnrollButton();
        Thread.sleep(2000);
    }

    @When("The user clicks on the radio button for without subsidy child")
    public void the_user_clicks_on_the_radio_button_for_without_subsidy_child() {
        GuestUserEnrollmentPageMethods.ClickOnRadioButtonSubsidyPopup();
    }

    @When("The user clicks on the next button the subsidy popup")
    public void the_user_clicks_on_the_next_button_the_subsidy_popup() throws InterruptedException {
        GuestUserEnrollmentPageMethods.ClickOnNextButtonSubsidyPopup();
        Thread.sleep(2000);
    }

    @And("The user select Review the consent form Child Care Agreement checkbox")
    public void theUserSelectReviewTheConsentFormChildCareAgreementCheckbox() {
        GuestUserEnrollmentPageMethods.ClickOnReviewTheConsentFormCheckBox();
    }

    @And("The user click on the review the consent form submit button")
    public void theUserClickOnTheReviewTheConsentFormSubmitButton() {
        GuestUserEnrollmentPageMethods.ClickOnReviewTheConsentFormSubmitButton();
    }
}

