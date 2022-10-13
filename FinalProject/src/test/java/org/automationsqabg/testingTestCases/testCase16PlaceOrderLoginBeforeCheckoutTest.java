package org.automationsqabg.testingTestCases;

import org.automationsqabg.pages.automationExerciseLandingPage;
import org.automationsqabg.pages.testCase16PlaceOrderLoginBeforeCheckoutPage;
import org.automationsqabg.utility.data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase16PlaceOrderLoginBeforeCheckoutTest extends baseClass{

    @Test
    public void testCase16PlaceOrderLoginBeforeCheckoutTesting() {

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase16PlaceOrderLoginBeforeCheckoutPage test16Page = new testCase16PlaceOrderLoginBeforeCheckoutPage (wd);

//        3. Verify that home page is visible successfully
        if (aelp.homeSlider.isDisplayed()){
            String homePageUrl = wd.getCurrentUrl();
            Assert.assertEquals(homePageUrl, data.BASE_URL);
            sleepTest(1500);
            System.out.println(data.HOME_PAGE_SUCCESS_MESSAGE);
            sleepTest(2500);
        }

        else {
            System.out.println(data.ERROR_MESSAGE);
        }

//        4. Click 'Signup / Login' button
        aelp.signUpLogInButton.click();
        sleepTest(1500);

//        5. Fill email, password and click 'Login' button
        aelp.loginEmailAddress.sendKeys(data.LOGIN_EMAIL_ADDRESS_INPUT);
        sleepTest(2500);
        aelp.loginPassword.sendKeys(data.LOGIN_PASSWORD_INPUT);
        sleepTest(2500);
        aelp.loginButton.click();
        sleepTest(2500);


//        6. Verify 'Logged in as username' at top
        if (aelp.loggedInAsTxt.isDisplayed()) {
            String loggedInAsText = aelp.loggedInAsTxt.getText();
            if (loggedInAsText.contains(data.LOGGED_IN_PARTIAL_TEXT)){
                System.out.println("Contains checking works.");
                sleepTest(2500);
            }

        }
        else {
            System.out.println(data.ERROR_MESSAGE);
        }

//        7. Add products to cart
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("window.scrollBy(0,600)");
        sleepTest(2500);

        aelp.viewProduct.click();
        aelp.addToCartButton.click();
        sleepTest(2500);
        aelp.continueShoppingButton.click();
        sleepTest(2500);

//        8. Click 'Cart' button
        aelp.cartButton.click();
        sleepTest(2500);


//        9. Verify that cart page is displayed
        if (aelp.shoppingCart.isDisplayed()) {
            System.out.println("You are at cart page");
            sleepTest(2500);
        } else {
            System.out.println(data.ERROR_MESSAGE);
        }

//        10. Click Proceed To Checkout
        aelp.proceedToCheckout.click();
        sleepTest(2500);

//        11. Verify Address Details and Review Your Order
        if (aelp.deliveryAddressFullName.isDisplayed()) {
            String billingAddressFullNameTxt = aelp.billingAddressFullName.getText();
            Assert.assertEquals(billingAddressFullNameTxt, data.DELIVERY_ADDRESS_FULL_NAME);
        } else {
            System.out.println(data.ERROR_MESSAGE);
        }

        if (aelp.billingAddressFullName.isDisplayed()) {
            String deliveryAddressFullNameTxt = aelp.billingAddressFullName.getText();
            Assert.assertEquals(deliveryAddressFullNameTxt, data.BILLING_ADDRESS_FULL_NAME);
        } else {
            System.out.println(data.ERROR_MESSAGE);
        }

//        12. Enter description in comment text area and click 'Place Order'
        aelp.checkOutPageCommentInput.sendKeys(data.CHECK_OUT_PAGE_COMMENT);
        sleepTest(2500);

        aelp.placeOrderButton.click();
        sleepTest(2500);

//        13. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        aelp.nameOnCardInput.sendKeys(data.NAME_ON_CARD_INPUT);
        sleepTest(2500);

        aelp.cardNumberInput.sendKeys(data.CARD_NUMBER_INPUT);
        sleepTest(2500);

        aelp.cvcInput.sendKeys(data.CVC_INPUT);
        sleepTest(2500);

        aelp.expirationMonth.sendKeys(data.EXPIRATION_MONTH_INPUT);
        sleepTest(2500);

        aelp.expirationYear.sendKeys(data.EXPIRATION_YEAR_INPUT);
        sleepTest(2500);

//        14. Click 'Pay and Confirm Order' button
        aelp.payAndConfirmOrderButton.click();
        sleepTest(2500);

//        15. Verify success message 'Your order has been placed successfully!'
        if (aelp.orderPlaceSuccessTxt.isDisplayed()) {
            String orderPlaceSuccessText = aelp.orderPlaceSuccessTxt.getText();
            Assert.assertEquals(orderPlaceSuccessText, data.ORDER_PLACE_SUCCESS_TEXT);
        }
        else {
            System.out.println(data.ERROR_MESSAGE);
        }

        aelp.orderPlaceSuccessPageContinueButton.click();
        sleepTest(2500);

    }
}