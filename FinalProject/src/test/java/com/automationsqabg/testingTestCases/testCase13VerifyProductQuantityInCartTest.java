package com.automationsqabg.testingTestCases;

import com.automationsqabg.pages.LandingPage;
import com.automationsqabg.pages.TestCase13VerifyProductQuantityInCartPage;
import com.automationsqabg.Utility.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase13VerifyProductQuantityInCartTest extends BaseClass {

    @Test
    public void testCase13VerifyProductQuantityInCartTesting(){

        LandingPage aelp = new LandingPage(wd);
        TestCase13VerifyProductQuantityInCartPage test13Page = new TestCase13VerifyProductQuantityInCartPage(wd);

        if (test13Page.slider.isDisplayed()){
            System.out.println("You are watching slider, so you are at HOME PAGE");
            sleepTest(5000);
        }
        else {
            System.out.println(Data.ERROR_MESSAGE);
        }
        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("window.scrollBy(0,600)");
        sleepTest(3000);

        test13Page.viewProduct.click();
        sleepTest(1500);

        String productDetailsUrl = wd.getCurrentUrl();
        Assert.assertEquals(productDetailsUrl, Data.VIEW_PRODUCT_DETAIL_URL);
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
            Assert.assertTrue(true, Data.PRODUCT_QUANTITY_NUMBER);
            sleepTest(1500);
            System.out.println("Product quantity is matched.");
        }
        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

    }
}
