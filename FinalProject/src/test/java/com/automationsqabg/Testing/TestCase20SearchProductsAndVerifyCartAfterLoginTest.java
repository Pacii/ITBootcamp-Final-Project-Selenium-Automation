package com.automationsqabg.Testing;

import com.automationsqabg.Pages.LandingPage;
import com.automationsqabg.Utility.Data;
import com.automationsqabg.Pages.TestCase20SearchProductsAndVerifyCartAfterLoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCase20SearchProductsAndVerifyCartAfterLoginTest extends BaseClass {

    @Test
    public void testCase20SearchProductsAndVerifyCartAfterLoginTesting() {

        LandingPage aelp = new LandingPage(wd);
        TestCase20SearchProductsAndVerifyCartAfterLoginPage test20Page = new TestCase20SearchProductsAndVerifyCartAfterLoginPage(wd);

//        3. Click on 'Products' button
        aelp.productsButton.click();
        sleepTest(1500);

//        4. Verify user is navigated to ALL PRODUCTS page successfully
        String productPageUrl = wd.getCurrentUrl();
        Assert.assertEquals(productPageUrl, Data.PRODUCTS_PAGE_URL);
        sleepTest(1500);
        System.out.println(productPageUrl);

//        5. Enter product name in search input and click search button
        test20Page.searchBox.sendKeys(Data.SEARCH_TEXT_ONE);
        sleepTest(2500);

        test20Page.searchIcon.click();
        sleepTest(1500);

//        6. Verify 'SEARCHED PRODUCTS' is visible

        JavascriptExecutor jse = (JavascriptExecutor) wd;
        jse.executeScript("window.scrollBy(0,500)");
        sleepTest(3000);

        // MOUSE HOVER
        Actions builder = new Actions(wd);

        builder.moveToElement(test20Page.mouseHoverOverSleevelessDressName).build().perform();
        sleepTest(4000);

        String sleevelessDressTxt = test20Page.mouseHoverSleevelessDressText.getText();
        Assert.assertEquals(sleevelessDressTxt, Data.SEARCH_TEXT_ONE);
        System.out.println(sleevelessDressTxt);
        sleepTest(4000);
        System.out.println("MOUSE HOVER WORKED");


//        7. Add those products to cart

        test20Page.addToCartButton.click();
        sleepTest(1500);

        test20Page.continueShopping.click();
        sleepTest(1500);

//        8. Click 'Cart' button and verify that products are visible in cart
        test20Page.cartButton.click();
        sleepTest(1500);

        String productVisibilityText = test20Page.productVisibility.getText();
        Assert.assertEquals(productVisibilityText, Data.SEARCH_TEXT_ONE);
        sleepTest(1500);
        System.out.println(productVisibilityText + " is displaying.");

//        9. Click 'Signup / Login' button and submit login details
        aelp.signUpLogInButton.click();
        sleepTest(1500);

        aelp.loginEmailAddress.sendKeys(Data.SIGNUP_EMAIL);
        sleepTest(1500);

        aelp.loginPassword.sendKeys(Data.LOGIN_PASSWORD_INPUT);
        sleepTest(1500);

        aelp.loginButton.click();
        sleepTest(1500);

//        10. Again, go to Cart page
        aelp.homeCartButton.click();
        sleepTest(1500);

//        11. Verify that those products are visible in cart after login as well
        String productVisibilityText1 = test20Page.productVisibility.getText();
        Assert.assertEquals(productVisibilityText1, Data.SEARCH_TEXT_ONE);
        sleepTest(1500);
        System.out.println(productVisibilityText1 + " is displaying.");
    }
}
