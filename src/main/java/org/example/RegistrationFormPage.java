package org.example;

import org.openqa.selenium.By;

public class RegistrationFormPage extends Utils{
    private By _typeFirstName = By.xpath("//input[contains(@name,'FirstName')]");
    private By _typeLastName = By.xpath("//input[contains(@name,'LastName')]");
    private By _birthDay = By.xpath("//select[@name='DateOfBirthDay']");
    private  By _birthMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    private By _birthYear = By.xpath("//select[@name='DateOfBirthYear']");
    private By _Email = By.xpath("//input[contains(@id,'Email')]");
    private By _Password = By.xpath("//input[@id='Password']");
    private By _ConfirmPassword = By.xpath("//input[@name='ConfirmPassword']");
    private By _registerButton = By.xpath("//button[contains(@name,'register-button')]");
LoadProp loadProp = new LoadProp();
    public void enterRegistrationDetails1(){
        //type first name
        typeText(_typeFirstName, loadProp.getProperty("FirstName"));
        //type last name
        typeText(_typeLastName, loadProp.getProperty("LastName"));
        //select option from birthday
        selectOptionByValue(_birthDay,loadProp.getProperty("birthDay"));
        //select option from birth Month
        selectOptionByVisibleText(_birthMonth, loadProp.getProperty("birthMonth"));
        //select option from birth Year
        selectOptionByIndex(_birthYear,66);
        //type e-mail address
        typeText(_Email, loadProp.getProperty("emailWithoutDomain") + timestamp() + loadProp.getProperty("emailDomain"));
        //type password
        typeText(_Password, loadProp.getProperty("password"));
        //type confirm password
        typeText(_ConfirmPassword, loadProp.getProperty("confirmPassword"));
        //click on register submit button
        clickOnElement(_registerButton);
    }
//    public void enterRegistrationDetails2(){
//        //type first name
//        typeText(_typeFirstName, "TestFirstName");
//        //type last name
//        typeText(_typeLastName, "TestLastName");
//        //type e-mail address
//        typeText(_Email, "test1234" + datestamp() + "@gmail.com");
//        //type password
//        typeText(_Password, "test1234");
//        //type confirm password
//        typeText(_ConfirmPassword, "test1234");
//        //click on register submit button
//        clickOnElement(_registerButton);
//    }
    public void enterRegistrationDetails3(){
        //type first name
        typeText(_typeFirstName,loadProp.getProperty("FirstName") );
        //type last name
        typeText(_typeLastName,loadProp.getProperty("LastName") );
        //type e-mail address
        typeText(_Email, loadProp.getProperty("email"));
        //type password
        typeText(_Password,loadProp.getProperty("password") );
        //type confirm password
        typeText(_ConfirmPassword,loadProp.getProperty("confirmPassword") );
        //click on register submit button
        clickOnElement(_registerButton);
    }

}
