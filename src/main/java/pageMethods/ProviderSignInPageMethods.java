package pageMethods;


import base.PredefinedActions;
import constant.ConstantPath;
import utility.PropOperation;


public class ProviderSignInPageMethods extends PredefinedActions {
    public PropOperation propOperation;

    public ProviderSignInPageMethods() {
        propOperation = new PropOperation(ConstantPath.PROVIDERSIGNINPAGELOCATORS);
    }

    public void NavigateToProviderURL() {
        getDriver("https://dev-provider.hopscotchconnect.com/login");


    }
    public void EnterEmailProvider(){
        setText(propOperation.getValue("ProviderEmail"), true, "hoptest.dev-provider@yopmail.com");
    }
    public void EnterProviderPassword(){
        setText(propOperation.getValue("ProviderPassword"), true, "Test@12345");
    }

    public void LogInProvider(){
        setText(propOperation.getValue("ProviderEmail"), true, "hoptest.dev-provider@yopmail.com");
        setText(propOperation.getValue("ProviderPassword"), true, "Test@12345");
        clickOnElement(propOperation.getValue("ProviderLoginButton"), true);
    }

    }

