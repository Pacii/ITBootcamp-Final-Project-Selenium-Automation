package com.automationsqabg.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase2LogInWithCorrectEmailAndDeleteAccountPage extends BasePage {
    public TestCase2LogInWithCorrectEmailAndDeleteAccountPage(WebDriver wd) {
        super(wd);
    }

    @FindBy( xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']/li[9]/a" )
    public WebElement loggedInAs;

    public WebElement getLoggedInAs() {
        return loggedInAs;
    }

    @FindBy ( xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/delete_account']" )
    public WebElement deleteAccount;

    public WebElement getDeleteAccount() {
        return deleteAccount;
    }

    @FindBy ( xpath = "//button [text() = 'Delete']" )
    public WebElement delAcc;

    public WebElement getDelAcc() {
        return delAcc;
    }

    @FindBy ( xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]" )
    public WebElement deleteError;

    public WebElement getDeleteError() {
        return deleteError;
    }
}
