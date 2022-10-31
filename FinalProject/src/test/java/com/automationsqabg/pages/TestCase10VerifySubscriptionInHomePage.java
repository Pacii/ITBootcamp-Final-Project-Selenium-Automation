package com.automationsqabg.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

    public class TestCase10VerifySubscriptionInHomePage extends BasePage {
        public TestCase10VerifySubscriptionInHomePage(WebDriver wd) {
            super(wd);
        }

        @FindBy( xpath = "//h2[text()='Subscription']" )
        public WebElement subscription;

        public WebElement getSubscription() {
            return subscription;
        }

        @FindBy ( xpath = "//input [@type = 'email']" )
        public WebElement subscriptionEmailInputBox;

        public WebElement subscriptionEmailInputBox() {
            return subscriptionEmailInputBox;
        }

        @FindBy ( xpath = "//button [@id = 'subscribe']" )
        public WebElement arrowButton;

        public WebElement getArrowButton() {
            return arrowButton;
        }

        // //div [@class = 'alert-success alert']
        // //div [text () = 'You have been successfully subscribed!']
        @FindBy ( xpath = "//div [text () = 'You have been successfully subscribed!']" )
        public WebElement successAlert;

        public WebElement getSuccessAlert() {
            return successAlert;
        }
    }
