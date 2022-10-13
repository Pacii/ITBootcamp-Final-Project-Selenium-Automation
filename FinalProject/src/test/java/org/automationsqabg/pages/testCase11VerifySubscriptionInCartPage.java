package org.automationsqabg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class testCase11VerifySubscriptionInCartPage extends basePage{
    public testCase11VerifySubscriptionInCartPage(WebDriver wd) {
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