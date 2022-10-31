package com.automationsqabg.Testing;

import com.automationsqabg.Pages.LandingPage;
import com.automationsqabg.Pages.TestCase9SearchProductPage;
import com.automationsqabg.Utility.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase9SearchProductTest extends BaseClass {

    @Test
    public void testCase9SearchProductTesting() {

        LandingPage aelp = new LandingPage(wd);
        TestCase9SearchProductPage test9Page = new TestCase9SearchProductPage(wd);

        aelp.productsButton.click();
        sleepTest(1500);

        String productsPageUrl = wd.getCurrentUrl();
        Assert.assertEquals(productsPageUrl, Data.PRODUCTS_PAGE_URL);
        sleepTest(1500);
        System.out.println("Product Page URL Matched");

        String productsTxt = aelp.productsButton.getText();
        Assert.assertTrue(true, Data.PRODUCTS_TEXT);
        sleepTest(1500);
        System.out.println(productsTxt + " is showing.");

        test9Page.searchBox.sendKeys(Data.SEARCH_TEXT);
        sleepTest(1500);

        test9Page.searchButton.click();
        sleepTest(1500);

        JavascriptExecutor je = (JavascriptExecutor) wd;
        je.executeScript("window.scrollBy (0,500)");

        String searchProductsTxt = test9Page.searchProductsText.getText();
        Assert.assertTrue(true, Data.SEARCH_PRODUCTS_TEXT);
        sleepTest(1500);
        System.out.println(searchProductsTxt+" is showing");

        String productNameTxt = test9Page.productNameText.getText();
        Assert.assertTrue(true, Data.PRODUCT_NAME_TEXT);
        sleepTest(1500);
        System.out.println(productNameTxt + " is showing");

    }
}
