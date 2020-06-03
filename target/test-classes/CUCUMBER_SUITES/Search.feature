Feature: Search Functionality
Background: user is successfully logged in primusbank
 When user opens the "Chrome" browser and exe "C:\\Users\\devis\\OneDrive\\Desktop\\Automation Support Systems\\chromedriver.exe"
 When user provides the url "http://primusbank.qedgetech.com/"
 When user enters username as "Admin"
 When user enters passwor as "Admin"
 When user click on login button
 @Regression
 Scenario: Search button Functionality with valied data
 When user click on Branches
 When user select "USA" as Country
 When user select "NewYork" as State  
 When user select "Watertown" as City 
 When user click on Search button
 Then Application Shows result for "Watertown" branches
 
 