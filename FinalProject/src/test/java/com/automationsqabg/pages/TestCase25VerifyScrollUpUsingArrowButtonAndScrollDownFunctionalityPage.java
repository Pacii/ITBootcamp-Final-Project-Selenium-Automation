package com.automationsqabg.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityPage extends BasePage {
    public TestCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityPage(WebDriver wd) {
        super(wd);
    }

    @FindBy ( xpath = "/html[1]/body[1]/a[1]" )
    public WebElement scrollUpButton;

    public WebElement getScrollUpButton() {
        return scrollUpButton;
    }

    @FindBy (className = "/html/body/ins[2]")
    public WebElement adArrow;

    public WebElement getAdArrow(){return adArrow; }
}
