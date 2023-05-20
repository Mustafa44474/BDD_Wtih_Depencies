Feature: User RegisterationDataTable 
 Background: 
  Given User navigate to Register Account page
 Scenario: Registration with all mandatory fields

 When User enter following details into the fields 
 | FirstName     | Mustafa |
 | LastName      | Siddiqi |
 | emailaddress | gmustafa.siddiqi021@gmail.com|
 | telephon      | 1234567890 |
 | password | Automation@321 |
 And Selects privacy policy field
 And clicks on Continue button
 Then Accound should get succesfully created 
 