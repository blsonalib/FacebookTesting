package com.bridgelabz.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegisterForm {
    @FindBy(name = "firstname")
    private WebElement fName;
    @FindBy(name = "lastname")
    private WebElement lName;
    @FindBy(name="reg_email__")
    private WebElement mobileNumber;
    @FindBy(name="reg_passwd__")
    private WebElement newPassword;
    @FindBy(id = "day")
    private WebElement bDay;
    @FindBy(id = "month")
    private WebElement bMonth;
    @FindBy(id = "year")
    private WebElement bYear;
    @FindBy(xpath = "//label[contains(text(),'Female')]")
    private WebElement genderFemale;
    @FindBy(name = "websubmit")
    private WebElement signUp;

    public FacebookRegisterForm(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    public void setFirstName(String firstName){
        fName.sendKeys(firstName);
    }
    public void setLastName(String lastName){

        lName.sendKeys(lastName);
    }
    public void setMobileNumber(String mobileNo){
        mobileNumber.sendKeys(mobileNo);
    }
    public void setNewPassword(String newPass){
        newPassword.sendKeys(newPass);
    }
    public void setBirthDate(int date){
        Select dateOfBirth = new Select(bDay);
        dateOfBirth.selectByIndex(date);
    }
    public void setBirthMonth(String month){
        Select dateOfBirth = new Select(bMonth);
        dateOfBirth.selectByVisibleText(month);
    }
    public void setBirthYear(String year){
        Select dateOfBirth = new Select(bYear);
        dateOfBirth.selectByVisibleText(year);
    }
    public void setGender(){
        genderFemale.click();
    }

    public void clickSignUp(){
        signUp.click();
    }
}
