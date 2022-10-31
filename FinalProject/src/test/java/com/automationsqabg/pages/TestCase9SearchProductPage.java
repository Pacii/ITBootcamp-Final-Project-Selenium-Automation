package com.automationsqabg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase9SearchProductPage extends BasePage {
    public TestCase9SearchProductPage(WebDriver wd) {
        super(wd);
    }

    @FindBy(xpath = "/html/body/section[2]//h2[.='All Products']")
    public WebElement productText;

    public WebElement getProductText() {
        return productText;
    }

    @FindBy(xpath = "/html/body/section[2]/div[@class='container']/div[@class='row']//div[@class='features_items']/div[2]/div[@class='product-image-wrapper']/div[@class='choose']/ul//a[@href='/product_details/1']")
    public WebElement viewProductFirst;

    public WebElement getViewProductFirst() {
        return viewProductFirst;
    }

    @FindBy ( xpath = "/html//input[@id='search_product']" )
    public WebElement searchBox;

    public WebElement getsearchBox() {
        return searchBox;
    }

    @FindBy ( xpath = "/html//button[@id='submit_search']" )
    public WebElement searchButton;

    public WebElement getSearchButton() {
        return searchButton;
    }

    @FindBy ( xpath = "/html/body/section[2]//h2[.='Searched Products']" )
    public WebElement searchProductsText;

    public WebElement getSearchProductsText() {
        return searchProductsText;
    }

    @FindBy ( xpath = "/html/body/section[2]/div[@class='container']/div[@class='row']//div[@class='productinfo text-center']/p[.='Blue Top']" )
    public WebElement productNameText;

    public WebElement getProductNameText() {
        return productNameText;
    }
}

