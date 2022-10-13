package org.automationsqabg.testingTestCases;

import org.automationsqabg.pages.automationExerciseLandingPage;
import org.automationsqabg.pages.testCase15PlaceOrderRegisterBeforeCheckoutPage;
import org.automationsqabg.utility.data;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase15PlaceOrderRegisterBeforeCheckoutTest extends baseClass{

    @Test
    public void testCase15PlaceOrderRegisterBeforeCheckoutTesting() {

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase15PlaceOrderRegisterBeforeCheckoutPage test15Page = new testCase15PlaceOrderRegisterBeforeCheckoutPage(wd);

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

//        5. Fill all details in Signup and create account
        aelp.signUpNameInput.sendKeys(data.SIGNUP_NAME_INPUT);
        sleepTest(2500);

        aelp.signUpEmailAddressInput.sendKeys(data.SIGNUP_EMAIL_ADDRESS_INPUT);
        sleepTest(2500);

        aelp.signUpSubmitButton.click();
        sleepTest(2500);

        aelp.signUpTitleRadioButton.click();
        sleepTest(2500);

        aelp.signUpPasswordInput.sendKeys(data.SIGNUP_PAGE_PASSWORD_INPUT);
        sleepTest(2500);

        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("window.scrollBy(0,400)");
        sleepTest(2000);

        Select objSelectDay = new Select(aelp.signUpDayDropdown);
        objSelectDay.selectByValue(data.SIGNUP_PAGE_DATE_DROPDOWN);
        sleepTest(2500);

        Select objSelectMonth = new Select(aelp.signUpMonthDropdown);
        objSelectMonth.selectByValue(data.SIGNUP_PAGE_MONTH_DROPDOWN);
        sleepTest(2500);

        Select objSelectYear = new Select(aelp.signUpYearDropdown);
        objSelectYear.selectByValue(data.SIGNUP_PAGE_YEAR_DROPDOWN);
        sleepTest(2500);

        aelp.signUpNewsletterCheckBox.click();
        sleepTest(2500);

        aelp.signUpOfferCheckBox.click();
        sleepTest(2500);

        aelp.signUpFirstNameInput.sendKeys(data.SIGNUP_FIRST_NAME_INPUT);
        sleepTest(2500);

        aelp.signUpLastNameInput.sendKeys(data.SIGNUP_SECOND_NAME_INPUT);
        sleepTest(2500);

        aelp.signUpCompanyNameInput.sendKeys(data.SIGNUP_COMPANY_NAME_INPUT);
        sleepTest(2500);

        aelp.signUpAddressInput.sendKeys(data.SIGNUP_ADDRESS_INPUT);
        sleepTest(2500);

        aelp.signUpAddress2Input.sendKeys(data.SIGNUP_ADDRESS2_INPUT);
        sleepTest(2500);

        Select objSelectCountry = new Select(aelp.signUpCountryDropdown);
        objSelectCountry.selectByValue(data.SIGNUP_COUNTRY_NAME_DROPDOWN);
        sleepTest(2500);

        aelp.signUpStateInput.sendKeys(data.SIGNUP_STATE_INPUT);
        sleepTest(2500);

        aelp.signUpCityInput.sendKeys(data.SIGNUP_CITY_INPUT);
        sleepTest(2500);

        aelp.signUpZipCodeInput.sendKeys(data.SIGNUP_ZIPCODE_INPUT);
        sleepTest(2500);

        aelp.signUpMobileNumberInput.sendKeys(data.SIGNUP_MOBILE_NUMBER_INPUT);
        sleepTest(2500);

        aelp.signUpCreateAccountButton.click();
        sleepTest(2500);

//        6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        if (aelp.signUpAccountCreatedText.isDisplayed()) {
            String signUpAccountCreatedTxt = aelp.signUpAccountCreatedText.getText();
            Assert.assertEquals(signUpAccountCreatedTxt, data.SIGNUP_ACCOUNT_CREATED_TXT);
            System.out.println(data.SIGNUP_ACCOUNT_CREATED_TXT);
            sleepTest(2500);
        } else {
            System.out.println(data.ERROR_MESSAGE);
        }

        aelp.signUpAccountCreatedContinueButton.click();
        sleepTest(2500);

//        7. Verify ' Logged in as username' at top
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

//        8. Add products to cart
        js.executeScript("window.scrollBy(0,700)");
        sleepTest(2500);

        aelp.viewProduct.click();
        aelp.addToCartButton.click();
        sleepTest(2500);
        aelp.continueShoppingButton.click();
        sleepTest(2500);

//        9. Click 'Cart' button
        aelp.cartButton.click();
        sleepTest(2500);


//        10. Verify that cart page is displayed
        if (aelp.shoppingCart.isDisplayed()) {
            System.out.println("You are at cart page");
            sleepTest(2500);
        } else {
            System.out.println(data.ERROR_MESSAGE);
        }

//        11. Click Proceed To Checkout
        aelp.proceedToCheckout.click();
        sleepTest(2500);

//        12. Verify Address Details and Review Your Order
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

//        13. Enter description in comment text area and click 'Place Order'
        aelp.checkOutPageCommentInput.sendKeys(data.CHECK_OUT_PAGE_COMMENT);
        sleepTest(2500);

        aelp.placeOrderButton.click();
        sleepTest(2500);

//        14. Enter payment details: Name on Card, Card Number, CVC, Expiration date
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

//        15. Click 'Pay and Confirm Order' button
        aelp.payAndConfirmOrderButton.click();
        sleepTest(2500);

//        16. Verify success message 'Your order has been placed successfully!'
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
