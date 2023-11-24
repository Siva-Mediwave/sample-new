@Resetpassword
Feature: Reset_password 

  Scenario: We can reset password
    Given Launch  "<url>" on browser for account_password
    When User click the patient/young_person login button for account_password
    Then User Enter Phone or "<Email>" address for account_password
    Then User Enter "<Passoword>" address for account_password
    Then User click on Login button for account_password
    Then User click on profile icon
    Then User click on Account button
    Then User Enter on old password 
    Then User Enter on new password
    Then User Enter on confirm password
    Then User click on save button