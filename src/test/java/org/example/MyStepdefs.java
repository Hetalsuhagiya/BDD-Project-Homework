package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegistrationFormPage registrationFormPage =new RegistrationFormPage();
    RegistrationResultPage registrationResultPage =new RegistrationResultPage();
    LogInPage logInPage = new LogInPage();
    LogInPageDetails logInPageDetails = new LogInPageDetails();
    EmailAFriendDetails emailAFriendDetails = new EmailAFriendDetails();
    EmailAFriendResultPage emailAFriendResultPage = new EmailAFriendResultPage();
    ReferHTCOneAndroidToAFriend referHTCOneAndroidToAFriend = new ReferHTCOneAndroidToAFriend();

    @Given("I am on registration page")
    public void i_am_on_registration_page() {
       homePage.clickOnRegisterButton();
    }
    @When("I enter required registration details")
    public void i_enter_required_registration_details() {
        registrationFormPage.enterRegistrationDetails1();

    }
    @Then("I should able to register successfully.")
    public void i_should_able_to_register_successfully() {
        registrationResultPage.verifyUserRegisteredSuccessfullyOrNot();
    }

    @Given("I am on homepage")
    public void i_am_on_homepage() {
homePage.clickOnRegisterButton();
registrationFormPage.enterRegistrationDetails3();
logInPage.clickOnLogInButton();
logInPageDetails.enterLogInDetail();
    }
    @When("I click on HTC One M8 Android")
    public void i_click_on_htc_one_m8_android() {
homePage.clickOnProductToReferToAFriend();
referHTCOneAndroidToAFriend.clickOnEmailAFriendToReferProductToFriend();
    }
    @When("I click on Email A Friend")
    public void i_click_on_email_a_friend() {
        emailAFriendDetails.clickOnEmailAFriendDetail();

    }
    @Then("I should able to refer a product to friend")
    public void i_should_able_to_refer_a_product_to_friend() {
        emailAFriendResultPage.verifyRegisteredUserCanReferAProductToAFriend();

    }
}
