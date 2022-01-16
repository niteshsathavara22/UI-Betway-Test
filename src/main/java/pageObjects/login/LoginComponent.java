package pageObjects.login;

import helper.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginComponent extends CommonMethod {
    private By $signInTab = By.id("idcta-link");
    private By $email = By.id("user-identifier-input");
    private By $password = By.id("password-input");
    private By $singIn_Button = By.id("submit-button");
    private By $actualFailMessage = By.cssSelector("form");


    public void clickOnSignInTab() {
        clickElement($signInTab);
    }

    public void enter_Email_And_Password(String email, String password) {
        //Email address
        enterText($email, email);
        //Password
        enterText($password, password);
    }

    public void click_On_SignIn_Button() {

        clickElement($singIn_Button);
    }

    public void error_Message_Assert(String fail_message) {
        //Actual fail message
        WebElement Fail_Message = driver.findElement($actualFailMessage);
        //get actual error message
        String Actual_Fail_Message = Fail_Message.getText();
        //Compare
        if (fail_message.equals(Actual_Fail_Message)) {
            System.out.println("Actual And Expected Message  : " + Actual_Fail_Message);
        } else {
            //Actual
            System.out.println("Actual is :" + Actual_Fail_Message);
            //Expected
            System.out.println("Expected is :" + fail_message);
        }

    }
}
