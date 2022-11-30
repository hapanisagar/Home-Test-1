Feature: Mail online Test

  Background:
    Given User able to open browser
    And Enter Url
  @E2E
  Scenario: Mail online Valid Test
    Then User is on HomePage and Verify the webpage displays current date and time
    Then User able to Navigate to the Sport menu
    Then Ensure primary navigation colour (Sport) and secondary navigation (Football) are same
    Then User able to Click on the Football sub navigation item
    Then Click the first article displayed and traverse to the gallery image
    Then click the gallery icon appearing on the right-hand side corner with numbers and gallery loads on full screen
    Then Now verify if it has previous and next arrows buttons and when clicked previous or next it navigates to the appropriate gallery picture
    Then on the gallery embedded in the article page click on the Facebook share icon and verify it opens Facebook modal dialog
    Then Go to a video embedded within the article and click the full screen button on the right-hand corner, ensure video can be viewed in full screen and minimized
    Then Navigate to the bottom right of the article page to the Premier League Table section
    And  exhibit the points or positions from the Premier league table for the Liverpool team
    Then User close the Browser

