package org.example;

import org.openqa.selenium.By;

public class LogInPage extends Utils{
    private By _Login = By.xpath("//a[contains(@class,'ico-login')]");
    public void clickOnLogInButton(){
        //click on Log-in button
        clickOnElement(_Login);
    }
}
