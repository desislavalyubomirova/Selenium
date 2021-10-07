Feature: Verify Community Poll
  Scenario: Community Poll verification

    Given Customer is on Demo shop home page
    When Customer click on Excellent
    And Customer clicks on vote
    Then Verify message:Only register customers can vote