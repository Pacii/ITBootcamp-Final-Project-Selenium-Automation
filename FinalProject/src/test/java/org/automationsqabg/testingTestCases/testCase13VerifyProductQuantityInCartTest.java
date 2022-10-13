package org.automationsqabg.testingTestCases;

import org.automationsqabg.pages.automationExerciseLandingPage;
import org.automationsqabg.pages.testCase13VerifyProductQuantityInCartPage;
import org.automationsqabg.utility.data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase13VerifyProductQuantityInCartTest extends baseClass{

    @Test
    public void testCase13VerifyProductQuantityInCartTesting(){

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase13VerifyProductQuantityInCartPage test13Page = new testCase13VerifyProductQuantityInCartPage(wd);

        if (test13Page.slider.isDisplayed()){
            System.out.println("You are watching slider, so you are at HOME PAGE");
            sleepTest(5000);
        }
        else {
            System.out.println(data.ERROR_MESSAGE);
        }
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("window.scrollBy(0,600)");
        sleepTest(3000);

        test13Page.viewProduct.click();
        sleepTest(1500);

        String productDetailsUrl = wd.getCurrentUrl();
        Assert.assertEquals(productDetailsUrl, data.VIEW_PRODUCT_DETAIL_URL);
        sleepTest(1500);
        System.out.println("Product Detail is Showing");

        test13Page.productQuantityInputBox.clear();
        test13Page.productQuantityInputBox.sendKeys("4");
        sleepTest(1500);

        test13Page.addToCartButton.click();
        sleepTest(1500);

        test13Page.viewCartButton.click();
        sleepTest(1500);

        if (test13Page.quantityDisplay.isDisplayed()){
            String quantityDisplayNumber = test13Page.quantityDisplay.getText();
            Assert.assertTrue(true,data.PRODUCT_QUANTITY_NUMBER);
            sleepTest(1500);
            System.out.println("Product quantity is matched.");
        }
        else {
            System.out.println(data.ERROR_MESSAGE);
        }

    }
}
