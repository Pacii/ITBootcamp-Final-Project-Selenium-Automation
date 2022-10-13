package org.automationsqabg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class testCase5RegisterUserWithExistingEmailPage extends basePage{
    public testCase5RegisterUserWithExistingEmailPage(WebDriver wd) {
        super(wd);
    }

    @FindBy ( xpath = "/html//section[@id='form']//form[@action='/signup']/p[.='Email Address already exist!']" )
    public WebElement emailAddressAlreadyExistText;

    public WebElement getEmailAddressAlreadyExistText() {
        return emailAddressAlreadyExistText;
    }
}

