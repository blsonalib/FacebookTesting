package com.bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogOutPage {
    @FindBy(id = "userNavigationLabel")
    private WebElement logOutDropDown;
    @FindBy(xpath = "//span[contains(text(),'Log Out')]")
    private WebElement logOut;

    public FacebookLogOutPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public void clickOnDropDownButton(){
        logOutDropDown.click();
    }
    public void ClickOnLogOut(){
        logOut.click();
    }
}
