package org.automationsqabg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class testCase4LogOutUserPage extends basePage{
    public testCase4LogOutUserPage(WebDriver wd) {
        super(wd);
    }

    @FindBy( xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']/li[9]/a" )
    public WebElement loggedInAsText;

    public WebElement getLoggedInAsText() {

        return loggedInAsText;
    }

    @FindBy ( xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/logout']" )
    public WebElement logOut;

    public WebElement getLogOut() {
        return logOut;
    }
}
