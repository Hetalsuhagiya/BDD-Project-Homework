package org.example;


import org.openqa.selenium.By;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
public class Utils extends BasePage {
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static long timestamp() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }

    public static long datestamp() {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("dd-MM-yyyy-hh:mm");
        return simpledateformat.hashCode();
    }

    public static void selectOptionByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static void selectOptionByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }

    public static void selectOptionByIndex(By by, int index) {
        Select select = new Select((driver.findElement(by)));
        select.selectByIndex(index);
    }
    public static String currentTimeStamp() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhhmmss");
        return sdf.format(date);
    }
    public static void captureScreenshot(String fileName) {
        //convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) driver);

        //Call getScreenshotAs method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination
        File desFile = new File("src\\test\\Screenshots\\" + fileName + "" + currentTimeStamp() + ".png");

        //copy file at destination
        try {
            FileUtils.copyFile(SrcFile, desFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
