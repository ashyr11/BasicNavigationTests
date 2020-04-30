package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {
        chromeMethod();
        firefoxMethod();
        edgeMethod();
    }

    public static void chromeMethod(){
        WebDriver driver=BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://google.com");
        String actualGoogle =driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String actualEtsy=driver.getTitle();

        driver.navigate().back();
        String expectedGoogle=driver.getTitle();

        StringUtility.verifyEquals(actualGoogle,expectedGoogle);

        driver.navigate().forward();
        String expectedEtsy=driver.getTitle();

        StringUtility.verifyEquals(actualEtsy,expectedEtsy);
        driver.quit();

    }

    public static void firefoxMethod(){
        WebDriver driver=BrowserFactory.getDriver("firefox");
        driver.manage().window().maximize();
        driver.get("https://google.com");
        String actualGoogle=driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String actualEtsy=driver.getTitle();

        driver.navigate().back();
        String expectedGoogle=driver.getTitle();

        StringUtility.verifyEquals(actualGoogle,expectedGoogle);

        driver.navigate().forward();
        String expectedEtsy=driver.getTitle();

        StringUtility.verifyEquals(actualEtsy,expectedEtsy);
        driver.quit();

    }

    public static void edgeMethod(){
        WebDriver driver=BrowserFactory.getDriver("edge");
        driver.manage().window().maximize();
        driver.get("https://google.com");
        String actualGoogle=driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String actualEtsy=driver.getTitle();

        driver.navigate().back();
        String expectedGoogle=driver.getTitle();

        StringUtility.verifyEquals(actualGoogle,expectedGoogle);

        driver.navigate().forward();
        String expectedEtsy=driver.getTitle();

        StringUtility.verifyEquals(actualEtsy,expectedEtsy);
        driver.quit();

    }
}
