package com.automationsqabg.testingTestCases;

import com.automationsqabg.pages.TestCase7VerifyTestCasesPage;
import com.automationsqabg.pages.LandingPage;
import com.automationsqabg.Utility.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase7VerifyTestCasesTest extends BaseClass {

    @Test
    public void testCase7VerifyTestCasesTesting() {

        LandingPage aelp = new LandingPage(wd);
        TestCase7VerifyTestCasesPage test7Page = new TestCase7VerifyTestCasesPage(wd);

        aelp.testCases.click();
        sleepTest(1500);

        String testCaseUrl = wd.getCurrentUrl();
        Assert.assertEquals(testCaseUrl, Data.TEST_CASES_URL);
        sleepTest(1500);
        System.out.println("URL Matched");

        JavascriptExecutor je = (JavascriptExecutor) wd;
        je.executeScript("window.scrollBy (0,300)");
        sleepTest(1000);

        je.executeScript("window.scrollBy (0,500)");
        sleepTest(1000);

        String testCaseTxt = test7Page.testCasesText.getText();
        Assert.assertEquals(testCaseTxt, Data.TEST_CASES_TEXT);
        sleepTest(1500);
        System.out.println(testCaseTxt + " is showing.");

    }
}
