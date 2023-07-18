package com.tutorialsninja.testsuite;

import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class MyAccountPageTest extends BaseTest {
    HomePage homePage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        registerPage = new RegisterPage();


    }

    @Test(groups = {"sanity", "regression"})

    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //1.1 Click on My Account Link.
        registerPage.clickOnMyAccountLink();
        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Register”
        homePage.selectMyAccountOptions("Register");
        //1.3 Verify the text “Register Account”.
        Assert.assertEquals(registerPage.verifyTheTextRegisterAccount(), "Register Account", "Text not found");


    }

    @Test(groups = {"sanity", "smoke", "regression"})

    public void verifyUserShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        //2.1 Click on My Account Link.
        registerPage.clickOnMyAccountLink();
        Thread.sleep(1000);
        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Login”
        Thread.sleep(1000);
        homePage.selectMyAccountOptions("Login");
        //2.3 Verify the text “Returning Customer”
        Assert.assertEquals(registerPage.verifyTheRetuningCustomer(), "Returning Customer", "Text not found");


    }

    @Test(groups = {"smoke", "regression"})

    public void verifyThatUserRegisterAccountSuccessfully() throws InterruptedException {
        //3.1 Click on My Account Link.
        Thread.sleep(1000);
        registerPage.clickOnMyAccountLink();
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Register”
        homePage.selectMyAccountOptions("Register");
        Thread.sleep(1000);
        //3.3 Enter First Name
        registerPage.enterFirstName("Rita");
        Thread.sleep(1000);
        //3.4 Enter Last Name
        registerPage.enterLastName("Smith");
        Thread.sleep(1000);
        //3.5 Enter Email
        registerPage.enterEmail("real123@gmail.com");
        Thread.sleep(1000);
        //3.6 Enter Telephone
        registerPage.enterTelephone("09876543234");
        Thread.sleep(1000);
        //3.7 Enter Password
        registerPage.enterPassword("real1234");
        Thread.sleep(1000);
        //3.8 Enter Password Confirm
        registerPage.confirmPassword("real1234");
        Thread.sleep(1000);
        //3.9 Select Subscribe Yes radio button
        registerPage.clickOnRadioButton();
        Thread.sleep(1000);
        //3.10 Click on Privacy Policy check box
        registerPage.clickOnPrivacyPolicy();
        //3.11 Click on Continue button
        Thread.sleep(1000);
        registerPage.clickOnContinueButton();
        //3.12 Verify the message “Your Account Has Been Created!”
        Assert.assertEquals(registerPage.verifyMessageYourAccountHasBeenCreated(), "Your Account Has Been Created!", "Text not found");
        Thread.sleep(1000);
        //3.13 Click on Continue button
        registerPage.clickOnContinueButtonSecond();
        Thread.sleep(1000);
        //3.14 Click on My Account Link.
        registerPage.clickOnMyAccountLinkLast();
        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter
        //“Logout”
        homePage.selectMyAccountOptions("Logout");
        Thread.sleep(1000);
        //3.16 Verify the text “Account Logout”
        Assert.assertEquals(registerPage.verifyTheLogoutMessage(), "Account Logout", "Text not found");
        Thread.sleep(1000);
        //3.17 Click on Continue button
        registerPage.clickOnLastContinueButton();
    }

}
