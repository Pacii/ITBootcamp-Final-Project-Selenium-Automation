package com.automationsqabg.paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

    public class testCase12AddProductsInCartPage extends basePage{

        public testCase12AddProductsInCartPage(WebDriver wd) {
            super(wd);
        }

        @FindBy ( xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]" )
        public WebElement overProduct1;

        public WebElement getOverProduct1() {
            return overProduct1;
        }

        @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/div/a")
        public WebElement addToCart1;

        public WebElement getaddToCart1() {
            return addToCart1;
        }

        @FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
        public WebElement continueBtn;

        public WebElement getcontinueBtn(){return continueBtn;}

        @FindBy(xpath = "//*[@id=\"accordian\"]/div[3]/div[1]/h4/a")
        public WebElement findKids;

        public WebElement getFindKids() {
            return findKids;
        }

        @FindBy(xpath = "//*[@id='Kids']/div/ul/li[1]/a")
        public  WebElement dress;

        public WebElement getDress(){return dress;}

        @FindBy ( xpath = "/html/body/section/div/div[2]/div[2]/div/div[3]/div/div[1]" )
        public WebElement overProduct2;

        public WebElement getOverProduct2() {
            return overProduct2;
        }

        @FindBy (xpath = "/html/body/section/div/div[2]/div[2]/div/div[3]/div/div[1]/div[2]/div/a")
        public WebElement addToCart2;

        public WebElement getAddToCart2() {
            return addToCart2;
        }

        @FindBy (xpath = "//u [text () = 'View Cart']")
        public WebElement viewCart;

        public WebElement getViewCart() {
            return viewCart;
        }

    }

