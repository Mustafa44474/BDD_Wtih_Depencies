 @all
 Feature: User Registeration 
 Background: 
  Given User navigate to Register Account page
  
   @Registration  @Registrationwithmandatoryfields @all @smoke @regression
 Scenario: Registration with mandatory fields

 When User enter firstName "Mustafa" into the FirstName field
 And User enter lastName "Siddi" into the lastName field
 And User enter email "gmusatafa@gmail.com" into email field
 And User enter telephone "1234567890" into Telephone field
 And User enter password "Test@321" into password field
 And User enter passwrod "Test@321" into password confirm field
 And User Select privacy policy field
 And User clicks on continue button
 Then Account should get succesfully created 
 
 
@Registration  @Registrationwithmandatoryfields @all @smoke @regression
 Scenario: Registration with All fields 
 When User enter firstName "Mustafa" into the FirstName field
 And User enter lastName "Siddi" into the lastName field
 And User enter email "gmusatafa@gmail.com" into email field
 And User enter telephone "1234567890" into Telephone field
 And User enter password "Test@321" into password field
 And User enter passwrod "Test@321" into password confirm field
 And User Select yes for Newsletter
 And User Select privacy policy field
 And User clicks on continue button
 Then Account should get succesfully created 
 
    @Registration  @Registrationwithmandatoryfields @all @smoke  
 Scenario: Registration without providing any field
 
 When User dont enter details into any fields
 And User clicks on continue button
 Then Warning messages should be displayed for the mandatory fields
 
 @Registration @Registrationwithmandatoryfields @all @smoke  
 Scenario:  Registration without duplicate emai
 When User enter firstName "Mustafa" into the FirstName field
 And User enter lastName "Siddi" into the lastName field
 And User enter priviuse email "gmustafa.siddiqi@gmail.com" into email field
 And User enter telephone "1234567890" into Telephone field
 And User enter password "Test@321" into password field
 And User enter passwrod "Test@321" into password confirm field
 And User Select yes for Newsletter
 And User Select privacy policy field
 And User clicks on continue button
 Then Warning message informting the user about dublipate