package org.automationsqabg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class testCase21AddReviewOnProductPage extends basePage{
    public testCase21AddReviewOnProductPage(WebDriver wd) {
        super(wd);
    }

    @FindBy ( xpath = "/html/body/section[2]//h2[.='All Products']" )
    public WebElement allProductsText;

    public WebElement getAllProductsText() {
        return allProductsText;
    }

    @FindBy ( xpath = "/html/body/section/div[@class='container']//ul[@class='nav nav-tabs']//a[@href='#reviews']" )
    public WebElement writeYourReviewText;

    public WebElement getWriteYourReviewText() {
        return writeYourReviewText;
    }

    @FindBy ( xpath = "/html//input[@id='name']" )
    public WebElement writeYourReviewTextNameInput;

    public WebElement getWriteYourReviewTextNameInput() {
        return writeYourReviewTextNameInput;
    }

    @FindBy ( xpath = "/html//input[@id='email']" )
    public WebElement writeYourReviewTextEmailAddressInput;

    public WebElement getWriteYourReviewTextEmailAddressInput() {
        return writeYourReviewTextEmailAddressInput;
    }

    @FindBy ( xpath = "/html//textarea[@id='review']" )
    public WebElement writeYourReviewTextInput;

    public WebElement getWriteYourReviewTextInput() {
        return writeYourReviewTextInput;
    }

    @FindBy ( xpath = "/html//button[@id='button-review']" )
    public WebElement writeYourReviewTextSubmit;

    public WebElement getWriteYourReviewTextSubmit() {
        return writeYourReviewTextSubmit;
    }
}
