package com.automationsqabg.testingTestCases;

import com.automationsqabg.paths.automationExerciseLandingPage;
import com.automationsqabg.paths.testCase22AddToCartFromRecommendedItemsPage;
import com.automationsqabg.dataPackage.data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase22AddToCartFromRecommendedItemsTest extends baseClass{

    @Test
    public void testCase22AddToCartFromRecommendedItemsTesting() {

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase22AddToCartFromRecommendedItemsPage test22Page = new testCase22AddToCartFromRecommendedItemsPage(wd);

//        3. Scroll to bottom of page
        JavascriptExecutor jse = (JavascriptExecutor) wd;
        jse.executeScript("window.scrollBy(0,7400)");
        sleepTest(2500);

//        4. Verify 'RECOMMENDED ITEMS' are visible
        String recommendedItemsTxt = test22Page.recommendedItemsText.getText();
        Assert.assertEquals(recommendedItemsTxt, data.RECOMMENDED_ITEMS_TEXT);
        sleepTest(1500);
        System.out.println();
        System.out.println(recommendedItemsTxt + " is displaying.");

//        5. Click on 'Add To Cart' on Recommended product
        test22Page.stylishDressAddToCartButton.click();
        sleepTest(1500);

//        6. Click on 'View Cart' button
        aelp.viewCart.click();
        sleepTest(1500);

//        7. Verify that product is displayed in cart page
        if (test22Page.stylishDressDisplayText.isDisplayed()) {
            String stylishDressDisplayTxt = test22Page.stylishDressDisplayText.getText();
            Assert.assertEquals(stylishDressDisplayTxt, data.STYLISH_DRESS_TEXT);
            sleepTest(1500);
            System.out.println();
            System.out.println(stylishDressDisplayTxt + " is showing.");
        }

        else {
            System.out.println(data.ERROR_MESSAGE);
        }
    }
}
