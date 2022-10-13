package org.automationsqabg.testingTestCases;

import org.automationsqabg.pages.automationExerciseLandingPage;
import org.automationsqabg.pages.testCase7VerifyTestCasesPage;
import org.automationsqabg.utility.data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase7VerifyTestCasesTest extends baseClass{

    @Test
    public void testCase7VerifyTestCasesTesting() {

        automationExerciseLandingPage aelp = new automationExerciseLandingPage(wd);
        testCase7VerifyTestCasesPage test7Page = new testCase7VerifyTestCasesPage(wd);

        aelp.testCases.click();
        sleepTest(1500);

        String testCaseUrl = wd.getCurrentUrl();
        Assert.assertEquals(testCaseUrl,data.TEST_CASES_URL);
        sleepTest(1500);
        System.out.println("URL Matched");

        JavascriptExecutor je = (JavascriptExecutor) wd;
        je.executeScript("window.scrollBy (0,300)");
        sleepTest(1000);

        je.executeScript("window.scrollBy (0,500)");
        sleepTest(1000);

        String testCaseTxt = test7Page.testCasesText.getText();
        Assert.assertEquals(testCaseTxt, data.TEST_CASES_TEXT);
        sleepTest(1500);
        System.out.println(testCaseTxt + " is showing.");

    }
}
