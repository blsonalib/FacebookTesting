package com.bridgelabz.facebooktest;

import com.bridgelabz.facebook.generics.AutoConstant;
import com.bridgelabz.facebook.generics.FacebookLibrary;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest implements AutoConstant {
    public WebDriver driver;
    static {
        System.setProperty(GECKO_KEY,GECKO_VALUE);
        System.setProperty(CHROME_KEY,CHROM_VALUE);
    }
    @BeforeTest
    public void openFacebook(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        String url = FacebookLibrary.getProperty(CONFIG_PATH,"URL1");
        driver.manage().window().maximize();
        driver.get(url);
        driver.navigate().refresh();
        String implicitTimeOut = FacebookLibrary.getProperty(CONFIG_PATH, "ImplicitTimeOut");
        int timePeriod = Integer.parseInt(implicitTimeOut);
        driver.manage().timeouts().implicitlyWait(timePeriod, TimeUnit.SECONDS);
    }

    @AfterTest
    public void closeFacebook(){
        driver.close();
    }
   /* @Test
    public void screenShot(String screenShot) throws IOException { ;

        TakesScreenshot scrShot = (TakesScreenshot) driver;
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("/home/admin1/Documents/PrajktaRaut/Facebook_Testing/Screenshot/"+screenShot+"_"+".jpg");
        FileUtils.copyFile(srcFile,destFile);
    }*/
}
