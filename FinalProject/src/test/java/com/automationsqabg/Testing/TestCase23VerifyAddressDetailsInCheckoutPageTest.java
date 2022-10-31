package com.automationsqabg.Testing;

import com.automationsqabg.Pages.LandingPage;
import com.automationsqabg.Pages.TestCase23VerifyAddressDetailsInCheckoutPagePage;
import com.automationsqabg.Utility.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase23VerifyAddressDetailsInCheckoutPageTest extends BaseClass {

    @Test
    public void testCase23VerifyAddressDetailsInCheckoutPageTesting() {

        LandingPage aelp = new LandingPage(wd);
        TestCase23VerifyAddressDetailsInCheckoutPagePage test23Page = new TestCase23VerifyAddressDetailsInCheckoutPagePage(wd);

//        3. Verify that home page is visible successfully
        String homePageUrl = wd.getCurrentUrl();
        Assert.assertEquals(homePageUrl, Data.BASE_URL);
        sleepTest(1500);
        System.out.println(homePageUrl);

//        4. Click 'Signup / Login' button
        aelp.signUpLogInButton.click();
        sleepTest(1500);

//        5. Fill all details in Signup and create account
        aelp.signUpNameInput.sendKeys(Data.SIGNUP_NAME_INPUT);
        sleepTest(1500);

        aelp.signUpEmailAddressInput.sendKeys(Data.SIGNUP_EMAIL_ADDRESS_INPUT_TC_23);
        sleepTest(1500);

        aelp.signUpSubmitButton.click();

        aelp.signUpTitleRadioButton.click();
        sleepTest(2500);

        aelp.signUpPasswordInput.sendKeys(Data.SIGNUP_PAGE_PASSWORD_INPUT);
        sleepTest(2500);

        JavascriptExecutor jse = (JavascriptExecutor) wd;
        jse.executeScript("window.scrollBy(0,500)");
        sleepTest(2500);

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

        jse.executeScript("window.scrollBy(0,500)");
        sleepTest(500);

        aelp.signUpZipCodeInput.sendKeys(Data.SIGNUP_ZIPCODE_INPUT);
        sleepTest(2500);

        aelp.signUpMobileNumberInput.sendKeys(Data.SIGNUP_MOBILE_NUMBER_INPUT);
        sleepTest(2500);

        aelp.signUpCreateAccountButton.click();
        sleepTest(2500);

//        6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        if (aelp.signUpAccountCreatedText.isDisplayed()) {
            String signUpAccountCreatedTxt = aelp.signUpAccountCreatedText.getText();
            Assert.assertEquals(signUpAccountCreatedTxt, Data.SIGNUP_ACCOUNT_CREATED_TXT);
            System.out.println(Data.SIGNUP_ACCOUNT_CREATED_TXT);
            sleepTest(2500);
        }
        else {
            System.out.println(Data.ERROR_MESSAGE);
        }
        aelp.signUpAccountCreatedContinueButton.click();

//        7. Verify ' Logged in as username' at top
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

//        8. Add products to cart
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("window.scrollBy(0,600)");
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
            System.out.println(Data.ERROR_MESSAGE);
        }

//        11. Click Proceed To Checkout
        aelp.proceedToCheckout.click();
        sleepTest(2500);

//        12. Verify Address Details and Review Your Order
        if (aelp.deliveryAddressFullName.isDisplayed()) {
            String billingAddressFullNameTxt = aelp.billingAddressFullName.getText();
            Assert.assertEquals(billingAddressFullNameTxt, Data.DELIVERY_ADDRESS_FULL_NAME);
        } else {
            System.out.println(Data.ERROR_MESSAGE);
        }

//        13. Verify that the billing address is same address filled at the time registration of account

        if (aelp.billingAddressFullName.isDisplayed()) {
            String deliveryAddressFullNameTxt = aelp.billingAddressFullName.getText();
            Assert.assertEquals(deliveryAddressFullNameTxt, Data.BILLING_ADDRESS_FULL_NAME);
        } else {
            System.out.println(Data.ERROR_MESSAGE);
        }

//        14. Click 'Delete Account' button
//        15. Verify 'ACCOUNT DELETED!' and click 'Continue' button

    }
}
