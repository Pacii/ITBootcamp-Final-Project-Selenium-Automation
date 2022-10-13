package org.automationsqabg.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

    public class automationExerciseLandingPage extends basePage {
        public automationExerciseLandingPage(WebDriver wd) {
            super(wd);
        }

        @FindBy(xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/login']")
        public WebElement signUpLogInButton;
        public WebElement getSignUpLogInButton() {

            return signUpLogInButton;
        }

        @FindBy ( xpath = "/html//section[@id='form']/div[@class='container']//h2[.='Login to your account']" )
        public WebElement loginToYourAccountText;

        public WebElement getLoginToYourAccountText() {
            return loginToYourAccountText;
        }

        @FindBy ( xpath = "/html//section[@id='form']/div[@class='container']//h2[.='New User Signup!']" )
        public WebElement newUserSignupText;

        public WebElement getNewUserSignupText() {
            return newUserSignupText;
        }

        @FindBy (xpath = "/html//section[@id='form']//form[@action='/login']/input[@name='email']")
        public WebElement loginEmailAddress;

        public WebElement getEmailAddress() {
            return loginEmailAddress;
        }

        @FindBy (xpath = "/html//section[@id='form']//form[@action='/login']/input[@name='password']")
        public WebElement loginPassword;

        public WebElement getPassword() {
            return loginPassword;
        }

        @FindBy (xpath = "/html//section[@id='form']//form[@action='/login']/button[@type='submit']")
        public WebElement loginButton;

        public WebElement getLoginButton() {
            return loginButton;
        }


        @FindBy (xpath = "/html//section[@id='form']//form[@action='/signup']/input[@name='name']")
        public WebElement signUpName;

        public WebElement getSignUpName() {
            return signUpName;
        }

        @FindBy (xpath = "/html//section[@id='form']//form[@action='/signup']/input[@name='email']")
        public WebElement signUpEmail;

        public WebElement getSignUpEmail() {
            return signUpEmail;
        }

        @FindBy (xpath = "/html//section[@id='form']//form[@action='/signup']/button[@type='submit']")
        public WebElement signUpButton;

        public WebElement getSignUpButton() {
            return signUpButton;
        }

        @FindBy ( xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a" )
        public WebElement contactUsButton;

        public WebElement getContactUsButton() {
            return contactUsButton;
        }

        @FindBy ( xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/test_cases']" )
        public WebElement testCases;

        public WebElement getTestCases() {
            return testCases;
        }

        @FindBy ( xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/products']" )
        public WebElement productsButton;

        public WebElement getProductsButton() {
            return productsButton;
        }

        @FindBy ( xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/view_cart']" )
        public WebElement cartButton;

        public WebElement getCartButton() {
            return cartButton;
        }

        @FindBy ( xpath = "//div[@id='slider-carousel']/div[@class='carousel-inner']" )
        public WebElement homeSlider;

        public WebElement getHomeSlider() {
            return homeSlider;
        }

        @FindBy ( xpath = "/html/body/section[2]/div[@class='container']/div[@class='row']//div[@class='features_items']/div[2]/div[@class='product-image-wrapper']/div[@class='choose']/ul//a[@href='/product_details/1']" )
        public WebElement viewProduct;

        public WebElement getViewProduct() {
            return viewProduct;
        }

        @FindBy ( xpath = "/html/body/section/div[@class='container']/div[@class='row']//button[@type='button']" )
        public WebElement addToCartButton;

        public WebElement getAddToCartButton() {
            return addToCartButton;
        }

        @FindBy ( xpath = "/html//div[@id='cartModal']//a[@href='/view_cart']/u[.='View Cart']" )
        //@FindBy ( xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u" )
        //@FindBy ( css = "#cartModal > div > div > div.modal-body > p:nth-child(2) > a > u")
        public WebElement viewCart;

        public WebElement getViewCart() {
            return viewCart;
        }

        @FindBy ( xpath = "//section[@id='cart_items']//ol[@class='breadcrumb']/li[.='Shopping Cart']" )
        public WebElement shoppingCart;

        public WebElement getShoppingCart() {
            return shoppingCart;
        }

        @FindBy ( xpath = "/html//section[@id='do_action']//a[@class='btn btn-default check_out']" )
        public WebElement proceedToCheckout;

        public WebElement getProceedToCheckout() {
            return proceedToCheckout;
        }

        @FindBy ( xpath = "/html//div[@id='checkoutModal']//a[@href='/login']/u[.='Register / Login']" )
        public WebElement registerLogin;

        public WebElement getRegisterLogin() {
            return registerLogin;
        }

        @FindBy ( xpath = "/html//section[@id='form']//form[@action='/signup']/input[@name='name']" )
        public WebElement signUpNameInput;

        public WebElement getSignUpNameInput() {
            return signUpNameInput;
        }

        @FindBy ( xpath = "/html//section[@id='form']//form[@action='/signup']/input[@name='email']" )
        public WebElement signUpEmailAddressInput;

        public WebElement getSignUpEmailAddressInput() {
            return signUpNameInput;
        }

        @FindBy ( xpath = "/html//section[@id='form']//form[@action='/signup']/button[@type='submit']" )
        public WebElement signUpSubmitButton;

        public WebElement getSignUpSubmitButton() {
            return signUpSubmitButton;
        }

        @FindBy ( xpath = "/html//section[@id='form']/div[@class='container']//form[@action='/signup']/div[1]/div[1]/label[@class='top']/div[@class='radio']//input[@name='title']" )
        public WebElement signUpTitleRadioButton;

        public WebElement getSignUpTitleRadioButton() {
            return signUpTitleRadioButton;
        }

        @FindBy ( xpath = "/html//input[@id='password']" )
        public WebElement signUpPasswordInput;

        public WebElement getSignUpPasswordInput() {
            return signUpPasswordInput;
        }

        @FindBy ( xpath = "/html//select[@id='days']" )
        public WebElement signUpDayDropdown;

        public WebElement getSignDayDropdown() {
            return signUpDayDropdown;
        }

        @FindBy ( xpath = "/html//select[@id='months']" )
        public WebElement signUpMonthDropdown;

        public WebElement getSignUpMonthDropdown() {
            return signUpMonthDropdown;
        }

        @FindBy ( xpath = "/html//select[@id='years']" )
        public WebElement signUpYearDropdown;

        public WebElement getSignUpYearDropdown() {
            return signUpYearDropdown;
        }

        @FindBy ( xpath = "/html//input[@id='newsletter']" )
        public WebElement signUpNewsletterCheckBox;

        public WebElement getSignUpNewsletterCheckBox() {
            return signUpNewsletterCheckBox;
        }

        @FindBy ( xpath = "/html//input[@id='optin']" )
        public WebElement signUpOfferCheckBox;

        public WebElement getSignUpOfferCheckBox() {
            return signUpOfferCheckBox;
        }

        @FindBy ( xpath = "/html//input[@id='first_name']" )
        public WebElement signUpFirstNameInput;

        public WebElement getSignUpFirstNameInput() {
            return signUpFirstNameInput;
        }

        @FindBy ( xpath = "/html//input[@id='last_name']" )
        public WebElement signUpLastNameInput;

        public WebElement getSignUpLastNameInput() {
            return signUpLastNameInput;
        }

        @FindBy ( xpath = "/html//input[@id='company']" )
        public WebElement signUpCompanyNameInput;

        public WebElement getSignUpCompanyNameInput() {
            return signUpCompanyNameInput;
        }

        @FindBy ( xpath = "/html//section[@id='form']/div[@class='container']//form[@action='/signup']//input[@name='address1']" )
        public WebElement signUpAddressInput;

        public WebElement getSignUpAddressInput() {
            return signUpAddressInput;
        }

        @FindBy ( xpath = "/html//section[@id='form']/div[@class='container']//form[@action='/signup']//input[@name='address2']" )
        public WebElement signUpAddress2Input;

        public WebElement getSignUpAddress2Input() {
            return signUpAddress2Input;
        }

        @FindBy ( xpath = "/html//select[@id='country']" )
        public WebElement signUpCountryDropdown;

        public WebElement getSignUpCountryDropdown() {
            return signUpCountryDropdown;
        }

        @FindBy ( xpath = "/html//input[@id='state']" )
        public WebElement signUpStateInput;

        public WebElement getSignUpStateInput() {
            return signUpStateInput;
        }

        @FindBy ( xpath = "/html//input[@id='city']" )
        public WebElement signUpCityInput;

        public WebElement getSignUpCityInput() {
            return signUpCityInput;
        }

        @FindBy ( xpath = "/html//input[@id='zipcode']" )
        public WebElement signUpZipCodeInput;

        public WebElement getSignUpZipCodeInput() {
            return signUpZipCodeInput;
        }

        @FindBy ( xpath = "/html//input[@id='mobile_number']" )
        public WebElement signUpMobileNumberInput;

        public WebElement getSignUpMobileNumberInput() {
            return signUpMobileNumberInput;
        }

        @FindBy ( xpath = "/html//section[@id='form']//form[@action='/signup']/button[@type='submit']" )
        public WebElement signUpCreateAccountButton;

        public WebElement getSignUpCreateAccountButton() {
            return signUpCreateAccountButton;
        }

        @FindBy ( xpath = "//*[@id=\"form\"]/div/div/div/h2/b" )
        public WebElement signUpAccountCreatedText;

        public WebElement getSignUpAccountCreatedText() {
            return signUpAccountCreatedText;
        }

        @FindBy ( xpath = "//*[@id=\"form\"]/div/div/div/div/a" )
        public WebElement signUpAccountCreatedContinueButton;

        public WebElement getSignUpAccountCreatedContinueButton() {
            return signUpAccountCreatedContinueButton;
        }

        @FindBy ( xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']/li[9]/a" )
        public WebElement loggedInAsTxt;

        public WebElement getLoggedInAsTxt() {
            return loggedInAsTxt;
        }

        @FindBy ( xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']/li[9]/a" )
        public WebElement loggedInAsValidation;

        public WebElement getLoggedInAsValidation() {
            return loggedInAsValidation;
        }

        @FindBy ( xpath = "/html//header[@id='header']/div[@class='header-middle']//ul[@class='nav navbar-nav']//a[@href='/view_cart']" )
        public WebElement homeCartButton;

        public WebElement getHomeCartButton() {
            return homeCartButton;
        }

        @FindBy ( xpath = "//div[@id='ordermsg']/textarea[@name='message']" )
        public WebElement descriptionCommentText;

        public WebElement getDescriptionCommentText() {
            return descriptionCommentText;
        }

        @FindBy ( xpath = "/html//section[@id='cart_items']//a[@href='/payment']" )
        public WebElement placeOrderButton;

        public WebElement getPlaceOrderButton() {
            return placeOrderButton;
        }

        @FindBy ( xpath = "/html//form[@id='payment-form']//input[@name='name_on_card']" )
        public WebElement nameOnCardInput;

        public WebElement getNameOnCardInput() {
            return nameOnCardInput;
        }

        @FindBy ( xpath = "/html//form[@id='payment-form']//input[@name='card_number']" )
        public WebElement cardNumberInput;

        public WebElement getCardNumberInput() {
            return cardNumberInput;
        }

        @FindBy ( xpath = "/html//form[@id='payment-form']//input[@name='cvc']" )
        public WebElement cvcInput;

        public WebElement getCvcInput() {
            return cvcInput;
        }

        @FindBy ( xpath = "/html//form[@id='payment-form']//input[@name='expiry_month']" )
        public WebElement expirationMonth;

        public WebElement getExpirationMonth() {
            return expirationMonth;
        }

        @FindBy ( xpath = "/html//form[@id='payment-form']//input[@name='expiry_year']" )
        public WebElement expirationYear;

        public WebElement getExpirationYear() {
            return expirationYear;
        }

        @FindBy ( xpath = "/html//button[@id='submit']" )
        public WebElement payAndConfirmOrderButton;

        public WebElement getPayAndConfirmOrderButton() {
            return payAndConfirmOrderButton;
        }

        @FindBy ( xpath = "/html//section[@id='form']//p[.='Congratulations! Your order has been confirmed!']" )
        public WebElement orderPlacedTxt;

        public WebElement getOrderPlacedTxt() {
            return orderPlacedTxt;
        }

        @FindBy ( xpath = "//ul[@id='address_delivery']/li[@class='address_firstname address_lastname']" )
        public WebElement deliveryAddressFullName;

        public WebElement getDeliveryAddressFullName() {
            return deliveryAddressFullName;
        }

        @FindBy ( xpath = "//ul[@id='address_invoice']/li[@class='address_firstname address_lastname']" )
        public WebElement billingAddressFullName;

        public WebElement getBillingAddressFullName() {
            return billingAddressFullName;
        }

        @FindBy ( xpath = "//div[@id='ordermsg']/textarea[@name='message']" )
        public WebElement checkOutPageCommentInput;

        public WebElement getCheckOutPageCommentInput() {
            return checkOutPageCommentInput;
        }

        @FindBy ( xpath = "/html//section[@id='form']//p[.='Congratulations! Your order has been confirmed!']" )
        public WebElement orderPlaceSuccessTxt;

        public WebElement getOrderPlaceSuccessTxt() {
            return orderPlaceSuccessTxt;
        }

        @FindBy ( xpath = "/html//section[@id='form']/div[@class='container']//a[@href='/']" )
        public WebElement orderPlaceSuccessPageContinueButton;

        public WebElement getOrderPlaceSuccessPageContinueButton() {
            return orderPlaceSuccessPageContinueButton;
        }

        @FindBy ( xpath = "/html//div[@id='cartModal']//button[.='Continue Shopping']" )
        public WebElement continueShoppingButton;

        public WebElement getContinueShoppingButton() {
            return continueShoppingButton;
        }

        @FindBy ( xpath = "//a[text()='Download Invoice']" )
        public WebElement downloadInvoiceButton;

        public WebElement getDownloadInvoiceButton() {
            return downloadInvoiceButton;
        }

        @FindBy ( xpath = "/html/body/footer/div[2]/div/div[1]/div[2]/div/h2" )
        public WebElement subscriptionText;

        public WebElement getSubscriptionText() {
            return subscriptionText;
        }

        @FindBy ( xpath = "//h2[text()='Full-Fledged practice website for Automation Engineers']" )
        public WebElement sliderText;

        public WebElement getSliderText() {
            return sliderText;
        }
    }

