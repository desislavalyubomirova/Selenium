Feature: Share a book with a friend using email
@smoke
  Scenario: Share a book with a friend
  Given Customer is on Demo shop home page
  When Customers Click on log in
  When Customer enter email for login
  When Customer enter password
  When Customers click on Log in button
  When Customer search for a book
  Then Customer is on book page
  When Customer click on book
  When Customer click Email friend button
  Then Customer is on the email friend tab
  When Customer enter friend email
  When Customer click on Send email
  Then Customer see verification message
