$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Navigation_4DayForcast.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Aradhita Das"
    }
  ],
  "line": 3,
  "name": "Navigation to 4-Day weather forecast",
  "description": "",
  "id": "navigation-to-4-day-weather-forecast",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@4_day_weather_forecast"
    }
  ]
});
formatter.before({
  "duration": 4567557600,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify  that temperature of API response matches with website.",
  "description": "",
  "id": "navigation-to-4-day-weather-forecast;verify--that-temperature-of-api-response-matches-with-website.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@TestCase_4DayForcast_API"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Load Home Page of weather of gov sg site",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Get the Fourday Weather forecast API response",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Check for successful response status",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Open TwentyFour-HOUR FORECAST link and click FourDay Outlook tab",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "The FourDay Outlook section of the forcast table should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I verify the day after tomorrows temperature of the response match with website",
  "keyword": "And "
});
formatter.match({
  "location": "Forcast4DaySteps.load_Home_Page_of_weather_of_gov_sg_site()"
});
formatter.result({
  "duration": 5257955500,
  "status": "passed"
});
formatter.match({
  "location": "Forcast4DaySteps.get_the_Fourday_Weather_forecast_API_response()"
});
formatter.result({
  "duration": 3094558400,
  "status": "passed"
});
formatter.match({
  "location": "Forcast4DaySteps.check_for_successful_response_status()"
});
formatter.result({
  "duration": 2998100,
  "status": "passed"
});
formatter.match({
  "location": "Forcast4DaySteps.open_TwentyFour_HOUR_FORECAST_link_and_click_FourDay_Outlook_tab()"
});
formatter.result({
  "duration": 2383412500,
  "status": "passed"
});
formatter.match({
  "location": "Forcast4DaySteps.the_FourDay_Outlook_section_of_the_forcast_table_should_be_displayed()"
});
formatter.result({
  "duration": 516698600,
  "status": "passed"
});
formatter.match({
  "location": "Forcast4DaySteps.i_verify_the_day_after_tomorrows_temperature_of_the_response_match_with_website()"
});
formatter.result({
  "duration": 1039475600,
  "status": "passed"
});
formatter.after({
  "duration": 1159773300,
  "status": "passed"
});
});