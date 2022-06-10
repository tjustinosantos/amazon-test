Feature: Amazon Test

  Scenario: Looking for TV on Amazon.com
    Given I have amazon website opened
    When I click on hamburger menu in the top left corner
    And click on the "TV, Appliances, Electronics"
    And I click on click on "Televisions"
    And I filter the results by Brand "Samsung"
    And sort the Samsung results with "Price: High to Low"
    And click on the second highest priced item
    Then I assert that About this item section is present
    And log this section text to console