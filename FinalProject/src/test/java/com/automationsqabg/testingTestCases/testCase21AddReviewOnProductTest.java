package com.automationsqabg.testingTestCases;

import com.automationsqabg.paths.automationExerciseLandingPage;
import com.automationsqabg.paths.testCase21AddReviewOnProductPage;
import com.automationsqabg.dataPackage.data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase21AddReviewOnProductTest extends baseClass{

    @Test
    public void testCase21AddReviewOnProductTesting() {

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase21AddReviewOnProductPage test21Page = new testCase21AddReviewOnProductPage (wd);

//        3. Click on 'Products' button
        aelp.productsButton.click();
        sleepTest(1500);

//        4. Verify user is navigated to ALL PRODUCTS page successfully
        String allProductsTxt = test21Page.allProductsText.getText();
        Assert.assertEquals(allProductsTxt, data.ALL_PRODUCTS_TEXT);
        sleepTest(1500);
        System.out.println();
        System.out.println(allProductsTxt + " is displaying");
        System.out.println();

        JavascriptExecutor jse = (JavascriptExecutor) wd;
        jse.executeScript("window.scrollBy(0,500)");
        sleepTest(1000);

//        5. Click on 'View Product' button
        aelp.viewProduct.click();
        sleepTest(1500);

//        6. Verify 'Write Your Review' is visible
        String writeYourReviewTxt = test21Page.writeYourReviewText.getText();
        Assert.assertEquals(writeYourReviewTxt, data.WRITE_YOUR_REVIEW_TEXT);
        sleepTest(1500);
        System.out.println();
        System.out.println(writeYourReviewTxt + " is displaying");
        System.out.println();

        jse.executeScript("window.scrollBy(0,500)");
        sleepTest(5000);

//        7. Enter name, email and review
        test21Page.writeYourReviewTextNameInput.sendKeys(data.WRITE_YOUR_REVIEW_TEXT_NAME_INPUT);
        sleepTest(1500);

        if (test21Page.writeYourReviewTextEmailAddressInput.isDisplayed()) {
            test21Page.writeYourReviewTextEmailAddressInput.sendKeys(data.WRITE_YOUR_REVIEW_TEXT_WRONG_EMAIL_ADDRESS_INPUT);
            sleepTest(2500);
        }

        else {
            System.out.println(data.ERROR_MESSAGE);
        }

        test21Page.writeYourReviewTextInput.sendKeys(data.WRITE_YOUR_REVIEW_TEXT_INPUT);
        sleepTest(1500);

        test21Page.writeYourReviewTextSubmit.click();
        sleepTest(1500);



        test21Page.writeYourReviewTextNameInput.clear();
        sleepTest(2500);
        test21Page.writeYourReviewTextNameInput.sendKeys(data.WRITE_YOUR_REVIEW_TEXT_NAME_INPUT);
        sleepTest(1500);

        if (test21Page.writeYourReviewTextEmailAddressInput.isDisplayed()) {
            test21Page.writeYourReviewTextEmailAddressInput.clear();
            sleepTest(2500);
            test21Page.writeYourReviewTextEmailAddressInput.sendKeys(data.WRITE_YOUR_REVIEW_TEXT_EMAIL_ADDRESS_INPUT);
            sleepTest(1500);
        }

        else {
            System.out.println(data.ERROR_MESSAGE);
        }

        test21Page.writeYourReviewTextInput.clear();
        sleepTest(2500);
        test21Page.writeYourReviewTextInput.sendKeys(data.WRITE_YOUR_REVIEW_TEXT_INPUT);
        sleepTest(1500);

//        8. Click 'Submit' button
        test21Page.writeYourReviewTextSubmit.click();
        sleepTest(1500);

//        9. Verify success message 'Thank you for your review.'
//        AS ALERT IS DISAPPEARING FAST, AVOID THIS.

    }
}
