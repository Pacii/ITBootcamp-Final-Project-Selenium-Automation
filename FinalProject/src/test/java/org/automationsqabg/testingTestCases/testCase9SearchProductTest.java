package org.automationsqabg.testingTestCases;

import org.automationsqabg.pages.automationExerciseLandingPage;
import org.automationsqabg.pages.testCase9SearchProductPage;
import org.automationsqabg.utility.data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase9SearchProductTest extends baseClass{

    @Test
    public void testCase9SearchProductTesting() {

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase9SearchProductPage test9Page = new  testCase9SearchProductPage (wd);

        aelp.productsButton.click();
        sleepTest(1500);

        String productsPageUrl = wd.getCurrentUrl();
        Assert.assertEquals(productsPageUrl, data.PRODUCTS_PAGE_URL);
        sleepTest(1500);
        System.out.println("Product Page URL Matched");

        String productsTxt = aelp.productsButton.getText();
        Assert.assertTrue(true, data.PRODUCTS_TEXT);
        sleepTest(1500);
        System.out.println(productsTxt + " is showing.");

        test9Page.searchBox.sendKeys(data.SEARCH_TEXT);
        sleepTest(1500);

        test9Page.searchButton.click();
        sleepTest(1500);

        JavascriptExecutor je = (JavascriptExecutor) wd;
        je.executeScript("window.scrollBy (0,500)");

        String searchProductsTxt = test9Page.searchProductsText.getText();
        Assert.assertTrue(true,data.SEARCH_PRODUCTS_TEXT);
        sleepTest(1500);
        System.out.println(searchProductsTxt+" is showing");

        String productNameTxt = test9Page.productNameText.getText();
        Assert.assertTrue(true, data.PRODUCT_NAME_TEXT);
        sleepTest(1500);
        System.out.println(productNameTxt + " is showing");

    }
}
