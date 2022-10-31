package com.automationsqabg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver wd;

    public BasePage(WebDriver wd){
        this.wd = wd;
        this.inItPage();
    }
    public void inItPage () {
        PageFactory.initElements (wd, this);
    }

}
