
  Feature: Code challenge for UST to navigate Amazon and add item in the shopping cart
    Scenario: Navigate to Amazon and add multiple product in shopping cart and validate details on checkout page
      Given I navigate to "https://www.amazon.com"
      When I click on 5-th Product in "Best Sellers in Home & Kitchen"
#      And I Open details of 5-th Product
#      And I add 8 pieces of product in shopping kart
#      Then I Open shopping kart
#      And I validate the same product is added
#      And I validate sum is correct
