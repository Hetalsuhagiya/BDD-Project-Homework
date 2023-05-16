package org.example;

import org.openqa.selenium.By;

import static org.example.Utils.clickOnElement;
import static org.example.Utils.typeText;

public class EmailAFriendDetails extends Utils{
    private By _friendEmail = By.xpath("//input[@id='FriendEmail']");
    //private By _yourEmail = By.xpath("//input[@id='YourEmailAddress']");
    private By _sendEmail = By.xpath("//button[@class='button-1 send-email-a-friend-button']");
    //private By _productemailafriend = By.xpath("//button[@onclick='setLocation(\"/productemailafriend/18\")']");
    LoadProp loadProp = new LoadProp();
    public void clickOnEmailAFriendDetail(){
        //type Friend's email
        typeText(_friendEmail,loadProp.getProperty("friendEmail"));
        //click send email
        clickOnElement(_sendEmail);
    }
}


