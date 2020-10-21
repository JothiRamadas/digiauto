Feature: As a I should be able to login

  Scenario: Try to login with correct username and wrong password

    Given : I am on

    When : Click formauthentication
    When : Enter username "tomsmith"
    When : Enter password "wrongpassword"
    When : Click on login
    Then : User should be able to see "You logged into a secure area"

    @valid
  Scenario: Try to login with correct username and correct password

    Given : I am on homepage
    When : Click formauthentication
    When : Enter username "tomsmith"
    When : Enter password "SuperSecretPassword!"
    When : Click on login
    When : Click on logout
    Then : User should be able to see "You logged out of the secure area"


