package com.bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "pass")
    private WebElement password;

    @FindBy(id = "loginbutton")
    private WebElement login;

    public FacebookLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void setUserName(String userName) {
        email.sendKeys(userName);
    }

    public void setPassword(String password1) {
        password.sendKeys(password1);
    }

    public void clickButton() {
        login.click();
    }
}
