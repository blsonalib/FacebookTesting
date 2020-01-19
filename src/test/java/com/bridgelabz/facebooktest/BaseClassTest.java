package com.bridgelabz.facebooktest;

import com.bridgelabz.facebook.generics.AutoConstant;
import com.bridgelabz.facebook.generics.FacebookLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseClassTest implements AutoConstant {
    public WebDriver driver;
    static {
        System.setProperty(GECKO_KEY,GECKO_VALUE);
        System.setProperty(CHROME_KEY,CHROM_VALUE);
    }
    @BeforeTest
    public void setUp(){

        driver = new ChromeDriver();
     //   String url = FacebookLibrary.getProperty(CONFIG_PATH,"URL");
        //String url = FacebookLibrary.getProperty(CONFIG_PATH,"URL1");
        //String url = FacebookLibrary.getProperty(CONFIG_PATH,"URL2");
       // String url = FacebookLibrary.getProperty(CONFIG_PATH,"URL3");
        String url = FacebookLibrary.getProperty(CONFIG_PATH,"URL4");
        driver.manage().window().maximize();
        driver.get(url);
        String implicitTimeOut = FacebookLibrary.getProperty(CONFIG_PATH, "ImplicitTimeOut");
        int timePeriod = Integer.parseInt(implicitTimeOut);
        driver.manage().timeouts().implicitlyWait(timePeriod, TimeUnit.SECONDS);
    }
}
