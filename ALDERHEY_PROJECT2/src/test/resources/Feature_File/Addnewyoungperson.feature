@Addnewyoungperson	
Feature: Appointment	 

  Scenario: addnewyoungperson
    When Launch Alderhey "<url>" for addnewyoungperson
    Then User click on parent/youngperson button for addnewyoungperson
    Then User Enter on  phone "<email>" Address for addnewyoungperson
    Then User Enter the password "<password>" Address for addnewyoungperson
    Then User Enter Login button for addnewyoungperson
    Then User Click on Add a new child/young person
    Then User Enter young person first name
    Then User Enter young person last name
    Then User Enter young person date of birth
    Then User Enter young person NHS Number
    Then User click on Submit access request button