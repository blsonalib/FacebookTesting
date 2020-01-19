package com.bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragonDrop {
    @FindBy(xpath = "//a[contains(text(),'BANK')]")
    private WebElement from;
    @FindBy(id = "bank")
    private WebElement To;
    public DragonDrop(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
public void dragDropOperation() throws InterruptedException {
    WebDriver driver = null;
    Actions act=new Actions(driver);
    act.dragAndDrop(from, To).build().perform();
    Thread.sleep(7000);
}
}
