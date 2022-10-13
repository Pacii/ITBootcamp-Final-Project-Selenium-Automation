package org.automationsqabg.testingTestCases;

import org.automationsqabg.pages.automationExerciseLandingPage;
import org.automationsqabg.pages.testCase2LogInWithCorrectEmailPage;
import org.automationsqabg.utility.data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase2LogInWithCorrectEmailTest extends baseClass{

    @Test
    public void testCase2LogInWithCorrectEmailTesting(){

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase2LogInWithCorrectEmailPage test2Page = new testCase2LogInWithCorrectEmailPage(wd);

        aelp.signUpLogInButton.click();
        sleepTest(1000);

        String TestCase2LogInWithCorrectEmailPageUrl = wd.getCurrentUrl();
        Assert.assertEquals(TestCase2LogInWithCorrectEmailPageUrl, data.LOGIN_SIGNUP_URL);
        System.out.println("Link matched.");
        sleepTest(1000);

        String loginToYourAccountText = aelp.loginToYourAccountText.getText();
        Assert.assertEquals(loginToYourAccountText,data.LOG_IN_TO_YOUR_ACCOUNT_TEXT);
        sleepTest(1500);
        System.out.println("Login to your account is showing");

        aelp.loginEmailAddress.sendKeys(data.SIGNUP_EMAIL);
        sleepTest(2000);

        aelp.loginPassword.sendKeys(data.SIGNUP_PAGE_PASSWORD);
        sleepTest(1500);

        aelp.loginButton.click();
        sleepTest(1500);

        System.out.println("Successfully logged in!");
    }
}