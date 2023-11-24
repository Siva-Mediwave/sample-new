@Parentsignup	
Feature: Parentsignup	 

  Scenario: parents signup
    When Launch Alderhey "<url>" for Parentsignup
    Then User click on parent/youngperson button for Parentsignup
    Then User click on Parent radio button
    Then User Enter parent's first name
   Then User Enter parent's last name
   Then User Enter parent's Email name
   Then User Enter parent's Mobilenumber 
   Then User Enter parent's Password
   Then User Enter parent's Confirm password
   Then User click on Termsandconditions and Privacy statement
   Then User click on create account.