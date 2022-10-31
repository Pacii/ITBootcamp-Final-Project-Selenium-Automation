package com.automationsqabg.testingTestCases;

import com.automationsqabg.pages.LandingPage;
import com.automationsqabg.pages.TestCase12AddProductsInCartPage;
import com.automationsqabg.Utility.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase12AddProductsInCartTest extends BaseClass {

    @Test
    public void testCase12AddProductsInCartTesting() {

        LandingPage aelp = new LandingPage(wd);
        TestCase12AddProductsInCartPage test12Page = new TestCase12AddProductsInCartPage(wd);

        aelp.productsButton.click();

        String productsUrl = wd.getCurrentUrl();
        Assert.assertEquals(productsUrl, Data.PRODUCTS_PAGE_URL);
        sleepTest(1500);
        System.out.println("Products URL Matched");

        JavascriptExecutor js = (JavascriptExecutor) wd;
        js.executeScript("window.scrollBy(0,400)");
        sleepTest(3000);

        Actions actions = new Actions(wd);
        actions.moveToElement(test12Page.getOverProduct1()).perform();
        sleepTest(5000);
        test12Page.getaddToCart1().click();
        sleepTest(2500);

        test12Page.getcontinueBtn().click();
        sleepTest(2500);

        test12Page.getFindKids().click();
        test12Page.getDress().click();

        js.executeScript("window.scrollBy(0,300)");
        sleepTest(3000);


//        Move the mouse to appear the HOAVER MENU
        actions.moveToElement(test12Page.getOverProduct2()).perform();
        sleepTest(5000);

//        Move the mouse to appear the HOAVER MENU & then click the element on HOAVER MENU
        actions.moveToElement(test12Page.getAddToCart2());
        actions.click().build().perform();

        test12Page.viewCart.click();
        sleepTest(1500);

        String viewCartUrl = wd.getCurrentUrl();
        Assert.assertEquals(viewCartUrl, Data.CART_URL);
        sleepTest(1500);
        System.out.println("View Cart Url Matched");
    }
}