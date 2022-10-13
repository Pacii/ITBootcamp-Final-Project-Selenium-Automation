package org.automationsqabg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class testCase3LogInWithInCorrectEmailPage extends basePage{
    public testCase3LogInWithInCorrectEmailPage(WebDriver wd) {
        super(wd);
    }

    @FindBy (xpath = "/html//section[@id='form']//form[@action='/login']/p[.='Your email or password is incorrect!']")
    public WebElement incorrectMessage;

    public WebElement getIncorrectMessage() {
        return incorrectMessage;
    }
}
