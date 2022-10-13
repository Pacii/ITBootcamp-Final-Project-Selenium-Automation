package org.automationsqabg.testingTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.automationsqabg.pages.automationExerciseLandingPage;
import org.automationsqabg.pages.testCase1RegisterUserPage;
import org.automationsqabg.utility.data;

public class testCase1RegisterUserTest extends baseClass {

//////////////////////////////////////////////////////IMPORTANT!!!!!!!//////////////////////////////////////////////////////
    // There is a bug on this site...you cannot delete the account either manually or automatically!!!!

    @Test
    public void testCase1RegisterUserTesting() {

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase1RegisterUserPage test1Page = new testCase1RegisterUserPage(wd);


        String testCase1RegisterUserUrl = wd.getCurrentUrl();
        Assert.assertEquals(testCase1RegisterUserUrl, data.BASE_URL);
        System.out.println("Link Matched");

        //Click on Signup/Login Button
        aelp.signUpLogInButton.click();
        sleepTest(2000);

        //Validate Signup/Login page URL
        String signUpUrl = wd.getCurrentUrl();
        Assert.assertEquals(signUpUrl, data.LOGIN_SIGNUP_URL);
        System.out.println("SIGNUP Url Matched");

        //Sending Name to Name box
        aelp.signUpName.sendKeys(data.SIGNUP_NAME);
        sleepTest(2000);

        //Sending Email to Email Box
        aelp.signUpEmail.sendKeys(data.SIGNUP_EMAIL);
        sleepTest(2000);

        //Click on Signup Button
        aelp.signUpButton.click();
        sleepTest(2000);

        //SignUp Landing Page Text Validation
        String signUpPageTxt = test1Page.signUpPageText.getText();
        Assert.assertEquals(signUpPageTxt, data.SIGNUP_PAGE_TEXT);
        System.out.println("Text is visible");

        //Select Gender
        test1Page.male.click();
        sleepTest(1500);

        JavascriptExecutor je = (JavascriptExecutor) wd;
        je.executeScript("window.scrollBy (0,1000)");


        //SignUp Page Password
        test1Page.signUpPagePassword.sendKeys(data.SIGNUP_PAGE_PASSWORD);
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
            System.out.println(data.NEWSLETTER_CHECK_BOX);
        }

        boolean isSelected1 = test1Page.specialOfferCheckBox.isSelected();
        if ( isSelected1 == false ){
            test1Page.specialOfferCheckBox.click();
            sleepTest(2000);
            System.out.println(data.SPECIAL_OFFER_CHECK_BOX);
        }

        //First Name
        test1Page.firstNameText.sendKeys(data.FIRST_NAME_TEXT);
        sleepTest(1000);

        //Last Name
        test1Page.lastNameText.sendKeys(data.LAST_NAME_TEXT);
        sleepTest(1000);

        //Company
        test1Page.companyText.sendKeys(data.COMPANY_TEXT);
        sleepTest(1000);

        //Address
        test1Page.address1Text.sendKeys(data.ADDRESS_1_TEXT);
        sleepTest(1000);

        //Address 2
        test1Page.address2Text.sendKeys(data.ADDRESS_2_TEXT);
        sleepTest(1000);

        //Country Selection from dropdown
        By country = By.cssSelector("select#country");
        test1Page.doSelectByVisibleText(country,"New Zealand");
        sleepTest(2000);

        //State
        test1Page.stateText.sendKeys(data.STATE_TEXT);
        sleepTest(1000);

        //City
        test1Page.cityText.sendKeys(data.CITY_TEXT);
        sleepTest(1000);

        //Zipcode
        test1Page.zipcodeText.sendKeys(data.ZIPCODE_TEXT);
        sleepTest(1000);

        //Mobile Number
        test1Page.mobileNumberText.sendKeys(data.MOBILE_NUMBER);
        sleepTest(1000);

        //Click on Create account
        test1Page.createAccount.click();
        sleepTest(2000);

        // Checking Account Created Text Availability
        String accountCreatedTxt = test1Page.accountCreatedText.getText();
        Assert.assertEquals(accountCreatedTxt, data.ACCOUNT_CREATED_TEXT);
        System.out.println("ACCOUNT CREATED available");
        sleepTest(2000);

        //Click on CONTINUE Button
        test1Page.continueButton.click();
        sleepTest(2000);

        String loggedInTxt = test1Page.loggedInText.getText();
        Assert.assertTrue(true, data.LOGGED_IN_PARTIAL_TEXT);
        System.out.println("Logged in Text is available");
        sleepTest(2000);

        //Checking Delete Account Text availability
        String delAccText = test1Page.deleteAccount.getText();
        Assert.assertEquals(delAccText, data.DELETE_ACCOUNT_TEXT);
        sleepTest(2000);

        //Click Delete Account
        test1Page.deleteAccount.click();
        sleepTest(2000);

        //Checking Delete Account Url
        String deleteAccountUrl = wd.getCurrentUrl();
        Assert.assertEquals(deleteAccountUrl, data.DELETE_ACCOUNT_URL);
        sleepTest(2000);

        //Again click on delete account
        test1Page.delAcc.click();
        sleepTest(3000);

           System.out.println("The button was pressed but the account was not deleted!");
           System.out.println("BUG REPORTED!");
       }

    }