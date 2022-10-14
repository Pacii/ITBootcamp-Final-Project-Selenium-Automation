package com.automationsqabg.paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class testCase7VerifyTestCasesPage extends basePage{
    public testCase7VerifyTestCasesPage(WebDriver wd) {
        super(wd);
    }

    @FindBy ( xpath = "/html//section[@id='form']/div[@class='container']//b[.='Test Cases']" )
    public WebElement testCasesText;

    public WebElement getTestCasesText() {
        return testCasesText;
    }
}
