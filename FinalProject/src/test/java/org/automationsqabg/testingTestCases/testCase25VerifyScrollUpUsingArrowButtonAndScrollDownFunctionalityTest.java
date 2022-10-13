package org.automationsqabg.testingTestCases;

import org.automationsqabg.pages.automationExerciseLandingPage;
import org.automationsqabg.pages.testCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityPage;
import org.automationsqabg.utility.data;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityTest extends baseClass{

    @Test
    public void testCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityTesting() {

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityPage test25Page = new testCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityPage(wd);

//        3. Verify that home page is visible successfully
        if (aelp.getHomeSlider().isDisplayed()){
            System.out.println("You are at HomePage");
            sleepTest(2500);
        }

        else {
            System.out.println(data.ERROR_MESSAGE);
        }


//        5. Scroll down page to bottom
        JavascriptExecutor jse = (JavascriptExecutor) wd;
        jse.executeScript("window.scrollBy(0,8800)");
        sleepTest(2500);

//        6. Verify 'SUBSCRIPTION' is visible
        if (aelp.getSubscriptionText().isDisplayed()) {
            System.out.println("SUBSCRIPTION is visible");
            sleepTest(1500);
        }

        //        4. Click ad arrow to remove ads
        test25Page.getAdArrow().click();
        sleepTest(1000);

//        7. Click on arrow at bottom right side to move upward
        test25Page.scrollUpButton.click();
        sleepTest(1500);

//        8. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
        if (aelp.sliderText.isDisplayed()){
            String sliderTxt = aelp.sliderText.getText();
            Assert.assertEquals(sliderTxt,data.SLIDER_TEXT);
            System.out.println();
            System.out.println(sliderTxt);
            System.out.println();
            sleepTest(1500);
        }

        else {
            System.out.println(data.ERROR_MESSAGE);
        }
    }
}
