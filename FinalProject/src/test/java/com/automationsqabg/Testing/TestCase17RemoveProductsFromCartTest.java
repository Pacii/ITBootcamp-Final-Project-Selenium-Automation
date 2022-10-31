package com.automationsqabg.Testing;

import com.automationsqabg.Pages.LandingPage;
import com.automationsqabg.Pages.TestCase17RemoveProductsFromCartPage;
import com.automationsqabg.Utility.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase17RemoveProductsFromCartTest extends BaseClass {

    @Test
    public void testCase17RemoveProductsFromCartTesting() {

        LandingPage aelp = new LandingPage(wd);
        TestCase17RemoveProductsFromCartPage test17Page = new TestCase17RemoveProductsFromCartPage(wd);

//        3. Verify that home page is visible successfully
        if (test17Page.homePageSlider.isDisplayed()) {
            System.out.println("You are at home page.");
        }

        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

        if (test17Page.homePageSlider.isDisplayed()) {
            String homePageUrl = wd.getCurrentUrl();
            Assert.assertEquals(homePageUrl, Data.BASE_URL);
            System.out.println(homePageUrl + " You are watching home page url. ");
        }

        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

        JavascriptExecutor je = (JavascriptExecutor) wd;
        je.executeScript("window.scrollBy (0,1000)");

        test17Page.viewProductButton.click();
        sleepTest(2500);

//        4. Add products to cart
        test17Page.addToCartButton.click();
        sleepTest(1500);
        test17Page.addToCartPageContinueShopping.click();
        sleepTest(1500);

//        5. Click 'Cart' button
        test17Page.cartButton.click();
        sleepTest(1500);

//        6. Verify that cart page is displayed
        if (test17Page.shoppingCartText.isDisplayed()) {
            System.out.println("You are at " + Data.SHOPPING_CART_PAGE_TEXT + " page");
        }

        else {
            System.out.println(Data.ERROR_MESSAGE);
        }

        String shoppingCartPageUrl = wd.getCurrentUrl();
        Assert.assertEquals(shoppingCartPageUrl, Data.SHOPPING_CART_PAGE_URL);
        System.out.println("As URL match, so you are at " + Data.SHOPPING_CART_PAGE_TEXT);
        sleepTest(1500);

//        7. Click 'X' button corresponding to particular product
        test17Page.productRemoveButton.click();
        sleepTest(1500);

//        8. Verify that product is removed from the cart
        String  productRemovedTxt = test17Page.productRemovedText.getText();
        Assert.assertEquals(productRemovedTxt, Data.PRODUCT_REMOVED_TEXT);
        System.out.println(productRemovedTxt);
        sleepTest(2500);

    }
}
