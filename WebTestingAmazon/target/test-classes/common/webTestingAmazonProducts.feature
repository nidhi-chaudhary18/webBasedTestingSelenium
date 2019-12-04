
  Feature: Code challenge for UST to navigate Amazon and add item in the shopping cart
    Scenario: Navigate to Amazon and add multiple product in shopping cart and validate details on checkout page
      Given I navigate to "https://www.amazon.com"
      When I click on 5-th Product in "Best Sellers in Cell Phones & Accessories"
      And I add 4 pieces of product in shopping kart
      Then I open shopping kart
      And I validate the same product is added
      And I validate sum is correct
