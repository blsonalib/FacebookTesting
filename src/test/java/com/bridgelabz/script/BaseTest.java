package com.bridgelabz.script;

import com.bridgelabz.facebook.generics.AutoConstant;
import com.bridgelabz.facebook.generics.FacebookLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

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
        String url = FacebookLibrary.getProperty(CONFIG_PATH,"URL");
        driver.manage().window().maximize();
        driver.get(url);
        String implicitTimeOut = FacebookLibrary.getProperty(CONFIG_PATH, "ImplicitTimeOut");
        int timePeriod = Integer.parseInt(implicitTimeOut);
        driver.manage().timeouts().implicitlyWait(timePeriod, TimeUnit.SECONDS);
    }
    @AfterTest
    public void closeFacebook(){
        driver.close();
    }
}
