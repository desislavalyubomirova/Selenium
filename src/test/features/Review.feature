Feature: Review the book

Scenario: Review book
Given Customer is on Demo shop home page
When Customers Click on log in
When Customer enter email for login
When Customer enter password
When Customers click on Log in button
When Customer search for a book
Then Customer is on book page
When Customer click on book
  When Click on add review
  Then Customer is on Product review for Health Book page
  When Customer enter review title
  When Customer enter review text
  When Customer click submit review button