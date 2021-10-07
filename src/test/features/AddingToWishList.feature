Feature: Adding to WishList
  Scenario: Add a health book to Wishlist

    Given Customer is on DemoShop home page book
    When Customer search for a health book
    Then Customer is on book page
    When Customer click on book

    When Customer click on add to wishlist
    Then Wishlist should get updated from (0) to (1)