package com.automationsqabg.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TestCase1RegisterUserPageAndDelete extends BasePage {
    public TestCase1RegisterUserPageAndDelete(WebDriver wd) {
        super(wd);
    }

    @FindBy(xpath = "/html//section[@id='form']//div[@class='login-form']/h2/b[.='Enter Account Information']")
    public WebElement signUpPageText;

    public WebElement getSignUpPageText() {
        return signUpPageText;
    }

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement male;

    public WebElement getMale() {
        return male;
    }

    @FindBy(xpath = "//input[@id='id_gender2']")
    public WebElement female;

    public WebElement getFemale() {
        return female;
    }

    @FindBy(xpath = "//input[@id='password']")
    public WebElement signUpPagePassword;

    public WebElement getSignUpPagePassword() {
        return signUpPagePassword;
    }


    //Sign Up Page Date Picker Drop Down Validation
    public WebElement getElement(By locator) {
        return wd.findElement(locator);
    }

    public void doSelectByVisibleText(By locator, String value) {
        Select select = new Select(getElement(locator));
        select.selectByVisibleText(value);
        System.out.println(value);
    }

    @FindBy(xpath = "//label[@for='newsletter' and text()='Sign up for our newsletter!'] ")
    public WebElement newsletterCheckBox;

    public WebElement getNewsletterCheckBox() {
        return newsletterCheckBox;
    }

    @FindBy(xpath = "//label[@for='optin' and text()='Receive special offers from our partners!'] ")
    public WebElement specialOfferCheckBox;

    public WebElement getSpecialOfferCheckBox() {
        return specialOfferCheckBox;
    }

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstNameText;

    public WebElement getFirstNameText() {
        return firstNameText;
    }

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastNameText;

    public WebElement getLastNameText() {
        return lastNameText;
    }

    @FindBy(xpath = "//input[@id='company']")
    public WebElement companyText;

    public WebElement getCompanyText() {
        return companyText;
    }

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address1Text;

    public WebElement getAddress1Text() {
        return address1Text;
    }

    @FindBy(xpath = "//input[@id='address2']")
    public WebElement address2Text;

    public WebElement getAddress2Text() {
        return address2Text;
    }

    @FindBy(xpath = "//input[@id='state']")
    public WebElement stateText;

    public WebElement getStateText() {
        return stateText;
    }

    @FindBy(xpath = "//input[@id='city']")
    public WebElement cityText;

    public WebElement getCityText() {
        return cityText;
    }

    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipcodeText;

    public WebElement getZipcodeText() {
        return zipcodeText;
    }

    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement mobileNumberText;

    public WebElement getMobileNumberText() {
        return mobileNumberText;
    }

    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccount;

    public WebElement getCreateAccount() {
        return createAccount;
    }

    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement accountCreatedText;

    public WebElement getAccountCreatedText() {
        return accountCreatedText;
    }

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;

    public WebElement getContinueButton() {
        return continueButton;
    }

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")
    public WebElement loggedInText;

    public WebElement getLoggedInText() {
        return loggedInText;
    }

    @FindBy(xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/delete_account']")
    public WebElement deleteAccount;

    public WebElement getDeleteAccount() {
        return deleteAccount;
    }

    @FindBy(xpath = "//button [text() = 'Delete']")
    public WebElement delAcc;

    public WebElement getDelAcc() {
        return delAcc;
    }

    @FindBy(xpath = "/html/body/section/div/div/div/h2")
    public WebElement delAccTxt;

    public WebElement getDelAccTxt() {
        return delAccTxt;
    }

    @FindBy(xpath = "/html/body/section/div/div/div/div/a")
    public WebElement delAccContinueBtn;

    public WebElement getDelAccContinueBtn() {
        return delAccContinueBtn;
    }



}
