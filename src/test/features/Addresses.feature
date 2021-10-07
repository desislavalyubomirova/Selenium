Feature: Addresses
Scenario: Verify Addresses

  Given Customer is on Demo shop home page
  When Customers Click on log in
  When Customer enter email for login
  When Customer enter password
  When Customers click on Log in button
  When Customer click on addresses
  Then Customer verify MyAccount-Addresses Page
  Then Customer verify name is John Smith