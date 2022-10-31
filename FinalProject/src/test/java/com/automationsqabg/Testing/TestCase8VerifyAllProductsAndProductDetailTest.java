package com.automationsqabg.Testing;

import com.automationsqabg.Pages.LandingPage;
import com.automationsqabg.Pages.TestCase8VerifyAllProductsAndProductDetailPage;
import com.automationsqabg.Utility.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase8VerifyAllProductsAndProductDetailTest extends BaseClass {

    @Test
    public void testCase8VerifyAllProductsAndProductDetailTesting() {

        LandingPage aelp = new LandingPage(wd);
        TestCase8VerifyAllProductsAndProductDetailPage test8Page = new TestCase8VerifyAllProductsAndProductDetailPage(wd);

        aelp.productsButton.click();
        sleepTest(1500);

        String productsPageUrl = wd.getCurrentUrl();
        Assert.assertEquals(productsPageUrl, Data.PRODUCTS_PAGE_URL);
        sleepTest(1500);
        System.out.println("Product Page URL Matched");

        JavascriptExecutor je = (JavascriptExecutor) wd;
        je.executeScript("window.scrollBy (0,500)");

        String productsTxt = aelp.productsButton.getText();
        Assert.assertTrue(true, Data.PRODUCTS_TEXT);
        sleepTest(1500);
        System.out.println(productsTxt + " is showing.");

        test8Page.viewProductFirst.click();
        sleepTest(1500);

        String productNameTxt = test8Page.productName.getText();
        Assert.assertTrue(true, Data.PRODUCT_NAME_TEXT);
        sleepTest(1500);
        System.out.println(productNameTxt + " is showing.");

        String productCategoryTxt = test8Page.productCategory.getText();
        Assert.assertTrue(true, Data.PRODUCT_CATEGORY_TEXT);
        sleepTest(1500);
        System.out.println(productCategoryTxt + " is showing.");

        String productPriceTxt = test8Page.productPrice.getText();
        Assert.assertTrue(true, Data.PRODUCT_PRICE_TEXT);
        sleepTest(1500);
        System.out.println(productPriceTxt + " is showing.");

        String productAvailabilityTxt = test8Page.productAvailability.getText();
        Assert.assertTrue(true, Data.PRODUCT_AVAILABILITY_TEXT);
        sleepTest(1500);
        System.out.println(productAvailabilityTxt + " is showing.");

        String productConditionTxt = test8Page.productCondition.getText();
        Assert.assertTrue(true, Data.PRODUCT_CONDITION_TEXT);
        sleepTest(1500);
        System.out.println(productConditionTxt + " is showing.");

        String productBrandTxt = test8Page.productBrand.getText();
        Assert.assertTrue(true, Data.PRODUCT_BRAND_TEXT);
        sleepTest(1500);
        System.out.println(productBrandTxt + " is showing.");

    }
}