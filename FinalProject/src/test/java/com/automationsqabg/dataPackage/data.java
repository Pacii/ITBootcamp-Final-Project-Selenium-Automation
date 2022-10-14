package com.automationsqabg.dataPackage;
import com.github.javafaker.Faker;

public class data {
    public static String randomEmail() {
        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        return email;
    }

    public static final String BASE_URL = "https://www.automationexercise.com/";
    public static final String HOME_PAGE_SUCCESS_MESSAGE = "You are at Home page";
    public static final String LOGIN_SIGNUP_URL = "https://www.automationexercise.com/login";
    public static final String SIGNUP_NAME = "XYZ";
    public static final String SIGNUP_EMAIL = "qwertyu1@gmail.com";

    public static final String SIGNUP_PAGE_TEXT = "ENTER ACCOUNT INFORMATION";
    public static final String SIGNUP_PAGE_PASSWORD = "zxcV%1289";

    public static final String NEWSLETTER_CHECK_BOX = "Newsletter Check Box checked";
    public static final String SPECIAL_OFFER_CHECK_BOX = "Special Offer Check Box checked";


    public static final String FIRST_NAME_TEXT = "DEF";
    public static final String LAST_NAME_TEXT = "GHI";
    public static final String COMPANY_TEXT = "Company";
    public static final String ADDRESS_1_TEXT = "ABC - 1";
    public static final String ADDRESS_2_TEXT = "ZXC";
    public static final String STATE_TEXT = "ZXC";
    public static final String CITY_TEXT = "ZXC";
    public static final String ZIPCODE_TEXT = "1234";
    public static final String MOBILE_NUMBER = "+381123456789";
    public static final String ACCOUNT_CREATED_TEXT = "ACCOUNT CREATED!";
    public static final String LOGGED_IN_TEXT = "Logged in as XYZ";
    public static final String LOGGED_IN_PARTIAL_TEXT = "Logged in as";
    public static final String DELETE_ACCOUNT_TEXT = "Delete Account";
    public static final String DELETE_ACCOUNT_URL = "https://www.automationexercise.com/delete_account";

    public static final String DELETE_ACCOUNT_ERROR = "Are you sure you want to delete this Delete Account?";


    public static final String LOG_IN_TO_YOUR_ACCOUNT_TEXT = "Login to your account";
    public static final String NEW_USER_SIGNUP_TEXT = "New User Signup!";

    public static final String INCORRECT_EMAIL = "xyz1234567890@mail.com";
    public static final String INCORRECT_PASSWORD = "xyz1234567890@mail.com";
    public static final String INCORRECT_TEXT = "Your email or password is incorrect!";

    public static final String EMAIL_ADDRESS_ALREADY_EXIST_TEXT = "Email Address already exist!";

    public static final String CONTACT_US_URL = "https://www.automationexercise.com/contact_us";
    public static final String CONTACT_US_TEXT = "GET IN TOUCH";
    public static final String CONTACT_US_NAME = "XYZ";
    public static final String CONTACT_US_EMAIL = "xyz1234567890124@mail.com";
    public static final String CONTACT_US_SUBJECT = "CONTACT US SUBJECT";
    public static final String CONTACT_US_MESSAGE = "CONTACT US MESSAGE";
    public static final String CONTACT_US_SUCCESS_MESSAGE = "Success! Your details have been submitted successfully.";

    public static final String FEATURES_ITEMS_TEXT = "FEATURES ITEMS";


    public static final String TEST_CASES_TEXT = "TEST CASES";

    public static final String TEST_CASES_URL = "https://www.automationexercise.com/test_cases";

    public static final String PRODUCTS_PAGE_URL = "https://www.automationexercise.com/products";
    public static final String PRODUCTS_TEXT = "Products";


    public static final String PRODUCT_NAME_TEXT = "Blue Top";
    public static final String PRODUCT_CATEGORY_TEXT = "Category:";
    public static final String PRODUCT_PRICE_TEXT = "Rs. ";
    public static final String PRODUCT_AVAILABILITY_TEXT = "Availability:";
    public static final String PRODUCT_CONDITION_TEXT = "Condition:";
    public static final String PRODUCT_BRAND_TEXT = "Brand:";


    public static final String SEARCH_TEXT = "Blue Top";
    public static final String SEARCH_PRODUCTS_TEXT = "SEARCHED PRODUCTS";


    public static final String SUBSCRIPTION_US_EMAIL = "xyz@mail.com";
    public static final String SUCCESS_ALERT_TEXT = "'You have been successfully subscribed!'";


    public static final String CART_TEXT = "Shopping Cart";
    public static final String CART_URL = "https://www.automationexercise.com/view_cart";

    public static final String VIEW_PRODUCT_DETAIL_URL = "https://www.automationexercise.com/product_details/1";
    public static final String PRODUCT_QUANTITY_NUMBER = "4";


    public static final String SIGNUP_NAME_INPUT = "ABC";
    public static final String SIGNUP_EMAIL_ADDRESS_INPUT = randomEmail();

    public static final String SIGNUP_EMAIL_ADDRESS_INPUT_2TESTCASE = randomEmail();
    public static final String SIGNUP_EMAIL_ADDRESS_INPUT_TC_23 = randomEmail();
    public static final String SIGNUP_EMAIL_ADDRESS_INPUT_TC_24 = randomEmail();
    public static final String SIGNUP_PAGE_PASSWORD_INPUT = "zxcV%89";
    public static final String SIGNUP_PAGE_DATE_DROPDOWN = "13";
    public static final String SIGNUP_PAGE_MONTH_DROPDOWN = "12";
    public static final String SIGNUP_PAGE_YEAR_DROPDOWN = "2000";
    public static final String SIGNUP_FIRST_NAME_INPUT = "DEF";
    public static final String SIGNUP_SECOND_NAME_INPUT = "GHI";
    public static final String SIGNUP_COMPANY_NAME_INPUT = "ABC Company";
    public static final String SIGNUP_ADDRESS_INPUT = "Random Address1";
    public static final String SIGNUP_ADDRESS2_INPUT = "Random Address2";
    public static final String SIGNUP_COUNTRY_NAME_DROPDOWN = "New Zealand";
    public static final String SIGNUP_STATE_INPUT = "M";
    public static final String SIGNUP_CITY_INPUT = "M";
    public static final String SIGNUP_ZIPCODE_INPUT = "1231";
    public static final String SIGNUP_MOBILE_NUMBER_INPUT = "+3811670130130";
    public static final String SIGNUP_ACCOUNT_CREATED_TXT = "ACCOUNT CREATED!";
    public static final String DELIVERY_ADDRESS_FULL_NAME = "Mr. DEF GHI";
    public static final String BILLING_ADDRESS_FULL_NAME = "Mr. DEF GHI";
    public static final String ORDER_PLACED_PARTIAL_TXT = "Your order has been confirmed!";
    public static final String CHECK_OUT_PAGE_COMMENT = "If you would like to add a comment about your order, please write it in the field below.";
    public static final String NAME_ON_CARD_INPUT = "ABC_DEF_GHI";
    public static final String CARD_NUMBER_INPUT = "4637673603806677";
    public static final String CVC_INPUT = "753";
    public static final String EXPIRATION_MONTH_INPUT = "05";
    public static final String EXPIRATION_YEAR_INPUT = "2027";
    public static final String ORDER_PLACE_SUCCESS_TEXT = "Congratulations! Your order has been confirmed!";

    public static final String LOGIN_PASSWORD_INPUT = "zxcV%1289";

    public static final String SHOPPING_CART_PAGE_TEXT = "Shopping Cart";
    public static final String SHOPPING_CART_PAGE_URL = "https://www.automationexercise.com/view_cart";
    public static final String PRODUCT_REMOVED_TEXT = "Cart is empty! Click here to buy products.";

    public static final String CATEGORY_TEXT = "CATEGORY";
    public static final String WOMEN_TOPS_PRODUCTS_TEXT = "WOMEN - TOPS PRODUCTS";
    public static final String MEN_JEANS_PRODUCTS_TEXT = "MEN - JEANS PRODUCTS";

    public static final String POLO_BRAND_PAGE_URL = "https://www.automationexercise.com/brand_products/Polo";
    public static final String POLO_BRAND_PRODUCTS_TEXT = "BRAND - POLO PRODUCTS";
    public static final String MADAME_BRAND_PAGE_URL = "https://www.automationexercise.com/brand_products/Madame";
    public static final String MADAME_BRAND_PRODUCTS_TEXT = "BRAND - MADAME PRODUCTS";


    public static final String PAGE_URL = "https://www.automationexercise.com/products";
    public static final String SEARCH_TEXT_ONE = "Sleeveless Dress";

    public static final String ALL_PRODUCTS_TEXT = "ALL PRODUCTS";
    public static final String WRITE_YOUR_REVIEW_TEXT = "WRITE YOUR REVIEW";
    public static final String WRITE_YOUR_REVIEW_TEXT_NAME_INPUT = "DRESS REVIEW";
    public static final String WRITE_YOUR_REVIEW_TEXT_WRONG_EMAIL_ADDRESS_INPUT = "abc3";
    public static final String WRITE_YOUR_REVIEW_TEXT_EMAIL_ADDRESS_INPUT = "abc3@mail.com";
    public static final String WRITE_YOUR_REVIEW_TEXT_INPUT = "WRITE YOUR REVIEW HERE";

    public static final String RECOMMENDED_ITEMS_TEXT = "RECOMMENDED ITEMS";
    public static final String STYLISH_DRESS_TEXT = "Stylish Dress";

    public static final String SLIDER_TEXT = "Full-Fledged practice website for Automation Engineers";



    public static final String ERROR_MESSAGE = "Not Found";


}
