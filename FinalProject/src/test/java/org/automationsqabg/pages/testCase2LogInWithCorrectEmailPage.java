package org.automationsqabg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class testCase2LogInWithCorrectEmailPage extends basePage {
    public testCase2LogInWithCorrectEmailPage(WebDriver wd) {
        super(wd);
    }

    @FindBy( xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']/li[9]/a" )
    public WebElement loggedInAs;

    public WebElement getLoggedInAs() {
        return loggedInAs;
    }
}
