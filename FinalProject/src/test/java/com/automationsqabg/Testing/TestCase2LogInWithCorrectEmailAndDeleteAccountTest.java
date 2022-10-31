package com.automationsqabg.Testing;

import com.automationsqabg.Utility.Data;
import com.automationsqabg.Pages.LandingPage;
import com.automationsqabg.Pages.TestCase2LogInWithCorrectEmailAndDeleteAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2LogInWithCorrectEmailAndDeleteAccountTest extends BaseClass {
//     This test has the same problem as the first one due to a bug on the delete button!!!

    @Test
    public void testCase2LogInWithCorrectEmailTesting(){

        LandingPage aelp = new LandingPage(wd);
        TestCase2LogInWithCorrectEmailAndDeleteAccountPage test2Page = new TestCase2LogInWithCorrectEmailAndDeleteAccountPage(wd);

        aelp.signUpLogInButton.click();
        sleepTest(1000);

        String TestCase2LogInWithCorrectEmailPageUrl = wd.getCurrentUrl();
        Assert.assertEquals(TestCase2LogInWithCorrectEmailPageUrl, Data.LOGIN_SIGNUP_URL);
        System.out.println("Link matched.");
        sleepTest(1000);

        String loginToYourAccountText = aelp.loginToYourAccountText.getText();
        Assert.assertEquals(loginToYourAccountText, Data.LOG_IN_TO_YOUR_ACCOUNT_TEXT);
        sleepTest(1500);
        System.out.println("Login to your account is showing");

        aelp.loginEmailAddress.sendKeys(Data.SIGNUP_EMAIL);
        sleepTest(2000);

        aelp.loginPassword.sendKeys(Data.SIGNUP_PAGE_PASSWORD);
        sleepTest(1500);

        aelp.loginButton.click();
        sleepTest(1500);

        System.out.println("Successfully logged in!");

        //Checking Delete Account Text availability
        String delAccText = test2Page.deleteAccount.getText();
        Assert.assertEquals(delAccText, Data.DELETE_ACCOUNT_TEXT);
        sleepTest(2000);

        //Click Delete Account
        test2Page.deleteAccount.click();
        sleepTest(2000);

        //Checking Delete Account Url
        String deleteAccountUrl = wd.getCurrentUrl();
        Assert.assertEquals(deleteAccountUrl, Data.DELETE_ACCOUNT_URL);
        sleepTest(2000);

        //Again click on delete account
        test2Page.delAcc.click();
        sleepTest(3000);

        System.out.println("The button was pressed but the account was not deleted!");
        System.out.println("BUG REPORTED!");
    }
}