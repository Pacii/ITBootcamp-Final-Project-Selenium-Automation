package com.automationsqabg.Testing;

import com.automationsqabg.Pages.LandingPage;
import com.automationsqabg.Pages.TestCase1RegisterUserPageAndDelete;
import com.automationsqabg.Utility.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1RegisterUserTestAndDelete extends BaseClass {

//////////////////////////////////////////////////////IMPORTANT!!!!!!!//////////////////////////////////////////////////////
//    There is a bug on this site...you cannot delete the account either manually or automatically!!!!
//    So this test is just User Registration Test :)

//    If test 1 fails, go to the utility folder and in the data class change te String SIGNUP_EMAIL on line 15 because someone already used this email before you!
//    After that try again :)

    @Test
    public void testCase1RegisterUserTesting() {

        LandingPage aelp = new LandingPage(wd);
        TestCase1RegisterUserPageAndDelete test1Page = new TestCase1RegisterUserPageAndDelete(wd);


        String testCase1RegisterUserUrl = wd.getCurrentUrl();
        Assert.assertEquals(testCase1RegisterUserUrl, Data.BASE_URL);
        System.out.println("Link Matched");

        //Click on Signup/Login Button
        aelp.signUpLogInButton.click();
        sleepTest(2000);

        //Validate Signup/Login page URL
        String signUpUrl = wd.getCurrentUrl();
        Assert.assertEquals(signUpUrl, Data.LOGIN_SIGNUP_URL);
        System.out.println("SIGNUP Url Matched");

        //Sending Name to Name box
        aelp.signUpName.sendKeys(Data.SIGNUP_NAME);
        sleepTest(2000);

        //Sending Email to Email Box
        aelp.signUpEmail.sendKeys(Data.SIGNUP_EMAIL);
        sleepTest(2000);

        //Click on Signup Button
        aelp.signUpButton.click();
        sleepTest(2000);

        //SignUp Landing Page Text Validation
        String signUpPageTxt = test1Page.signUpPageText.getText();
        Assert.assertEquals(signUpPageTxt, Data.SIGNUP_PAGE_TEXT);
        System.out.println("Text is visible");

        //Select Gender
        test1Page.male.click();
        sleepTest(1500);

        JavascriptExecutor je = (JavascriptExecutor) wd;
        je.executeScript("window.scrollBy (0,1000)");


        //SignUp Page Password
        test1Page.signUpPagePassword.sendKeys(Data.SIGNUP_PAGE_PASSWORD);
        sleepTest(1500);

        //Date of Birth DropDown
        By day = By.cssSelector("select#days");
        By month = By.cssSelector("select#months");
        By year = By.cssSelector("select#years");

        test1Page.doSelectByVisibleText(day, "21");
        sleepTest(1500);
        test1Page.doSelectByVisibleText(month, "June");
        sleepTest(1500);
        test1Page.doSelectByVisibleText(year, "1991");
        sleepTest(1500);

        //Checkbox for newsletter & special offers
        boolean isSelected = test1Page.newsletterCheckBox.isSelected();
        if ( isSelected == false ){
            test1Page.newsletterCheckBox.click();
            sleepTest(2000);
            System.out.println(Data.NEWSLETTER_CHECK_BOX);
        }

        boolean isSelected1 = test1Page.specialOfferCheckBox.isSelected();
        if ( isSelected1 == false ){
            test1Page.specialOfferCheckBox.click();
            sleepTest(2000);
            System.out.println(Data.SPECIAL_OFFER_CHECK_BOX);
        }

        //First Name
        test1Page.firstNameText.sendKeys(Data.FIRST_NAME_TEXT);
        sleepTest(1000);

        //Last Name
        test1Page.lastNameText.sendKeys(Data.LAST_NAME_TEXT);
        sleepTest(1000);

        //Company
        test1Page.companyText.sendKeys(Data.COMPANY_TEXT);
        sleepTest(1000);

        //Address
        test1Page.address1Text.sendKeys(Data.ADDRESS_1_TEXT);
        sleepTest(1000);

        //Address 2
        test1Page.address2Text.sendKeys(Data.ADDRESS_2_TEXT);
        sleepTest(1000);

        //Country Selection from dropdown
        By country = By.cssSelector("select#country");
        test1Page.doSelectByVisibleText(country,"New Zealand");
        sleepTest(2000);

        //State
        test1Page.stateText.sendKeys(Data.STATE_TEXT);
        sleepTest(1000);

        //City
        test1Page.cityText.sendKeys(Data.CITY_TEXT);
        sleepTest(1000);

        //Zipcode
        test1Page.zipcodeText.sendKeys(Data.ZIPCODE_TEXT);
        sleepTest(1000);

        //Mobile Number
        test1Page.mobileNumberText.sendKeys(Data.MOBILE_NUMBER);
        sleepTest(1000);

        //Click on Create account
        test1Page.createAccount.click();
        sleepTest(2000);

        // Checking Account Created Text Availability
        String accountCreatedTxt = test1Page.accountCreatedText.getText();
        Assert.assertEquals(accountCreatedTxt, Data.ACCOUNT_CREATED_TEXT);
        System.out.println("ACCOUNT CREATED available");
        sleepTest(2000);

        //Click on CONTINUE Button
        test1Page.continueButton.click();
        sleepTest(2000);

        String loggedInTxt = test1Page.loggedInText.getText();
        Assert.assertTrue(Data.LOGGED_IN_TEXT.contains(loggedInTxt));
        System.out.println("Logged in Text is available");
        sleepTest(2000);


        //Checking Delete Account Text availability
        String delAccText = test1Page.deleteAccount.getText();
        Assert.assertEquals(delAccText, Data.DELETE_ACCOUNT_TEXT);
        sleepTest(2000);

        //Click Delete Account
        test1Page.deleteAccount.click();
        sleepTest(2000);

        //Checking Delete Account Url
        String deleteAccountUrl = wd.getCurrentUrl();
        Assert.assertEquals(deleteAccountUrl, Data.DELETE_ACCOUNT_URL);
        sleepTest(2000);

        //Checking Account Delete text
        String deleteAccountText = test1Page.delAccTxt.getText();
        Assert.assertEquals(deleteAccountText, Data.DELETED_ACCOUNT_TEXT);
        sleepTest(1000);
        test1Page.delAccContinueBtn.click();

        Assert.assertTrue(aelp.signUpLogInButton.isDisplayed());

       }

    }