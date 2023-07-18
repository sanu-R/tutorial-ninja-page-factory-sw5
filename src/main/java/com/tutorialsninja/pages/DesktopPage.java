package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")

    WebElement desktopsText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")

    WebElement descending;

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Name (Z - A)')]")
    WebElement desOder;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement product;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='HP LP3065']")
    WebElement hPText;
    @CacheLookup
    @FindBy(id = "input-option225")
    WebElement deliveryDateInput;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currency;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='£Pound Sterling']")
    WebElement currencyChange;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement successMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Shopping Cart')]")
    WebElement textShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//small[contains(text(),'Delivery Date:2022-11-30')] ")
    WebElement deliveryDate;

    @CacheLookup
    @FindBy(xpath = "//td[contains(text(),'Product 21')]")
    WebElement model;
    @CacheLookup
            @FindBy(xpath ="//div[@class = 'table-responsive']/table/tbody/tr/td[6]" )
            WebElement total;



    public String verifyTheDesktopsText() {
        return getTextFromElement(desktopsText);

    }


    public void descendingOrder() {
        clickOnElement(descending);

    }

    public String desOderVerify() {
        return getTextFromElement(desOder);
    }

    public void clickOnProduct() {
        clickOnElement(product);
    }

    public String verifyTheTextHp() {
        return getTextFromElement(hPText);

    }

    public void pickDeliveryDate(String date) {
     deliveryDateInput.clear();

        deliveryDateInput.sendKeys(date);
    }

    public void clickOnCurrencyChange() {
        clickOnElement(currency);
    }

    public void selectCurrencyPound() {
        mouseHoverToElementAndClick(currencyChange);
    }

    public void giveQty(String add) {
     quantity.clear();

       quantity.sendKeys(add);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String verifyTheMessageSuccessYouHaveAddedHp() {
        return getTextFromElement(successMessage);
    }

    public void clickOnShoppingCartDisplayIntoSuccessMessage() {
        clickOnElement(shoppingCart);
    }

    public String verifyTheTextShoppingCart() {
        return getTextFromElement(textShoppingCart);
    }

    public String verifyTheProductName() {
        return getTextFromElement(productName);
    }

    public String verifyTheDeliveryDate() {
        return getTextFromElement(deliveryDate);
    }

    public String verifyTheModel() {
        return getTextFromElement(model);
    }

    public String verifyTheTotal() {
        return getTextFromElement(total);
    }


}
