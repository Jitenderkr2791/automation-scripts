package constant;

import stepDefinition.AutomationHooks;

public class ConstantPath {

    public static final String hopscotch_URL = getHopscotchURL(AutomationHooks.environment);

    public static final String email_superAdmin = "";

    public static final String password = "1233";

    // private static final String BASDIR = ".\\src\\main\\java\\config\\";
    private static final String BASDIR = System.getProperty("user.dir") + "/src/main/java/config/";
    public static final String SIGNINPAGELOCATORS = BASDIR + "SignInPageLocators.properties";
    public static final String GUESTUSERPAGELOCATORS = BASDIR + "GuestUserEnrollmentLocators.properties";
    public static final String CHILDREGISTRATIONPAGELOCATORS = BASDIR + "ChildRegistrationLocators.properties";
    public static final String PROVIDERSIGNINPAGELOCATORS = BASDIR + "ProviderSignInPageLocators.properties";
    public static final String INTAKEFORMPAGELOCATORS = BASDIR + "IntakeFormLocators.properties";
    public static final String CAPACITYMANAGEMENTLOCATORS = BASDIR + "CapacityManagementLocators.properties";
    public static final String STAFFMANAGEMENTLOCATORS = BASDIR + "StaffManagementLocators.properties";




    public static final String CHROMEDRIVER = "D:\\chromedriver.exe";
    public static final String EDGEDRIVER = "repace with edgedriver path";
    public static final String GICODRIVER = "repace with gicodriver path";

    public static String getHopscotchURL(String environment) {
        switch (environment) {
            case "client":
                return "https://dev-client.hopscotchconnect.com/";
            case "provider":
                return "https://dev-provider.hopscotchconnect.com/";
            case "intake":
                return "https://dev-client.hopscotchconnect.com/provider/PLLC-7854/intake";
            default:
                return "https://dev-client.hopscotchconnect.com/";
        }



    }

    public static String getUsername(String environment) {
        switch (environment) {
            case "client":
                return "jack@yopmail.com";
            case "provider":
                return "hoptest.dev-provider@yopmail.com";
            default:
                return "client";
        }
    }

    public static String getPassword(String environment) {
        switch (environment) {
            case "client":
                return "Test@12345";
            case "provider":
                return "Test@12345";
            default:
                return "Test@12345";
        }
    }

}
