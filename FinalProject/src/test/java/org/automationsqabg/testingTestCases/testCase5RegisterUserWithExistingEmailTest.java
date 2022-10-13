package org.automationsqabg.testingTestCases;


import org.automationsqabg.pages.automationExerciseLandingPage;
import org.automationsqabg.pages.testCase5RegisterUserWithExistingEmailPage;
import org.automationsqabg.utility.data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase5RegisterUserWithExistingEmailTest extends baseClass {

    @Test
    public void testCase5RegisterUserWithExistingEmailTesting(){

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase5RegisterUserWithExistingEmailPage test5Page = new testCase5RegisterUserWithExistingEmailPage(wd);

        aelp.signUpLogInButton.click();

        String signupPageUrl = wd.getCurrentUrl();
        Assert.assertEquals(signupPageUrl, data.LOGIN_SIGNUP_URL);
        System.out.println("Valida Url");
        sleepTest(1500);

        String newUserSignupTxt = aelp.newUserSignupText.getText();
        Assert.assertEquals(newUserSignupTxt,data.NEW_USER_SIGNUP_TEXT);
        System.out.println(newUserSignupTxt + " is showing");
        sleepTest(1500);

        aelp.signUpName.sendKeys(data.SIGNUP_NAME);
        sleepTest(1500);

        aelp.signUpEmail.sendKeys(data.SIGNUP_EMAIL);
        sleepTest(1500);

        aelp.signUpButton.click();
        sleepTest(1500);

        String emailAddressAlreadyExistTxt = test5Page.emailAddressAlreadyExistText.getText();
        Assert.assertEquals(emailAddressAlreadyExistTxt,data.EMAIL_ADDRESS_ALREADY_EXIST_TEXT);
        System.out.println(emailAddressAlreadyExistTxt);
        sleepTest(1500);

    }
}
