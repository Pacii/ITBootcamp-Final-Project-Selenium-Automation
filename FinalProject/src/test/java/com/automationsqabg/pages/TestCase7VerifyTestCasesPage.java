package com.automationsqabg.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase7VerifyTestCasesPage extends BasePage {
    public TestCase7VerifyTestCasesPage(WebDriver wd) {
        super(wd);
    }

    @FindBy ( xpath = "/html//section[@id='form']/div[@class='container']//b[.='Test Cases']" )
    public WebElement testCasesText;

    public WebElement getTestCasesText() {
        return testCasesText;
    }
}
