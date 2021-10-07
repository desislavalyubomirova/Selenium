Feature: My Account Rewards
Scenario: My Account Rewards Point Balance


    Given Customer is on Demo shop home page
    When Customers Click on log in
  When Customer enter email for login
  When Customer enter password
  When Customers click on Log in button
  When Customer click on My Account
  Then Customer see Account info
  When Customer click on reward points
  Then Customer is on reward page
  Then Customer can verify his balance