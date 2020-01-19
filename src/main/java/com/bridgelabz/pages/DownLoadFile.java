package com.bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownLoadFile {
    @FindBy(id = "blob")
    private WebElement downloadFile;
    public  DownLoadFile(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public void downLoadFile(){
        downloadFile.click();
    }
}
