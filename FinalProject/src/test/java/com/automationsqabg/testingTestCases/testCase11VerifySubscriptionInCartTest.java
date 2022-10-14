package com.automationsqabg.testingTestCases;

import com.automationsqabg.paths.testCase11VerifySubscriptionInCartPage;
import com.automationsqabg.paths.automationExerciseLandingPage;
import com.automationsqabg.dataPackage.data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase11VerifySubscriptionInCartTest extends baseClass {

    @Test
    public void testCase11VerifySubscriptionInCartTesting() {

        automationExerciseLandingPage aelp = new  automationExerciseLandingPage (wd);
        testCase11VerifySubscriptionInCartPage test11Page = new testCase11VerifySubscriptionInCartPage(wd);

        aelp.cartButton.click();
        sleepTest(1500);

        String cartUrl = wd.getCurrentUrl();
        Assert.assertEquals(cartUrl, data.CART_URL);
        sleepTest(1500);
        System.out.println("");
        System.out.println(cartUrl);
        System.out.println("");


        if ( test11Page.cartText.isDisplayed()  ){
            String cartTxt = test11Page.cartText.getText();
            Assert.assertEquals(cartTxt, data.CART_TEXT);
            sleepTest(1500);
            System.out.println("");
            System.out.println(cartTxt + " is showing");
            System.out.println("");
        }

        else {
            System.out.println(data.ERROR_MESSAGE);
        }

        test11Page.cartEmailInputBox.sendKeys(data.SUBSCRIPTION_US_EMAIL);
        sleepTest(2500);

        test11Page.cartEmailInputBoxSubmit.click();
        sleepTest(1500);

    }
}
