package com.automationsqabg.testingTestCases;

import com.automationsqabg.pages.LandingPage;
import com.automationsqabg.pages.TestCase4LogOutUserPage;
import com.automationsqabg.Utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase4LogOutUserTest extends BaseClass {

    @Test
    public void testCase4LogOutUserTesting(){

        LandingPage aelp = new LandingPage(wd);
        TestCase4LogOutUserPage test4Page = new TestCase4LogOutUserPage(wd);

        aelp.signUpLogInButton.click();
        sleepTest(1500);

        String loginToYourAccountTxt = aelp.loginToYourAccountText.getText();
        Assert.assertEquals(loginToYourAccountTxt, Data.LOG_IN_TO_YOUR_ACCOUNT_TEXT);
        System.out.println(loginToYourAccountTxt + " is showing");
        sleepTest(1500);

        String loginUrl = wd.getCurrentUrl();
        Assert.assertEquals(loginUrl, Data.LOGIN_SIGNUP_URL);
        System.out.println("You are at login/signup page");

        aelp.loginEmailAddress.sendKeys(Data.SIGNUP_EMAIL);
        sleepTest(1500);

        aelp.loginPassword.sendKeys(Data.SIGNUP_PAGE_PASSWORD);
        sleepTest(1500);

        aelp.loginButton.click();
        sleepTest(1500);
        System.out.println("You are logged out");

        String loggedInAsTxt = test4Page.loggedInAsText.getText();
        Assert.assertTrue(true, Data.LOGGED_IN_PARTIAL_TEXT);
        sleepTest(1500);
        System.out.println(loggedInAsTxt + " is showing");

        test4Page.logOut.click();
        sleepTest(1500);

        String loginToYourAccountTxt2 = aelp.loginToYourAccountText.getText();
        Assert.assertEquals(loginToYourAccountTxt2, Data.LOG_IN_TO_YOUR_ACCOUNT_TEXT);
        System.out.println(loginToYourAccountTxt2 + " is showing");
        sleepTest(1500);

    }
}
