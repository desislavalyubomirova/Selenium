Feature: Laptop purchase
  Scenario: 14 inch laptop purchase

    Given Customer is on Demo shop home page
    When Customer click on books
    Then Customer should see the results

    When Customer orders by Price low to hight
    When Customer change the view to list
    When Customer adds the first book to cart
    Then Customer should see updated cart


    When Customer is on the cart page
   Then Customer should land on shopping cart page

    When Customer Choose USA
    When Customer agrees to terms and conditions
    When Customer clicks on check out
    Then Customer should be redirected to sign in page

    When Customer clicks on check out as guest button
    Then Customer is redirected to Checkout page

    When Customer enters first name
    And Customer enter last name
    And Customer enter email
    And Customer choose country
    And Customer enter address1
    And Customer enter city information
    And Customer enter zip
    And Customer enter phone
    And Customer click on continue
    Then Billing tab becomes inactive
    Then Shipping tab become active

    When Customer click on pick-up in store checkbox
    And Customer click on continue button
    Then Payment method becomes active

    When Customer clicks on payment method continue
    Then Payment tab becomes disabled


    When Customer click on payment info continue button
    Then Confirm page becomes active

    When Customer click on confirm
    Then Order number is generated
