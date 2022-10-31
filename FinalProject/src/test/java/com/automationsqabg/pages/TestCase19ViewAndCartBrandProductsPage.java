package com.automationsqabg.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase19ViewAndCartBrandProductsPage extends BasePage {
    public TestCase19ViewAndCartBrandProductsPage(WebDriver wd) {
        super(wd);
    }

    @FindBy ( xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/products']" )
    public WebElement productsButton;

    public WebElement getProductsButton() {
        return productsButton;
    }

    @FindBy ( xpath = "/html/body/section[2]/div[@class='container']//ul[@class='nav nav-pills nav-stacked']//a[@href='/brand_products/Polo']" )
    public WebElement poloBrandButton;

    public WebElement getPoloBrandButton() {
        return poloBrandButton;
    }

    @FindBy ( xpath = "/html/body/section//h2[.='Brand - Polo Products']" )
    public WebElement poloBrandProductsText;

    public WebElement getPoloBrandProductsText() {
        return poloBrandProductsText;
    }

    @FindBy ( xpath = "/html/body/section/div[@class='container']//ul[@class='nav nav-pills nav-stacked']//a[@href='/brand_products/Madame']" )
    public WebElement madameBrandButton;

    public WebElement getMadameBrandButton() {
        return madameBrandButton;
    }

    @FindBy ( xpath = "/html/body/section//h2[.='Brand - Madame Products']" )
    public WebElement madameBrandsProductsText;

    public WebElement getMadameBrandsProductsText() {
        return madameBrandsProductsText;
    }
}
