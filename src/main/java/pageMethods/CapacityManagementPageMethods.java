package pageMethods;

import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;

import java.util.Random;

public class CapacityManagementPageMethods extends PredefinedActions {
    public PropOperation propOperation;

    public CapacityManagementPageMethods() {
        propOperation = new PropOperation(ConstantPath.CAPACITYMANAGEMENTLOCATORS);
    }

    public void ClickOnClassroomsSliderBarOption() {
        clickOnElementUsingJavaScript(propOperation.getValue("ClassroomsSliderBarOption"), true);

    }

    public boolean isYourClassroomsTitleTextVisible() {
        return isElementVisible(propOperation.getValue("YourClassroomsTitleText"));
    }

    public void ClickOnCreateNewClassroomButton() {
        clickOnElement(propOperation.getValue("CreateNewClassroomButton"), true);

    }
    public boolean isCreateClassroomTitleTextVisible() {
        return isElementVisible(propOperation.getValue("CreateClassroomTitleText"));
    }

    public String generateRandomClassName() {
        String prefix = "TestClass";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder randomSuffix = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            randomSuffix.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }
        return prefix + randomSuffix;
    }

    public void EnterClassroomName(String ClassroomName) {
        setText(propOperation.getValue("ClassroomNameField"), true, ClassroomName);

    }

    public void ClickOnStartDateClassroomField() {
        clickOnElement(propOperation.getValue("StartDateClassroomField"), true);

    }
    public void ClickOnStartDateClassroomTodayDate() {
        clickOnElement(propOperation.getValue("StartDateClassroomTodayDate"), true);

    }
    public void EnterMinimumAgeField(String MinimumAgeField) {
        setText(propOperation.getValue("MinimumAgeField"), true, MinimumAgeField);

    }
    public void EnterMaximumAgeField(String MaximumAgeField) {
        setText(propOperation.getValue("MaximumAgeField"), true, MaximumAgeField);
    }
    public void EnterOverEnrollmentCapacityField(String OverEnrollmentCapacityField) {
        setText(propOperation.getValue("OverEnrollmentCapacityField"), true, OverEnrollmentCapacityField);

    }
    public void EnterLicenseCapacityField(String LicenseCapacityField) {
        setText(propOperation.getValue("LicenseCapacityField"), true, LicenseCapacityField);
    }
    public void ClickOnEnrollmentCutoffWindowField() {
        clickOnElement(propOperation.getValue("EnrollmentCutoffWindowField"), true);
    }

    public void ClickOnEnrollmentCutoffWindowOption() {
        clickOnElement(propOperation.getValue("EnrollmentCutoffWindowOption"), true);
    }

    public void EnterStudentTeacherRatioField(String StudentTeacherRatioField) {
        setText(propOperation.getValue("StudentTeacherRatioField"), true, StudentTeacherRatioField);
    }


    public void EnterFullTimeTuitionFee(String fee) {
        setText(propOperation.getValue("FullTimeTuitionField"), true, fee);
    }

    public void ClickOnFullTimeTuitionCadenceField() {
        clickOnElement(propOperation.getValue("FullTimeTuitionCadenceField"), true);
    }

    public void SelectFullTimeTuitionCadenceOption() {
        clickOnElement(propOperation.getValue("FullTimeTuitionCadenceOption"), true);
    }

    public void EnterMorningsTuitionFee(String fee) {
        setText(propOperation.getValue("MorningsTuitionField"), true, fee);
    }

    public void ClickOnMorningsTuitionCadenceField() {
        clickOnElement(propOperation.getValue("MorningsTuitionCadenceField"), true);
    }

    public void SelectMorningsTuitionCadenceOption() {
        clickOnElement(propOperation.getValue("MorningsTuitionCadenceOption"), true);
    }

    public void EnterAfternoonsTuitionFee(String fee) {
        setText(propOperation.getValue("AfternoonsTuitionField"), true, fee);
    }

    public void ClickOnAfternoonsTuitionCadenceField() {
        clickOnElement(propOperation.getValue("AfternoonsTuitionCadenceField"), true);
    }

    public void SelectAfternoonsTuitionCadenceOption() {
        clickOnElement(propOperation.getValue("AfternoonsTuitionCadenceOption"), true);
    }

    public void EnterMonWedFriTuitionFee(String fee) {
        setText(propOperation.getValue("MonWedFriTuitionField"), true, fee);
    }

    public void ClickOnMonWedFriTuitionCadenceField() {
        clickOnElement(propOperation.getValue("MonWedFriTuitionCadenceField"), true);
    }

    public void SelectMonWedFriTuitionCadenceOption() {
        clickOnElement(propOperation.getValue("MonWedFriTuitionCadenceOption"), true);
    }

    public void EnterTueThuTuitionFee(String fee) {
        setText(propOperation.getValue("TueThuTuitionField"), true, fee);
    }

    public void ClickOnTueThuTuitionCadenceField() {
        clickOnElement(propOperation.getValue("TueThuTuitionCadenceField"), true);
    }

    public void SelectTueThuTuitionCadenceOption() {
        clickOnElement(propOperation.getValue("TueThuTuitionCadenceOption"), true);
    }

    public void EnterDropInTuitionFee(String fee) {
        setText(propOperation.getValue("DropInTuitionField"), true, fee);
    }

    public void ClickOnCreateButton() {
        clickOnElement(propOperation.getValue("CreateButton"), true);
    }

    public void EnterSearchBoxClassroom(String SearchBoxClassroom) {
        setText(propOperation.getValue("SearchBoxClassroom"), true, SearchBoxClassroom);
    }

    //Capacity management details
    public void ClickOnViewCapacityButton() {
        clickOnElement(propOperation.getValue("ViewCapacityButton"), true);
    }


    public boolean isCapacityManagementTitleTextVisible() {
        return isElementVisible(propOperation.getValue("CapacityManagementTitleText"));
    }
    public boolean isDescriptionBelowCapacityManagementTextVisible() {
        return isElementVisible(propOperation.getValue("DescriptionBelowCapacityManagementText"));
    }

    public boolean isPleaseSelectAClassroomTextVisible() {
        return isElementVisible(propOperation.getValue("PleaseSelectAClassroomText"));
    }
    public boolean isLicenseCapacityLabelVisible() {
        return isElementVisible(propOperation.getValue("LicenseCapacityLabel"));
    }



    public String getTextLicenseCapacityValue() {
        return getElementText(propOperation.getValue("LicenseCapacityValue1"),true);
    }
}
