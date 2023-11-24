@Resourcelibrary
Feature: Resourcelibrary 

  Scenario: Resource can view and download
    Given Launch  "<url>" on browser
    When User click the patient/young_person login button
    Then User Enter Phone or "<Email>" address 
    Then User Enter "<Passoword>" address
    Then User click on Login button
    Then User click on User's health button
    Then User click on Resource library button
    Then User click on Prescribed resources button
    Then User enter resourcename in search filter
    
    Then User click on Add favourite icon
    Then User click on back to resource library link
    Then User click on Favourite resource button
    Then User click on remove favourite icon
    Then User click on cancel button for confirm remove popup
    Then User click on confirm button for confirm remove popup
    
    Then User click on Resource Read_more link
    Then User click on Download button
    Then User click on View button
    