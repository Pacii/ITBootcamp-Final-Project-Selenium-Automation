package com.automationsqabg.testingTestCases;

import com.automationsqabg.paths.automationExerciseLandingPage;
import com.automationsqabg.paths.testCase8VerifyAllProductsAndProductDetailPage;
import com.automationsqabg.dataPackage.data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase8VerifyAllProductsAndProductDetailTest extends baseClass{

    @Test
    public void testCase8VerifyAllProductsAndProductDetailTesting() {

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase8VerifyAllProductsAndProductDetailPage test8Page = new  testCase8VerifyAllProductsAndProductDetailPage (wd);

        aelp.productsButton.click();
        sleepTest(1500);

        String productsPageUrl = wd.getCurrentUrl();
        Assert.assertEquals(productsPageUrl, data.PRODUCTS_PAGE_URL);
        sleepTest(1500);
        System.out.println("Product Page URL Matched");

        JavascriptExecutor je = (JavascriptExecutor) wd;
        je.executeScript("window.scrollBy (0,500)");

        String productsTxt = aelp.productsButton.getText();
        Assert.assertTrue(true, data.PRODUCTS_TEXT);
        sleepTest(1500);
        System.out.println(productsTxt + " is showing.");

        test8Page.viewProductFirst.click();
        sleepTest(1500);

        String productNameTxt = test8Page.productName.getText();
        Assert.assertTrue(true, data.PRODUCT_NAME_TEXT);
        sleepTest(1500);
        System.out.println(productNameTxt + " is showing.");

        String productCategoryTxt = test8Page.productCategory.getText();
        Assert.assertTrue(true, data.PRODUCT_CATEGORY_TEXT);
        sleepTest(1500);
        System.out.println(productCategoryTxt + " is showing.");

        String productPriceTxt = test8Page.productPrice.getText();
        Assert.assertTrue(true, data.PRODUCT_PRICE_TEXT);
        sleepTest(1500);
        System.out.println(productPriceTxt + " is showing.");

        String productAvailabilityTxt = test8Page.productAvailability.getText();
        Assert.assertTrue(true, data.PRODUCT_AVAILABILITY_TEXT);
        sleepTest(1500);
        System.out.println(productAvailabilityTxt + " is showing.");

        String productConditionTxt = test8Page.productCondition.getText();
        Assert.assertTrue(true, data.PRODUCT_CONDITION_TEXT);
        sleepTest(1500);
        System.out.println(productConditionTxt + " is showing.");

        String productBrandTxt = test8Page.productBrand.getText();
        Assert.assertTrue(true, data.PRODUCT_BRAND_TEXT);
        sleepTest(1500);
        System.out.println(productBrandTxt + " is showing.");

    }
}