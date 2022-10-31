package com.automationsqabg.Testing;

import com.automationsqabg.Pages.LandingPage;
import com.automationsqabg.Utility.Data;
import com.automationsqabg.Pages.TestCase6ContactUsFormPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase6ContactUsFormTest extends BaseClass {

    //////////////////////////////////////////////////////IMPORTANT!!!!!!!//////////////////////////////////////////////////////
//  For this test you need one pdf file to which you will conduct line 44


    @Test
    public void testCase6ContactUsFormTesting(){

        LandingPage aelp = new LandingPage(wd);
        TestCase6ContactUsFormPage test6Page = new TestCase6ContactUsFormPage(wd);

        aelp.contactUsButton.click();

        String contactUsUrl = wd.getCurrentUrl();
        Assert.assertEquals(contactUsUrl, Data.CONTACT_US_URL);
        sleepTest(1500);
        System.out.println(contactUsUrl + " url matched");

        String contactUsTxt = test6Page.getContactUsGetInTouchText().getText();
        Assert.assertEquals(contactUsTxt, Data.CONTACT_US_TEXT);
        sleepTest(1500);
        System.out.println(contactUsTxt + " text is available");

        test6Page.contactUsName.sendKeys(Data.CONTACT_US_NAME);
        test6Page.contactUsEmail.sendKeys(Data.CONTACT_US_EMAIL);
        test6Page.contactUsSubject.sendKeys(Data.CONTACT_US_SUBJECT);
        test6Page.contactUsMessage.sendKeys(Data.CONTACT_US_MESSAGE);
        sleepTest(1500);

        JavascriptExecutor je = (JavascriptExecutor) wd;
        je.executeScript("window.scrollBy (0,100)");

        test6Page.contactUsChooseFile.sendKeys("C:\\Users\\Pacii\\Downloads\\jd.pdf");
        sleepTest(1500);

        test6Page.contactUsSubmit.click();
        sleepTest(1500);

        Alert alertBox = wd.switchTo().alert();
        System.out.println(alertBox.getText());
        sleepTest(1500);

        alertBox.accept();
        sleepTest(1500);


        String successTxt = test6Page.successText.getText();
        Assert.assertEquals(successTxt, Data.CONTACT_US_SUCCESS_MESSAGE);
        sleepTest(1500);
        System.out.println(successTxt + " is showing!");

        test6Page.homeButton.click();
        sleepTest(1500);

        String featuresItemsTxt = test6Page.featuresItems.getText();
        Assert.assertEquals(featuresItemsTxt, Data.FEATURES_ITEMS_TEXT);
        sleepTest(1500);
        System.out.println("You are at HOME page.");
    }

}


