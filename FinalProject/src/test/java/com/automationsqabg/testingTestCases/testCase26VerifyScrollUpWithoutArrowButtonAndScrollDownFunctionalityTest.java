package com.automationsqabg.testingTestCases;

import com.automationsqabg.paths.automationExerciseLandingPage;
import com.automationsqabg.paths.testCase26VerifyScrollUpWithoutArrowButtonAndScrollDownFunctionalityPage;
import com.automationsqabg.dataPackage.data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase26VerifyScrollUpWithoutArrowButtonAndScrollDownFunctionalityTest extends baseClass{

    @Test
    public void testCase26VerifyScrollUpWithoutArrowButtonAndScrollDownFunctionalityTesting() {

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase26VerifyScrollUpWithoutArrowButtonAndScrollDownFunctionalityPage test26Page = new testCase26VerifyScrollUpWithoutArrowButtonAndScrollDownFunctionalityPage(wd);

//        3. Verify that home page is visible successfully
        if (aelp.homeSlider.isDisplayed()){
            System.out.println("You are at Homepage");
            sleepTest(1500);
        }

        else {
            System.out.println(data.ERROR_MESSAGE);
        }

//        4. Scroll down page to bottom
        JavascriptExecutor jse = (JavascriptExecutor) wd;
        jse.executeScript("window.scrollBy(0,8800)");
        sleepTest(2500);

//        5. Verify 'SUBSCRIPTION' is visible
        if (aelp.subscriptionText.isDisplayed()) {
            System.out.println("Subscrition text is visible!");
            sleepTest(1500);
        }

//        6. Scroll up page to top
        JavascriptExecutor jseUp = (JavascriptExecutor) wd;
        jseUp.executeScript("window.scrollBy(0,-8800)");
        sleepTest(2500);

//        7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen
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