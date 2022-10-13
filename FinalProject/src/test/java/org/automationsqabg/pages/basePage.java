package org.automationsqabg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basePage {

    public WebDriver wd;

    public basePage(WebDriver wd){
        this.wd = wd;
        this.inItPage();
    }
    public void inItPage () {
        PageFactory.initElements (wd, this);
    }

}
