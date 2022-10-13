package org.automationsqabg.testingTestCases;

import org.automationsqabg.pages.automationExerciseLandingPage;
import org.automationsqabg.pages.testCase19ViewAndCartBrandProductsPage;
import org.automationsqabg.utility.data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase19ViewAndCartBrandProductsTest extends baseClass{

    @Test
    public void testCase19ViewAndCartBrandProductsTesting() {

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase19ViewAndCartBrandProductsPage test19Page = new testCase19ViewAndCartBrandProductsPage(wd);

        String homePageUrl = wd.getCurrentUrl();
        Assert.assertEquals(homePageUrl, data.BASE_URL);
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
        Assert.assertEquals(poloProductsPageUrl, data.POLO_BRAND_PAGE_URL);
        sleepTest(1500);
        System.out.println(poloProductsPageUrl + "\n");

        String poloProductsTxt = test19Page.poloBrandProductsText.getText();
        Assert.assertEquals(poloProductsTxt, data.POLO_BRAND_PRODUCTS_TEXT);
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
        Assert.assertEquals(madameProductsPageUrl, data.MADAME_BRAND_PAGE_URL);
        sleepTest(1500);
        System.out.println(madameProductsPageUrl + "\n");

        String madameProductsTxt = test19Page.madameBrandsProductsText.getText();
        Assert.assertEquals(madameProductsTxt, data.MADAME_BRAND_PRODUCTS_TEXT);
        sleepTest(1500);
        System.out.println(madameProductsTxt + "\n");
        System.out.println("You are watching " + madameProductsTxt + "\n");
    }
}
