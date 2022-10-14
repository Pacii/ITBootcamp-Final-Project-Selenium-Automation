package com.automationsqabg.paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class testCase6ContactUsFormPage extends basePage{
    public testCase6ContactUsFormPage(WebDriver wd) {
        super(wd);
    }


    @FindBy ( xpath = "//*[@id=\"contact-page\"]/div[2]/div[1]/div/h2" )
    public WebElement contactUsGetInTouchText;

    public WebElement getContactUsGetInTouchText() {
        return contactUsGetInTouchText;
    }

    @FindBy ( xpath = "//*[@id=\"contact-us-form\"]/div[1]/input" )
    public WebElement contactUsName;

    public WebElement getContactUsName() {
        return contactUsName;
    }

    @FindBy ( xpath = "//*[@id=\"contact-us-form\"]/div[2]/input" )
    public WebElement contactUsEmail;

    public WebElement getContactUsEmail() {
        return contactUsEmail;
    }

    @FindBy ( xpath = "//*[@id=\"contact-us-form\"]/div[3]/input" )
    public WebElement contactUsSubject;

    public WebElement getContactUsSubject() {
        return contactUsSubject;
    }

    @FindBy ( xpath = "//*[@id=\"message\"]" )
    public WebElement contactUsMessage;

    public WebElement getContactUsMessage() {
        return contactUsMessage;
    }

    @FindBy ( xpath = "//*[@id=\"contact-us-form\"]/div[5]/input" )
    public WebElement contactUsChooseFile;

    public WebElement getContactUsChooseFile() {
        return contactUsChooseFile;
    }

    @FindBy ( xpath = "//*[@id=\"contact-us-form\"]/div[6]/input" )
    public WebElement contactUsSubmit;

    public WebElement getContactUsSubmit() {
        return contactUsSubmit;
    }

    @FindBy ( xpath = "//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]" )
    public WebElement successText;

    public WebElement getSuccessText() {
        return successText;
    }

    @FindBy ( xpath = "//*[@id=\"form-section\"]/a" )
    public WebElement homeButton;

    public WebElement getHomeButton() {
        return homeButton;
    }

    @FindBy ( xpath = "/html/body/section[2]//h2[.='Features Items']" )
    public WebElement featuresItems;

    public WebElement getFeaturesItems() {
        return featuresItems;
    }
}

