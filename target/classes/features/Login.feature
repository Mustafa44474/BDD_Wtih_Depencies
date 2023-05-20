 @all
 Feature: User Login
 Registered User should be abele to login to access account details
 
 Background: 
 Given User is navigate to Login page
 
 
 @smoke @regression
 Scenario Outline: Login with valid credentials
 
 When User enters valid email address <email>  
And User enters valid password <password>   
 Then User should login successfully
 Examples: 
 |email 										 |password      |
 | gmustafa.siddiqi1@gmail.com | Automation@321 |

 | gmustafa.siddiqi3@gmail.com | Automation@321 |
  
 
 
@smoke @regression
 Scenario: Login with invalid credentials
 When User enters invalid email address "gmustafa.siddiqi23@gmail.com"
 And User enters invalid password "AVSE"
 And User clicks on Login button
 Then User should get proper warning message
 
@smoke @regression
 Scenario: Login with valid email and invalid password
 When User enters valid email address "gmustafa.siddiqi@gmail.com"
 And  User enters invalid password "AVSE" 
 And  User clicks on Login button
 Then User should get proper warning message
 
 @login @Loginwithinvalidemailandvalidpassword @smoke @regression
 Scenario: Login with invalid email and valid password
 When User enters invalid email address "gmustafa.siddiqi23@gmail.com"

 And  User clicks on Login button
 Then User should get proper warning message
 
 @login @LoginwithLoginwithoutprovidinganycredential @smoke @regression
 Scenario: Login without providing any credential
 
 When User dont enters any credentials
 And  User clicks on Login button
 Then User should get proper warning message
 