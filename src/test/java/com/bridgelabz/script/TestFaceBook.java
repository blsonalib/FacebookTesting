package com.bridgelabz.script;

import com.bridgelabz.facebook.generics.AutoConstant;
import com.bridgelabz.facebook.generics.FacebookLibrary;
import com.bridgelabz.pages.FacebookLoginPage;
import com.bridgelabz.pages.FacebookRegisterForm;
import org.testng.annotations.Test;

public class TestFaceBook extends BaseTest {


    @Test(description = "login facebook page")
    public void loginFacebook() throws InterruptedException {

        FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
        String username = FacebookLibrary.getCellValue(AutoConstant.EXCEL_PATH,"Sheet1",1,0);
        String password = FacebookLibrary.getCellValue(AutoConstant.EXCEL_PATH,"Sheet1",1,1);
        facebookLoginPage.setUserName(username);
        Thread.sleep(2000);
        facebookLoginPage.setPassword(password);
        Thread.sleep(2000);
        facebookLoginPage.clickButton();
        Thread.sleep(2000);
    }

    @Test(description = "Register facebook page")
    public void registerFacebook() throws InterruptedException {
        FacebookRegisterForm facebookRegisterForm = new FacebookRegisterForm(driver);
        facebookRegisterForm.setFirstName("sonali");
        Thread.sleep(2000);
        facebookRegisterForm.setLastName("Bankar");
        Thread.sleep(2000);
        facebookRegisterForm.setMobileNumber("9956764763");
        Thread.sleep(2000);
        facebookRegisterForm.setNewPassword("65361576");
        Thread.sleep(2000);
        facebookRegisterForm.setBirthDate(19);
        Thread.sleep(2000);
        facebookRegisterForm.setBirthMonth("May");
        Thread.sleep(2000);
        facebookRegisterForm.setBirthYear("1994");
        Thread.sleep(2000);
        facebookRegisterForm.setGender();
        Thread.sleep(2000);
        facebookRegisterForm.setSignUp();
        Thread.sleep(3000);
    }
}
