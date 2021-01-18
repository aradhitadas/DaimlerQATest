package com.pages;

import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import com.pages.*;

public class Forcast4DaySteps {
	  WebDriver driver;
	  Homepage home;
	  day4forcastpage forcast4day;

	  Response response;
	  String jsonString;
	  
	   
	  @Given("^Load Home Page of weather of gov sg site$")
	  public void load_Home_Page_of_weather_of_gov_sg_site() throws Throwable {
		  home = new Homepage(driver);
		// driver.get("http://www.weather.gov.sg");
		  home.navigateTo();
	      //throw new PendingException();
	  }
	  
	  @Given("^Get the Fourday Weather forecast API response$")
	  public void get_the_Fourday_Weather_forecast_API_response() throws Throwable {
		  
		  response = RestAssured.get("https://api.data.gov.sg/v1/environment/4-day-weather-forecast");
		
		  
	  }
	  @When("^Open TwentyFour-HOUR FORECAST link and click FourDay Outlook tab$")
	  public void open_TwentyFour_HOUR_FORECAST_link_and_click_FourDay_Outlook_tab() throws Throwable {
		  home.open4dayforcast();
	     // throw new PendingException();
	  }
	  @When("^Check for successful response status$")
	  public void check_for_successful_response_status() throws Throwable {
		  	int statusCode = response.getStatusCode();
			assertTrue(statusCode == 200);
		
	  }
	  

	@Then("^The FourDay Outlook section of the forcast table should be displayed$")
	  public void the_FourDay_Outlook_section_of_the_forcast_table_should_be_displayed() throws Throwable {
		  forcast4day = new day4forcastpage(driver);
		  forcast4day.checkfor4dayforcast();
	     // throw new PendingException();
	  }
	  
	  @Then("^I verify the day after tomorrows temperature of the response match with website$")
	  public void i_verify_the_day_after_tomorrows_temperature_of_the_response_match_with_website() throws Throwable {
		  forcast4day = new day4forcastpage(driver);
		  forcast4day.checkforecasttablecontent();
		  String hTemp = forcast4day.hottemp;
		  String cTemp = forcast4day.coldtemp;
		  System.out.println(hTemp);
		  System.out.println(cTemp);
		  
		  jsonString = response.asString();
		  System.out.println(jsonString);
		  
		  List<String> jsonResponse = new ArrayList<String>();
		  jsonResponse = JsonPath.from(jsonString).get("items");
		 System.out.println(jsonResponse);
	  }
	  
	  @Before
	  public void startUp() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aradhita\\Documents\\chromedriver.exe");
	    driver = new ChromeDriver();
		 
	  }
	 
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	}