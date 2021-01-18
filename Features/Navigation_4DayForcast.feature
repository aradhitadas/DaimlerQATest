#Author: Aradhita Das
@4_day_weather_forecast
Feature: Navigation to 4-Day weather forecast 

  @TestCase_4DayForcast_1
  Scenario: Verify  that Fourday weather forecast can be accessed from the Navigation bar of Home page.
    Given Load Home Page of weather of gov sg site
    When Open TwentyFour-HOUR FORECAST link and click FourDay Outlook tab
    Then The FourDay Outlook section of the forcast table should be displayed

  @TestCase_4DayForcast_API 	
  Scenario: Verify  that temperature of API response matches with website.
    Given Load Home Page of weather of gov sg site
    And Get the Fourday Weather forecast API response
    When Check for successful response status
    And Open TwentyFour-HOUR FORECAST link and click FourDay Outlook tab
    Then The FourDay Outlook section of the forcast table should be displayed
    And I verify the day after tomorrows temperature of the response match with website
