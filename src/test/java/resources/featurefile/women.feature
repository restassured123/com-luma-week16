

Feature:
  As a user i want to sort products by price and by name
  @sanity @smoke
  Scenario: Sorting the products by name filter

    Given I am on the on Luma website homepage
    When I mouse hover on women Menu
    And I mouse Hover on Tops
    And I click on Jackets
    And I select sort by filter as  Product Name
    Then I verify the products name display in alphabetical order



  Scenario:  User should sort the products by name filter successfully
    Given I am on the on Luma website homepage
    When I mouse hover on women Menu
    And I mouse Hover on Tops
    And I click on Jackets
    And I select sort by filter as Price
    Then I verify the products price display in low to high
