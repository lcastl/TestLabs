
  Feature: Amazon search

    Scenario: search into amazon page
      Given that I am at the amazon home page
      When I search for a <product>
      And I click on search button
      Then I verify the list of given products

      Example:
        |product         |
        |sun glasses     |
        |watches for men |