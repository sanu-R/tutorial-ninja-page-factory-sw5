package com.tutorialsninja.testsuite;

import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopAndNotebooksPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class HomePageTest {
    HomePage homePage;
    DesktopPage desktopPage;
    LaptopAndNotebooksPage laptopAndNotebooksPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        desktopPage = new DesktopPage();
        laptopAndNotebooksPage = new LaptopAndNotebooksPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.mouseHoverOnDesktopTab();
        //1.2 call selectMenu method and pass the menu = “Show All Desktops”
        homePage.mouseHoverAndClickOnShowAllDesktops();
        //  1.3 Verify the text ‘Desktops’
        Assert.assertEquals(desktopPage.verifyTheDesktopsText(), "Desktops", "text not found");

    }

    @Test(groups = {"sanity", "smoke", "regression"})
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.mouseHoverOnLaptopsAndNotebookTab();

        //2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        homePage.mouseHoverAndClickOnLaptopsAndNotebookTab();

        //2.3 Verify the text ‘Laptops & Notebooks’
        Assert.assertEquals(laptopAndNotebooksPage.verifyLaptopsAndNotebooksText(), "Laptops & Notebooks", "text not found");

    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {

        //3.1 Mouse hover on “Components” Tab and click
        homePage.mouseHoverOnComponents();
        //3.2 call selectMenu method and pass the menu = “Show All Components”
        homePage.mouseHoverAndClickOnShowAllComponents();
        //3.3 Verify the text ‘Components’
        Assert.assertEquals(homePage.verifyComponentsText(), "Components", "Text not found");

    }


}
