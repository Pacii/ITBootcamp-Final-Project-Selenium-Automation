package com.automationsqabg.testingTestCases;

import com.automationsqabg.pages.LandingPage;
import com.automationsqabg.pages.TestCase19ViewAndCartBrandProductsPage;
import com.automationsqabg.Utility.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase19ViewAndCartBrandProductsTest extends BaseClass {

    @Test
    public void testCase19ViewAndCartBrandProductsTesting() {

        LandingPage aelp = new LandingPage(wd);
        TestCase19ViewAndCartBrandProductsPage test19Page = new TestCase19ViewAndCartBrandProductsPage(wd);

        String homePageUrl = wd.getCurrentUrl();
        Assert.assertEquals(homePageUrl, Data.BASE_URL);
        sleepTest(2000);
        System.out.println(homePageUrl + "\n");
        System.out.println("You are at home page.");

        test19Page.productsButton.click();
        sleepTest(2500);

        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("window.scrollBy(0,1200)");
        sleepTest(1000);

//        5. Click on any brand name
        test19Page.poloBrandButton.click();
        sleepTest(1500);

//        6. Verify that user is navigated to brand page and brand products are displayed
        String poloProductsPageUrl = wd.getCurrentUrl();
        Assert.assertEquals(poloProductsPageUrl, Data.POLO_BRAND_PAGE_URL);
        sleepTest(1500);
        System.out.println(poloProductsPageUrl + "\n");

        String poloProductsTxt = test19Page.poloBrandProductsText.getText();
        Assert.assertEquals(poloProductsTxt, Data.POLO_BRAND_PRODUCTS_TEXT);
        sleepTest(1500);
        System.out.println(poloProductsTxt + "\n");
        System.out.println("You are watching " + poloProductsTxt + "\n");

        js.executeScript("window.scrollBy(0,400)");
        sleepTest(1000);

//        7. On left side bar, click on any other brand link
        test19Page.madameBrandButton.click();
        sleepTest(1500);

//        8. Verify that user is navigated to that brand page and can see products
        String madameProductsPageUrl = wd.getCurrentUrl();
        Assert.assertEquals(madameProductsPageUrl, Data.MADAME_BRAND_PAGE_URL);
        sleepTest(1500);
        System.out.println(madameProductsPageUrl + "\n");

        String madameProductsTxt = test19Page.madameBrandsProductsText.getText();
        Assert.assertEquals(madameProductsTxt, Data.MADAME_BRAND_PRODUCTS_TEXT);
        sleepTest(1500);
        System.out.println(madameProductsTxt + "\n");
        System.out.println("You are watching " + madameProductsTxt + "\n");
    }
}
