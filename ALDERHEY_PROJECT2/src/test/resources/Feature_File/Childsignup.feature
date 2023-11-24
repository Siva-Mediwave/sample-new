@youngsignup
Feature: youngsignup	 

  Scenario: young signup
    When Launch Alderhey "<url>" for youngsignup
    Then User click on parent/youngperson button for youngsignup
    Then User click on young radio button
    Then User Enter parent's First Name
   Then User Enter parent's Last Name
   Then User Enter parent's Date of birth
   Then User Enter parent's NHS no
   Then User Enter parent's password
   Then User Enter parent's confirm password
   Then User click on termsandconditions and privacy statement
   Then User click on Create Account.
