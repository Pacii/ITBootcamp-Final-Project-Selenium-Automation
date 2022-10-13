package org.automationsqabg.testingTestCases;

import org.automationsqabg.pages.automationExerciseLandingPage;
import org.automationsqabg.pages.testCase12AddProductsInCartPage;
import org.automationsqabg.utility.data;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase12AddProductsInCartTest extends baseClass{

    @Test
    public void testCase12AddProductsInCartTesting() {

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase12AddProductsInCartPage test12Page = new testCase12AddProductsInCartPage(wd);

        aelp.productsButton.click();

        String productsUrl = wd.getCurrentUrl();
        Assert.assertEquals(productsUrl, data.PRODUCTS_PAGE_URL);
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
        Assert.assertEquals(viewCartUrl,data.CART_URL);
        sleepTest(1500);
        System.out.println("View Cart Url Matched");
    }
}