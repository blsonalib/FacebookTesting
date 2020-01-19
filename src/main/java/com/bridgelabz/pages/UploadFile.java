package com.bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFile {
    @FindBy(id = "imagesrc")
    private WebElement uploadFile;
    public  UploadFile(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public void fileUpload(){
        uploadFile.sendKeys("/home/admin1/Downloads/USCensusData.csv");
    }
}
