package stepDefinition;


import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import pageMethods.ProviderSignInPageMethods;


public class ProviderSignInPageSteps {
    ProviderSignInPageMethods ProviderSignInPageMethods = new ProviderSignInPageMethods();

    @Given("user on the Sign in page for Provider")
    public void userOnTheSignInPageForProvider() {
        ProviderSignInPageMethods.LogInProvider();
    }

}

