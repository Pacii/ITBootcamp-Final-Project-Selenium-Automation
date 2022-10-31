package com.automationsqabg.Testing;

import com.automationsqabg.Pages.TestCase11VerifySubscriptionInCartPage;
import com.automationsqabg.Pages.LandingPage;
import com.automationsqabg.Utility.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase11VerifySubscriptionInCartTest extends BaseClass {

    @Test
    public void testCase11VerifySubscriptionInCartTesting() {

        LandingPage aelp = new LandingPage(wd);
        TestCase11VerifySubscriptionInCartPage test11Page = new TestCase11VerifySubscriptionInCartPage(wd);

        aelp.cartButton.click();
        sleepTest(1500);

        String cartUrl = wd.getCurrentUrl();
        Assert.assertEquals(cartUrl, Data.CART_URL);
        sleepTest(1500);
        System.out.println("");
        System.out.println(cartUrl);
        System.out.println("");


        if ( test11Page.cartText.isDisplayed()  ){
            String cartTxt = test11Page.cartText.getText();
            Assert.assertEquals(cartTxt, Data.CART_TEXT);
            sleepTest(1500);
            System.out.println("");
            System.out.println(cartTxt + " is showing");
            System.out.println("");
        }

        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

        test11Page.cartEmailInputBox.sendKeys(Data.SUBSCRIPTION_US_EMAIL);
        sleepTest(2500);

        test11Page.cartEmailInputBoxSubmit.click();
        sleepTest(1500);

    }
}
