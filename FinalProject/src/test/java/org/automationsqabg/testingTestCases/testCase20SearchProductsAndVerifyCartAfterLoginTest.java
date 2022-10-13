package org.automationsqabg.testingTestCases;

import org.automationsqabg.pages.automationExerciseLandingPage;
import org.automationsqabg.pages.testCase20SearchProductsAndVerifyCartAfterLoginPage;
import org.automationsqabg.utility.data;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class testCase20SearchProductsAndVerifyCartAfterLoginTest extends baseClass{

    @Test
    public void testCase20SearchProductsAndVerifyCartAfterLoginTesting() {

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase20SearchProductsAndVerifyCartAfterLoginPage test20Page = new testCase20SearchProductsAndVerifyCartAfterLoginPage(wd);

//        3. Click on 'Products' button
        aelp.productsButton.click();
        sleepTest(1500);

//        4. Verify user is navigated to ALL PRODUCTS page successfully
        String productPageUrl = wd.getCurrentUrl();
        Assert.assertEquals(productPageUrl, data.PRODUCTS_PAGE_URL);
        sleepTest(1500);
        System.out.println(productPageUrl);

//        5. Enter product name in search input and click search button
        test20Page.searchBox.sendKeys(data.SEARCH_TEXT_ONE);
        sleepTest(2500);

        test20Page.searchIcon.click();
        sleepTest(1500);

//        6. Verify 'SEARCHED PRODUCTS' is visible

        JavascriptExecutor jse = (JavascriptExecutor) wd;
        jse.executeScript("window.scrollBy(0,500)");
        sleepTest(5000);

//        WebElement mouseHoverOverSleevelessDressName = driver.findElement(By.xpath("/html/body/section[2]/div[@class='container']/div[@class='row']//div[@class='single-products']/div[2]"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(mouseHoverOverSleevelessDressName);
//        sleepTest(5000);
//        System.out.println("MOUSE HOVER WORKED");

        // MOUSE HOVER
        // https://stackoverflow.com/questions/17293914/how-to-perform-mouseover-function-in-selenium-webdriver-using-java
        Actions builder = new Actions(wd);
//        WebElement element = tcspavcalp.mouseHoverOverSleevelessDressName;
//        WebElement element = driver.findElement(By.xpath("/html/body/section[2]/div[@class='container']/div[@class='row']//div[@class='single-products']/div[2]"));
        builder.moveToElement(test20Page.mouseHoverOverSleevelessDressName).build().perform();
        sleepTest(5000);

        String sleevelessDressTxt = test20Page.mouseHoverSleevelessDressText.getText();
        Assert.assertEquals(sleevelessDressTxt, data.SEARCH_TEXT_ONE);
        System.out.println(sleevelessDressTxt);
        sleepTest(5000);
        System.out.println("MOUSE HOVER WORKED");

//        7. Verify all the products related to search are visible=> What happened if I search through "top"
//        Multiple tops are appearing & Should I verify them 1 by 1

//        8. Add those products to cart
        test20Page.viewProduct.click();
        sleepTest(1500);

        test20Page.addToCartButton.click();
        sleepTest(1500);

        test20Page.continueShopping.click();
        sleepTest(1500);

//        9. Click 'Cart' button and verify that products are visible in cart
        test20Page.cartButton.click();
        sleepTest(1500);

        String productVisibilityText = test20Page.productVisibility.getText();
        Assert.assertEquals(productVisibilityText, data.SEARCH_TEXT_ONE);
        sleepTest(1500);
        System.out.println(productVisibilityText + " is displaying.");

//        10. Click 'Signup / Login' button and submit login details
        aelp.signUpLogInButton.click();
        sleepTest(1500);

        aelp.loginEmailAddress.sendKeys(data.LOGIN_EMAIL_ADDRESS_INPUT);
        sleepTest(1500);

        aelp.loginPassword.sendKeys(data.LOGIN_PASSWORD_INPUT);
        sleepTest(1500);

        aelp.loginButton.click();
        sleepTest(1500);

//        11. Again, go to Cart page
        aelp.homeCartButton.click();
        sleepTest(1500);

//        12. Verify that those products are visible in cart after login as well
        String productVisibilityText1 = test20Page.productVisibility.getText();
        Assert.assertEquals(productVisibilityText1, data.SEARCH_TEXT_ONE);
        sleepTest(1500);
        System.out.println(productVisibilityText1 + " is displaying.");
    }
}
