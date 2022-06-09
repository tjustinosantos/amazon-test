Feature: Amazon Test

  Scenario: Looking for Nikon D3X product on Amazon.com
    Given I have amazon website opened
    When I click on hamburguer menu in the top left corner
    And I scroll own and then Click on the TV, Appliances
    And Electronics link under Shop by Department section
    And I click on click on Televisions under Tv, Audio & Cameras sub section
    And I scroll down and filter the results by Brand Samsung
    And sort the Samsung results with price High to Low
    And click on the second highest priced item
    Then I assert that About this item section is present
    And log this section text to console and report