package com.automationsqabg.testingTestCases;

import com.automationsqabg.paths.testCase10VerifySubscriptionInHomePage;
import com.automationsqabg.paths.automationExerciseLandingPage;
import com.automationsqabg.dataPackage.data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class testCase10VerifySubscriptionInHomeTest extends baseClass{

    @Test
    public void testCase10VerifySubscriptionInHomeTesting() {

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase10VerifySubscriptionInHomePage test10Page = new testCase10VerifySubscriptionInHomePage(wd);

        JavascriptExecutor js = (JavascriptExecutor) wd;


        js.executeScript("arguments[0].scrollIntoView(true);", test10Page.subscription);
        sleepTest(5000);

        test10Page.subscriptionEmailInputBox().sendKeys(data.SUBSCRIPTION_US_EMAIL);
        sleepTest(1500);

        test10Page.arrowButton.click();
        sleepTest(1500);


    }
}