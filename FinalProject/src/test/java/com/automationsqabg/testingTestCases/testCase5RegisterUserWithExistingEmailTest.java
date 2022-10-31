package com.automationsqabg.testingTestCases;


import com.automationsqabg.pages.TestCase5RegisterUserWithExistingEmailPage;
import com.automationsqabg.pages.LandingPage;
import com.automationsqabg.Utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase5RegisterUserWithExistingEmailTest extends BaseClass {

    @Test
    public void testCase5RegisterUserWithExistingEmailTesting(){

        LandingPage aelp = new LandingPage(wd);
        TestCase5RegisterUserWithExistingEmailPage test5Page = new TestCase5RegisterUserWithExistingEmailPage(wd);

        aelp.signUpLogInButton.click();

        String signupPageUrl = wd.getCurrentUrl();
        Assert.assertEquals(signupPageUrl, Data.LOGIN_SIGNUP_URL);
        System.out.println("Valida Url");
        sleepTest(1500);

        String newUserSignupTxt = aelp.newUserSignupText.getText();
        Assert.assertEquals(newUserSignupTxt, Data.NEW_USER_SIGNUP_TEXT);
        System.out.println(newUserSignupTxt + " is showing");
        sleepTest(1500);

        aelp.signUpName.sendKeys(Data.SIGNUP_NAME);
        sleepTest(1500);

        aelp.signUpEmail.sendKeys(Data.SIGNUP_EMAIL);
        sleepTest(1500);

        aelp.signUpButton.click();
        sleepTest(1500);

        String emailAddressAlreadyExistTxt = test5Page.emailAddressAlreadyExistText.getText();
        Assert.assertEquals(emailAddressAlreadyExistTxt, Data.EMAIL_ADDRESS_ALREADY_EXIST_TEXT);
        System.out.println(emailAddressAlreadyExistTxt);
        sleepTest(1500);

    }
}
