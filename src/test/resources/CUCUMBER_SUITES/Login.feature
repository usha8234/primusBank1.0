Feature: Login Feature
Background: user is successfully logged in
 When user opens the "Chrome" browser and exe "C:\\Users\\devis\\OneDrive\\Desktop\\Automation Support Systems\\chromedriver.exe"
 When user provides the url "http://primusbank.qedgetech.com/"
 
 @SmokeTest
 Scenario: login functionality for username and password
 When user enters username as "Admin"
 When user enters passwor as "Admin"
 When user click on login button
 Then user is on the "Admin" mainpage and get message as welcome to admin