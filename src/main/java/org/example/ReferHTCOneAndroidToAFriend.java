package org.example;

import org.openqa.selenium.By;

public class ReferHTCOneAndroidToAFriend extends Utils{
    private By _productEmailAFriend = By.xpath("//button[@onclick='setLocation(\"/productemailafriend/18\")']");
    public void clickOnEmailAFriendToReferProductToFriend(){
        //click on email friend
        clickOnElement(_productEmailAFriend);
    }
}
