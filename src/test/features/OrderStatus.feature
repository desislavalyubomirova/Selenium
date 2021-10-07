Feature: Order Status
  Scenario: Pending Order

    Given Customer is on Demo shop home page
    When Customers Click on log in
    And Customer enter email
    And Customer enter password
    And Customer click Log In Button
    Then Customer should verify log in is successful

    When Customer click on order links
    Then Customer verify MyAccount-Orders Page
    Then Customer should see order status