package com.tutorialsninja.pages;


import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LaptopAndNotebooksPage extends Utility {
    HomePage homePage = new HomePage();
    @CacheLookup
    @FindBy(xpath = "//h2[text()= 'Laptops & Notebooks']")
    WebElement laptopsAndNotebooksText;

    public String verifyLaptopsAndNotebooksText() {
        return getTextFromElement(laptopsAndNotebooksText);

    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort'")
    WebElement sortPrice;
    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Price (High > Low)')]")
    WebElement verifyProductArrange;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currency;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='£Pound Sterling']")
    WebElement currencyChange;
    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement macBook;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'MacBook')]")
    WebElement macText;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement add;
    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement messageSuccess;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement verifyProductName;

    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement quan;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement updateTab;
    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement verifyTheModifiedMessage;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement verifyTotal;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement conBut;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Checkout')]")
    WebElement checkOutButt;
    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestCheck;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueTab;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-telephone']")
    WebElement telephone;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-address-1']")
    WebElement address;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-city']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement postCode;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement zone;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement clickOnCon;

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Add Comments About Your Order')]")
    WebElement addComment;

    @CacheLookup
    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement termAndCondition;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement continueButtonPress;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    WebElement warning;


    public void selectTextHighToLow() {
        selectByVisibleTextFromDropDown(sortPrice, "Price (High > Low)");
    }

    public String verifyProductPriceWillArrangeInHighToLow() {
        return getTextFromElement(verifyProductArrange);
    }

    public void clickOnCurrencyChange() {
        clickOnElement(currency);
    }

    public void selectCurrencyPound() {
        mouseHoverToElementAndClick(currencyChange);
    }

    public void clickProductMacbook() {
        clickOnElement(macBook);
    }

    public String verifyMacBookText() {
        return getTextFromElement(macText);
    }

    public void clickAddToCart() {
        clickOnElement(add);
    }

    public String verifyTextMessageSuccessYouHaveAddedMacbook() {
        return getTextFromElement(messageSuccess);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

    public void changeQuantity(String qut) {
      quan.clear();
        sendTextToElement(quan,qut);
    }

    public String VerifyTheTextShoppingCart() {
        return getTextFromElement(shoppingCartText);
    }

    public String VerifyTheProductNameMacBook() {
        return getTextFromElement(verifyProductName);
    }

    public void clickOnUpdateTab() {
        clickOnElement(updateTab);
    }

    public String verifyYouHaveModifiedYourShoppingCart() {
        return getTextFromElement(verifyTheModifiedMessage);
    }

    public String  verifyTheTotalPrice() {

        return getTextFromElement(verifyTotal);

    }

    public void clickOnContButtonForMac() {
        clickOnElement(conBut);
    }

    public String verifyTheTextCheckOut() {
        return getTextFromElement(checkOutButt);

    }

    public void clickOnRadioButton() {
        clickOnElement(guestCheck);
    }

    public void clickOnContinueTab() {
        clickOnElement(continueTab);
    }
    public void fillUserN(String user){
        sendTextToElement(firstName,user);
    }
    public void fillLastN(String lName){
        sendTextToElement(lastName,lName);
    }
    public void fillEmail(String eMail){
        sendTextToElement(email,eMail);
    }
    public void fillPhone(String phone){
        sendTextToElement(telephone,phone);
    }
    public void fillAddress(String add){
        sendTextToElement(address,add);
    }
    public void fillCity(String c){
        sendTextToElement(city,c);
    }
    public void fillPostcode(String post){
        sendTextToElement(postCode,post);
    }
    public void fillCountry(String con){
        sendTextToElement(country,con);
    }
    public void selectZone(String drop){
        selectByVisibleTextFromDropDown(zone,drop);
    }


    public void clickOnContinueBottom() {
        clickOnElement(clickOnCon);
    }

    public void addCommentThanks() {
        sendTextToElement(addComment, "Thank you.");
    }

    public void termAndConditionCheckBox() {
        clickOnElement(termAndCondition);
    }

    public void continueButtonPressForOnce() {
        clickOnElement(continueButtonPress);

    }

    public String warningMessagePayments() {
        return getTextFromElement(warning);

    }


}