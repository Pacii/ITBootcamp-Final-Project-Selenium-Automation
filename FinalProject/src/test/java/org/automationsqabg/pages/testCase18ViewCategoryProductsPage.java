package org.automationsqabg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class testCase18ViewCategoryProductsPage extends basePage{
    public testCase18ViewCategoryProductsPage(WebDriver wd) {
        super(wd);
    }

    @FindBy ( xpath = "/html/body/section//h2[.='Category']" )
    public WebElement categoryText;

    public WebElement getCategoryText() {
        return categoryText;
    }

    @FindBy ( xpath = "/html//div[@id='accordian']//a[@href='#Women']" )
    public WebElement womenCategory;

    public WebElement getWomenCategory() {
        return womenCategory;
    }

    @FindBy ( xpath = "//div[@id='Women']//ul//a[@href='/category_products/2']" )
    public WebElement womenCategorySubCategoryTops;

    public WebElement getWomenCategorySubCategoryTops() {
        return womenCategorySubCategoryTops;
    }

    @FindBy ( xpath = "/html/body/section//h2[.='Women - Tops Products']" )
    public WebElement womenTopsProductsText;

    public WebElement getWomenTopsProductsText() {
        return womenTopsProductsText;
    }

    @FindBy ( xpath = "/html//div[@id='accordian']//a[@href='#Men']" )
    public WebElement menCategory;

    public WebElement getMenCategory() {
        return menCategory;
    }

    @FindBy ( xpath = "//div[@id='Men']//ul//a[@href='/category_products/6']" )
    public WebElement menCategorySubCategoryJeans;

    public WebElement getMenCategorySubCategoryJeans() {
        return menCategorySubCategoryJeans;
    }

    @FindBy ( xpath = "/html/body/section//h2[.='Men - Jeans Products']" )
    public WebElement menJeansProductsText;

    public WebElement getMenJeansProductsText() {
        return menJeansProductsText;
    }
}
