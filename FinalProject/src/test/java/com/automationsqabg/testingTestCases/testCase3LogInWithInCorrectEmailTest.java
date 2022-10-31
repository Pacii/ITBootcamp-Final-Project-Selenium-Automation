package com.automationsqabg.testingTestCases;

import com.automationsqabg.pages.LandingPage;
import com.automationsqabg.pages.TestCase3LogInWithInCorrectEmailPage;
import com.automationsqabg.Utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3LogInWithInCorrectEmailTest extends BaseClass {

    @Test
    public void testCase3LogInWithInCorrectEmailTesting(){

        LandingPage aelp = new LandingPage(wd);
        TestCase3LogInWithInCorrectEmailPage test3Page = new TestCase3LogInWithInCorrectEmailPage(wd);

        aelp.signUpLogInButton.click();
        sleepTest(1000);

        String signUpUrl = wd.getCurrentUrl();
        Assert.assertEquals(signUpUrl, Data.LOGIN_SIGNUP_URL);
        System.out.println("URL Matched");
        sleepTest(1500);

        aelp.loginEmailAddress.sendKeys(Data.INCORRECT_EMAIL);
        sleepTest(1500);
        System.out.println("Incorrect Email Wrote");

        aelp.loginPassword.sendKeys(Data.INCORRECT_PASSWORD);
        sleepTest(1500);
        System.out.println("Incorrect Password Wrote");

        aelp.loginButton.click();
        sleepTest(1500);
        System.out.println("Login clicked");

        String incorrectMessage = test3Page.incorrectMessage.getText();
        Assert.assertEquals(incorrectMessage, Data.INCORRECT_TEXT);
        sleepTest(1500);
        System.out.println("Incorrect Message Showed");

    }
}