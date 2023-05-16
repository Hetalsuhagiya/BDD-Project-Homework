package org.example;

import org.openqa.selenium.By;

public class LogInPageDetails extends Utils{
    LoadProp loadProp = new LoadProp();
    private By _Email = By.xpath("//input[contains(@class,'email')]");
    private By _Password = By.xpath("//input[@name='Password']");
    private By _loginButton = By.xpath("//button[@class='button-1 login-button']");

    public void enterLogInDetail(){
        //type e-mail address
        typeText(_Email, loadProp.getProperty("email"));
        //type password
        typeText(_Password, loadProp.getProperty("password"));
        //click on Log-in
        clickOnElement(_loginButton);
    }
}
