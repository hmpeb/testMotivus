Feature: Test with Microsoft

  Scenario: Validate the operation of the Microsoft page
    Given I open the browser in the microsoft page
    Then I validate the menu items are present in microsoft page
    When I go to windows in microsoft page
    Then I click on about windows menu and print elements in dropdown in windows page
    Then I click on search button in windows page
    When I search for Visual Studio in windows page
    Then I print the price of the Selected Element in windows page
