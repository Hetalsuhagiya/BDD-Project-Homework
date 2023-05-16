package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;


import static org.example.Utils.getTextFromElement;

public class EmailAFriendResultPage extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']/ul/li");
    private By _result = By.xpath("//div[@class='result']");
    String expectedMessage = loadProp.getProperty("eMailMessage");
    public void verifyRegisteredUserCanReferAProductToAFriend(){
        //print message(Your email has been sent)
        String message = getTextFromElement(_result);
        System.out.println("Sent Message: " + message);
        Assert.assertEquals(message, expectedMessage);
    }

}
