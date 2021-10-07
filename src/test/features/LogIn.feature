Feature: Log In
  Scenario: Successful to Log In

    Given Customer is on Demo shop home page
    When Customers Click on log in
#    Then Customer should be on Sign In Page

    When Customer enter email for login
    When Customer enter password
    When Customer click on Remember me box

    When  Customers click on Log in
    Then  Customer Land on the home page
    Then Customer click on Log Out
