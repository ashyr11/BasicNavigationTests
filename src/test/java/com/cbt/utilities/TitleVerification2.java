package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com ", "https://westelm.com/");

        WebDriver driver=BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();

        for (String each : urls) {
            driver.get(each);
            String title=driver.getTitle().toLowerCase().replace(" ","");
            if( driver.getCurrentUrl().contains(title) ){
                System.out.println("TEST PASSED "+each);
            }
            else {
                System.out.println("TEST FAILED "+each);
            }
        }
        driver.quit();
    }
}
