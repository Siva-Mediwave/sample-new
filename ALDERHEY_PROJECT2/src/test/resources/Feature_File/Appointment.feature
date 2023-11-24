@Appointment	
Feature: Appointment	 

  Scenario: Appointment flow
    When Launch Alderhey "<url>"
    Then User click on parent/youngperson button
    Then User Enter on  phone "<email>" Address
    Then User Enter the password "<password>" Address 
    Then User Enter Login button
    Then User click user's health button
    Then User click on My Appointments button
    Then User click on filter by option dropdown
    
    