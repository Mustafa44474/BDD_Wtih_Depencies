 @all
 Feature: Search Functionality
 Background: 
 Given User is open the application 
 
 @search  @Searchforavalidproduct  @all @smoke @regression
 Scenario: Search for a valid product 
 When User enters valid productName into search field
 And User clicks on Search button
 Then Valid projdct should be displayed in the search result
 @search  @Searchfornon-existanceProduct @all @smoke @regression
 
 Scenario: Search for non-existance Product
 When User enters non-existance Product into search field
 And User clicks on Search button
 Then User should see Proper text " There is no prodcut matching" 
 
 @search  @Searchwithoutprovidingproductinearchfied @all @smoke  
Scenario: Search without providing product in searchfied
 When User dont enter any produt into search field
 And User clicks on Search button
 Then User should see Proper text " There is no prodcut matching" 
 