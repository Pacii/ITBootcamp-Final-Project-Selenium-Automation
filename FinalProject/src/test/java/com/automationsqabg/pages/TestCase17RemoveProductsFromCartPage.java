package com.automationsqabg.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase17RemoveProductsFromCartPage extends BasePage {
    public TestCase17RemoveProductsFromCartPage(WebDriver wd) {
        super(wd);
    }

    @FindBy ( xpath = "//div[@id='slider-carousel']/div[@class='carousel-inner']" )
    public WebElement homePageSlider;

    public WebElement getHomePageSlider() {
        return homePageSlider;
    }

    @FindBy ( xpath = "/html/body/section[2]/div[@class='container']/div[@class='row']//div[@class='features_items']/div[2]/div[@class='product-image-wrapper']/div[@class='choose']/ul//a[@href='/product_details/1']" )
    public WebElement viewProductButton;

    public WebElement getViewProductButton() {
        return viewProductButton;
    }

    @FindBy ( xpath = "/html/body/section/div[@class='container']/div[@class='row']//button[@type='button']" )
    public WebElement addToCartButton;

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    @FindBy ( xpath = "/html//div[@id='cartModal']//button[.='Continue Shopping']" )
    public WebElement addToCartPageContinueShopping;

    public WebElement getAddToCartPageContinueShopping() {
        return addToCartPageContinueShopping;
    }

    @FindBy ( xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/view_cart']" )
    public WebElement cartButton;

    public WebElement getCartButton() {
        return cartButton;
    }

    @FindBy ( xpath = "//section[@id='cart_items']//ol[@class='breadcrumb']/li[.='Shopping Cart']" )
    public WebElement shoppingCartText;

    public WebElement getShoppingCartText() {
        return shoppingCartText;
    }

    @FindBy ( xpath = "/html//tr[@id='product-1']//i[@class='fa fa-times']" )
    public WebElement productRemoveButton;

    public WebElement getProductRemoveButton() {
        return productRemoveButton;
    }

    @FindBy ( xpath = "//span[@id='empty_cart']/p[@class='text-center']" )
    public WebElement productRemovedText;

    public WebElement getProductRemovedText() {
        return productRemovedText;
    }
}
