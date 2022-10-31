package com.automationsqabg.Testing;

import com.automationsqabg.Pages.TestCase10VerifySubscriptionInHomePage;
import com.automationsqabg.Pages.LandingPage;
import com.automationsqabg.Utility.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TestCase10VerifySubscriptionInHomeTest extends BaseClass {

    @Test
    public void testCase10VerifySubscriptionInHomeTesting() {

        LandingPage aelp = new LandingPage(wd);
        TestCase10VerifySubscriptionInHomePage test10Page = new TestCase10VerifySubscriptionInHomePage(wd);

        JavascriptExecutor js = (JavascriptExecutor) wd;


        js.executeScript("arguments[0].scrollIntoView(true);", test10Page.subscription);
        sleepTest(5000);

        test10Page.subscriptionEmailInputBox().sendKeys(Data.SUBSCRIPTION_US_EMAIL);
        sleepTest(1500);

        test10Page.arrowButton.click();
        sleepTest(1500);


    }
}