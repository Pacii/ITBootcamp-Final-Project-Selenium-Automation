package com.automationsqabg.Testing;

import com.automationsqabg.Pages.LandingPage;
import com.automationsqabg.Pages.TestCase14PlaceOrderRegisterWhileCheckoutPage;
import com.automationsqabg.Utility.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase14PlaceOrderRegisterWhileCheckoutTest extends BaseClass {

    @Test
    public void testCase14PlaceOrderRegisterWhileCheckoutTesting() {

        LandingPage aelp = new LandingPage(wd);
        TestCase14PlaceOrderRegisterWhileCheckoutPage test14Page = new TestCase14PlaceOrderRegisterWhileCheckoutPage(wd);

        if (aelp.homeSlider.isDisplayed()) {
            System.out.println("You are watching slider, so you are at HOME PAGE");
            sleepTest(2500);
        } else {
            System.out.println(Data.ERROR_MESSAGE);
        }

        if (aelp.homeSlider.isDisplayed()) {
            String homePageUrl = wd.getCurrentUrl();
            Assert.assertEquals(homePageUrl, Data.BASE_URL);
            sleepTest(2500);
            System.out.println(Data.HOME_PAGE_SUCCESS_MESSAGE);
        }
        else {
            System.out.println(Data.ERROR_MESSAGE);
        }


        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("window.scrollBy(0,500)");
        sleepTest(2500);

        aelp.viewProduct.click();
        aelp.addToCartButton.click();
        sleepTest(2500);
        aelp.viewCart.click();
        sleepTest(2500);

        if (aelp.shoppingCart.isDisplayed()) {
            System.out.println("You are at cart page");
            sleepTest(2500);
        } else {
            System.out.println(Data.ERROR_MESSAGE);
        }

        aelp.proceedToCheckout.click();
        sleepTest(2500);

        aelp.registerLogin.click();
        sleepTest(2000);

        aelp.signUpNameInput.sendKeys(Data.SIGNUP_NAME_INPUT);
        sleepTest(2500);

        aelp.signUpEmailAddressInput.sendKeys(Data.SIGNUP_EMAIL_ADDRESS_INPUT);
        sleepTest(2500);

        aelp.signUpSubmitButton.click();
        sleepTest(2500);

        aelp.signUpTitleRadioButton.click();
        sleepTest(2500);

        aelp.signUpPasswordInput.sendKeys(Data.SIGNUP_PAGE_PASSWORD_INPUT);
        sleepTest(2500);

        js.executeScript("window.scrollBy(0,300)");

        Select objSelectDay = new Select(aelp.signUpDayDropdown);
        objSelectDay.selectByValue(Data.SIGNUP_PAGE_DATE_DROPDOWN);
        sleepTest(2500);

        Select objSelectMonth = new Select(aelp.signUpMonthDropdown);
        objSelectMonth.selectByValue(Data.SIGNUP_PAGE_MONTH_DROPDOWN);
        sleepTest(2500);

        Select objSelectYear = new Select(aelp.signUpYearDropdown);
        objSelectYear.selectByValue(Data.SIGNUP_PAGE_YEAR_DROPDOWN);
        sleepTest(2500);

        aelp.signUpNewsletterCheckBox.click();
        sleepTest(2500);

        aelp.signUpOfferCheckBox.click();
        sleepTest(2500);

        aelp.signUpFirstNameInput.sendKeys(Data.SIGNUP_FIRST_NAME_INPUT);
        sleepTest(2500);

        aelp.signUpLastNameInput.sendKeys(Data.SIGNUP_SECOND_NAME_INPUT);
        sleepTest(2500);

        aelp.signUpCompanyNameInput.sendKeys(Data.SIGNUP_COMPANY_NAME_INPUT);
        sleepTest(2500);

        aelp.signUpAddressInput.sendKeys(Data.SIGNUP_ADDRESS_INPUT);
        sleepTest(2500);

        aelp.signUpAddress2Input.sendKeys(Data.SIGNUP_ADDRESS2_INPUT);
        sleepTest(2500);

        Select objSelectCountry = new Select(aelp.signUpCountryDropdown);
        objSelectCountry.selectByValue(Data.SIGNUP_COUNTRY_NAME_DROPDOWN);
        sleepTest(2500);


        aelp.signUpStateInput.sendKeys(Data.SIGNUP_STATE_INPUT);
        sleepTest(2500);

        aelp.signUpCityInput.sendKeys(Data.SIGNUP_CITY_INPUT);
        sleepTest(2500);

        aelp.signUpZipCodeInput.sendKeys(Data.SIGNUP_ZIPCODE_INPUT);
        sleepTest(2500);

        aelp.signUpMobileNumberInput.sendKeys(Data.SIGNUP_MOBILE_NUMBER_INPUT);
        sleepTest(2500);

        aelp.signUpCreateAccountButton.click();
        sleepTest(2500);

        aelp.signUpAccountCreatedContinueButton.click();
        sleepTest(2500);

        if (aelp.loggedInAsTxt.isDisplayed()) {
            String loggedInAsText = aelp.loggedInAsTxt.getText();
            if (loggedInAsText.contains(Data.LOGGED_IN_PARTIAL_TEXT)){
                System.out.println("Contains checking works.");
                sleepTest(2500);
            }

       }
        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

        aelp.cartButton.click();
        sleepTest(2500);
        //ASD

        aelp.proceedToCheckout.click();
        sleepTest(2500);

        if (aelp.deliveryAddressFullName.isDisplayed()) {
            String billingAddressFullNameTxt = aelp.billingAddressFullName.getText();
            Assert.assertEquals(billingAddressFullNameTxt, Data.DELIVERY_ADDRESS_FULL_NAME);
        } else {
            System.out.println(Data.ERROR_MESSAGE);
        }

        if (aelp.billingAddressFullName.isDisplayed()) {
            String deliveryAddressFullNameTxt = aelp.billingAddressFullName.getText();
            Assert.assertEquals(deliveryAddressFullNameTxt, Data.BILLING_ADDRESS_FULL_NAME);
        } else {
            System.out.println(Data.ERROR_MESSAGE);
        }

        aelp.checkOutPageCommentInput.sendKeys(Data.CHECK_OUT_PAGE_COMMENT);
        sleepTest(2500);

        aelp.placeOrderButton.click();
        sleepTest(2500);

        aelp.nameOnCardInput.sendKeys(Data.NAME_ON_CARD_INPUT);
        sleepTest(2500);

        aelp.cardNumberInput.sendKeys(Data.CARD_NUMBER_INPUT);
        sleepTest(2500);

        aelp.cvcInput.sendKeys(Data.CVC_INPUT);
        sleepTest(2500);

        aelp.expirationMonth.sendKeys(Data.EXPIRATION_MONTH_INPUT);
        sleepTest(2500);

        aelp.expirationYear.sendKeys(Data.EXPIRATION_YEAR_INPUT);
        sleepTest(2500);

        aelp.payAndConfirmOrderButton.click();
        sleepTest(2500);

        if (aelp.orderPlaceSuccessTxt.isDisplayed()) {
            String orderPlaceSuccessText = aelp.orderPlaceSuccessTxt.getText();
            Assert.assertEquals(orderPlaceSuccessText, Data.ORDER_PLACE_SUCCESS_TEXT);
        }
        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

        aelp.orderPlaceSuccessPageContinueButton.click();
        sleepTest(2500);
    }
}
