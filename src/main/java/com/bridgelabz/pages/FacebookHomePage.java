package com.bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FacebookHomePage {
    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElement home;
    @FindBy(xpath = "//a[@class='_7kfu']")
    private WebElement addStory;
    @FindBy(id = "js_1rf")
    private WebElement selectPhoto;
    @FindBy(id = "js_62")
    private WebElement clickPhoto;

    // @FindBy(xpath = "//section[@class='_vli']//div[@class='_1sez']")
    /*private WebElement yourStoryCheckBox;
    @FindBy(xpath = "//div[@class='_5yk2']//div[@class='_5rp7']//div[@class='_5rpb']//div[@class='notranslate _5rpu']//div//div//div[@class='_1mf _1mj']")
    private WebElement writeStory;
    @FindBy(xpath = "")
    private WebElement postText;

    @FindBy(xpath = "//div[@class='_cy6']//div[@class='_4kny']")
    private WebElement profile;
    @FindBy(xpath = "//span[@class='_30w0 _50f7']")
    private WebElement imageIcon;
    @FindBy(name = "pic")
    private WebElement uploadPhotoLink;*/
    public FacebookHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickHome() {
        home.click();
    }

    public void clickAddStory() {
        addStory.click();
    }

    /* public void setAddStory() {
             yourStoryCheckBox.isSelected();
     }
     public void writeSomething(String text){
     writeStory.sendKeys(text);
     }
     public void clickPostText(){
         postText.submit();
     }
     public void clickProfile(){
         profile.click();
     }
      public void clickImageIcon(){
          imageIcon.click();
      }
      public void clickOnPhotos(){
          selectPhoto.click();
      }*/

    }



