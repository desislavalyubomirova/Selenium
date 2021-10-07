Feature: Newsletter sign up
  @myfirst
  Scenario: Sign up sussesfully

    Given Customer is on Demo shop home page
    When Customer enter email address
    When Customer clicks on subscribe
    Then Customer see checking text