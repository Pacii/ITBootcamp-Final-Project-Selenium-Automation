package org.automationsqabg.testingTestCases;

import org.automationsqabg.pages.automationExerciseLandingPage;
import org.automationsqabg.pages.testCase3LogInWithInCorrectEmailPage;
import org.automationsqabg.utility.data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase3LogInWithInCorrectEmailTest extends baseClass{

    @Test
    public void testCase3LogInWithInCorrectEmailTesting(){

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase3LogInWithInCorrectEmailPage test3Page = new testCase3LogInWithInCorrectEmailPage(wd);

        aelp.signUpLogInButton.click();
        sleepTest(1000);

        String signUpUrl = wd.getCurrentUrl();
        Assert.assertEquals(signUpUrl, data.LOGIN_SIGNUP_URL);
        System.out.println("URL Matched");
        sleepTest(1500);

        aelp.loginEmailAddress.sendKeys(data.INCORRECT_EMAIL);
        sleepTest(1500);
        System.out.println("Incorrect Email Wrote");

        aelp.loginPassword.sendKeys(data.INCORRECT_PASSWORD);
        sleepTest(1500);
        System.out.println("Incorrect Password Wrote");

        aelp.loginButton.click();
        sleepTest(1500);
        System.out.println("Login clicked");

        String incorrectMessag = test3Page.incorrectMessage.getText();
        Assert.assertEquals(incorrectMessag,data.INCORRECT_TEXT);
        sleepTest(1500);
        System.out.println("Incorrect Message Showed");

    }
}