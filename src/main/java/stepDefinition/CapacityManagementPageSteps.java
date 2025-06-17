package stepDefinition;


import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageMethods.CapacityManagementPageMethods;

public class CapacityManagementPageSteps {

    CapacityManagementPageMethods CapacityManagementPageMethods = new CapacityManagementPageMethods();


    @When("user clicks on the classrooms option in slider menu")
    public void user_clicks_on_the_classrooms_option_in_slider_menu() {
        CapacityManagementPageMethods.ClickOnClassroomsSliderBarOption();
    }

    @And("user navigate to classroom list page")
    public void userNavigateToClassroomListPage() {
        Assert.assertTrue("user navigate to classroom list page is not visible",
                CapacityManagementPageMethods.isYourClassroomsTitleTextVisible());
    }

    @And("user click on the Create New Classroom button")
    public void userClickOnTheCreateNewClassroomButton() {
        CapacityManagementPageMethods.ClickOnCreateNewClassroomButton();
    }

    @And("user navigate to create classroom page")
    public void userNavigateToCreateClassroomPage() {
        Assert.assertTrue("user is not navigate to create classroom page",
                CapacityManagementPageMethods.isCreateClassroomTitleTextVisible());
    }

    private String randomClassroomName;

    @And("user enter the classroom name")
    public void userEnterTheClassroomName() {
        randomClassroomName = CapacityManagementPageMethods.generateRandomClassName();
        CapacityManagementPageMethods.EnterClassroomName(randomClassroomName);
    }

    @And("user clicks on the start date field")
    public void userClicksOnTheStartDateField() {
        CapacityManagementPageMethods.ClickOnStartDateClassroomField();
    }

    @And("user select start date for classroom")
    public void userSelectStartDateForClassroom() {
        CapacityManagementPageMethods.ClickOnStartDateClassroomTodayDate();
    }

    @And("user enter the minimum age of child")
    public void userEnterTheMinimumAgeOfChild() {
        CapacityManagementPageMethods.EnterMinimumAgeField("12");
    }

    @And("user enter the maximum age of child")
    public void userEnterTheMaximumAgeOfChild() {
        CapacityManagementPageMethods.EnterMaximumAgeField("50");
    }

    @And("user enter Over Enrollment Capacity for classroom")
    public void userEnterOverEnrollmentCapacityForClassroom() {
        CapacityManagementPageMethods.EnterOverEnrollmentCapacityField("6");
    }

    @And("user enter License Capacity for classroom")
    public void userEnterLicenseCapacityForClassroom() {
        CapacityManagementPageMethods.EnterLicenseCapacityField("5");
    }

    @And("user clicks on the Enrollment Cutoff Window field")
    public void userClicksOnTheEnrollmentCutoffWindowField() {
        CapacityManagementPageMethods.ClickOnEnrollmentCutoffWindowField();
    }

    @And("user select Enrollment Cutoff Window option")
    public void userSelectEnrollmentCutoffWindowOption() {
        CapacityManagementPageMethods.ClickOnEnrollmentCutoffWindowOption();
    }

    @And("user enter Student Teacher Ratio")
    public void userEnterStudentTeacherRatio() {
        CapacityManagementPageMethods.EnterStudentTeacherRatioField("2");
    }

    @And("user enter Full Time Tuition fee")
    public void userEnterFullTimeTuitionFee() {
        CapacityManagementPageMethods.EnterFullTimeTuitionFee("500");
    }

    @And("user clicks on the Full Time Tuition cadence field")
    public void userClicksOnFullTimeTuitionCadenceField() {
        CapacityManagementPageMethods.ClickOnFullTimeTuitionCadenceField();
    }

    @And("user select on the Full Time Tuition cadence option")
    public void userSelectOnFullTimeTuitionCadenceOption() {
        CapacityManagementPageMethods.SelectFullTimeTuitionCadenceOption();
    }

    @And("user enter Mornings Tuition fee")
    public void userEnterMorningsTuitionFee() {
        CapacityManagementPageMethods.EnterMorningsTuitionFee("400");
    }

    @And("user clicks on the Mornings Tuition cadence field")
    public void userClicksOnMorningsTuitionCadenceField() {
        CapacityManagementPageMethods.ClickOnMorningsTuitionCadenceField();
    }

    @And("user select on the Mornings Tuition cadence option")
    public void userSelectOnMorningsTuitionCadenceOption() {
        CapacityManagementPageMethods.SelectMorningsTuitionCadenceOption();
    }

    @And("user enter Afternoons Tuition fee")
    public void userEnterAfternoonsTuitionFee() {
        CapacityManagementPageMethods.EnterAfternoonsTuitionFee("450");
    }

    @And("user clicks on the Afternoons Tuition cadence field")
    public void userClicksOnAfternoonsTuitionCadenceField() {
        CapacityManagementPageMethods.ClickOnAfternoonsTuitionCadenceField();
    }

    @And("user select on the Afternoons Tuition cadence option")
    public void userSelectOnAfternoonsTuitionCadenceOption() {
        CapacityManagementPageMethods.SelectAfternoonsTuitionCadenceOption();
    }

    @And("user enter Mon, Wed, Fri Tuition fee")
    public void userEnterMonWedFriTuitionFee() {
        CapacityManagementPageMethods.EnterMonWedFriTuitionFee("550");
    }

    @And("user clicks on the Mon, Wed, Fri  Tuition cadence field")
    public void userClicksOnMonWedFriTuitionCadenceField() {
        CapacityManagementPageMethods.ClickOnMonWedFriTuitionCadenceField();
    }

    @And("user select on the Mon, Wed, Fri Tuition cadence option")
    public void userSelectOnMonWedFriTuitionCadenceOption() {
        CapacityManagementPageMethods.SelectMonWedFriTuitionCadenceOption();
    }

    @And("user enter Tue, Thu Tuition fee")
    public void userEnterTueThuTuitionFee() {
        CapacityManagementPageMethods.EnterTueThuTuitionFee("530");
    }

    @And("user clicks on the Tue, Thu Tuition  cadence field")
    public void userClicksOnTueThuTuitionCadenceField() {
        CapacityManagementPageMethods.ClickOnTueThuTuitionCadenceField();
    }

    @And("user select on the Tue, Thu  Tuition cadence option")
    public void userSelectOnTueThuTuitionCadenceOption() {
        CapacityManagementPageMethods.SelectTueThuTuitionCadenceOption();
    }

    @And("user enter Drop in Tuition fee")
    public void userEnterDropInTuitionFee() {
        CapacityManagementPageMethods.EnterDropInTuitionFee("300");
    }

    @And("user click on the create button")
    public void userClickOnCreateButton() {
        CapacityManagementPageMethods.ClickOnCreateButton();
    }

    @And("when user enter the random classroom name in the search box")
    public void whenUserEnterTheRandomClassroomNameInTheSearchBox() throws InterruptedException {
        CapacityManagementPageMethods.EnterSearchBoxClassroom(randomClassroomName);
        Thread.sleep(2000);
    }

    @And("user click on  view capacity button")
    public void userClickOnViewCapacityButton() {
        CapacityManagementPageMethods.ClickOnViewCapacityButton();
    }

    @Then("the user should see the title Capacity Management")
    public void theUserShouldSeeTheTitleCapacityManagement() {
        Assert.assertTrue("the user is not see the title Capacity Management",
                CapacityManagementPageMethods.isCapacityManagementTitleTextVisible());
    }

    @And("the user should see the description below the title")
    public void theUserShouldSeeTheDescriptionBelowTheTitle() {
        Assert.assertTrue("the user is not see the description below the title",
                CapacityManagementPageMethods.isDescriptionBelowCapacityManagementTextVisible());
    }

    @And("the user should see the text Please select a classroom")
    public void theUserShouldSeeTheTextPleaseSelectAClassroom() {
        Assert.assertTrue("the user is not see the text Please select a classroom",
                CapacityManagementPageMethods.isPleaseSelectAClassroomTextVisible());
    }

    @And("the user should see the label License Capacity")
    public void theUserShouldSeeTheLabelLicenseCapacity() {
        Assert.assertTrue("the user is not  see the label License Capacity",
                CapacityManagementPageMethods.isLicenseCapacityLabelVisible());
    }

    @And("the user should see the value for License Capacity")
    public void theUserShouldSeeTheValueForLicenseCapacity() {
        String textvalue =CapacityManagementPageMethods.getTextLicenseCapacityValue();
        System.out.println("This this license value :" +textvalue );
    }
}
