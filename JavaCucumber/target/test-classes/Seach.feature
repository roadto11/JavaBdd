@Completed
Feature: Demo test scenario

  @Scenario1
  Scenario: test scenario of chappter1
 	Given I am on the home page
    When I am on chapter first page
    And I select  radio button
    And I select drop down value
    Then I verify page text
    And I verify ajax request
    
 @Scenario2
 Scenario: test scenario of chappter2
    Given I am on the home page
    When I am on chapter Second page
    Then I verify multiple line text
    And I verify buttons
  
@Searchmodule_single_search_functionality
Scenario Outline: verify search
    When I navigate to search retrieve page
    And I input "<SearchText>" in search text field
    Then I click on browse folder button
    And I expanded root folder
    Then I selected folder "<folderName>" from folder list
    When I select meta data name "<metadata1>" from "0" option
    And I select requirement "<requirement1>" from "0" option
    And I enter value "<value1>" in "0" option
    And I click on search button
    Then I found search result page open with heading "<result>"

 Examples: Search data
  | folderName | SearchText | metadata1       | requirement1        | value1                | result          |
  |    IT      | calsoft     | segment        | equal               |   470                 | Search Results for: "path_names:"IT" AND parsed_segment_s:470 AND _text_:calsoft"    |
  |   Calsoft  | calsoft     | start_date     | equal               |   07-09-2017          | Search Results for: "path_names:"IT"     |
  |   IT       | calsoft     | contract_type  | equal               |   Amendment           | Search Results for: "path_names:"IT" AND parsed_contract_type_s:amendment AND _text_:calsoft"    |
  |   IT       | calsoft     | execution_date | less than or equal  |   2015-01-01          | Search Results for: "path_names:"IT" AND parsed_execution_date_tdt:[* TO "2015-01-01"] AND _text_:calsoft"    |
  |   TechMD   | calsoft     | governing_law  | equal               |   Laws of California  | path_names:"IT" AND parsed_governing_law_s:laws\ *of\ *california AND _text_:Testing"    |
  |   IT       | Text        | payment_terms  | less than           |   90                  | Search Results for: "path_names:"IT" AND parsed_payment_terms_thl:{* TO 90} AND _text_:Text"   |

  