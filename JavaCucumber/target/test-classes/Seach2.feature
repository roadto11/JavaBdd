@Login
Feature: Demo test scenario

  @Scenario3
  Scenario: test scenario of chappter1
 	Given I am on the home page
    When I am on chapter first page
    And I select  radio button
    And I select drop down value
    Then I verify page text
    And I verify ajax request
    
 @Scenario4
  Scenario Outline: test scenario of chappter2
    Given I am on the home page
    When I am on chapter Second page
    Then I verify multiple line text
    And I verify buttons
  
  Examples:

| username | password | title |

| Rob      | xyz1      | title1 |

| Bob      | xyz1      | title2 |