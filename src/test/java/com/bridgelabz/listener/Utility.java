package com.bridgelabz.listener;

import com.bridgelabz.facebooktest.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class  Utility extends BaseTest {

    public void screenShot(String screenShot) throws IOException {
        // System.out.println("Addded");

        TakesScreenshot scrShot = (TakesScreenshot) driver;
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        System.out.println("gjhjfdkgh");
        File destFile = new File("/home/admin1/Documents/PrajktaRaut/Facebook_Testing/screenShot/"+screenShot+"_"+".jpg");
        FileUtils.copyFile(srcFile,destFile);
    }
}
