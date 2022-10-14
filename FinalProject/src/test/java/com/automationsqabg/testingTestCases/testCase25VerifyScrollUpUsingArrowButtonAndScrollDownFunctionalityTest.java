package com.automationsqabg.testingTestCases;

import com.automationsqabg.paths.automationExerciseLandingPage;
import com.automationsqabg.paths.testCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityPage;
import com.automationsqabg.dataPackage.data;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityTest extends baseClass{

    @Test
    public void testCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityTesting() {

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityPage test25Page = new testCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityPage(wd);

//        3. I had difficulty removing the ad from the bottom of the page, so I resized the window to remove the ads
        wd.manage().window().setSize(new Dimension(1500,800));

//        4. Verify that home page is visible successfully
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
