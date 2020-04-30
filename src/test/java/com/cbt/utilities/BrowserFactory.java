package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManagerException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String browserName){

        String OSname=System.getProperty("os.name");

       if(browserName.equals("safari")){
           if(OSname.contains("Mac")){
               return new SafariDriver();
           }
           else if(OSname.contains("Windows")){
               return null;
           }
       }

       else if(browserName.equals("edge")){
            if(OSname.contains("Windows")){
               WebDriverManager.edgedriver().setup();
               return new EdgeDriver();
            }
            else if(OSname.contains("Mac")){
                return null;
            }
        }

        else if(browserName.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
        else if(browserName.equals("chrome")){

            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }

       return null;
    }
}
