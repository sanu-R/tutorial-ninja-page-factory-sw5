package com.tutorialsninja.pages;


import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='My Account']")
    WebElement myAccount;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
    WebElement register;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerText;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement returnCustomer;
    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement name;
    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement surName ;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement eMail ;
    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephone ;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement passWord ;
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement passWordConfirm;

    @CacheLookup
    @FindBy(xpath ="//label[@class='radio-inline']//input[@value='1']")
    WebElement  radioButton;
    @CacheLookup
    @FindBy(xpath ="//input[@type='checkbox']")
    WebElement privacyPolicy;
    @CacheLookup
    @FindBy(xpath ="//div[@class = 'buttons']//input[@value='Continue']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath ="//h1[text()='Your Account Has Been Created!']")
    WebElement  verifyMessageYourAccount ;
    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'Continue')]")
    WebElement conButton ;
    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'My Account')]")
    WebElement myAccountLink ;
    @CacheLookup
    @FindBy(xpath ="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']")
    WebElement logOut;
    @CacheLookup
    @FindBy(xpath ="//h1[contains(text(),'Account Logout')]")
    WebElement verifyLogoutText;
    @CacheLookup
    @FindBy(xpath ="//a[contains(text(),'Continue')]")
    WebElement lastContinueButt;




    public void clickOnMyAccountLink() {
        clickOnElement(myAccount);
    }

    public void clickOnRegister() {
        clickOnElement(register);
    }

    public String verifyTheTextRegisterAccount() {
        return getTextFromElement(registerText);


    }

    public String verifyTheRetuningCustomer() {
        return getTextFromElement(returnCustomer);

    }

    public void enterFirstName(String fN) {
        sendTextToElement(name,fN);
    }

    public void enterLastName(String sN) {
        sendTextToElement(surName,sN);
    }

    public void enterEmail(String m) {
     sendTextToElement(eMail,m);
    }

    public void enterTelephone(String tel) {
        sendTextToElement(telephone,tel);

    }

    public void enterPassword(String pas) {
        sendTextToElement(passWord,pas);

    }

    public void confirmPassword(String conPas) {
        sendTextToElement(passWordConfirm,conPas);

    }

    public void clickOnRadioButton() {
        clickOnElement(radioButton);
    }

    public void clickOnPrivacyPolicy() {
        clickOnElement(privacyPolicy);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public String verifyMessageYourAccountHasBeenCreated() {
        return getTextFromElement(verifyMessageYourAccount);

    }

    public void clickOnContinueButtonSecond() {
        clickOnElement(conButton);
    }

    public void clickOnMyAccountLinkLast() {
        clickOnElement(myAccountLink);
    }

    public void clickOnLogOut() {
        clickOnElement(logOut);
    }

    public  String verifyTheLogoutMessage() {

        return getTextFromElement(verifyLogoutText);

    }

    public void clickOnLastContinueButton() {
        clickOnElement(lastContinueButt);
    }


}
