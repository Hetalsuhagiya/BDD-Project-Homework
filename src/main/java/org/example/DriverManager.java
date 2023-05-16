package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils{
    LoadProp loadProp = new LoadProp();
    String browserName = loadProp.getProperty("browserName");
    public void openBrowser() {
        //open Chrome browser
        if (browserName.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
            //open Firefox browser
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
            //open Edge browser
        } else if (browserName.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else
            System.out.println("Your browser name is incorrect or not implemented" + browserName);
        driver.get(loadProp.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void closeBrowser() {
        driver.close();
    }

}
