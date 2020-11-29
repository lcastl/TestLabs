
  Feature: get into amazon page

    Scenario: search sun glasses
      Given that I am at the amazon home page
      When I search for a <product>
      Then I verify the list of given products

      Example:
        |product|