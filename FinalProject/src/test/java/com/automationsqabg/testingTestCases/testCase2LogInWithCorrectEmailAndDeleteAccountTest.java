package com.automationsqabg.testingTestCases;

import com.automationsqabg.dataPackage.data;
import com.automationsqabg.paths.automationExerciseLandingPage;
import com.automationsqabg.paths.testCase2LogInWithCorrectEmailAndDeleteAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase2LogInWithCorrectEmailAndDeleteAccountTest extends baseClass{
//     This test has the same problem as the first one due to a bug on the delete button!!!

    @Test
    public void testCase2LogInWithCorrectEmailTesting(){

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase2LogInWithCorrectEmailAndDeleteAccountPage test2Page = new testCase2LogInWithCorrectEmailAndDeleteAccountPage(wd);

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

        aelp.loginEmailAddress.sendKeys(data.LOGIN_MAIL);
        sleepTest(2000);

        aelp.loginPassword.sendKeys(data.SIGNUP_PAGE_PASSWORD);
        sleepTest(1500);

        aelp.loginButton.click();
        sleepTest(1500);

        System.out.println("Successfully logged in!");

        //Checking Delete Account Text availability
        String delAccText = test2Page.deleteAccount.getText();
        Assert.assertEquals(delAccText, data.DELETE_ACCOUNT_TEXT);
        sleepTest(2000);

        //Click Delete Account
        test2Page.deleteAccount.click();
        sleepTest(2000);

        //Checking Delete Account Url
        String deleteAccountUrl = wd.getCurrentUrl();
        Assert.assertEquals(deleteAccountUrl, data.DELETE_ACCOUNT_URL);
        sleepTest(2000);

        //Again click on delete account
        test2Page.delAcc.click();
        sleepTest(3000);

        System.out.println("The button was pressed but the account was not deleted!");
        System.out.println("BUG REPORTED!");
    }
}