package com.automationsqabg.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase11VerifySubscriptionInCartPage extends BasePage {
    public TestCase11VerifySubscriptionInCartPage(WebDriver wd) {
        super(wd);
    }

    @FindBy ( xpath = "//section[@id='cart_items']//ol[@class='breadcrumb']/li[.='Shopping Cart']" )
    public WebElement cartText;

    public WebElement getCartText() {
        return cartText;
    }

    @FindBy ( xpath = "//input [@type = 'email']" )
    public WebElement cartEmailInputBox;

    public WebElement getCartEmailInputBox() {
        return cartEmailInputBox;
    }

    @FindBy ( xpath = "//button [@type = 'submit']" )
    public WebElement cartEmailInputBoxSubmit;

    public WebElement getCartEmailInputBoxSubmit() {
        return cartEmailInputBoxSubmit;
    }


}