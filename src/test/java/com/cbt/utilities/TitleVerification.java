package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver=BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get(urls.get(0));
        String expectedTitle=driver.getTitle();
        System.out.println("Verify Title");
        for (String each : urls) {
            driver.get(each);
            StringUtility.verifyEquals(driver.getTitle(), expectedTitle );
        }

        System.out.println("Verify URL");

        for (String each : urls) {
            driver.get(each);
            if( driver.getCurrentUrl().startsWith("http://practice.cybertekschool.com") ){
                System.out.println("URL Verification passed "+each);
            }else {
                System.out.println("URL Verification failed "+each);
            }
        }

        driver.quit();

    }
}
