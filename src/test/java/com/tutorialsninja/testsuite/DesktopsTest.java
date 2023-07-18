package com.tutorialsninja.testsuite;

import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class DesktopsTest extends BaseTest {
    DesktopPage desktopPage;
    HomePage homePage;
    @BeforeMethod(alwaysRun = true)
    public void inIT(){
        desktopPage = new DesktopPage();
       homePage = new HomePage();
    }


    @Test(groups = {"sanity","regression"})
    public void verifyProductArrangeInAlphabeticalOrder() {
        //1.1 Mouse hover on Desktops Tab.and click
        homePage.mouseHoverOnDesktopTab();
        //1.2 Click on “Show All Desktops”
        homePage.mouseHoverAndClickOnShowAllDesktops();
        //1.3 Select Sort By position "Name: Z to A"
        desktopPage.descendingOrder();
        //1.4 Verify the Product will arrange in Descending order.
        desktopPage.desOderVerify();


    }

   @Test(groups = {"sanity", "smoke","regression"})



    public void verifyProductAddedToShoppingCartSuccessFully() {

        //2.1 Mouse hover on Desktops Tab.and click
        homePage.mouseHoverOnDesktopTab();
        //2.2 Click on “Show All Desktops”
        homePage.mouseHoverAndClickOnShowAllDesktops();
        desktopPage.clickOnCurrencyChange();
        desktopPage.selectCurrencyPound();
        //2.4 Select product “HP LP3065”
        desktopPage.clickOnProduct();
        //2.5 Verify the Text "HP LP3065"
        Assert.assertEquals(desktopPage.verifyTheTextHp(),"HP LP3065","Text not found");
        //2.6 Select Delivery Date "2022-11-30"
        desktopPage.pickDeliveryDate("2022-11-30");
        //2.7.Enter Qty "1” using Select class.
        desktopPage.giveQty("1");
        //2.8 Click on “Add to Cart” button
        desktopPage.clickOnAddToCart();
        //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
      //  Assert.assertEquals(desktopPage.verifyTheMessageSuccessYouHaveAddedHp(),"You have added HP LP3065 to your shopping cart!","Text not displayed");
        //2.10 Click on link “shopping cart” display into success message
        desktopPage.clickOnShoppingCartDisplayIntoSuccessMessage();
        //2.11 Verify the text "Shopping Cart"
        String expectedMessage2 = "Shopping Cart";
        String actualMessage2 = desktopPage.verifyTheTextShoppingCart();
        Assert.assertEquals(actualMessage2, expectedMessage2, "Text not displayed");
        //2.12 Verify the Product name "HP LP3065"
        String expectedMessage3 = "HP LP3065";
        String actualMessage3 = desktopPage.verifyTheProductName();
        Assert.assertEquals(actualMessage3, expectedMessage3, "Text not displayed");
        desktopPage.verifyTheProductName();
        //2.13 Verify the Delivery Date "2022-11-30"
        String expectedMessage4 = "2022-11-30";
        String actualMessage4 = desktopPage.verifyTheDeliveryDate();
       // Assert.assertEquals(actualMessage4, expectedMessage4, "Text not displayed");
        //2.14 Verify the Model "Product21"
        String expectedMessage5 = "Product21";
        String actualMessage5 = desktopPage.verifyTheModel();
      //  Assert.assertEquals(actualMessage5, expectedMessage5, "Text not displayed");
        //2.15 Verify the Total "£74.73"
        String expectedMessage6 = "£74.73";
        String actualMessage6 = desktopPage.verifyTheTotal();
        Assert.assertEquals(actualMessage6, expectedMessage6, "Text not displayed");


    }

}
