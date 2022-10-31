package com.automationsqabg.Testing;

import com.automationsqabg.Pages.LandingPage;
import com.automationsqabg.Pages.TestCase18ViewCategoryProductsPage;
import com.automationsqabg.Utility.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase18ViewCategoryProductsTest extends BaseClass {

    @Test
    public void testCase18ViewCategoryProductsTesting() {

        LandingPage aelp = new LandingPage(wd);
        TestCase18ViewCategoryProductsPage test18Page = new TestCase18ViewCategoryProductsPage(wd);

        JavascriptExecutor je = (JavascriptExecutor) wd;
        je.executeScript("window.scrollBy (0,700)");

//        3. Verify that categories are visible on left side bar
        if (test18Page.categoryText.isDisplayed()) {
            String categoryTxt = test18Page.categoryText.getText();
            Assert.assertEquals(categoryTxt, Data.CATEGORY_TEXT);
            System.out.println("\n"+categoryTxt+"\n");
            sleepTest(1500);
        }

        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

//        4. Click on 'Women' category
        test18Page.womenCategory.click();
        sleepTest(1500);

//        5. Click on any category link under 'Women' category, for example: Dress
        test18Page.womenCategorySubCategoryTops.click();
        sleepTest(1500);

//        6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'

        if (test18Page.womenTopsProductsText.isDisplayed()){
            String womenTopsProductsTxt = test18Page.womenTopsProductsText.getText();
            Assert.assertEquals(womenTopsProductsTxt, Data.WOMEN_TOPS_PRODUCTS_TEXT);
            System.out.println(womenTopsProductsTxt+"\n");
            sleepTest(1500);
        }

        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

//        7. On left side bar, click on any sub-category link of 'Men' category

        test18Page.menCategory.click();
        sleepTest(1500);

//        8. Verify that user is navigated to that category page
        test18Page.menCategorySubCategoryJeans.click();
        sleepTest(1500);

        if (test18Page.menJeansProductsText.isDisplayed()){
            String menJeansProductsTxt = test18Page.menJeansProductsText.getText();
            Assert.assertEquals(menJeansProductsTxt, Data.MEN_JEANS_PRODUCTS_TEXT);
            System.out.println(menJeansProductsTxt+"\n");
            sleepTest(1500);
        }

        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

    }
}
