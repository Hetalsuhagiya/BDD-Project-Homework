Feature: referAFriend
  @referAFriend
  Scenario: As registered user, I should able to refer a friend
    Given I am on homepage
    When I click on HTC One M8 Android
    And I click on Email A Friend
    Then I should able to refer a product to friend
