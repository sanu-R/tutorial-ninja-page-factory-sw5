package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[text()='Desktops']")
    WebElement desktopsTab;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Show AllDesktops')]")
    WebElement selectShowAllDesktops;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Laptops & Notebooks']")
    WebElement laptopsAndNotebooksTab;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Show AllLaptops & Notebooks']")
    WebElement selectShowAllLaptopsAndNotebooks;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Components']")
    WebElement componentsTab;
    @CacheLookup
    @FindBy(xpath = "//a[text()='Show AllComponents']")
    WebElement showAllComponents;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement componentText;
    @CacheLookup
    @FindBy(xpath = "//div[@id='top-links']//li[contains(@class,'open')]/ul/li")
    List<WebElement> toplink;

    public void mouseHoverOnDesktopTab() {
        mouseHoverToElement(desktopsTab);
    }

    public void mouseHoverAndClickOnShowAllDesktops() {
        mouseHoverToElementAndClick(selectShowAllDesktops);
    }

    public void mouseHoverOnLaptopsAndNotebookTab() {
        mouseHoverToElement(laptopsAndNotebooksTab);
    }

    public void mouseHoverAndClickOnLaptopsAndNotebookTab() {
        mouseHoverToElementAndClick(selectShowAllLaptopsAndNotebooks);
    }

    public void mouseHoverOnComponents() {
        mouseHoverToElement(componentsTab);
    }

    public void mouseHoverAndClickOnShowAllComponents() {
        mouseHoverToElementAndClick(showAllComponents);
    }

    public String verifyComponentsText() {
        return getTextFromElement(componentText);


    }

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(toplink);
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(toplink);
        }
    }


}
