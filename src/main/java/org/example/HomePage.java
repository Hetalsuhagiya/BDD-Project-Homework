package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    private By _registerButton = By.xpath("//a[text()='Register']");
    private By _referHTCOneToAFriend = By.xpath("//a[text()='HTC One M8 Android L 5.0 Lollipop']");
    public void clickOnRegisterButton() {
        //click on Register Button on homepage
        clickOnElement(_registerButton);

    }
    public void clickOnProductToReferToAFriend() {
        //click on a HTC One M8 Android L to refer to a friend
        clickOnElement(_referHTCOneToAFriend);
    }

}
