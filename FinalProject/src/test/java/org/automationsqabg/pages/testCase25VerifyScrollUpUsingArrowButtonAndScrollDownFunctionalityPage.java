package org.automationsqabg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class testCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityPage extends basePage{
    public testCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityPage(WebDriver wd) {
        super(wd);
    }

    @FindBy ( xpath = "/html//a[@id='scrollUp']" )
    public WebElement scrollUpButton;

    public WebElement getScrollUpButton() {
        return scrollUpButton;
    }

    @FindBy ( xpath = "/html/body/ins[2]/div[1]//ins/span/svg/path" )
    public WebElement adArrow;

    public WebElement getAdArrow(){return adArrow; }
}
