package com.automationsqabg.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase22AddToCartFromRecommendedItemsPage extends BasePage {
    public TestCase22AddToCartFromRecommendedItemsPage(WebDriver wd) {
        super(wd);
    }

    @FindBy ( xpath = "/html/body/section[2]//h2[.='recommended items']" )
    public WebElement recommendedItemsText;

    public WebElement getRecommendedItemsText() {
        return recommendedItemsText;
    }

    @FindBy ( xpath = "/html//div[@id='recommended-item-carousel']/div[@class='carousel-inner']/div[2]/div[1]/div[@class='product-image-wrapper']/div[@class='single-products']/div[@class='productinfo text-center']/a" )
    public WebElement stylishDressAddToCartButton;

    public WebElement getStylishDressAddToCartButton() {
        return stylishDressAddToCartButton;
    }

    @FindBy ( xpath = "/html//tr[@id='product-4']//a[@href='/product_details/4']" )
    public WebElement stylishDressDisplayText;

    public WebElement getStylishDressDisplayText() {
        return stylishDressDisplayText;
    }
}
