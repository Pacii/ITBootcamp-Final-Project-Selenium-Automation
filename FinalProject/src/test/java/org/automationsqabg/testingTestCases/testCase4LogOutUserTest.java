package org.automationsqabg.testingTestCases;

import org.automationsqabg.pages.automationExerciseLandingPage;
import org.automationsqabg.pages.testCase4LogOutUserPage;
import org.automationsqabg.utility.data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase4LogOutUserTest extends baseClass{

    @Test
    public void testCase4LogOutUserTesting(){

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase4LogOutUserPage test4Page = new testCase4LogOutUserPage(wd);

        aelp.signUpLogInButton.click();
        sleepTest(1500);

        String loginToYourAccountTxt = aelp.loginToYourAccountText.getText();
        Assert.assertEquals(loginToYourAccountTxt, data.LOG_IN_TO_YOUR_ACCOUNT_TEXT);
        System.out.println(loginToYourAccountTxt + " is showing");
        sleepTest(1500);

        String loginUrl = wd.getCurrentUrl();
        Assert.assertEquals(loginUrl,data.LOGIN_SIGNUP_URL);
        System.out.println("You are at login/signup page");

        aelp.loginEmailAddress.sendKeys(data.SIGNUP_EMAIL);
        sleepTest(1500);

        aelp.loginPassword.sendKeys(data.SIGNUP_PAGE_PASSWORD);
        sleepTest(1500);

        aelp.loginButton.click();
        sleepTest(1500);
        System.out.println("You are logged out");

        String loggedInAsTxt = test4Page.loggedInAsText.getText();
        Assert.assertTrue(true, data.LOGGED_IN_PARTIAL_TEXT);
        sleepTest(1500);
        System.out.println(loggedInAsTxt + " is showing");

        test4Page.logOut.click();
        sleepTest(1500);

        String loginToYourAccountTxt2 = aelp.loginToYourAccountText.getText();
        Assert.assertEquals(loginToYourAccountTxt2, data.LOG_IN_TO_YOUR_ACCOUNT_TEXT);
        System.out.println(loginToYourAccountTxt2 + " is showing");
        sleepTest(1500);

    }
}
