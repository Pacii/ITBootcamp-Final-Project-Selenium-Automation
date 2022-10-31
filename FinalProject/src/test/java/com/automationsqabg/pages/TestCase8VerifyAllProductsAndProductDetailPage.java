package com.automationsqabg.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase8VerifyAllProductsAndProductDetailPage extends BasePage {
    public TestCase8VerifyAllProductsAndProductDetailPage(WebDriver wd) {
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

    @FindBy(xpath = "/html/body/section/div[@class='container']//h2[.='Blue Top']")
    public WebElement productName;

    public WebElement getProductName() {
        return productName;
    }

    @FindBy(xpath = "/html/body/section/div[@class='container']//p[.='Category: Women > Tops']")
    public WebElement productCategory;

    public WebElement getProductCategory() {
        return productCategory;
    }

    @FindBy(xpath = "/html/body/section/div[@class='container']/div[@class='row']//span[.='Rs. 500']")
    public WebElement productPrice;

    public WebElement getProductPrice() {
        return productPrice;
    }

    @FindBy(xpath = "/html/body/section/div[@class='container']/div[@class='row']//b[.='Availability:']")
    public WebElement productAvailability;

    public WebElement getProductAvailability() {
        return productAvailability;
    }

    @FindBy(xpath = "/html/body/section/div[@class='container']/div[@class='row']//b[.='Condition:']")
    public WebElement productCondition;

    public WebElement getProductCondition() {
        return productCondition;
    }

    @FindBy(xpath = "/html/body/section/div[@class='container']/div[@class='row']//b[.='Brand:']")
    public WebElement productBrand;

    public WebElement getProductBrand() {
        return productBrand;
    }
}
