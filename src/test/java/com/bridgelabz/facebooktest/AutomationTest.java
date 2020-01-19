package com.bridgelabz.facebooktest;

import com.bridgelabz.pages.DownLoadFile;
import com.bridgelabz.pages.DragonDrop;
import com.bridgelabz.pages.UploadFile;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class AutomationTest extends BaseClassTest
{
    @Test
    public void fileUpload() throws AWTException {

        Robot robot = new Robot();
        robot.setAutoDelay(2000);
        driver.findElement(By.id("imagesrc")).click();
        StringSelection selection = new StringSelection("/home/admin1/.bash_logout");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
        robot.setAutoDelay(3000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.setAutoDelay(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.setAutoDelay(3000);
    }

    @Test
    public void fileUploadUsingSendKey() throws InterruptedException {

        UploadFile uploadFile = new UploadFile(driver);
        uploadFile.fileUpload();
        Thread.sleep(2000);
    }

    @Test
    public void fileDownload() throws InterruptedException {

        DownLoadFile LoadFile = new DownLoadFile(driver);
        LoadFile.downLoadFile();
        Thread.sleep(2000);
    }

    @Test
    public void drageDrop() throws InterruptedException {
        WebElement From=driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
        WebElement To=driver.findElement(By.id("bank"));
        Actions act=new Actions(driver);
        act.dragAndDrop(From, To).build().perform();
        Thread.sleep(7000);
    }

    @Test
    public void alertOperation() throws InterruptedException {
        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).click();
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        alert.accept();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        driver.quit();
    }
}
