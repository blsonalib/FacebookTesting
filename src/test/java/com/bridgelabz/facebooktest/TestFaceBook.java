package com.bridgelabz.facebooktest;

import com.bridgelabz.facebook.generics.AutoConstant;
import com.bridgelabz.facebook.generics.FacebookLibrary;
import com.bridgelabz.listener.FacebookListener;
import com.bridgelabz.pages.FacebookHomePage;
import com.bridgelabz.pages.FacebookLogOutPage;
import com.bridgelabz.pages.FacebookLoginPage;
import com.bridgelabz.pages.FacebookRegisterForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

@Listeners(FacebookListener.class)
public class TestFaceBook extends BaseTest {

    @Test()
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

    @Test()
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
        facebookRegisterForm.clickSignUp();
        Thread.sleep(3000);
        Assert.assertEquals(false,true);
    }

   @Test
    public void homeAndPost() throws InterruptedException, AWTException {
       FacebookHomePage homePage = new FacebookHomePage(driver);
       loginFacebook();

       Robot robot = new Robot();
       driver.findElement(By.xpath("//a[@class='_7kfu']"));
       robot.mouseMove(340, 510);
       Thread.sleep(2000);
       robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
       robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
       Thread.sleep(3000);
       for (int i = 0; i <= 2; i++) {
           robot.keyPress(KeyEvent.VK_TAB);
           robot.keyRelease(KeyEvent.VK_TAB);
           Thread.sleep(3000);
       }
       robot.keyPress(KeyEvent.VK_ENTER);
       robot.keyRelease(KeyEvent.VK_ENTER);
       Thread.sleep(3000);
       robot.keyPress(KeyEvent.VK_RIGHT);
       robot.keyRelease(KeyEvent.VK_RIGHT);
       Thread.sleep(3000);
       robot.keyPress(KeyEvent.VK_ENTER);
       robot.keyRelease(KeyEvent.VK_ENTER);
       Thread.sleep(2000);
       robot.keyPress(KeyEvent.VK_ENTER);
       robot.keyRelease(KeyEvent.VK_ENTER);
       Thread.sleep(3000);
    }

      @Test
       public void facebookLogOut () throws InterruptedException {
           FacebookLogOutPage logOutPage = new FacebookLogOutPage(driver);
           loginFacebook();
           logOutPage.clickOnDropDownButton();
           Thread.sleep(1000);
           logOutPage.ClickOnLogOut();
           Thread.sleep(1000);
       }
}
