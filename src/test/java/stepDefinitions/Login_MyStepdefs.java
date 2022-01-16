package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.login.LoginComponent;


public class Login_MyStepdefs {
    LoginComponent loginComponent = new LoginComponent();


    @Given("^User is on homepage$")
    public void user_is_on_homepage() {
        System.out.println("User on home page");

    }

    @When("^User click on login button$")
    public void user_click_on_login_button() throws Throwable {
        loginComponent.clickOnSignInTab();

    }

    @And("^User enter \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_enter(String Email, String Password) {
        loginComponent.enter_Email_And_Password(Email, Password);

    }

    @And("^User click on Sign in button$")
    public void user_click_on_Sign_in_button() {
        loginComponent.click_On_SignIn_Button();

    }

    @Then("^User should not able to login and get Error message \"([^\"]*)\"$")
    public void user_should_not_able_to_login_and_get_Error_message(String Fail_message) {
        loginComponent.error_Message_Assert(Fail_message);
    }


}
